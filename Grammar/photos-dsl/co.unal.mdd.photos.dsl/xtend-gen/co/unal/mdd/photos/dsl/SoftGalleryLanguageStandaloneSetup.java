/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl;

import co.unal.mdd.photos.dsl.SoftGalleryLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SoftGalleryLanguageStandaloneSetup extends SoftGalleryLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new SoftGalleryLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
