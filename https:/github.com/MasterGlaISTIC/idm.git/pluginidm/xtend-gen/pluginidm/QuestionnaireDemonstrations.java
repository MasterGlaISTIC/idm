package pluginidm;

import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.xtext.example.survey.SurveyStandaloneSetupGenerated;
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
  public Object test1() {
    return null;
  }
}
