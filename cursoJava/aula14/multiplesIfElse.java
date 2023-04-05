package cursoJava.aula14;

import java.util.Scanner;

public class multiplesIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto? R$ ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Pode comprar, esta barato");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Razoavel, da pra pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais");
		} else {
			System.out.println("Muito caro");
		}

	}

}
