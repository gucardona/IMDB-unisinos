package unisinos.imdb.streaming;

import unisinos.imdb.midias.Audiovisual;

public class Categoria {
    TiposCategorias tipo;
    Audiovisual[] midias;

    public Categoria(TiposCategorias tipo, Audiovisual[] midias) {
        this.tipo = tipo;
        this.midias = midias;
    }

    public Audiovisual[] getMidias() {
        return midias;
    }

    public void setMidias(Audiovisual[] midias) {
        this.midias = midias;
    }

    public TiposCategorias getTipo() {
        return tipo;
    }

    public void setTipo(TiposCategorias tipo) {
        this.tipo = tipo;
    }
}
