/*
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.ui.tests;

import co.unal.mdd.photos.dsl.ui.internal.DslActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SoftGalleryLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("co.unal.mdd.photos.dsl.SoftGalleryLanguage");
	}

}
