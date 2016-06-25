package br.com.zup.aplicacao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.zup.dominio.Endereco;

@Service
public class BuscarEnderecoPorCep {

	private static final Logger LOGGER = LoggerFactory.getLogger(BuscarEnderecoPorCep.class);

	@Autowired
	private Environment app;
	
	public List<Endereco> buscarEnderecoPorCep(String cep) {
		LOGGER.info("Buscando: " + cep);
		
		return null;
	}
}
