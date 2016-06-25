package br.com.zup.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.zup.aplicacao.EnderecoService;
import br.com.zup.dominio.Cep;
import br.com.zup.dominio.Endereco;

public class EnderecoControllerTest {

	@Autowired
	private EnderecoService servico;
	
	Endereco endereco;
	List<Endereco> enderecos;
	
	//{"logradouro":"Rua Visconde de Inhaúma","complemento":"até 1398/1399","bairro":"Centro","localidade":"Ribeirão Preto","uf":"SP","cep":{"cep":"14010-100"}}
	@Test
	public void retornarMeuCep() {
		endereco = servico.buscarEnderecoPorCep("14010160");
		assertEquals(new Cep("14010160"), endereco.getCep());
	}
	
	@Test
	public void retornarMeuEndereco() {
		enderecos = servico.buscarCepPorEndereco("SP", "Rio de Janeiro", "Ipanema");
		assertTrue(enderecos.contains(new Cep("22631-390")));
	}

}
