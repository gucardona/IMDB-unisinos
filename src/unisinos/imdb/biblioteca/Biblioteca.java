package unisinos.imdb.biblioteca;

import unisinos.imdb.midias.Audiovisual;

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

    public Audiovisual consultaMidia(int posicao) {
        return filmes_e_series[posicao];
    }

    public void adicionaMidia(Audiovisual midia) {
        for (int i = 0; i < filmes_e_series.length; i++) {
            if (filmes_e_series[i] == null) {
                filmes_e_series[i] = midia;
                break;
            }
        }
    }

    public void removeMidia(Audiovisual midia) {
        for (int i = 0; i < filmes_e_series.length; i++) {
            if (filmes_e_series[i] != null && filmes_e_series[i].equals(midia)) {
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
