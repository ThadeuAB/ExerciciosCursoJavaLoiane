package cursoJavaExe20;

import java.util.Scanner;

public class Exe20c {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char [] [] jogoVelha = new char [3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;
		
		while (!ganhou) {
			
			if(jogada % 2 == 1) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
				
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Linha (1,2,3): ");
				linha = scan.nextInt();
				if (linha >=1 && linha<=3) {
					linhaValida=true;
				} else {
					System.out.println("Linha invalida.Digite novamente");
				}
			}
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Coluna (1,2,3): ");
				coluna = scan.nextInt();
				if (coluna >=1 && coluna <=3) {
					colunaValida=true;					
				} else {
					System.out.println("Coluna invalida.Digite novamente");
				}
				
			}
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posicao ja ocupada. Tente novamente");				
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			for(int i=0; i<jogoVelha.length; i++) {
				for(int j=0; j<jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j]+" | ");
				}
				System.out.println();
				
			}
			if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') ||
					(jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) {
				ganhou = true;
				System.out.println("Parabens jogador 1 ganhou");
				
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||
					(jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){
				ganhou = true;
				System.out.println("Parabens jogador 2 ganhou");
				
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("DEU VELHA!");
			}
		}

	}

}
