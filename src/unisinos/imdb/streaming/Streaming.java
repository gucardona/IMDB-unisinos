package unisinos.imdb.streaming;

public class Streaming {
    String nome;
    Categoria categoria;

    public Streaming(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Streaming{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
