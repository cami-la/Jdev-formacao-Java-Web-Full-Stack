package site.camila.cursojava.executavel;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};

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
		disciplina2.setDisciplina("Curso de Java");
		disciplina2.setNota(notasLogica);

	}

}
