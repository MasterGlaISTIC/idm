package pluginidm

import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
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

		println("Without aspects")
		val loader = new EcoreLoader
		val docHelper = new EcoreHelper()
		val metamodel = loader.loadModel("projectIDM.ecore")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			docHelper.assignIdentifier(aClass)
		}
		println("--- Flat ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.flat(aClass, ""));
		}
		println
		println("--- Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper._short(aClass, ""));
		}
		println
		println("--- Flat Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.flatShort(aClass, ""));
		}

	}

//def toPolls(List<Poll> polls) '''
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
