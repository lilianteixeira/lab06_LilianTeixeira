package exception;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException() {
		super("Voce nao tem saldo suficiente");
	}
		
}

