package cursoJavaExe16_17;

import java.util.Scanner;

public class Exe16_17c {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com o n-esimo termo da serie de Fibonacci: ");
		int n = scan.nextInt();
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.print(primeiro + " ");
		System.out.print(segundo + " ");
		
		for(int i=3; i<=n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " ");
		}*/
		
		/*int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.print(primeiro + " ");
		System.out.print(segundo + " ");
		
		while(proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " ");
			
		}*/
		
		/*System.out.println("Informe o numero para calcular o fatorial: ");
		int num = scan.nextInt();
		System.out.print(num+"! = " + num);
		int resultado = num;
		
		for(int i=num-1; i>0; i--) {
			resultado *= i;
			System.out.print("*"+i);
		}
		
		System.out.print(" = "+resultado);*/
		
		/*System.out.println("Quantos numeros serao inseridos? ");
		int num = scan.nextInt();
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		int valor;
		
		for(int i=1; i<=num; i++) {
			System.out.println("Digite o "+i+"o. numero: ");
			valor = scan.nextInt();
			while(valor>1000 || valor<0) {
				System.out.println("Valor deve ser entre 0 e 1000");
				System.out.println("Digite o "+i+"o. numero: ");
				valor = scan.nextInt();
			}
			soma += valor;
			if (valor>maior) {
				maior = valor;
			}
			if (valor<menor) {
				menor = valor;
			}
		}
		
		System.out.println("Maior valor inserido foi "+maior);
		System.out.println("Menor valor inserido foi "+menor);
		System.out.println("Soma dos valores inseridos foi "+soma);*/
		
		/*System.out.println("Entre com um numero: ");
		int num = scan.nextInt();
		boolean primo = true;
		
		for(int i=2; i<num; i++) {
			if (num % i == 0) {
				System.out.println("Nao e primo, divisivel por "+i);
				primo = false;
			}
		}
		if (primo) {
			System.out.println("E primo");
		}*/
		
		/*System.out.println("Entre com o numero de notas: ");
		int qtde = scan.nextInt();
		double nota;
		double soma = 0;
		
		for(int i=1; i<=qtde; i++) {
			System.out.println("Digite a "+i+"ª nota: ");
			nota = scan.nextDouble();
			soma += nota;
		}
		
		double media = soma/qtde;
		System.out.println("Foi inserido " +qtde+ " notas.");
		System.out.println("Media: "+media);*/
		
		/*System.out.println("Quantas pessoas tem na turma: ");
		int total = scan.nextInt();
		int idade;
		int soma = 0;
		
		for(int i=1; i<=total; i++) {
			System.out.println("Idade da "+i+"ª pessoa: ");
			idade = scan.nextInt();
			soma += idade;
		}
		double media = soma/total;
		if (media>=0 && media<=25) {
			System.out.println("Turma jovem, media de idade de "+media);
		} else if (media>25 && media<=60) {
			System.out.println("Turma adulta, media de idade de "+media);
		} else if (media>60) {
			System.out.println("Turma idosa, media de idade de "+media);
		}*/
		
		/*System.out.println("Numero de turmas: ");
		int numTurma = scan.nextInt();
		int alunos;
		int totAlunos = 0;
		
		for (int i=1; i<=numTurma;i++) {
			System.out.println("Quantos alunos tem na " +i+  "ª turma: ");
			alunos = scan.nextInt();
			while (alunos > 40) {
				System.out.println("Turma nao pode ter mais de 40 alunos.");
				System.out.println("Quantos alunos tem na " +i+  "ª turma: ");
				alunos = scan.nextInt();
			}
			totAlunos += alunos;
		}
		double media = totAlunos/numTurma;
		System.out.println("Quantidade de turmas: "+numTurma);
		System.out.println("Total de alunos: "+totAlunos);
		System.out.println("Media de alunos por turma: "+media);*/
	}
}
