package vetores.exercicios;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do VetorA: ");
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		}
		
//		for(int i = 0; i < vetorB.length; i++) {
//			System.out.println("Digite o valor do VetorA: ");
//			vetorB[i] = sc.nextInt();
			
//			vetorB[i] = vetorA[i] % 2;
//		}
		System.out.println("");
		System.out.println("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		System.out.println("");
		System.out.println("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}	
}
