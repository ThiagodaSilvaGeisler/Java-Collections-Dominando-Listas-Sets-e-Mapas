package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(javaColecoes.getAulas());
	}
}
		
