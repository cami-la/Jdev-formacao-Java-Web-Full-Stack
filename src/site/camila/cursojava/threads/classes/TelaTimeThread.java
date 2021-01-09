package site.camila.cursojava.threads.classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de Componentes

	private JLabel descricaoHora = new JLabel("Time Thread 1");
	public JTextField mostrarTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostrarTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	private Thread thread1Time;
	private Thread thread2Time;

//	private Runnable thread1 = new Runnable() {
//
//		@Override
//		public void run() {
//			while(true) {
//				mostrarTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	};
//	
//	private Runnable thread2 = new Runnable() {
//
//		@Override
//		public void run() {
//			while(true) {
//				mostrarTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	};
//	

	public TelaTimeThread() {
		setTitle("Minha tela time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		// Primeira parte concluída

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*
																			 * Controlador de posicionamento de
																			 * componentes
																			 */
		gridBagConstraints.gridx = 0; // linha
		gridBagConstraints.gridy = 0; // coluna
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

		this.mostrarTempo2.setPreferredSize(new Dimension(200, 25));
		mostrarTempo2.setEditable(false);
		gridBagConstraints.gridy++;
		this.jPanel.add(mostrarTempo2, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		this.jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		this.jPanel.add(jButton, gridBagConstraints);

		this.jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		this.jPanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) { // executa o clique no botão
//				thread1Time = new Thread(thread1);
//				thread2Time = new Thread(thread2);

				thread1Time = new Thread(new TarefaMostraDataEHora(mostrarTempo));
				thread1Time.start();

				thread2Time = new Thread(new TarefaMostraDataEHora2(mostrarTempo2));
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) { // executa o clique no botão
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		
		jButton2.setEnabled(false);
		add(jPanel, BorderLayout.WEST);

		// sempre será o último comando
		setVisible(true); // torna a tela visível para o usuário
	}

}
