package br.com.zup.dominio;

public class Endereco {
	
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String numero;
	private Cep cep;
	
	public Endereco() {}
	
	public Endereco(Cep cep) {
		this.cep = cep;
	}
	
	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String unidade, String ibge, String gia) {
		this.cep = new Cep(cep);
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}
}
