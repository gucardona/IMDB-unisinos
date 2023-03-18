package unisinos.imdb.testes;

import unisinos.imdb.classes.*;

public class BibliotecaTeste {
	public static void main(String[] args) {
		String[] principaisAtoresKingsman = { "Colin Firth", "Matthew Vaughn", "Samuel L. Jackson" };
		Filme f1 = new Filme("tt2802144", "Kingsman: The Secret Service", "Matthew Vaughn", 2014, Tipo.FILME,
				principaisAtoresKingsman);

		String[] principaisAtoresSherlock = { "Benedict Cumberbatch", "Martin Freeman", "Andrew Scott" };
		Filme f2 = new Filme("tt1475582", "Sherlock", "Mark Gatiss", 2010, Tipo.SERIE, principaisAtoresSherlock);
		
		String[] principaisAtoresTLU = { "Pedro Pascal", "Bella Ramsey" };
		Filme f3 = new Filme("tt3581920", "The Last of Us", "Craig Mazin", 2023, Tipo.SERIE, principaisAtoresTLU);
		
		String[] principaisAtoresRRR = { "Marina Fois", "Alain Chabat", "Maurice Barthélémy" };
		Filme f4 = new Filme("tt0357111", "RRRrrrr!!! Na Idade da Pedra", "Alain Chabat", 2004, Tipo.SERIE, principaisAtoresRRR);
		
		Biblioteca biblioteca = new Biblioteca(null);

		biblioteca.adicionaFilme(f1);
		biblioteca.adicionaFilme(f2);
		biblioteca.adicionaFilme(f3);
		biblioteca.adicionaFilme(f4);
		biblioteca.removeFilme(f1);
		biblioteca.listaFilmes();
	}
}
