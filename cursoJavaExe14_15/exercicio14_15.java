package cursoJavaExe14_15;

import java.util.Scanner;

public class exercicio14_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite o primeiro valor: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro valor, " + num1 + " e maior");
		} else {
			System.out.println("O segundo valor, " + num2 + " e maior");
		}*/
		
		/*System.out.println("Digite um valor: ");
		int num1 = scan.nextInt();
		
		if (num1 > 0) {
			System.out.println("Numero positivo");
		} else if (num1 < 0) {
			System.out.println("Numero negativo");
		} else {
			System.out.println("Zero");
		}*/
		
		/*System.out.println("Digite o sexo (M/F): ");
		String sexo = scan.next();
				
		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Invalido, digite M ou F");
		}*/
		
		/*System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) {
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
		}*/
		
		/*System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		switch(letra) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("vogal"); break;
		default: System.out.println("consoante");
		}*/
		
		/*System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		
		if (media == 10) {
			System.out.println("Media " + media + ". Aprovado com distincao!");
		} else if (media < 7) {
			System.out.println("Media " + media + ". Reprovado!");		
		} else {
			System.out.println("Media " + media + ". Aprovado!");
		}*/
		
		/*System.out.println("Digite o primeiro valor: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " foi o maior valor informado");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " foi o maior valor informado");
		} else if (num3 >= num1 && num3 >= num2){
			System.out.println(num3 + " foi o maior valor informado");
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1 + " foi o menor valor informado");
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2 + " foi o menor valor informado");
		} else if (num3 <= num1 && num3 <= num2){
			System.out.println(num3 + " foi o menor valor informado");
		}*/
		
		/*System.out.println("Digite o preco do primeiro produto: ");
		double preco1 = scan.nextDouble();
		System.out.println("Digite o preco do segundo produto: ");
		double preco2 = scan.nextDouble();
		System.out.println("Digite o preco do terceiro produto: ");
		double preco3 = scan.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("O primeiro produto tem o melhor preco");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("O segundo produto tem o melhor preco");
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("O terceiro produto tem o melhor preco");
		}*/
		
		/*System.out.println("Digite o primeiro valor: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
			if (num2 >= num3) {
				System.out.println(num2);
				System.out.println(num3);
			} else {
				System.out.println(num3);
				System.out.println(num2);
			}
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
			if (num1 >= num3) {
				System.out.println(num1);
				System.out.println(num3);
			} else {
				System.out.println(num3);
				System.out.println(num1);
			}
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println(num3);
			if (num1 >= num2) {
				System.out.println(num1);
				System.out.println(num2);
			} else {
				System.out.println(num2);
				System.out.println(num1);
			}
		}*/
		
		/*System.out.println("Qual turno voce estuda? (M/V/N): ");
		String turno = scan.next();
		
		switch(turno) {
		case "M":
		case "m": System.out.println("Turno matutino. Bom Dia!"); break;
		case "V":
		case "v": System.out.println("Turno vespertino. Boa tarde!"); break;
		case "N":
		case "n": System.out.println("Turno noturno. Boa noite!"); break;
		default: System.out.println("Letra invalida, digite M / V /N");
		}*/
		
		/*System.out.println("Informe salario atual: ");
		double salAtual = scan.nextDouble();
		int reajuste = 0;
		
		if (salAtual <= 280) {
			reajuste = 20;
		} else if (salAtual > 280 && salAtual <= 700) {
			reajuste = 15;
		} else if (salAtual > 700 && salAtual <= 1500) {
			reajuste = 10;
		} else {
			reajuste = 5;
		}
		
		double aumento = salAtual * reajuste/100;
		double salNovo = salAtual + aumento;
		
		System.out.println("Salario Atual: R$" + salAtual);
		System.out.println("Reajuste: " + reajuste + "%");
		System.out.println("Aumento: R$" + aumento);
		System.out.println("Salario Novo: R$" + salNovo);*/
		
		/*System.out.println("Informe salario por hora: ");
		double salHora = scan.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		double horas = scan.nextDouble();
		double salBruto = salHora * horas;
		int descontoIr = 0;
		double sindicato = salBruto * 3 /100;
		double fgts = salBruto * 11 /100;
		double inss = salBruto * 10/100;
		
		if (salBruto > 900 && salBruto <= 1500) {
			descontoIr = 5;
		} else if (salBruto > 1500 && salBruto <= 2500) {
			descontoIr = 10;
		} else if (salBruto > 2500) {
			descontoIr = 20;
		}
		
		double ir = salBruto * descontoIr /100;
		double totalDescontos = sindicato + ir + inss;
		double salLiquido = salBruto - totalDescontos;
		
		System.out.println("Salario Bruto: R$ " + salBruto);
		System.out.println("Faixa do IR: " + descontoIr + "%");
		System.out.println("IRRF: R$ " + ir);
		System.out.println("INSS: R$ " + inss);
		System.out.println("FGTS: R$ " + fgts);
		System.out.println("Contribuicao sindical: R$ " + sindicato);
		System.out.println("Total Descontos: R$ " + totalDescontos);
		System.out.println("Salario Liquido: R$ " + salLiquido);*/
		
		/*System.out.println("Digite um numero corresponde ao dia da semana (1-7): ");
		int dia = scan.nextInt();
		
		switch(dia) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terca"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sabado"); break;
		default: System.out.println("Valor invalido"); break;
		}*/
		
		/*System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		String conceito = "A";
		
		if (media > 7.5 && media <= 9) {
			conceito = "B";
		} else if (media > 6 && media <= 7.5) {
			conceito = "C";
		} else if (media > 4 && media <= 6) {
			conceito = "D";
		} else if (media <= 4) {
			conceito = "E";
		}
		
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("APROVADO");break;
		case "D": System.out.println("RECUPERACAO");break;
		case "E": System.out.println("REPROVADO");break;
		}*/
		
		/*System.out.println("Informe o primeiro lado do triangulo: ");
		double lado1 = scan.nextDouble();
		System.out.println("Informe o segundo lado do triangulo: ");
		double lado2 = scan.nextDouble();
		System.out.println("Informe o terceiro lado do triangulo: ");
		double lado3 = scan.nextDouble();
		
		if ((lado1 + lado2) > lado3 && (lado1+lado3) > lado2 && (lado2+lado3) > lado1) {
			System.out.println("Forma triangulo");
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Equilatero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Escaleno");
			} else {
				System.out.println("Isosceles");
			}
		} else {
			System.out.println("Nao forma triangulo");
		}*/
		
		/*System.out.println("Entre com o valor de 'A' ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("Sendo Zero, a equacao nao e do segundo grau.");
		} else {
			System.out.println("Entre com o valor de 'B' ");
			int b = scan.nextInt();
			System.out.println("Entre com o valor de 'C' ");
			int c = scan.nextInt();
			
			double delta = (b*b) - (4*a*c);
			if (delta < 0) {
				System.out.println("Delta negativo: " + delta);
			} else {
				System.out.println("Delta= " + delta);
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}*/
			
		/*System.out.println("Entre com o ano: ");
		int ano = scan.nextInt();
			
		if ((ano % 400==0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Ano bissexto");	
		} else {
			System.out.println("Ano nao bissexto ");
		}*/
		
		/*System.out.println("Digite um numero inteiro: ");
		int num = scan.nextInt();
		
		if (num % 2==0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar ");
		}*/
		
		/*System.out.println("Digite o primeiro valor ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo valor ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com a operacao (+ - / *): ");
		String escolha = scan.next();
		
		switch(escolha) {
		case "+": System.out.println("Soma dos valores: " + (num1+num2)); break;
		case "-": System.out.println("Subtracao dos valores: " + (num1-num2)); break;
		case "/": System.out.println("Divisao dos valores: " + (num1/num2)); break;
		case "*": System.out.println("Multiplicao dos valores: " + (num1*num2)); break;
		default: System.out.println("Valor invalido"); break;
		}*/
		
		/*System.out.println("Telefonou para a vitima? [S/N] ");
		String resp1 = scan.next();
		System.out.println("Esteve no local do crime? [S/N] ");
		String resp2 = scan.next();
		System.out.println("Mora perto da vitima? [S/N] ");
		String resp3 = scan.next();
		System.out.println("Devia para a vitima? [S/N] ");
		String resp4 = scan.next();
		System.out.println("Ja trabalhou com a vitima? [S/N] ");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont < 2) {
			System.out.println("Inocente");
		} else if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cumplice");
		} else if (cont == 5) {
			System.out.println("Culpado");
		}*/
		
		/*System.out.println("Escolha Alcool ou Gasolina (A/G): ");
		String opt = scan.next();
		System.out.println("Quantos litros ira colocar? ");
		int litros = scan.nextInt();
		double custo = 0;
				
		if (opt.equalsIgnoreCase("A")) {
			custo = litros * 1.90;
			if (litros <= 20) {
				custo = custo - (custo*3/100);
			} else {
				custo = custo - (custo*5/100);
			}
		} else if (opt.equalsIgnoreCase("G")) {
			custo = litros * 2.50;
			if (litros <= 20) {
				custo = custo - (custo*4/100);
			} else {
				custo = custo - (custo*6/100);
			}
		}
		System.out.println("Valor a ser pago: R$ " + custo);*/
		
		System.out.println("Quantos KG dos morangos: ");
		double qtdeMorango = scan.nextDouble();
		System.out.println("Quantos KG das macas: ");
		double qtdeMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		double precoKgMaca = 0;
		
		if (qtdeMorango <=5) {
			precoKgMorango = 2.50;
		} else {
			precoKgMorango = 2.20;
		}
		
		if (qtdeMaca <=5) {
			precoKgMaca = 1.80;
		} else {
			precoKgMaca = 1.50;
		}
		
		double precoTotalMorango = qtdeMorango * precoKgMorango;
		double precoTotalMaca = qtdeMaca * precoKgMaca;
		
		double precoFinal = precoTotalMorango + precoTotalMaca;
		
		if ((qtdeMorango + qtdeMaca) > 8 || precoFinal > 25) {
			precoFinal = precoFinal - (precoFinal*10/100);
		}
		System.out.println("Valor a pagar: R$ " + precoFinal);
	}	

}
