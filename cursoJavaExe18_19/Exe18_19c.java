package cursoJavaExe18_19;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exe18_19c {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*double [] nota1 = new double [10];
		double [] nota2 = new double [10];
		double [] media = new double [10];
		String [] Result = new String [10];
		
		for(int i=0; i<nota1.length;i++) {
			System.out.println("Primeira nota do "+(i+1)+"º aluno: ");
			nota1[i] = scan.nextDouble();
			System.out.println("Segunda nota do "+(i+1)+"º aluno: ");
			nota2[i] = scan.nextDouble();
			media[i] = (nota1[i] + nota2[i])/2;
			if (media[i]>=7) {
				Result[i] = "Aprovado";
			} else {
				Result[i] = "Reprovado";
			}
		}
		
		for (int i=0; i<media.length;i++) {
			System.out.println("Media do "+(i+1)+"º aluno: " + media[i]);
			System.out.println("Situacao: "+Result[i]);
		}*/
		
		int [] vetorA = new int [10];
		int zero = 0;
		int um = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random()*1);
			System.out.print(vetorA[i]+" ");
			if (vetorA[i] == 0) {
				zero += 1;
			} else {
				um += 1;
			}
		}
		System.out.println();
		System.out.println("Percentual de zeros: "+((zero*100)/10)+"%");
		System.out.println("Percentual de um: "+((um*100)/10)+"%");
		

	}

}
