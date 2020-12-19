package site.camila.cursojava.executavel;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Diretor;
import site.camila.cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Camila Cavalcante");

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("sasasasa");
		diretor.setNome("Cavalcante");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("asasa4s654a");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
