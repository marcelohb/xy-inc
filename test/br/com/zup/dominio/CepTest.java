package br.com.zup.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CepTest {
	
private Cep cep;
	
	@Before
	public void setUp() {
		cep = new Cep("14000000");
	}
	
	@Test
	public void cepsIguas() {
		assertEquals(new Cep("14000000"), cep);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void cepInvalido() {
		assertEquals(new Cep("14000-000"), cep);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void cepComMenosCaracteres() {
		assertEquals(new Cep("1400"), cep);
	}

}
