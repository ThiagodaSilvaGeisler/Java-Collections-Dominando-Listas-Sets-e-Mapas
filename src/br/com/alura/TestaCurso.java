package br.com.alura;

import java.util.ArrayList;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
	}
}
