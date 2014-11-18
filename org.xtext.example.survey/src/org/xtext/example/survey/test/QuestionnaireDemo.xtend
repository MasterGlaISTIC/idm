package org.xtext.example.survey.test

import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Assert
import org.junit.Test
import org.xtext.example.survey.SurveyStandaloneSetupGenerated
import org.xtext.example.survey.survey.survey

class QuestionnaireDemo {

	
	def loadServey(URI uri) {
		new SurveyStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as survey
	}
	
	def saveSurvey(URI uri, survey pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(pollS); 
		rs.save(new HashMap());
	}
	
	@Test
	def test1() {
		
		// loading
		var survey = loadServey(URI.createURI("/org.xtext.example.survey/src/org/xtext/example/survey/test/smaple.mydsl1")) 
		Assert.assertNotNull(survey)
		Assert.assertEquals(2, survey.polls.size)
		//saveSurvey(URI.createURI("foo1.xmi"), survey)
		
//		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
//		pollS.polls.forEach[p | p.name = p.name + "_poll"]
//
//		// serializing
//		savePollSystem(URI.createURI("foo2.q"), pollS) 
		
		 
			
	}
	
	
//	@Test
//	def test2() {
//		
//	// loading
//	var pollS = loadServey(URI.createURI("foo1.q")) 
//		
//	// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
//	var html = toPolls(pollS.polls)
//	Assert.assertNotNull(html)
//	
//	// serializing (note: we could type check the HTML 
//	// with Xtext by specifying the grammar for instance)
//	val fw = new FileWriter("foo1.html")
//	fw.write(html.toString)
//	fw.close
//		
//		
//	}
	
	


}