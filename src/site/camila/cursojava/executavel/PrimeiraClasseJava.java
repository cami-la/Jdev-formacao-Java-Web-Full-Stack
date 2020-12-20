package site.camila.cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import site.camila.cursojava.classes.Aluno;
import site.camila.cursojava.classes.Diretor;
import site.camila.cursojava.classes.Disciplina;
import site.camila.cursojava.classesauxiliares.FuncaoAutenticacao;
import site.camila.cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		try {
			String login = JOptionPane.showInputDialog("Informe o login: ");
			String senha = JOptionPane.showInputDialog("Informe a senha: ");

			// vou travar o contrato para autorizar somente quem realmente tiver o contrato
			// 100% legítimo.
			if (new FuncaoAutenticacao(new Diretor(senha, login)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

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

					for (int j = 1; j <= 2; j++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Diciplina " + j + ":");
						String valorNota = JOptionPane.showInputDialog("Nota Disciplina " + j + ":");

						Disciplina disciplinas = new Disciplina();
						disciplinas.setDisciplina(nomeDisciplina);
						disciplinas.setNota(Double.parseDouble(valorNota));

						aluno1.getDisciplinas().add(disciplinas);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					switch (escolha) {
					case 0:
						int continuarRemover = escolha;
						int posicao = 1;
						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane
									.showInputDialog("Escolha a disciplina [1, 2, 3 ou 4]");
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

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO))
						maps.get(StatusAluno.APROVADO).add(aluno);
					else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO))
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					else
						maps.get(StatusAluno.REPROVADO).add(aluno);
					;
				}

				System.out.println("---------- LISTA DOS ALUNOS APROVADOS ----------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(aluno.getNome() + ": resultado " + aluno.getAlunoAprovado() + " com média: "
							+ aluno.getMediaNota());
				}

				System.out.println("---------- LISTA DOS ALUNOS EM RECUPERAÇÃO ----------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(aluno.getNome() + ": resultado " + aluno.getAlunoAprovado() + " com média: "
							+ aluno.getMediaNota());
				}

				System.out.println("---------- LISTA DOS ALUNOS REPROVADOS ----------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(aluno.getNome() + ": resultado " + aluno.getAlunoAprovado() + " com média: "
							+ aluno.getMediaNota());

				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}
		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
					
			e.printStackTrace(); //imprime erro no console
			
			System.out.println("Mensagem: " + e.getMessage()); //mensagem de erro ou causa
			
			for(int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\nLinha do erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\nMétodo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\nClass: " + e.getClass().getName());

			}
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());
		}

	}
}
