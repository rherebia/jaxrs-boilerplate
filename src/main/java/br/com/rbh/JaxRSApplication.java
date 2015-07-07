package br.com.rbh;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class JaxRSApplication extends ResourceConfig {

	public JaxRSApplication() {
		packages("br.com.rbh.api");
	}
}
