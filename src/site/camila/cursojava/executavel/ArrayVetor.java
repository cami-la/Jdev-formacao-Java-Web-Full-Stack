package site.camila.cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		String[] valores = {"Alex", "98.5", "Curso de Java", "contato@jdevtreinamento.com.br", "80"};
		for(int i = 0; i < valores.length; i++)
			System.out.println("Valor da posição " + i + " é igual = " + valores[i]);

	}
	
}
