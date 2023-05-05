package vetores.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		double[] vetorB = new double[vetorA.length];
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o elemento do vetor A: " + i);
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.println("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println("");
		System.out.println("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
	}

}
