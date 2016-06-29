package fr.ensma.lisi.librarycontentrestwebservice;

import lombok.Data;

@Data
public class JokeResponse {

	private String type;
	private Joke[] value;

}
