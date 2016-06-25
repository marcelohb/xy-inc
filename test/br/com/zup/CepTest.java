package br.com.zup;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.zup.dominio.Cep;

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
