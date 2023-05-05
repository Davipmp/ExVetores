package vetores.exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A: ");
			vetorA[i] = sc.nextInt();
		}
			for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor do vetor B: ");
			vetorB[i] = sc.nextInt();

			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.println("");
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println("");
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}

		System.out.println("");
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i] + " ");
		}
	}
}
