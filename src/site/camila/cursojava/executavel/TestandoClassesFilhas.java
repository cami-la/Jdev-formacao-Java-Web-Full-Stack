package site.camila.cursojava.executavel;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Diretor;
import site.camila.cursojava.classes.Pessoa;
import site.camila.cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Camila Cavalcante");
		aluno.setIdade(21);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("sasasasa");
		diretor.setNome("Cavalcante");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("asasa4s654a");
		secretario.setIdade(18);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		
		System.out.println("Salário Aluno = R$" + aluno.salario());
		System.out.println("Salário Secretario = R$" + secretario.salario());
		System.out.println("Salário Diretor = R$" + diretor.salario());
		
		Pessoa pessoa = new Aluno();
		pessoa = secretario;
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " 
							+ pessoa.getNome() + " e o salario é de = R$" + pessoa.salario());
	}

}
