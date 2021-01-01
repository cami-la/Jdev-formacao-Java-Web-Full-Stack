package site.camila.cursojava.executavel;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };

		// Criação do aluno;
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDev Treinamento");
		// Criação da disciplina;
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		// Criação da disciplina;
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso Lógica");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);
		
		// Criação do aluno;
				Aluno aluno1 = new Aluno();
				aluno1.setNome("Camila Cavalcante");
				aluno1.setNomeEscola("JDev Treinamento");
				// Criação da disciplina;
				Disciplina disciplina3 = new Disciplina();
				disciplina3.setDisciplina("Curso de Java");
				disciplina3.setNota(notas);

				aluno1.getDisciplinas().add(disciplina3);

				// Criação da disciplina;
				Disciplina disciplina4 = new Disciplina();
				disciplina4.setDisciplina("Curso Lógica");
				disciplina4.setNota(notasLogica);
				aluno1.getDisciplinas().add(disciplina4);
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno1;

		
		for (Aluno alunoDoArray : arrayAlunos) {
			System.out.println("O nome do aluno é: " + alunoDoArray.getNome());
			System.out.println("Disciplinas: ");
			for (Disciplina disciplinasDoAluno: alunoDoArray.getDisciplinas()) {
				System.out.println(disciplinasDoAluno.getDisciplina() + " ");
				for(int i = 0; i < disciplinasDoAluno.getNota().length; i++) {
					System.out.println("A nota número " + (i+1) + " é igual " + disciplinasDoAluno.getNota()[i]);
				}
				/*for (double notasDaDisciplina: disciplinasDoAluno.getNota()) {
					System.out.println(notasDaDisciplina);
				}*/
			}
			System.out.println();
		}
		
		
		
/*
		System.out.println("Nome do Aluno " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("---------- Disciplinas do aluno ----------");

		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println(disc.getDisciplina());
			
			double notaMax = Double.NEGATIVE_INFINITY;
			double notaMin = Double.POSITIVE_INFINITY;
			for (double not : disc.getNota()) {
				System.out.print(not + " ");
				if (disc.getNota().length == 0) {
					notaMax = 0.0;
					notaMin = 0.0;
				}
				if (disc.getNota().length == 1) {
					notaMax = not;
					notaMin = not;
				}
				if (not > notaMax) notaMax = not;
				if (not < notaMin) notaMin = not;
			}
			System.out.println("\nNota Minima = " + notaMin);
			System.out.println("Nota Máxima = " + notaMax);
	}
	*/
	}

}
