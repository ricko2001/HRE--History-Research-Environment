package org.historyresearchenvironment.client;

import java.io.File;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.prefs.Preferences;

/**
 * Eclipse plug-in life cycle control. Sets up the logger. Starts and stops the
 * Help System.
 * 
 * @version 2018-06-20
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class Activator implements BundleActivator {
	private static BundleContext context;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");

	/**
	 * @return The bundle context
	 */
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		HreLogger.setup();

		// TODO Remove when New and Open are settled
		preferences.putInt("projectcount", preferences.getInt("projectcount", 1));
		preferences.put("project.0.name", preferences.get("project.0.name", "HRE"));
		preferences.put("project.0.lastupdated", preferences.get("project.0.lastupdated", "2000-01-01 01:01:01"));
		preferences.put("project.0.summary", preferences.get("project.0.summary", "This is the default project"));
		preferences.put("project.0.localserver", preferences.get("project.0.localserver", "LOCAL"));
		preferences.put("project.0.path", preferences.get("project.0.path", "~/HRE"));
		preferences.flush();

		LOGGER.info("HRE v0.1 has been started");

		LOGGER.info("Command line arguments:");

		ServiceReference<EnvironmentInfo> envRef = context.getServiceReference(EnvironmentInfo.class);
		EnvironmentInfo envInfo = context.getService(envRef);
		String[] args = envInfo.getCommandLineArgs();
		for (int i = 0; i < args.length; i++) {
			System.out.println("CLI " + i + ": " + args[i]);
		}

		String csMode = preferences.get("CSMODE", "DIRECT");
		LOGGER.info("Client/server mode " + csMode);
		LOGGER.info("HRE Absolute path: " + new File(".").getAbsolutePath());
		LOGGER.info("HRE Font: "
				+ preferences.get("HREFONT", "1|Segoe UI|12.0|0|WINDOWS|1|-16|0|0|0|400|0|0|0|0|3|2|1|34|Segoe UI"));

		final String command = "java -classpath plugins\\org.eclipse.help.base_4.2.153.v20180330-0640.jar org.eclipse.help.standalone.Infocenter -command start -port "
				+ preferences.getInt("HELPSYSTEMPORT", 8081)
				+ " -product org.historyresearchenvironment.helpsystem -clean";

		try {
			LOGGER.info("Help System is being started at port " + preferences.getInt("HELPSYSTEMPORT", 8081));
			Runtime.getRuntime().exec(command);
			LOGGER.info("Has started " + command);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		preferences.flush();
		HreH2ConnectionPool.dispose();

		final String command = "java -classpath plugins\\org.eclipse.help.base_4.2.153.v20180330-0640.jar org.eclipse.help.standalone.Infocenter -command shutdown";

		try {
			Runtime.getRuntime().exec(command);
			LOGGER.info("Help System is being stopped");
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}

		Activator.context = null;
	}
}
