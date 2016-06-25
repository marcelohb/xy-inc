package br.com.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.aplicacao.BuscarEnderecoPorCep;
import br.com.zup.dominio.Cep;
import br.com.zup.dominio.Endereco;

@RestController
public class EnderecoController {

	@Autowired
	private BuscarEnderecoPorCep servico;
	
	@RequestMapping("/enderecoPorCep")
	public Endereco buscarEnderecoPorCep(@RequestParam(value="cep") String cep) {
		Endereco endereco = servico.buscarEnderecoPorCep(cep);
		return endereco;
	}
	
	@RequestMapping("/cepPorEndereco")
	public Endereco buscarCepPorEndereco(@RequestParam(value="logradouro") String logradouro, @RequestParam(value="cidade") String cidade) {
		return new Endereco(new Cep("cep"));
	}

}
