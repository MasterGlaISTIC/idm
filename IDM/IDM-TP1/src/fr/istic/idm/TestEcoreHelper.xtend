package fr.istic.idm

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class TestEcoreHelper {
	
	def test(){
		val EcoreLoader loader  =  new EcoreLoader()
		val EPackage metaModel = loader.loadModel("Tableur.ecore")
		val EcoreHelper helper = new EcoreHelper()
		for(EClass class: metaModel.EClassifiers.filter(EClass)){
			helper.flat(class)
		}
			
		
	}
}