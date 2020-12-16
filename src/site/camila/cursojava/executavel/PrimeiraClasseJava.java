package site.camila.cursojava.executavel;

import javax.swing.JOptionPane;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome: ");
		String idade = JOptionPane.showInputDialog("Idade: ");
		String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
		String rg = JOptionPane.showInputDialog("RG: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String mae = JOptionPane.showInputDialog("Nome da mãe: ");
		String pai = JOptionPane.showInputDialog("Nome do Pai: ");
		String dataMatricula = JOptionPane.showInputDialog("Data da Matricula: ");
		String serie = JOptionPane.showInputDialog("Série ");
		String escola = JOptionPane.showInputDialog("Escola: ");
		/*String disciplina1 = JOptionPane.showInputDialog("Disciplina 1: ");
		String nota1 = JOptionPane.showInputDialog("Nota1: ");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2: ");
		String nota2 = JOptionPane.showInputDialog("Nota2: ");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3: ");
		String nota3 = JOptionPane.showInputDialog("Nota3: ");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4: ");
		String nota4 = JOptionPane.showInputDialog("Nota4: ");
		*/

		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataDeNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);	
		
		
		System.out.println("O nome do aluno1 é = " + aluno1.getNome());
		System.out.println("A idade do aluno1 é = " + aluno1.getIdade() + " anos");
		System.out.println("A data de nascimento do aluno1 é = " + aluno1.getDataNascimento());
		System.out.println("Escola " + aluno1.getNomeEscola());
		System.out.println("Média da nota do aluno1 é " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.isAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Mensagem = " + aluno1.getAlunoAprovado());
		System.out.println("====================");
		
		System.out.println(aluno1);
		
	}
}
