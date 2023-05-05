package vetores.exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o numero do vetor A: ");
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
		}
		System.out.println("");
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("");
		
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
		System.out.print(vetorB[i] + " ");
		}
	}

}
