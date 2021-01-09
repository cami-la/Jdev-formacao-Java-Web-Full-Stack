package site.camila.cursojava.threads.classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); //Painel de Componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostrarTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostrarTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	
	public TelaTimeThread() {
		setTitle("Minha tela time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira parte concluída
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*Controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0; //linha
		gridBagConstraints.gridy = 0; //coluna
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		this.descricaoHora.setPreferredSize(new Dimension(200, 25));
		this.jPanel.add(this.descricaoHora, gridBagConstraints);
		
		this.mostrarTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostrarTempo.setEditable(false);
		this.jPanel.add(this.mostrarTempo, gridBagConstraints);

		this.descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		this.jPanel.add(this.descricaoHora2, gridBagConstraints);
		
		this.mostrarTempo2.setPreferredSize(new Dimension(200,25));
		mostrarTempo2.setEditable(false);
		gridBagConstraints.gridy++;
		this.jPanel.add(mostrarTempo2, gridBagConstraints);		
		
		
		gridBagConstraints.gridwidth = 1;
		
		this.jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		this.jPanel.add(jButton, gridBagConstraints);
		
		this.jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		this.jPanel.add(jButton2, gridBagConstraints);
		
		add(jPanel, BorderLayout.WEST);
		
		//sempre será o último comando
		setVisible(true); //torna a tela visível para o usuário
	}
	
	
}
