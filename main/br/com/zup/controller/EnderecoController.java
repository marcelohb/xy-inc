package br.com.zup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.aplicacao.EnderecoService;
import br.com.zup.dominio.Endereco;

@RestController
public class EnderecoController {

	@Autowired
	private EnderecoService servico;
	
	@RequestMapping("/enderecoPorCep")
	public Endereco buscarEnderecoPorCep(@RequestParam(value="cep") String cep) {
		Endereco endereco = servico.buscarEnderecoPorCep(cep);
		return endereco;
	}
	
	@RequestMapping("/cepPorEndereco")
	public List<Endereco> buscarCepPorEndereco(@RequestParam(value="uf") String uf, @RequestParam(value="cidade") String cidade, @RequestParam(value="logradouro") String logradouro) {
		List<Endereco> enderecos = servico.buscarCepPorEndereco(uf, cidade, logradouro);
		
		return enderecos;
	}

}
