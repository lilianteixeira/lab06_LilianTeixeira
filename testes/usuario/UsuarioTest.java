package usuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {
	
	@Test
	public void testCriaUsuario() throws Exception {
		
		try{
			
		Usuario danilo = new Noob("Danilo", "danilo01", 22.0, 5);
		
		assertEquals("Danilo", danilo.getNome());
		assertEquals("danilo01", danilo.getLogin());
		assertNotEquals(00, danilo.getDinheiro());
		assertEquals(0, danilo.getX2p());
		
		}catch(Exception e){
		
			fail(); //nao deve lancar excecao
		
		}
		
	}
	
	@Test
	public void testAdicionaDinheiro(){
		
		try{
			
			Usuario danilo = new Noob("Danilo", "danilo01", 22.0, 5);
			danilo.adicionaDinheiro(15);
			
			assertEquals(37,0, danilo.getDinheiro());
			
			
			}catch(Exception e){
			
				fail(); //nao deve lancar excecao
			
			}
		
	}
	
	/**@Test
	public void testRegistraJogada(){
		
		try{
			
			Usuario danilo = new Noob("Danilo", "danilo01", 22.0, 5);
			//Jogo mario = new Jogo("Mario", 22.50, 2000, 5, "plataforma", Jogabilidade.ONLINE);
			Jogo mario = new Jogo("Mario", 22.50, 2000, 20, 5, "plataforma", ); 
			mario.registraJogada(200, true);
			
			assertEquals(expected, actual);
			
			}catch(Exception e){
			
				fail(); //nao deve lancar excecao
			
			}
		
	}*/

}
