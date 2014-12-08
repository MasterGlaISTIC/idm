package pluginidm

import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.xtext.example.survey.SurveyStandaloneSetupGenerated
import projectIDM.PollSystem
import junit.framework.Assert
import org.junit.Test
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated
import org.xtext.example.mydsl.myDsl.MyDsl

class M2M {
	
	def loadPollSystem(URI uri) {
		new SurveyStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as PollSystem
	}
	
	def loadFormattage(URI uri) {
		new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as MyDsl
	}

	def savePollSystem(URI uri, PollSystem pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(pollS);
		rs.save(new HashMap());
	}
	
	def saveFormattage(URI uri, MyDsl formattage) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(formattage);
		rs.save(new HashMap());
	}
	
	
	@Test
	def test() {
		// loading
		var pollS = loadPollSystem(URI.createURI("foo1.q"))
		Assert.assertNotNull(pollS)
		Assert.assertEquals(2, pollS.polls.size)
		savePollSystem(URI.createURI("foo1.xmi"), pollS)

		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
		//pollS.polls.forEach[p|p.name = p.name + "_poll"]

		// serializing
		savePollSystem(URI.createURI("foo2.q"), pollS)
	}

	
}

