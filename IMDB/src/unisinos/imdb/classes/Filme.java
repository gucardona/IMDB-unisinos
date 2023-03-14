package unisinos.imdb.classes;

import java.util.Arrays;

public class Filme {
	private String codigo, nomeDoFilme, diretor;
	private int ano;
	private Tipo tipo;
	private String[] principaisAtores;
	
	
	
	public Filme(String codigo, String nomeDoFilme, String diretor, int ano, Tipo tipo, String[] principaisAtores) {
		this.codigo = codigo;
		this.nomeDoFilme = nomeDoFilme;
		this.diretor = diretor;
		this.ano = ano;
		this.tipo = tipo;
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
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public String[] getPrincipaisAtores() {
		return principaisAtores;
	}
	
	@Override
	public String toString() {
		return 	"=======================================================================================\n" +
				"[ # " + tipo + " - código " + codigo + " # ]\n\nNome: " + nomeDoFilme + "\nDiretor: " + diretor + "\nAno de lançamento: " + ano
				+ "\nPrincipais atores:" + Arrays.toString(principaisAtores) + 
				"\n=======================================================================================\n";
		
		
		
		
		
		
		
		
		
		
	}
}
