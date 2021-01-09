package site.camila.cursojava.threads.executavel;

import javax.swing.JOptionPane;

import site.camila.cursojava.threads.classes.TarefaGenerica1;
import site.camila.cursojava.threads.classes.TarefaGenerica2;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNF = new Thread(thread2);
		threadNF.start();
		
		
		/*new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		*/

//		new Thread(new TarefaGenerica1()).start();
//		new Thread(new TarefaGenerica2()).start();

//		Thread threadEmail = new Thread(new TarefaGenerica1());
//		Thread threadNF = new Thread(new TarefaGenerica2());
//		
//		threadNF.start();
//		threadEmail.start();

		System.out.println("Chegou ao fim do código de teste de tread.".toUpperCase());
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
			}
		}
	};
	
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando alguma rotina, por exemplo envio de NF.");
			}
		}
	};
	
	
}
