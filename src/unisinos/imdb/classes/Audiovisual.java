package unisinos.imdb.classes;

import java.util.Arrays;

public abstract class Audiovisual {
	private String codigo, nomeDoFilme, diretor;
	private int ano;
	private Genero genero;
	private String[] principaisAtores;

	public Audiovisual(String codigo, String nomeDoFilme, String diretor, int ano, Genero genero,
			String[] principaisAtores) {

		this.codigo = codigo;
		this.nomeDoFilme = nomeDoFilme;
		this.diretor = diretor;
		this.ano = ano;
		this.setGenero(genero);
		this.principaisAtores = principaisAtores;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNomeDoFilme() {
		return nomeDoFilme;
	}

	public String getDiretor() {
		return diretor;
	}

	public int getAno() {
		return ano;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String[] getPrincipaisAtores() {
		return principaisAtores;
	}

	@Override
	public String toString() {
		return "codigo='" + codigo + '\'' +
				", nomeDoFilme='" + nomeDoFilme + '\'' +
				", diretor='" + diretor + '\'' +
				", ano=" + ano +
				", genero=" + genero +
				", principaisAtores=" + Arrays.toString(principaisAtores);
	}
}
