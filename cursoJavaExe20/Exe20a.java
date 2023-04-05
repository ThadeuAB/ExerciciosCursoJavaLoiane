package cursoJavaExe20;

import java.util.Random;
import java.util.Scanner;

public class Exe20a {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] [] numA = new int [4][4];
		
		Random numRandom = new Random();
		
		for (int i=0; i<numA.length; i++) {
			for (int j=0; j<numA[i].length; j++) {
				numA[i][j] = numRandom.nextInt(100);
			}
		}
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int col = 0;
		
		for (int i=0; i<numA.length; i++) {
			for (int j=0; j<numA[i].length; j++) {
				if (numA[i][j] > maior) {
					maior = numA[i][j];
					linha = i;
					col = j;
	
				}
			}
		}
		for (int i=0; i<numA.length; i++) {
			for (int j=0; j<numA[i].length; j++) {
				System.out.print(numA[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Maior valor: "+maior+" na linha "+linha+" coluna "+col);
	}
	

}
