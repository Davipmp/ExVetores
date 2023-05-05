package vetores.exercicios;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(" Digite um valor do vetor A: ");
			vetorA[i] = sc.nextInt();

			int numero = vetorA[i];
			if (numero % 2 == 0) {
				System.out.println("o numero é par! " + numero);
			} else {
				System.out.println("numero não é par! " + numero);
			}
		}
	}
}
