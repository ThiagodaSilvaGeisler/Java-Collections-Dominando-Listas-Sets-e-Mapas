package br.com.alura;

public class Aula {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titutlo, int tempo) {
		this.titulo = titutlo;
		this.tempo = tempo;
	}
	
	public String getTitutlo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}
	
}
