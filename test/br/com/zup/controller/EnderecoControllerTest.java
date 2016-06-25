package br.com.zup.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.zup.aplicacao.EnderecoService;
import br.com.zup.dominio.Endereco;

public class EnderecoControllerTest {
	

	@Autowired
	private EnderecoService servico;
	
	
	Endereco endereco;
	
	@Before
	public void setUp() {
		
	}

	@Test
	public void retornarMeuCep() {
		endereco = servico.buscarEnderecoPorCep("14010160");
		assertEquals("{"
				+ "		'cep': '14010-100',"
				+ "		'logradouro': 'Rua Visconde de Inhaúma',"
				+ "		'complemento': 'até 1398/1399',"
				+ "		'bairro': 'Centro',"
				+ "		'localidade': 'Ribeirão Preto',"
				+ "		'uf': 'SP',"
				+ "		'unidade': '',"
				+ "		'ibge': '3543402',"
				+ "		'gia': '5824'"
				+ "	}", endereco);
	}

}
