package cursoJava.aula28;

public class Carro1 {
	
	String marca;
	public Carro1(String marca, String modelo, int numPax, double capFuel, double consFuel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPax = numPax;
		this.capFuel = capFuel;
		this.consFuel = consFuel;
	}

	String modelo;
	int numPax;
	double capFuel;
	double consFuel;
	
	Carro1(){
		System.out.println("Classe Carro foi instanciada");
	}
	
	
	
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
