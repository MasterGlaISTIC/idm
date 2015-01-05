package pluginidm;

import com.google.common.collect.Iterables;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;
import org.xtext.example.survey.SurveyStandaloneSetupGenerated;
import pluginidm.EcoreHelper;
import pluginidm.EcoreLoader;
import projectIDM.PollSystem;

@SuppressWarnings("all")
public class QuestionnaireDemonstrations {
  public PollSystem loadPollSystem(final URI uri) {
    PollSystem _xblockexpression = null;
    {
      SurveyStandaloneSetupGenerated _surveyStandaloneSetupGenerated = new SurveyStandaloneSetupGenerated();
      _surveyStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((PollSystem) _get);
    }
    return _xblockexpression;
  }
  
  public void savePollSystem(final URI uri, final PollSystem pollS) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(pollS);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void test1() {
    InputOutput.<String>println("Without aspects");
    final EcoreLoader loader = new EcoreLoader();
    final EcoreHelper docHelper = new EcoreHelper();
    final EPackage metamodel = loader.loadModel("projectIDM.ecore");
    EList<EClassifier> _eClassifiers = metamodel.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass aClass : _filter) {
      docHelper.assignIdentifier(aClass);
    }
    InputOutput.<String>println("--- Flat ---");
    EList<EClassifier> _eClassifiers_1 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_1 = Iterables.<EClass>filter(_eClassifiers_1, EClass.class);
    for (final EClass aClass_1 : _filter_1) {
      String _flat = docHelper.flat(aClass_1, "");
      InputOutput.<String>println(_flat);
    }
    InputOutput.println();
    InputOutput.<String>println("--- Short ---");
    EList<EClassifier> _eClassifiers_2 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_2 = Iterables.<EClass>filter(_eClassifiers_2, EClass.class);
    for (final EClass aClass_2 : _filter_2) {
      String __short = docHelper._short(aClass_2, "");
      InputOutput.<String>println(__short);
    }
    InputOutput.println();
    InputOutput.<String>println("--- Flat Short ---");
    EList<EClassifier> _eClassifiers_3 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_3 = Iterables.<EClass>filter(_eClassifiers_3, EClass.class);
    for (final EClass aClass_3 : _filter_3) {
      String _flatShort = docHelper.flatShort(aClass_3, "");
      InputOutput.<String>println(_flatShort);
    }
  }
}
