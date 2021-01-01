package site.camila.cursojava.executavel;

public class Matriz {
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
		for (int i = 0; i < notas.length; i++) { //coluna
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
			
			/*for (int nota : notas[i]) //linha
				System.out.print(nota + " ");
			System.out.println();
			*/
		}
		
	}
}
