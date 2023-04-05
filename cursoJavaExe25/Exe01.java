package cursoJavaExe25;

public class Exe01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligada = true;
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		

	}

}
