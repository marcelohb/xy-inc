package br.com.zup.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.zup.aplicacao.EnderecoService;
import br.com.zup.dominio.Cep;
import br.com.zup.dominio.Endereco;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@TestPropertySource({"classpath:application.properties"})
public class EnderecoControllerTest {

	@Autowired
	private EnderecoService servico;
	
	Endereco endereco;
	List<Endereco> enderecos;
	
	@Test
	public void retornarMeuCep() {
		endereco = servico.buscarEnderecoPorCep("14010160");
		assertEquals(new Cep("14010160"), endereco.getCep());
	}
	
	@Test
	public void retornarMeuEndereco() {
		enderecos = servico.buscarCepPorEndereco("RJ", "Rio de Janeiro", "Ipanema");
		for (Endereco c : enderecos) {
			assertEquals(c.getCep(), new Cep("22631-390"));
		}
	}
	
	@Configuration
	static class Config {
		
		@Bean
		public EnderecoService getCepService(){
			return new EnderecoService();
		}
	}

}
