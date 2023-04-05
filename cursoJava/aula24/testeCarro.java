package cursoJava.aula24;

public class testeCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPax = 10;
		van.capFuel = 100;
		van.consFuel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		fusca.marca = "Volks";
		fusca.modelo = "Fusca";
		fusca.numPax = 4;
		fusca.capFuel = 30;
		fusca.consFuel = 0.15;

	}

}
