package cursoJavaExe18_19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe18_19a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int [] vetorA = new int [8];
		int [] vetorB = new int [vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Entre com o valor da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*2;
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++ ) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++ ) {
			System.out.print(vetorB[i] + " ");
		}*/
		
		/*int [] vetorA = new int [15];
		int [] vetorB = new int [vetorA.length];
		double [] vetorC = new double [vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Entre com o valor da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*vetorA[i];
			vetorC[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++ ) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++ ) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor C = ");
		for (int i=0; i<vetorC.length; i++ ) {
			System.out.print(vetorC[i] + " ");
		}*/
		
		/*int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Entre com o valor da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*i;
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++ ) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++ ) {
			System.out.print(vetorB[i] + " ");
		}*/
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		double [] vetorC = new double [vetorA.length];
		
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Entre com o valor da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++ ) {
			
			System.out.println("Entre com o valor da posicao "+i+": ");
			vetorB[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i]/vetorB[i];
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("Vetor C = ");
		for (int i=0; i<vetorC.length; i++ ) {
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
