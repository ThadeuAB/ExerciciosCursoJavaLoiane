package cursoJavaExe16_17;

import java.util.Scanner;

public class exe16_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*boolean notaValida = false;
		
		do {
		
			System.out.println("Informe a nota do aluno (0-10): ");
			double nota = scan.nextDouble();
		
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voce digitou: " + nota);
			} else {
				System.out.println("Nota invalida. Digite novamente");
			}
		 
		} while (!notaValida);*/
		
		/*System.out.println("User: ");
		String user = scan.next();
		System.out.println("Password: ");
		String pass = scan.next();
		
		while (user.equalsIgnoreCase(pass)) {
			System.out.println("Erro! Usuario e senha nao podem ser iguais!");
			System.out.println("Digite password novamente: ");
			pass = scan.next();
		}*/
		
		/*System.out.println("Nome: ");
		String nome = scan.next();
		
		while(nome.length() <= 3) {
			System.out.println("Invalido, nome deve ter ao menos 4 caracteres");
			System.out.println("Nome: ");
			nome = scan.next();
		}
		
		System.out.println("Idade: ");
		int idade = scan.nextInt();
		
		while(idade < 0 || idade > 150) {
			System.out.println("Invalido, digite uma idade valida");
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}
		
		System.out.println("Salario: ");
		double salario = scan.nextDouble();
		
		while(salario < 0) {
			System.out.println("Invalido, digite um valor valido");
			System.out.println("Salario: ");
			salario = scan.nextDouble();
		}
		
		System.out.println("Sexo (M/F): ");
		String sexo = scan.next();
		
		while (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
			System.out.println("Invalido, sexo deve ser M/F");
			System.out.println("Sexo (M/F): ");
			sexo = scan.next();
		}
		
		System.out.println("Estado civil (S/C/V/D): ");
		String estadoCivil = scan.next();
		
		while (!(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") ||
				estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D"))) {
			System.out.println("Invalido, Estado civil deve ser S/C/V/D");
			System.out.println("Estado civil (S/C/V/D): ");
			estadoCivil = scan.next();
		}*/
		
		/*double popA = 80000;
		double popB = 200000;
		int cont = 0;
		
		while (popA <= popB) {
			popA = popA + (popA/100) * 3;
			popB = popB + (popB/100) * 1.5;
			cont++;
		}
		
		System.out.println("Pais A alcancou a populacao do Pais B em " + cont + " anos");*/
		
		/*boolean valido = false;
		
		double popA;
		double cresceA;
		double popB;
		double cresceB;
		int cont = 0;
		
		do {
			
		System.out.println("Digite a populacao atual do pais A: ");
		popA = scan.nextDouble();
		if (popA > 0) {
			valido = true;
		} else {
			System.out.println("Populacao precisa ser maior que zero. ");
		}
		
			
			} while (!valido);
		
		valido = false;
		
		do {
			
			System.out.println("Digite a taxa de crescimento do pais A: ");
			cresceA = scan.nextDouble();
			if (cresceA > 0) {
				valido = true;
			} else {
				System.out.println("Taxa de crescimento precisa ser maior que zero. ");
			}
				
			} while (!valido);
		
		valido = false;
		
		do {
			
			System.out.println("Digite a populacao atual do pais B: ");
			popB = scan.nextDouble();
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Populacao precisa ser maior que zero. ");
			}
				
			} while (!valido);
		
		valido = false;
		
		do {
			
			System.out.println("Digite a taxa de crescimento do pais B: ");
			cresceB = scan.nextDouble();
			if (cresceB > 0) {
				valido = true;
			} else {
				System.out.println("Taxa de crescimento precisa ser maior que zero. ");
			}
				
			} while (!valido);
		
		while (popA <= popB) {
			popA = popA + (popA/100) * cresceA;
			popB = popB + (popB/100) * cresceB;
			cont++;
		}
		
		System.out.println("Pais A alcancou a populacao do Pais B em " + cont + " anos");
		System.out.println("Pop A: " + popA);
		System.out.println("Pop B: " + popB);*/
	}
}
