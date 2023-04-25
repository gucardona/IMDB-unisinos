package unisinos.imdb.midias;

public class Filme extends Audiovisual {

    private int duracao;

    public Filme(String codigo, String nomeDoFilme, String diretor, int ano, Genero genero, String[] principaisAtores,
                 int duracao) {

        super(codigo, nomeDoFilme, diretor, ano, genero, principaisAtores);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "{ # FILME: duracao=" + duracao + ", " + super.toString() +
                " # }";
    }
}
