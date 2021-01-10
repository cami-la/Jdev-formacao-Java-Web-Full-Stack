package site.camila.cursojava.threads.classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaNomeEEmail extends JDialog {
	/**
	 * atributos: 1 janela 2 campos de texto (Nome e e-mail) 2 label (para nome e
	 * e-mail) 2 botões (add e stop)
	 */
	private JPanel jpanel = new JPanel(new GridBagLayout()); // janela

	// labels
	private JLabel labelNome = new JLabel("Nome");
	private JLabel labelEmail = new JLabel("E-mail");

	// campos de texto
	private JTextField textNome = new JTextField();
	private JTextField textEmail = new JTextField();

	// botões
	private JButton buttonAdd = new JButton("Add");
	private JButton buttonStop = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaNomeEEmail() {
		setTitle("Fila e Pilha"); // título
		setSize(new Dimension(240, 240)); // tamanho
		setLocationRelativeTo(null); // a janela abrirá no meio da tela
		setResizable(false); // não é permitido aumentar ou diminuir a janela
		// primeiras configurações

		// controlador de posicionamento dos componentes.
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0; // começa na linha 0 do grid.
		gridBagConstraints.gridy = 0; // começa na coluna 0 do grid.
		gridBagConstraints.gridwidth = 2;// cada atributo ocupa 2 espaços no grid.
		gridBagConstraints.insets = new Insets(5, 10, 5, 5); // alinhamento: cima, baixo, direita, esqueda
		gridBagConstraints.anchor = GridBagConstraints.WEST; // alinhado a esqueda

		// configurando a label nome
		labelNome.setPreferredSize(new Dimension(200, 25)); // tamanho da label largura x altura
		jpanel.add(labelNome, gridBagConstraints); // adicionando a label (nome) na janela (jpanel) de acordo com as
													// definições do grid (gridBagConstraints)

		// configurando o campo de texto nome
		textNome.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // pula uma linha
		jpanel.add(textNome, gridBagConstraints);

		// configurando a label e-mail
		labelEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(labelEmail, gridBagConstraints);

		// configurando o campo de texto e-mail
		textEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(textEmail, gridBagConstraints);

		gridBagConstraints.gridwidth = 1; // a partir de agora, cada atributo ocupa apenas 1 grid

		// configurando botões
		buttonAdd.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(buttonAdd, gridBagConstraints);

		buttonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++; // pula um grid, como foi redefinido (gridwidth), agora cada atributo ocupa
									// apenas 1 grid.
		jpanel.add(buttonStop, gridBagConstraints);

		// colocando função aos botões
		buttonAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for (int i = 0; i < 10; i++) { // simulando 100
					ObjetoFilaThread filaThread = new ObjetoFilaThread(); // objeto que será adicionado na lista assim
																			// que apertar-mos o botão add
					filaThread.setNome(textNome.getText() + " - " + i); // colocando o nome que veio do campo (textNome)
																		// dentro do
					// objeto (filaThread)
					filaThread.setEmail(textEmail.getText()); // colocando o e-mail que veio do campo (textEmail) dentro
																// do objeto (filaThread)

					fila.add(filaThread); // adicionando o objeto (filaThread) dentro da fila
				}

			}
		});

		buttonStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				fila.stop();
				fila = null;
			}
		});

		//fila.start();
		// ultima configuração
		add(jpanel, BorderLayout.WEST); // delimitando uma borda para o jpanel
		setVisible(true); // torna a janela visível

	}
}
