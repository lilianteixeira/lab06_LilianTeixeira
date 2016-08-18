package exception;

public class UsuarioInexistenteException extends Exception {

	public UsuarioInexistenteException() {
		super("Este usuario nao esta cadastrado em loja.");
	}
	
	public UsuarioInexistenteException(String tipo){
		super(tipo);
	}
	
}
