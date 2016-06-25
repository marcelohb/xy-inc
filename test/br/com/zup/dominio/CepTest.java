package br.com.zup.dominio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CepTest {
	
private Cep cep;
	
	@Before
	public void setUp() {
		cep = new Cep("14000-000");
	}
	
	@Test
	public void cepsIguas() {
		assertEquals(new Cep("14000-000"), cep);
	}

}
