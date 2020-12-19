package site.camila.cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int i = 1; i <= 2; i++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno " + i + ": ");
			/*
			 * String idade = JOptionPane.showInputDialog("Idade: "); String
			 * dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
			 * String rg = JOptionPane.showInputDialog("RG: "); String cpf =
			 * JOptionPane.showInputDialog("CPF: "); String mae =
			 * JOptionPane.showInputDialog("Nome da mãe: "); String pai =
			 * JOptionPane.showInputDialog("Nome do Pai: "); String dataMatricula =
			 * JOptionPane.showInputDialog("Data da Matricula: "); String serie =
			 * JOptionPane.showInputDialog("Série "); String escola =
			 * JOptionPane.showInputDialog("Escola: ");
			 */
			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataDeNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(dataMatricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int j = 1; j <= 4; j++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Diciplina " + j + ":");
				String valorNota = JOptionPane.showInputDialog("Nota Disciplina " + j + ":");

				Disciplina disciplinas = new Disciplina();
				disciplinas.setDisciplina(nomeDisciplina);
				disciplinas.setNota(Double.valueOf(valorNota));

				aluno1.getDisciplinas().add(disciplinas);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			switch (escolha) {
			case 0:
				int continuarRemover = escolha;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Escolha a disciplina [1, 2, 3 ou 4]");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
				break;
			}
			/*
			 * if (escolha == 0) { String disciplinaRemover =
			 * JOptionPane.showInputDialog("Escolha a disciplina [1, 2, 3 ou 4]");
			 * aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()
			 * - 1); }
			 */

			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("Camila")) {
				alunos.remove(aluno);
				break;
			} else {
				System.out.println(alunos);
				System.out.println("Média da nota do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("------------------------------------------");
			}
		}

		System.out.println("Alunos que sobraram na lista");
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
			System.out.println("Matérias: ");
			for (Disciplina disciplina : aluno.getDisciplinas())
				System.out.println(disciplina.getDisciplina());
		}

	}
}
