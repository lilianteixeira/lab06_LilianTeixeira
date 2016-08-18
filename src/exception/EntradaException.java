package exception;

public class EntradaException extends Exception{
	
	public EntradaException() {
		super("Informe uma entrada válida");
		
	}
	
	public EntradaException(String mensagem){
		super(mensagem);
	}

}