
public class Veiculo {

	private String placa;
	protected Abastecimento abastecimento;
	protected Modelo modelo;
	protected Rota rota;
	

		

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa.length()>0)
		this.placa = placa;
	}
	public Abastecimento getAbastecimento() {
		return abastecimento;
	}
	public void setAbastecimento(Abastecimento abastecimento) {
		this.abastecimento = abastecimento;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo placa= ");
		builder.append(placa);
		builder.append(", abastecimento= ");
		builder.append(abastecimento);
		builder.append(", modelo= ");
		builder.append(modelo);
		builder.append(", rota= ");
		builder.append(rota);
		builder.append(", ");
		builder.append(super.toString());
		builder.append(" ");
		return builder.toString();
	}


	
	
	
	
}
