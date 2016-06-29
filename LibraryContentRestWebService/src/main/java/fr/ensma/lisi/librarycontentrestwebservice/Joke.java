package fr.ensma.lisi.librarycontentrestwebservice;

import lombok.Data;

@Data
public class Joke {

	private int id;
	private String joke;
	private String[] categories;

	private static final String[] Mes_Categorie = { "explicit", "nerdic" };

	public static String[] getMesCategorie() {
		return Mes_Categorie;
	}
}
