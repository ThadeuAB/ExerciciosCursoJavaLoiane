package cursoJava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPax;
	double capFuel;
	double consFuel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro e: " + capFuel * consFuel + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamado");
		return capFuel * consFuel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdFuel = km/consFuel;
		return qtdFuel;
	}
}
