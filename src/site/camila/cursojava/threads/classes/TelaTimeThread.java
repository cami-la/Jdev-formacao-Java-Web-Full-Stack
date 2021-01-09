package site.camila.cursojava.threads.classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
	
	public TelaTimeThread() {
		setTitle("Minha tela time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira parte concluída
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*Controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0; //linha
		gridBagConstraints.gridy = 0; //coluna
		
		this.descricaoHora.setPreferredSize(new Dimension(200, 25));
		this.jPanel.add(this.descricaoHora, gridBagConstraints);
		
		this.mostrarTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		this.jPanel.add(this.mostrarTempo, gridBagConstraints);

		this.descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		this.jPanel.add(this.descricaoHora2, gridBagConstraints);
		
		this.mostrarTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		this.jPanel.add(mostrarTempo2, gridBagConstraints);		
		
		add(jPanel, BorderLayout.WEST);
		
		//sempre será o último comando
		setVisible(true); //torna a tela visível para o usuário
	}
	
	
}
