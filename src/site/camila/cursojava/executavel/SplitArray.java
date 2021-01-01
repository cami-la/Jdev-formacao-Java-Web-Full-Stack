package site.camila.cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		String texto = "alex, curso Java, 80, 70, 90, 89";

		String[] valoresArray = texto.split(",");

		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso:" + valoresArray[1]);
		System.out.println("Nota 1:" + valoresArray[2]);
		System.out.println("Nota 2:" + valoresArray[3]);
		System.out.println("Nota 3:" + valoresArray[4]);
		System.out.println("Nota 4:" + valoresArray[5]);

		// Convertendo um Array em uma lista

		List<String> list = Arrays.asList(valoresArray);

		for (String string : list)
			System.out.println(string.strip());

		String[] conversaoArray = list.toArray(new String[6]);
		
		System.out.println();
		for (String string : conversaoArray)
			System.out.println(string.strip());

	}

}
