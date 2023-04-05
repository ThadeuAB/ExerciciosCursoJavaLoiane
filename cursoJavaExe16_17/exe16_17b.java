package cursoJavaExe16_17;

import java.util.Scanner;

public class exe16_17b {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*for (int i=1; i <= 20; i++) {
			System.out.print(i+" ");
		}*/
		
		/*int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Entre com um numero: ");
			num = scan.nextInt();
			if (num > maior) {
				maior = num;
			}
		
		}
		System.out.println("O maior numero e : " + maior);*/
		
		/*int num;
		int soma = 0;
				
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um numero: ");
			num = scan.nextInt();
			soma = soma+num;
		}
		
		double media = soma/5;
		System.out.println("A soma dos numeros informados foi: " + soma);
		System.out.println("A media dos numeros informados foi: " + media);*/
		
		/*for (int i=1; i<50; i=i+2) {
			System.out.print(i+" ");
		}*/
		
		/*int soma = 0;
		System.out.println("Inicio: ");
		int inicio = scan.nextInt();
		System.out.println("Final: ");
		int termino = scan.nextInt();
		
		for(int i=inicio+1; i< termino; i++) {
			System.out.println(i);
			soma +=i;
		}
		System.out.println("A soma desses numeros deu " + soma);*/
		
		/*System.out.println("Qual numero deseja ver a tabuada? ");
		int num = scan.nextInt();
		System.out.println("Tabuada de " + num);
		for(int i=1; i<=10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}*/
		
		/*System.out.println("Base: ");
		int base = scan.nextInt();
		System.out.println("Expoente: ");
		int expoente = scan.nextInt();
		int resultado = base;
		
		for(int i=; i<expoente; i++) {
			resultado *=base; 
		}
		System.out.println(base + " elevado a " + expoente + " potencia da " + resultado);*/
		
		/*int par = 0;
		int impar = 0;
		int num;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite o " +i+ "º numero: ");
			num = scan.nextInt();
			if (num%2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}
		System.out.println("Numeros pares digitados: " + par);
		System.out.println("Numeros impares digitados: " + impar);*/
	}

}
