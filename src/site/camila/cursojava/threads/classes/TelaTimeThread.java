package site.camila.cursojava.threads.classes;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() {
		setTitle("Minha tela time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira parte concluída
		
		
		//sempre será o último comando
		setVisible(true); //torna a tela visível para o usuário
	}
}
