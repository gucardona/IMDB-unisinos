package unisinos.imdb.streaming;

import java.util.Arrays;

public class Categoria {
    String[] categorias;

    public Categoria(String[] categorias) {
        this.categorias = categorias;
    }

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "categorias=" + Arrays.toString(categorias) +
                '}';
    }
}
