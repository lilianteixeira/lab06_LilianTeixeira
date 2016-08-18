package exception;

public class NumeroInvalidoException extends EntradaException{
	
	public NumeroInvalidoException(){
		super("O numero nao pode ser negativo");
	}
	
	public NumeroInvalidoException(String tipo){
		super(tipo + "nao pode ser negativo");
	}

}
