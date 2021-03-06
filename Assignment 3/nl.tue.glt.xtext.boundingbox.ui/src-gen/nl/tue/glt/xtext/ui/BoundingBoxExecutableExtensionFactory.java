/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.xtext.ui;

import com.google.inject.Injector;
import nl.tue.glt.xtext.boundingbox.ui.internal.BoundingboxActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BoundingBoxExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BoundingboxActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BoundingboxActivator.getInstance().getInjector(BoundingboxActivator.NL_TUE_GLT_XTEXT_BOUNDINGBOX);
	}
	
}
