package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		// Com set, não se tem garantia na ordem dos elementos.
		// Não aceita elementos repetidos
		// HashSet: tabela de espalhamento
		
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		// A vantagem da coleção Set é a rapidez para encontrar um elemento com o método contains:
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {System.out.println(aluno);});
		
		// Para acesso de cada elemento, se usa o laço:
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
