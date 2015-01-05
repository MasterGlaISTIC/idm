package pluginidm;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

@SuppressWarnings("all")
public class EcoreLoader {
  public EPackage loadModel(final String path) {
    EcoreResourceFactoryImpl fact = new EcoreResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("ecore", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createURI(path);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    EPackage p = ((EPackage) _get);
    return p;
  }
}
