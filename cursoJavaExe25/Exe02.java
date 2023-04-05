package cursoJavaExe25;

public class Exe02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque realizado");
			conta.consultarSaldo();
		} else {
			System.out.println("Saldo insuficiente");
			conta.consultarSaldo();
		}
		
		System.out.println("Depositando 500");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("Nao esta usando cheque especial");
		}

	}

}
