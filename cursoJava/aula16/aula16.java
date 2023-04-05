package cursoJava.aula16;

public class aula16 {

	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("Contando ate " + max);
		
		while (i <= max) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println(i);
		} while (i <= 15);
		
		System.out.println(i);
	}

}
