package vetores.exercicios;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um valor do vetor A: ");
			vetorA[i] = sc.nextInt();
			int total = 0;
			total += vetorA[i];
			System.out.println(" A soma de todos os numeros é: " + total);
		}
	}

}
