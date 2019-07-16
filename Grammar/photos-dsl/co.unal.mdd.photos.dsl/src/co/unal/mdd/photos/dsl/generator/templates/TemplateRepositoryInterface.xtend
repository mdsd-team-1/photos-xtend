package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositoryAnnotation

class TemplateRepositoryInterface {
	
	static def generate(String interfaceName, String packageName, Entities ent, SpringRepositoryAnnotation sra)
	''' 
	package «packageName»;
	
	import co.edu.unal.photosappback.model.«ent.name»;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
	import org.springframework.stereotype.«sra.name»;
	
	@«sra.name»
	public interface «interfaceName» extends JpaRepository<«ent.name», Integer>, JpaSpecificationExecutor<«ent.name»>{
		
		
	}
	''' 
}