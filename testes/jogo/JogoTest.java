package jogo;

import static org.junit.Assert.fail;

import java.util.HashSet;

import org.junit.Test;

public class JogoTest {

	@Test
	public void testCriaJogo() {
		
		try {
			
			HashSet< Jogabilidade> jogabilidades = new HashSet<Jogabilidade>();
			jogabilidades.add(Jogabilidade.ONLINE);
			
			Jogo mario = new Jogo("mario", 25, 2000, 20, 5, "plataforma", jogabilidades);
			
			
			
		} catch (Exception e) {
			
			fail(); //nao deve lancar excecao
			
		}
		
		

	}

}
