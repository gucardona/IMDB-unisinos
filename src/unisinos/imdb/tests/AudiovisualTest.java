package unisinos.imdb.tests;

import org.junit.Before;
import org.junit.Test;
import unisinos.imdb.biblioteca.Biblioteca;
import unisinos.imdb.midias.Audiovisual;
import unisinos.imdb.midias.Filme;
import unisinos.imdb.midias.Genero;
import unisinos.imdb.midias.Serie;
import unisinos.imdb.streaming.Categoria;
import unisinos.imdb.streaming.Streaming;
import unisinos.imdb.streaming.TiposCategorias;

import static org.junit.Assert.assertEquals;

public class AudiovisualTest {

    Biblioteca biblioteca = new Biblioteca();
    String[] atoresFilme, atoresSerie;
    Filme filme;
    Serie serie;

    Audiovisual[] midias_top250_netflix;

    Categoria[] categorias;
    Streaming streaming;

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

    @Test
    public void testa_streaming() {
        Audiovisual[] midias_top10br = new Audiovisual[]{filme, serie};

        Categoria top10br = new Categoria(TiposCategorias.TOP_10_BRASIL, midias_top10br);

        Categoria[] categorias = new Categoria[]{top10br};

        Streaming netflix = new Streaming("netflix", categorias);

        assertEquals(filme, netflix.getCategoria()[0].getMidias()[0]);
        assertEquals(serie, netflix.getCategoria()[0].getMidias()[1]);
    }
}
