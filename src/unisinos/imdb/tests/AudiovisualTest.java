package unisinos.imdb.tests;

import org.junit.Before;
import org.junit.Test;
import unisinos.imdb.biblioteca.Biblioteca;
import unisinos.imdb.midias.Filme;
import unisinos.imdb.midias.Genero;
import unisinos.imdb.midias.Serie;

import static org.junit.Assert.assertEquals;


public class AudiovisualTest {

    Biblioteca biblioteca = new Biblioteca();
    ;
    String[] atoresFilme, atoresSerie;
    Filme filme;
    Serie serie;

    @Before
    public void inicializa() {
        criaMidias();
    }

    private void criaMidias() {
        atoresFilme = new String[]{"Benedict Cumberbatch", "Chiwetel Ejiofor", "Rachel McAdams", "Benedict Wong"};
        filme = new Filme("tt1211837", "Doutor Estranho", "Scott Derrickson", 2016, Genero.ACAO,
                atoresFilme, 115);

        atoresSerie = new String[]{"Steve Carrel", "Rainn Wilson", "John Krasinski", "Jenna Fischer"};
        serie = new Serie("tt0386676", "The Office", "Greg Daniels", 2005, Genero.SITCOM,
                atoresSerie, 9, 201);
    }

    @Test
    public void testa_adicao_e_remocao_de_filme_ou_serie() {
        biblioteca.adicionaMidia(filme);

        assertEquals(filme, biblioteca.getMidia()[0]);

        biblioteca.adicionaMidia(serie);
        assertEquals(serie, biblioteca.getMidia()[1]);

        biblioteca.removeMidia(biblioteca.getMidia()[0]);
        assertEquals(null, biblioteca.getMidia()[0]);

        biblioteca.removeMidia(biblioteca.getMidia()[1]);
        assertEquals(null, biblioteca.getMidia()[1]);
    }
}
