package fr.ensma.lisi.librarycontentrestwebservice;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

/**
 * @author Eric at. al.
 * 
 *         Date : Juin 2016
 */
@Path("/jokes")
public class JokeRessource {


	/**
	 * URI: /jokes/jaxbjson/12
	 * 
	 * @return
	 * @throws IOException
	 */
	@Path("random/{id}")
	@Produces("application/json")
	@GET
	public JokeResponse getContentJokesWithJAXBJSON(@PathParam("id") int id) throws IOException {
		System.out.println("JokeResource.getContentJokesWithJAXBJSON()");

		Joke joke1 = new Joke();
		joke1.setId(1);
		joke1.setJoke("There is no such thing as global warming. Chuck Norris was cold," + " so he turned the sun up.");
		joke1.setCategories(Joke.getMesCategorie());

		Joke joke2 = new Joke();
		joke2.setId(2);
		joke2.setJoke("Chuck Norris brushes his teeth with a mixture of iron shavings,"
				+ " industrial paint remover, and wood-grain alcohol.");
		joke2.setCategories(Joke.getMesCategorie());

		Joke jokes[] = new Joke[2];
		jokes[0] = joke1;
		jokes[1] = joke2;

		JokeResponse jokeResponse = new JokeResponse();
		jokeResponse.setType("sucess");
		jokeResponse.setValue(jokes);

		return jokeResponse; 
	}

}
