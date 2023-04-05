package cursoJava.aula14;

import java.util.Scanner;

public class condicionaisIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
