package cursoJavaExe16_17;

import java.util.Scanner;

public class Exe16_17e {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Montar a tabuada de: ");
		int valor = scan.nextInt();
		System.out.println("Comecar por: ");
		int inicio = scan.nextInt();
		System.out.println("Terminar em: ");
		int termino = scan.nextInt();
		while(termino<inicio) {
			System.out.println("Termino deve ser maior ou igual que o inicio!");
			System.out.println("Terminar em: ");
			termino = scan.nextInt();
		}
		
		System.out.println("Vou montar a tabuada de " + valor + " comecando em "+inicio+" e terminando em "+termino+":");
		for (int i=inicio; i<=termino; i++) {
			System.out.println(valor + " X " + i + " = "+ (valor*i));
		}*/
		
		int codigo = 1;
		double baixo = Double.MAX_VALUE;
		int codBaixo =1;
		double alto = Double.MIN_VALUE;
		int codAlto =1;
		double gordo = Double.MIN_VALUE;
		int codGordo =1;
		double magro = Double.MAX_VALUE;
		int codMagro =1;
		double somaPeso = 0;
		double somaAltura = 0;
		double altura;
		double peso;
		int cont = 0;
		
		while (codigo>0) {
			System.out.println("Digite o codigo do cliente (0 para encerrar): ");
			codigo = scan.nextInt();
			if (codigo == 0) {
				break;
			}
			cont++;
			System.out.println("Altura: ");
			altura = scan.nextDouble();
			somaAltura += altura;
			if(altura > alto) {
				alto = altura;
				codAlto = codigo;
			}
			if(altura < baixo) {
				baixo = altura;
				codBaixo = codigo;
			}
			System.out.println("Peso: ");
			peso = scan.nextDouble();
			somaPeso += peso;
			if(peso > gordo) {
				gordo = peso;
				codGordo = codigo;
			}
			if(peso < magro) {
				magro = peso;
				codMagro = codigo;
			}
		}
		
		double mediaPeso = somaPeso/cont;
		double mediaAltura = somaAltura/cont;
		System.out.println("Clientes cadastrados: "+cont);
		System.out.println("Cliente com maior altura: "+ codAlto + " com "+alto);
		System.out.println("Cliente com menor altura: "+ codBaixo + " com "+baixo);
		System.out.println("Cliente com maior peso: "+ codGordo + " com "+gordo);
		System.out.println("Cliente com menor peso: "+ codMagro + " com "+magro);
		System.out.println("Media de altura: "+ mediaAltura);
		System.out.println("Media de peso: "+ mediaPeso);
		
		

	}

}
