package cursoJavaExe18_19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe18_19b {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int [] vetorA = new int [10];
		int par = 0;
		int impar = 0;
		int soma = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao " +i+ ":");
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
			if (vetorA[i] % 2==0) {
				par += 1;
			} else {
				impar += 1;
			}
		}
		
		System.out.println("Numeros pares registrados: "+par);
		System.out.println("Numeros impares registrados: "+impar);
		System.out.println("Soma dos numeros: "+soma);*/
		
		/*int [] vetorA = new int [10];
		int mult5 = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao " +i+ ":");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 5 ==0) {
				mult5 += vetorA[i];
			}
		}
		System.out.println("Soma dos numeros divisiveis por 5 registrados: "+mult5);*/
		
		/*int [] vetorA = new int [10];
		int impar = 0;
		int totalImpar = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao " +i+ ":");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 ==1) {
				totalImpar += vetorA[i];
				impar += 1;
			}
		}
		double mediaImpar = totalImpar/impar;
		System.out.println("Numeros impares: " +impar);
		System.out.println("Soma dos numeros impares: " +totalImpar);
		System.out.println("Media dos numeros impares: " +mediaImpar);*/
		
		/*int [] vetorA = new int [10];
		int par = 0;
		int impar = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao " +i+ ":");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 ==0) {
				par ++;
			} else {
				impar ++;
			}
		}
		
		double parPercentual = (par*100)/vetorA.length;
		double ImparPercentual = (impar*100)/vetorA.length;
		System.out.println("Percentual de numeros impares: " +ImparPercentual+"%");
		System.out.println("Percentual de numeros pares: " +parPercentual+"%");*/
		
		/*int [] vetorA = new int [10];
		int menor15Soma = 0;
		int igual15 = 0;
		int maior15 = 0;
		int maior15Soma = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao " +i+ ":");
			vetorA[i] = scan.nextInt();
			if (vetorA[i]<15) {
				menor15Soma += vetorA[i];
			} else if (vetorA[i] == 15) {
				igual15 ++;
			} else if (vetorA[i]>15) {
				maior15 ++;
				maior15Soma += vetorA[i];
			}
		}
		double media15 = maior15Soma/maior15;
		System.out.println("Soma dos valores abaixo de 15: " +menor15Soma);
		System.out.println("Valores iguais a 15: " +igual15);
		System.out.println("Media dos valores maiores que 15: " +media15);*/
		
		int [] vetorA = new int [10];
		int maior35 = 0;
		int velho = Integer.MIN_VALUE;
		int posVelho = 0;
		int novo = Integer.MAX_VALUE;
		int posNovo = 0;
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com a idade da posicao " +i+ ":");
			vetorA[i] = scan.nextInt();
			if (vetorA[i]>35) {
				maior35 ++;
			}
			if (vetorA[i]>velho) {
				velho = vetorA[i];
				posVelho = i;
			}
			if (vetorA[i]<novo) {
				novo = vetorA[i];
				posNovo = i;
			}
		}
		
		System.out.println("Quantidade de pessoas acima de 35: " +maior35);
		System.out.println("Pessoa mais idosa: " +velho+" na posicao "+posVelho);
		System.out.println("Pessoa mais nova: " +novo+" na posicao "+posNovo);
		
	}

}
