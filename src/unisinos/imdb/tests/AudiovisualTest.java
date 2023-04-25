package unisinos.imdb.tests;

import org.junit.Test;
import unisinos.imdb.classes.Audiovisual;
import unisinos.imdb.classes.Biblioteca;
import unisinos.imdb.classes.Filme;
import unisinos.imdb.classes.Genero;

import static org.junit.Assert.assertEquals;

public class AudiovisualTest {
	
	@Test
	public void testa_adicao_de_filme_ou_serie() {
		Biblioteca b = new Biblioteca();
		String[] p = {"ddd", "fff", "ggg"};
		Filme a = new Filme("111", "aaa", "bbb", 2000, Genero.ACAO, p,
				2.5);

		b.adicionaMidia(a);
		assertEquals(a, b.getMidia()[0]);
	}
}
