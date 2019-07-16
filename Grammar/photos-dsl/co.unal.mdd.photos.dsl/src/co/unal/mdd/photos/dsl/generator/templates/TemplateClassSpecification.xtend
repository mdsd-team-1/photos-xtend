package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpecificationSegmentElement
import co.unal.mdd.photos.dsl.softGalleryLanguage.CriteriaAttributeType
import java.util.List

class TemplateClassSpecification {
	
	static def generate(String className, String packageName, Entities ent, SpecificationSegmentElement sse, List<CriteriaAttributeType> classVars)
	''' 
	package «packageName»;
	
	import javax.persistence.criteria.CriteriaBuilder;
	import javax.persistence.criteria.CriteriaQuery;
	import javax.persistence.criteria.Predicate;
	import javax.persistence.criteria.Root;
	import org.springframework.data.jpa.domain.Specification;
	import co.edu.unal.photosappback.model.«ent.name»;
	import co.edu.unal.photosappback.specification.criteria.Search«sse.name.toFirstUpper»;
	
	public class «className» implements Specification<«ent.name»> {
	
		private Search«sse.name.toFirstUpper» «sse.name»;
	
		public «className»(Search«sse.name.toFirstUpper» «sse.name») {
			this.«sse.name» = «sse.name»;
		}
	
		@Override
		public Predicate toPredicate(Root<«ent.name»> root, «sse.name.toFirstUpper»Query<?> query, «sse.name.toFirstUpper»Builder «sse.name»Builder) {
	
			if («sse.name».get«FOR item: classVars»«IF item.name.equals("operation")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»().equalsIgnoreCase(">")) {
				return «sse.name»Builder.greaterThanOrEqualTo(
						root.<String> get(«sse.name».get«FOR item: classVars»«IF item.name.equals("key")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»()), «sse.name».get«FOR item: classVars»«IF item.name.equals("value")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»().toString());
			} 
	
			else if («sse.name».get«FOR item: classVars»«IF item.name.equals("operation")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»().equalsIgnoreCase("<")) {
				return «sse.name»Builder.lessThanOrEqualTo(
						root.<String> get(«sse.name».get«FOR item: classVars»«IF item.name.equals("key")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»()), «sse.name».get«FOR item: classVars»«IF item.name.equals("value")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»().toString());
			}
	
			else if («sse.name».get«FOR item: classVars»«IF item.name.equals("operation")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»().equalsIgnoreCase(":")) {
				if (root.get(«sse.name».get«FOR item: classVars»«IF item.name.equals("key")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»()).getJavaType() == String.class) {
					return «sse.name»Builder.like(
							root.<String>get(«sse.name».get«FOR item: classVars»«IF item.name.equals("key")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»()), "%" + «sse.name».get«FOR item: classVars»«IF item.name.equals("value")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»() + "%");
				} else {
					return «sse.name»Builder.equal(root.get(«sse.name».get«FOR item: classVars»«IF item.name.equals("key")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»()), «sse.name».get«FOR item: classVars»«IF item.name.equals("value")»«item.name.toFirstUpper»«ENDIF»«ENDFOR»());
				}
			}
			return null;
		}
	}
	''' 
}