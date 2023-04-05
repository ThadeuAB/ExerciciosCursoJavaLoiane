package cursoJavaExe16_17;

import java.util.Scanner;

public class Exe16_17d {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Informe a quantidade de CDs comprados: ");
		int cds = scan.nextInt();
		double soma = 0;
		double valor = 0;
		
		for(int i=1; i<=cds;i++) {
			System.out.println("Informe o valor do CD"+i+": ");
			valor = scan.nextDouble();
			soma += valor;
		}
		
		double media = soma/cds;
		System.out.println("CDs adquiridos: "+cds);
		System.out.println("Valor total gasto: "+soma);
		System.out.println("Valor medio por CD: "+media);*/
		
		/*System.out.println("Informe a quantidade de itens comprados: ");
		int itens = scan.nextInt();
		System.out.println("Informe o preco unitario: ");
		double preco = scan.nextDouble();
		
		System.out.println("Loja Quase dois - Tabela de Precos ");
		for(int i=1; i<=itens; i++) {
			System.out.println(i+" - R$ "+i*preco);
		}*/
		
		/*System.out.println("Lojas Tabajara");
		int cont = 1;
		double preco = 1;
		double soma = 0;
		
		while(preco > 0) {
			System.out.println("Produto "+cont+" : R$ ");
			preco = scan.nextDouble();
			cont++;
			soma +=preco;
		}
		
		System.out.println("Total: R$ "+soma);
		System.out.println("Dinheiro: R$ ");
		double dinheiro = scan.nextDouble();
		double troco = dinheiro - soma;
		System.out.println("Troco: R$ "+troco);*/
		
		/*System.out.println("Entre com a qtde de temperaturas: ");
		int qtde = scan.nextInt();
		double temp;
		double total = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for (int i=1; i<=qtde; i++) {
			System.out.println("Entre com a temperatura "+i+" :");
			temp = scan.nextDouble();
			total += temp;
			if (temp<menor) {
				menor = temp;
			}
			if (temp>maior) {
				maior = temp;
			}
		}
		double media = total/qtde;
		System.out.println("Temperaturas informadas: "+qtde);
		System.out.println("Maior temperatura informada: "+maior);
		System.out.println("Menor temperaturas informada: "+menor);
		System.out.println("Media das Temperaturas informadas: "+media);*/
		
		System.out.println("Entre com um valor: ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			boolean primo = true;
			
			for(int j=2; j<i; j++) {
				if (i % j == 0) {
					
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
			}
		}

	}

}
