package cursoJavaExe28_33;

public class Exe02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);
		
		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
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
