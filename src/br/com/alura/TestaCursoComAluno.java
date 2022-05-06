package br.com.alura;

import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		System.out.println(javaColecoes.getAulas());

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		
		//Se a Set não tem método get, como se percoria lista, antes do java8?
		for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		
		
		System.out.println("-------------------------------------------------------");
		
		//Vector: seguro para ser usada por várias Threads simultaneamente
		Vector<Aluno> vetor = new Vector<>();
		
		
		
		System.out.println("-------------------------------------------------------");
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}
}