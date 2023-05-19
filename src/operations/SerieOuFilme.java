package operations;

import unisinos.imdb.main.Teclado;

public class SerieOuFilme {

    public static String consulta() {
        int resposta = Teclado.leInt("(1) Série\n(2) Filme\nEscolha: ");
        if (resposta == 1)
            return "tv_series";

        else if (resposta == 2)
            return "tv_movies";

        else
            throw new IllegalArgumentException();
    }
}
