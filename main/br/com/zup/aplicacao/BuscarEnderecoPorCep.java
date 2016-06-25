package br.com.zup.aplicacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.zup.dominio.Endereco;

@Service
public class BuscarEnderecoPorCep {

	private static final Logger LOGGER = LoggerFactory.getLogger(BuscarEnderecoPorCep.class);

	@Autowired
	private Environment app;
	
	public Endereco buscarEnderecoPorCep(String cep) {
		LOGGER.info("Buscando: " + cep);
		String url = app.getProperty("urlViaCep.buscarPorCep")+cep+app.getProperty("urlViaCep.formato");
		LOGGER.info("URL>"+url);
		RestTemplate restTemplate = new RestTemplate();
		Endereco endereco = restTemplate.getForObject(url, Endereco.class);
		LOGGER.info("Encontrado " + endereco);
		return endereco;
	}
}
