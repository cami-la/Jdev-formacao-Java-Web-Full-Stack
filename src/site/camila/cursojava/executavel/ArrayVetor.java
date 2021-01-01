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
	}

}
