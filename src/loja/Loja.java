package loja;

import java.util.ArrayList;

import Usuario.Usuario;
/**
 * 
 * @author lilianht
 *
 *a loja é responsavel por imprimir os dados no console e capturas de Exceptions
 *
 */

public class Loja {

	private ArrayList<Usuario> listaDeUsuarios;
	private Usuario usuario;
	
	
	public Loja() {

		listaDeUsuarios = new ArrayList<Usuario>();
		
	}
	
	public void adicionaUsuario(String nome, String nomeLogin, double dinheiro){
		
		usuario = new Usuario(nome, nomeLogin, dinheiro);
		listaDeUsuarios.add(usuario);
		
	}
	
	
	public void vendeJogos(){
		
	}
	
}
