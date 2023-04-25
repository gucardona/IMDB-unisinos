package unisinos.imdb.classes;

import java.util.Arrays;

public class Biblioteca {
    Audiovisual[] filmes_e_series;
    private static final int TAMANHO = 100;

    public Biblioteca(Audiovisual[] filmes_e_series) {
        this.filmes_e_series = filmes_e_series;
    }

    public Biblioteca() {
        filmes_e_series = new Audiovisual[TAMANHO];
    }

    public void listaMidias() {
        for (int i = 0; i < filmes_e_series.length; i++) {
            if (filmes_e_series[i] == null)
                break;
            System.out.println(filmes_e_series.toString());
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

    public void adicionaMidia(Audiovisual midia) {
        for (int i = 0; i < filmes_e_series.length; i++) {
            if(filmes_e_series[i] == null) {
                filmes_e_series[i] = midia;
                break;
            }
        }
    }

    public void removeMidia(Audiovisual filmeOuSerie) {
        for (int i = 0; i < filmes_e_series.length; i++) {
            if (filmes_e_series[i].getCodigo().equalsIgnoreCase(filmeOuSerie.getCodigo())) {
                filmes_e_series[i] = null;
                break;
            }
        }
    }

    public Audiovisual[] getMidia() {
        return filmes_e_series;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "filmes_e_series=" + Arrays.toString(filmes_e_series) +
                '}';
    }
}
