package cursoJavaExe20;

import java.util.Scanner;

public class Exe20b {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String [][] eventos = new String[31][24];
		
		boolean sair = false;
		
		
		int opcao;
		int dia = 0;
		int hora = 0;
		while (!sair) {
			System.out.println("Digite 1 para adicionar evento.");
			System.out.println("Digite 2 para verificar evento.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				boolean diaValido = false;
				boolean horaValida = false;
				while(!diaValido) {
					System.out.println("Dia do mes (1-31): ");
					dia = scan.nextInt();
					if (dia > 0 && dia <=31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido. Digite novamente");
					}
				}
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso (0-23): ");
					hora = scan.nextInt();
					if (hora >=0 && hora <=23) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida. Digite novamente");
					}
				}
				
				System.out.println("Digite o compromisso: ");
				eventos [--dia] [hora] = scan.next();
				
				
			} else if (opcao == 2) {
				boolean diaValido = false;
				boolean horaValida = false;
				while(!diaValido) {
					System.out.println("Dia do mes (1-31): ");
					dia = scan.nextInt();
					if (dia > 0 && dia <=31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido. Digite novamente");
					}
				}
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso (0-23): ");
					hora = scan.nextInt();
					if (hora >=0 && hora <=23) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida. Digite novamente");
					}
				}
				
				dia--;
				System.out.println("O evento agendado e: ");
				System.out.println(eventos[dia][hora]);
					
				
			} else if(opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opcao invalida.");
			}
			
		}

	}

}
