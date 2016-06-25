package br.com.zup.dominio;

public class Endereco {
	
	private String logradouro;
	private String cidade;
	private String numero;
	private Cep cep;
	
	public Endereco(Cep cep) {
		this.cep = cep;
	}
	
	public Endereco(String logradouro, String numero, String cidade) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return this.logradouro;
	}
}
