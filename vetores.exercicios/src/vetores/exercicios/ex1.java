package vetores.exercicios;

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] elementosA = new int[5];
		int[] elementosB = new int[5];
		
		for (int i = 0; i < elementosA.length; i++) {
			System.out.println("Entre com o numero do vetor a: ");
			elementosA[i] = sc.nextInt();
			
			elementosB[i] = elementosA[i];
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < elementosA.length; i++) {
			System.out.print(elementosA[i]+ " ");
		}
		System.out.println("");
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < elementosB.length; i++) {
			System.out.print(elementosB[i] + " ");
		}
	}
}
	
