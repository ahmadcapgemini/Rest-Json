package fr.ensma.lisi.helloworldrestwebservice;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class HelloWorldResourceIntegrationTest {

	@Test
	public void testGetHello() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Get TEXT for application
		assertEquals(
				"Hello World from text/plain",
				service.path("hello").accept(MediaType.TEXT_PLAIN).get(String.class));
	}
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8088/helloworldrestwebservice/").build();
	}
}
