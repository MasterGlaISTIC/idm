package pluginidm

import java.util.HashMap
import junit.framework.Assert
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import org.xtext.example.survey.SurveyStandaloneSetupGenerated
import projectIDM.PollSystem

class QuestionnaireDemonstrations {
	def loadPollSystem(URI uri) {
		new SurveyStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as PollSystem
	}

	def savePollSystem(URI uri, PollSystem pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(pollS);
		rs.save(new HashMap());
	}

	@Test
	def test1() {

		
	}

	
//	def toPolls(List<Poll> polls) '''
//<html>
//<body>
//«FOR p : polls»
//«IF p.name != null»
//<h1>«p.name»</h1>
//«ENDIF»
//«FOR q : p.questions»
//<p>
//<h2>«q.text»</h2>
//<ul>
//«FOR o : q.options»
//<li>«o.text»</li>
//«ENDFOR»
//</ul>
//</p>
//«ENDFOR»
//«ENDFOR»
//</body>
//</html>
//'''
}
