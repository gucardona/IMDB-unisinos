package unisinos.imdb.streaming;

import unisinos.imdb.midias.Audiovisual;

public class Categoria {
    String nome;
    Audiovisual[] midias;

    public Categoria(String nome, Audiovisual[] midias) {
        this.nome = nome;
        this.midias = midias;
    }

    public Audiovisual[] getMidias() {
        return midias;
    }

    public void setMidias(Audiovisual[] midias) {
        this.midias = midias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
