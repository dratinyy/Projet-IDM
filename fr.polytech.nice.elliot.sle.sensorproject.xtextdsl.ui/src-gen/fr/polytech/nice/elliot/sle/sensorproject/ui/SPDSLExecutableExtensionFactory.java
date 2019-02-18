/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.nice.elliot.sle.sensorproject.ui;

import com.google.inject.Injector;
import fr.polytech.nice.elliot.sle.sensorproject.xtextdsl.ui.internal.XtextdslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SPDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XtextdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XtextdslActivator activator = XtextdslActivator.getInstance();
		return activator != null ? activator.getInjector(XtextdslActivator.FR_POLYTECH_NICE_ELLIOT_SLE_SENSORPROJECT_SPDSL) : null;
	}

}