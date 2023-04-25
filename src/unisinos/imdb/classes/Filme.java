package unisinos.imdb.classes;

public class Filme extends Audiovisual {

	private double duracao;

	public Filme(String codigo, String nomeDoFilme, String diretor, int ano, Genero genero, String[] principaisAtores,
			double duracao) {

		super(codigo, nomeDoFilme, diretor, ano, genero, principaisAtores);
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "{ # FILME: duracao=" + duracao + ", " + super.toString() +
				" # }";
	}
}
