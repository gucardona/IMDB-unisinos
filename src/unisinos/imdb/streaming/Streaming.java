package unisinos.imdb.streaming;

import unisinos.imdb.midias.Audiovisual;

import java.util.Arrays;

public class Streaming {
    String nome;
    Categoria[] categorias;

    public Streaming(String nome, Categoria[] categorias) {
        this.nome = nome;
        this.categorias = categorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria[] getCategoria() {
        return categorias;
    }

    public void setCategoria(Categoria[] categoria) {
        this.categorias = categoria;
    }
}
