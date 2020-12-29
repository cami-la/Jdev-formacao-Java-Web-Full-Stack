package site.camila.cursojava.executavel;

public class ArrayVetor {

	public static void main(String[] args) {
		// Array pode ser de todos os tipos de dados
		// array sempre deve ter a quantidade de posições definidas
		double[] notas = new double[5];

		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;

		for (int i = 0; i < notas.length; i++)
			System.out.println("Nota " + (i+1) + " = " + notas[i]);
	}

}
