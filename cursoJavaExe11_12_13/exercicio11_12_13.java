package cursoJavaExe11_12_13;

import java.util.Scanner;

public class exercicio11_12_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Alo mundo");*/
		 
		/*System.out.println("Digite um numero: ");
		int num = scan.nextLine();
		System.out.println("Voce digitou o numero " + num);*/
		
		/*System.out.println("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		int soma = valor1 + valor2;
		System.out.println("A soma dos valores deu " + soma);*/
		
		/*System.out.println("Digite a 1ª nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a 2ª nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a 3ª nota: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a 4ª nota: ");
		double nota4 = scan.nextDouble();
		System.out.println("A media foi " + (nota1+nota2+nota3+nota4)/4);*/
		
		/*System.out.println("Digite a quantidade de metros: ");
		double metros = scan.nextDouble();
		System.out.println(metros + " metros da " + (metros*100) + " centimetros");*/
		
		/*System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		double area = 3.14 * (raio*raio);
		System.out.println("A area do circulo e de " + area);*/
		
		/*System.out.println("Informe o tamanho de um dos lados do quadrado: ");
		double lado = scan.nextDouble();
		double area = lado*lado;
		System.out.println("A area do quadrado e de " + (area));
		System.out.println("O dobro da area e de " + (area*2));*/
		
		/*System.out.println("Informe o salario por hora: ");
		double salario = scan.nextDouble();
		System.out.println("Informe quantas horas foram trabalhadas no mes: ");
		int horas = scan.nextInt();
		System.out.println("O salario no mes sera de " + (salario * horas));*/
		
		/*System.out.println("Informe a temperatura em F: ");
		double f = scan.nextDouble();
		double c = 5*(f-32)/9;
		System.out.println("A temperatura em Celsius e de " + c);*/
		
		/*System.out.println("Informe a temperatura em C: ");
		double c = scan.nextDouble();
		double f = c * 9/5 + 32;
		System.out.println("A temperatura em Fahrenheit e de " + f);*/
		
		/*System.out.println("Digite o primeiro numero inteiro: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int valor2 = scan.nextInt();
		System.out.println("Agora digite um numero real: ");
		double valor3 = scan.nextDouble();
		double a = (valor1 * 2) * (valor2 / 2);
		double b = (valor1 * 3) + valor3;
		double c = (valor3 * valor3 * valor3);
		System.out.println("Os resultados pedidos pelo exercicios sao: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		/*System.out.println("Informe a altura: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (72.7*altura) - 58;
		System.out.println("Peso ideal: " + pesoIdeal);*/
		
		/*System.out.println("Informe o salario por hora: ");
		double salarioHora = scan.nextDouble();
		System.out.println("Informe quantas horas foram trabalhadas no mes: ");
		double horas = scan.nextDouble();
		double salarioBruto = salarioHora*horas;
		double impostoRenda = salarioBruto*11/100;
		double inss = salarioBruto*8/100;
		double sindicato = salarioBruto*5/100;
		double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("IRRF: " + impostoRenda);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Salario Liquido: " + salarioLiquido);*/
		
		System.out.println("Informe o tamanho do arquivo (em MB): ");
		double arquivo = scan.nextDouble();
		System.out.println("Informe a velocidade do link (em Mbps): ");
		double velocidade = scan.nextDouble();
		double tempo = arquivo/velocidade;
		System.out.println("Tempo estimado para download: " + tempo);

	}

}
