package site.camila.cursojava.threads;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		//Quero executar esse envio com um tempo de parada ou com um tempo determinado.
		for (int i = 0; i < 10; i++) {
			System.out.println("Executando alguma rotina, por exemplo, envio de e-mail.");
			Thread.sleep(1000);//Dá um tempo.			
		}
		System.out.println("Chegou ao fim do código de teste de tread.");
	}
}
