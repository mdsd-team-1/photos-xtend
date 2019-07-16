package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringEntityAnnotationTypes
import java.util.List

class TemplateClassModel {
	

	static def generate(String className, String packageName, Entities ent, List<SpringEntityAnnotationTypes> classVars)
	''' 
		package «packageName»;	
		
		import javax.persistence.*;

		@«FOR item: classVars»«IF item.name.equals("Entity")»«item.name»«ENDIF»«ENDFOR»
		@«FOR item: classVars»«IF item.name.equals("Table")»«item.name»«ENDIF»«ENDFOR»(name = "«ent.name.toFirstLower»")
		public class «className» {
		
			private int id;
			«IF ent.name.equals("Photo")»
			«FOR ap: ent.getAtributePhoto()»
				private «ap.name»;	
			«ENDFOR»
				«ELSEIF ent.name.equals("Album")»
					«FOR aa: ent.getAtributeAlbum()»
						private «aa.name»;	
					«ENDFOR»
						«ELSEIF ent.name.equals("User")»
							«FOR au: ent.getAtributeUserDomain()»
								private «au.name»;	
							«ENDFOR»
					«ENDIF»				
							
			public «className»() {}
		
			public «ent.name»(«IF ent.name.equals("Photo")»
										«FOR ap: ent.getAtributePhoto() SEPARATOR ', '»
											String «ap.name»
										«ENDFOR»
											«ELSEIF ent.name.equals("Album")»
												«FOR aa: ent.getAtributeAlbum() SEPARATOR ', '»
													String «aa.name»
												«ENDFOR»
													«ELSEIF ent.name.equals("User")»
														«FOR au: ent.getAtributeUserDomain() SEPARATOR ', '»
															String «au.name»
														«ENDFOR»
												«ENDIF»		) {
				«IF ent.name.equals("Photo")»
							«FOR ap: ent.getAtributePhoto()»
								this.«ap.name» = «ap.name»;		
							«ENDFOR»
								«ELSEIF ent.name.equals("Album")»
									«FOR aa: ent.getAtributeAlbum()»
										this.«aa.name» = «aa.name»;		
									«ENDFOR»
										«ELSEIF ent.name.equals("User")»
											«FOR au: ent.getAtributeUserDomain()»
												this.«au.name» = «au.name»;		
											«ENDFOR»
									«ENDIF»				
			}
			
			@«FOR item: classVars»«IF item.name.equals("Id")»«item.name»«ENDIF»«ENDFOR»
			@«FOR item: classVars»«IF item.name.equals("GeneratedValue")»«item.name»«ENDIF»«ENDFOR»(strategy = GenerationType.AUTO)
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}

			«IF ent.name.equals("Photo")»
						«FOR ap: ent.getAtributePhoto()»
							@«FOR item: classVars»«IF item.name.equals("Column")»«item.name»«ENDIF»«ENDFOR»(name = "«ap.name»", nullable = false)
							public String get«ap.name.toFirstUpper»() {
								return «ap.name»;
							}
							public void set«ap.name.toFirstUpper»(String «ap.name») {
								this.«ap.name» = «ap.name»;
							}
						«ENDFOR»
							«ELSEIF ent.name.equals("Album")»
								«FOR aa: ent.getAtributeAlbum()»
									@Column(name = "«aa.name»", nullable = false)
									public String get«aa.name.toFirstUpper»() {
										return «aa.name»;
									}
									public void set«aa.name.toFirstUpper»(String «aa.name») {
										this.«aa.name» = «aa.name»;
									}
								«ENDFOR»
									«ELSEIF ent.name.equals("User")»
										«FOR au: ent.getAtributeUserDomain()»
											@Column(name = "«au.name»", nullable = false)
											public String get«au.name.toFirstUpper»() {
												return «au.name»;
											}
											public void set«au.name.toFirstUpper»(String «au.name») {
												this.«au.name» = «au.name»;
											}							
										«ENDFOR»
								«ENDIF»		
								
			@«FOR item: classVars»«IF item.name.equals("Override")»«item.name»«ENDIF»«ENDFOR»
			public String toString() {
				return "«ent.name»{" +
						"id=" + id +
						«IF ent.name.equals("Photo")»
						«FOR ap: ent.getAtributePhoto()»
						", «ap.name»='" + «ap.name» + '\'' +
						«ENDFOR»
							«ELSEIF ent.name.equals("Album")»
								«FOR aa: ent.getAtributeAlbum()»
								", «aa.name»='" + «aa.name» + '\'' +
								«ENDFOR»
									«ELSEIF ent.name.equals("User")»
										«FOR au: ent.getAtributeUserDomain()»
										", «au.name»='" + «au.name» + '\'' +
										«ENDFOR»
								«ENDIF»
						'}';
			}			
	''' 
}