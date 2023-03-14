package unisinos.imdb.testes;

import unisinos.imdb.classes.*;

public class FilmesTeste {
	public static void main(String[] args) {
		String[] principaisAtoresKingsman = {"Colin Firth", "Matthew Vaughn", "Samuel L. Jackson"};
		Filme f1 = new Filme("tt2802144", "Kingsman: The Secret Service", "Matthew Vaughn", 2014, Tipo.FILME, principaisAtoresKingsman);
		
		System.out.println(f1);
	}
}
