/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.nice.elliot.sle.sensorproject


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SPDSLStandaloneSetup extends SPDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new SPDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
