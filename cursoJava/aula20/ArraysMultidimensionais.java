package cursoJava.aula20;

import java.util.Scanner;

public class ArraysMultidimensionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*double [] [] notasAlunos = new double [3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 6.5;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 5.5;
		notasAlunos[2][3] = 7.5;
		
		
		for (int i=0; i<notasAlunos.length; i++) {
			for (int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}*/
		
		/*int [] [] [] matriz3d = new int [3][3][3];
		
		for (int i=0; i<matriz3d.length; i++) {
			for (int j=0; j<matriz3d[i].length; j++) {
				for (int k=0; k<matriz3d[i][j].length; k++) {
					matriz3d[i][j][k] = i+j+k;
				}
			}
		}
		
		int soma = 0;
		int somaPar = 0;
		int somaImpar = 0;
		for (int i=0; i<matriz3d.length; i++) {
			for (int j=0; j<matriz3d[i].length; j++) {
				for (int k=0; k<matriz3d[i][j].length; k++) {
					soma += matriz3d[i][j][k];
					
					if (matriz3d[i][j][k] % 2 == 0) {
						somaPar += matriz3d[i][j][k];
					} else {
						somaImpar += matriz3d[i][j][k];
					}
				}
			}
		}
		
		System.out.println("Soma Total: " + soma);
		System.out.println("Soma Pares: " + somaPar);
		System.out.println("Soma Impar: " + somaImpar);*/
		
		System.out.println("Entre com o numero de pessoas entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Nome do filho " +(j+1)+": ");
				nomesFilhos[i][j] = scan.next();
			}
		}
		for (int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa "+ i + " tem " + nomesFilhos[i].length + " filhos");
			for (int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
