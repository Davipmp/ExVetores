package vetores.exercicios;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[2];
		int[] B = new int[A.length]; 
		int[] C = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o vetor A: ");
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < B.length; i++) {
			System.out.println("Digite o vetor B: ");
			B[i] = sc.nextInt();
			
			C[i] = A[i] / B[i];
		}
		
		System.out.println("");
		System.out.println("Vetor A: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Vetor B: ");
		for(int i = 0; i < B.length; i++) {
			System.out.println(B[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Vetor C: ");
		for(int i = 0; i < C.length; i++) {
			System.out.println(C[i] + " ");
		}
	}

}
