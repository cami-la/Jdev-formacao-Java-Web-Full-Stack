package site.camila.cursojava.threads.classes;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TarefaProcessandoFila implements Runnable {

	private ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila;

	public TarefaProcessandoFila(ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila) {
		this.pilhaFila = pilhaFila;
	}

	@Override
	public void run() {
		System.out.println("Fila rodando...");

		while (true) {
			Iterator<ObjetoFilaThread> iteracao = pilhaFila.iterator(); // transformou o a pilhaFila em um objeto iterável
			synchronized (iteracao) {
				while (iteracao.hasNext()) {
					ObjetoFilaThread processar = iteracao.next(); // pega o objeto atual

					/*
					 * Faz a rotina: - processar NF; - gera uma lista de pdf; - gera envio de
					 * e-mails;
					 */
					System.out.println("------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();

					try {
						Thread.sleep(1000); // dar um tempo para descarga de memória
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				try {
					Thread.sleep(100); // dar um tempo para descarga de memória
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
