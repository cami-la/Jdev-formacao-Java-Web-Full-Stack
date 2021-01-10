package site.camila.cursojava.threads.classes;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public ImplementacaoFilaThread() {
		new Thread(new TarefaProcessandoFila(pilhaFila)).start();
	}
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilhaFila.add(objetoFilaThread);
	}
	
	/*
	@Override
	public void run() {
		Iterator<ObjetoFilaThread> iteracao = pilhaFila.iterator(); //transformou o a pilhaFila em um objeto iterável
		
		while(iteracao.hasNext()) {
			ObjetoFilaThread processar = iteracao.next(); //pega o objeto atual
			
			
			 Faz a rotina:
			 - processar NF;
			 - gera uma lista de pdf;
			 - gera envio de e-mails; 
			
			System.out.println("------------------");
			System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			
			iteracao.remove();
			
			try {
				Thread.sleep(100); //dar um tempo para descarga de memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		try {
			Thread.sleep(100); //dar um tempo para descarga de memória
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	*/
}
