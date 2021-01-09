package site.camila.cursojava.threads.executavel;

import javax.swing.JOptionPane;

import site.camila.cursojava.threads.classes.TarefaGenerica;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		//new Thread(new TarefaGenerica()).start();
		
		System.out.println("Chegou ao fim do código de teste de tread.");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
	}
}
