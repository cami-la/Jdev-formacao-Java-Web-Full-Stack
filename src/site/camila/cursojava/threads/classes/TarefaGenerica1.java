package site.camila.cursojava.threads.classes;

public class TarefaGenerica1 implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
