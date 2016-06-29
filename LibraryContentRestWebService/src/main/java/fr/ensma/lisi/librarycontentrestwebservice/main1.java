package fr.ensma.lisi.librarycontentrestwebservice;

public class main1 {

	public static void main(String[] args) {

		Joke joke1 = new Joke();
		joke1.setId(1);
		joke1.setJoke("There is no such thing as global warming. Chuck Norris was cold,"
																+ " so he turned the sun up.");
		joke1.setCategories(Joke.getMesCategorie());

		
		Joke joke2 = new Joke();
		joke2.setId(2);
		joke2.setJoke("Chuck Norris brushes his teeth with a mixture of iron shavings,"
										+ " industrial paint remover, and wood-grain alcohol.");
		joke2.setCategories(Joke.getMesCategorie());
		
		Joke jokes [] = new Joke[2];
		jokes [0] = joke1;
		jokes [1]= joke2;
		
		JokeResponse jokeResponse = new JokeResponse();
		jokeResponse.setType("sucess");
		jokeResponse.setValue(jokes);
		System.out.println(jokeResponse);
	}

}
