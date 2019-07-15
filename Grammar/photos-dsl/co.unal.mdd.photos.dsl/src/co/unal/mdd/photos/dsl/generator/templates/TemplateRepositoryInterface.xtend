package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities

class TemplateRepositoryInterface {
	
	static def generate(String interfaceName, String packageName, Entities ent)
	''' 
	package «packageName»;
	
	import co.edu.unal.photosappback.model.«ent.name»;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
	import org.springframework.stereotype.Repository;
	
	@Repository
	public interface «interfaceName» extends JpaRepository<«ent.name», Integer>, JpaSpecificationExecutor<«ent.name»>{
		
		
	}
	''' 
}