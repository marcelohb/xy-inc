package br.com.zup.dominio;

public class Cep {
	
	private String cep;
	
	public Cep(String cep) {
		this.cep = cep.replace("-", "");
		validar();
	}
	
	private void validar() throws IllegalArgumentException {
		
		if (this.cep.length() != 8) {
			throw new IllegalArgumentException("CEP INCORRETO");
		}
		
		if(cep.replaceAll("[^0-9]", "").length() != 8){
			throw new IllegalArgumentException("CEP DEVE POSSUIR SOMENTE NÚMEROS!");
		}
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return cep;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cep other = (Cep) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Cep:"+this.cep+"]";
	}

}
