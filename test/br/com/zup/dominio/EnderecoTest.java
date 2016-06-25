package br.com.zup.dominio;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EnderecoTest {

	Endereco endereco;
	List<Endereco> enderecos;
	
	@Before
	public void setUp() {
		endereco = new Endereco("14000999", "Chico Junqueira", "100 ao 1000", "Centro", "Sao Joao Da Barra", "SP", "", "", "");
		enderecos = new ArrayList<Endereco>();
		enderecos.add(endereco);
		enderecos.add(new Endereco(new Cep("20000555")));
		enderecos.add(new Endereco(new Cep("20990555")));
		enderecos.add(new Endereco(new Cep("35000500")));
	}
	
	@Test
	public void existeEndereco() {
		assertTrue(enderecos.contains(new Cep("14000999")));
	}

}
