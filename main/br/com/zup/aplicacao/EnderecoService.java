package br.com.zup.aplicacao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.zup.dominio.Endereco;

@Service
public class EnderecoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EnderecoService.class);
	RestTemplate restTemplate = new RestTemplate();

	@Autowired
	private Environment app;
	
	public Endereco buscarEnderecoPorCep(String cep) {
		try {
			LOGGER.info("Buscando: " + cep);
			String url = app.getProperty("urlViaCep.buscarEndereco")+cep+app.getProperty("urlViaCep.formato");
			LOGGER.info("URL>"+url);
			return restTemplate.getForObject(url, Endereco.class);	
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Endereco> buscarCepPorEndereco(String uf, String cidade, String logradouro) {
		LOGGER.info("Buscando: " + uf + "/" + cidade + "/" + logradouro);
		String url = app.getProperty("urlViaCep.buscarEndereco")+uf + "/" + cidade + "/" + logradouro+app.getProperty("urlViaCep.formato");
		LOGGER.info("URL>"+url);
		@SuppressWarnings("unchecked")
		List<Endereco> enderecos = (List<Endereco>) restTemplate.getForObject(url, List.class);
		return enderecos;
	}
}
