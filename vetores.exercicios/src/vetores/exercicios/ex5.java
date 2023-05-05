package vetores.exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do Vetor A: " + i);
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.println("");
		System.out.print("Vetor A: ");
		for( int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
