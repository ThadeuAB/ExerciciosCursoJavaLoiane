package cursoJavaExe18_19;

import java.util.Scanner;

public class Exe18_19d {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int [] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a psoicao "+i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 != 0) {
				break;
			}
		}*/
		
		/*int [] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posicao "+i);
			vetorA[i] = scan.nextInt();
		}
		
		boolean palindromo = true;
		for (int i=0; i<vetorA.length/2; i++) {
			if (vetorA[i] != vetorA[vetorA.length -1 -i]) {
				palindromo = false;
			}
		}
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		if (palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Nao e palindromo");
		}*/
		
		int [] vetorA = new int[10];
		int [] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posicao "+i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
