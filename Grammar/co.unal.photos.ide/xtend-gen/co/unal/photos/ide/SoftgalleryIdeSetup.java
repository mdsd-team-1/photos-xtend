/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.ide;

import co.unal.photos.SoftgalleryRuntimeModule;
import co.unal.photos.SoftgalleryStandaloneSetup;
import co.unal.photos.ide.SoftgalleryIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SoftgalleryIdeSetup extends SoftgalleryStandaloneSetup {
  @Override
  public Injector createInjector() {
    SoftgalleryRuntimeModule _softgalleryRuntimeModule = new SoftgalleryRuntimeModule();
    SoftgalleryIdeModule _softgalleryIdeModule = new SoftgalleryIdeModule();
    return Guice.createInjector(Modules2.mixin(_softgalleryRuntimeModule, _softgalleryIdeModule));
  }
}