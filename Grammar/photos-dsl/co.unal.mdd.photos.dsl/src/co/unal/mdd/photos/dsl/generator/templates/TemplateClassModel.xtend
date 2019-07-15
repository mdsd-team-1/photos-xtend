package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities

class TemplateClassModel {
		
	static def generate(String className, String packageName, Entities ent)
	''' 
		package «packageName»;	
		
		import javax.persistence.*;
		
		@Entity
		@Table(name = "«ent.name.toFirstLower»")
		public class «className» {
		
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
		
			public «ent.name»() {
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
			
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}

			«IF ent.name.equals("Photo")»
						«FOR ap: ent.getAtributePhoto()»
							@Column(name = "«ap.name»", nullable = false)
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
								
			@Override
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