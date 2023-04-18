package unisinos.imdb.classes;

public class Biblioteca {
	Audiovisual[] filmes_e_series;

	public Biblioteca(Audiovisual[] audiovisual) {
		this.filmes_e_series = new Audiovisual[100];
	}

	public void listaFilmes() {
		for (Audiovisual filme_ou_serie : filmes_e_series) {
			if (filme_ou_serie == null)
				break;
			System.out.println(filme_ou_serie);
		}
	}

	public void ordenaMidias() {
		for (int i = 0; i < filmes_e_series.length; i++) {
			for (int j = i + 1; j < filmes_e_series.length; j++) {
				if (filmes_e_series[i] == null) {
					filmes_e_series[i] = filmes_e_series[j];
					filmes_e_series[j] = null;
				}

			}
		}
	}

	public void adicionaMidia(Audiovisual filme) {
		for (int i = 0; i < filmes_e_series.length; i++) {
			if (filmes_e_series[i] == null) {
				filmes_e_series[i] = filme;
				break;
			}
		}
		ordenaMidias();
	}

	public void removeMidia(Audiovisual filmeOuSerie) {
		for (int i = 0; i < filmes_e_series.length; i++) {
			if (filmes_e_series[i] != null
					&& filmes_e_series[i].getCodigo().equalsIgnoreCase(filmeOuSerie.getCodigo())) {
				filmes_e_series[i] = null;
				break;
			}
		}
		ordenaMidias();
	}
}
