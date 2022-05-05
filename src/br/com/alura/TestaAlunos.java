package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		// Com set, n�o se tem garantia na ordem dos elementos.
		// N�o aceita elementos repetidos
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {System.out.println(aluno);});
		
		// Para acesso de cada elemento, se usa o la�o:
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}
}
