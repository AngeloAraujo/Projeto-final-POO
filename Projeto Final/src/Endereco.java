
public  class Endereco {

	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		if(rua.length()>0)
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero>0)
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		if(bairro.length()>0)
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		if(cidade.length()>0)
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco Rua= ");
		builder.append(rua);
		builder.append(", Número= ");
		builder.append(numero);
		builder.append(", Bairro= ");
		builder.append(bairro);
		builder.append(", Cidade= ");
		builder.append(cidade);
		builder.append(".");
		return builder.toString();
	}
	
	
	
}
