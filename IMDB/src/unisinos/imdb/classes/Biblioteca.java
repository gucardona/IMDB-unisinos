package unisinos.imdb.classes;

public class Biblioteca {
	Filme[] filmes;
	
	public Biblioteca(Filme[] filmes) {
		this.filmes = new Filme[100];
	}

	public void listaFilmes() {
		for (Filme filme : filmes) {
			if(filme == null)
				break;
			System.out.println(filme);
		}
	}
	
	public void ordenaFilmes() {
		for(int i = 0; i < filmes.length; i++) {
			for(int j = i+1; j < filmes.length; j++) {
				if(filmes[i] == null)
					filmes[i] = filmes[j];
			}
		}
	}

	public void adicionaFilme(Filme filme) {
		for (int i = 0; i < filmes.length; i++) {
			if(filmes[i] == null) {
				filmes[i] = filme;
				break;
			}
		}
	}
	
	public void removeFilme(Filme filme) {
		for(int i = 0; i < filmes.length; i++) {
			if(filmes[i].getCodigo().equalsIgnoreCase(filme.getCodigo())) {
				filmes[i] = null;
				break;
			}
		}
	}
}
