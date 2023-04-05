package cursoJava.aula25;

import cursoJava.aula25.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPax = 10;
		van.capFuel = 100;
		van.consFuel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia: " + autonomia + "km");
		
		double qtdFuel10 = van.calcularCombustivel(10);
		double qtdFuel15 = van.calcularCombustivel(15);
		
		System.out.println("Para andar 10km e necessario " + qtdFuel10);
		System.out.println("Para andar 15km e necessario " + qtdFuel15);
		
		Carro fusca = new Carro();
		fusca.marca = "Volks";
		fusca.modelo = "Fusca";
		fusca.numPax = 4;
		fusca.capFuel = 30;
		fusca.consFuel = 0.15;


	}

}
