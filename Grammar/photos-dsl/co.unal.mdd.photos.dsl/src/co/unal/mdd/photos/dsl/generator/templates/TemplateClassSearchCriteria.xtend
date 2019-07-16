package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.CriteriaAttributeType
import java.util.List

class TemplateClassSearchCriteria {
	
	static def generate(String className, String packageName, List<CriteriaAttributeType> classVars)
	''' 
	package «packageName»;
	
	public class «className» {
		
		
		«FOR item: classVars»
		private String «item.name»;
		«ENDFOR»
	
		public «className»(«FOR item: classVars SEPARATOR ', '»String «item.name»«ENDFOR») {
			«FOR item: classVars»
			this.«item.name» = «item.name»;
			«ENDFOR»			
		}
		
		«FOR item: classVars»
		public String get«item.name.toFirstUpper»() {
			return «item.name»;
		}
		
		public void set«item.name.toFirstUpper»(String «item.name») {
			this.«item.name» = «item.name»;
		}	
			
		«ENDFOR»
	}
	''' 
}