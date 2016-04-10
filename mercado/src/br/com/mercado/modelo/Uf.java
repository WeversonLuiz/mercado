package br.com.mercado.modelo;

public enum Uf {

	AC("Acre"), 
	AL("Alagoas"), 
	AP("Amapa"), 
	AM("Amazonas"), 
	BA("Bahia"), 
	CE("Ceara"), 
	DF("Distrito Federal"), 
	ES("Espirito Santo"), 
	GO("Goias"), 
	MA("Maranhao"), 
	MT("Mato Grosso"), 
	MS("Mato Grosso do Sul"), 
	MG("Minas Gerais"), 
	PA("Para"), 
	PB("Paraiba"), 
	PE("Pernambuco"), 
	PR("Parana"), 
	PI("Piaui"), 
	RJ("Rio De Janeiro"), 
	RN("Rio Grande do Norte"),
	RS("Rio Grande do Sul"), 
	RO("Rondonia"), 
	RR("Roraima"), 
	SC("Santa Catarina"), 
	SE("Sergipe"), 
	SP("Sao Paulo"), 
	TO("Tocantins");
	
	private final String descricao;
	
	Uf(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
