
public class Veiculo {

	private String placa;
	protected Modelo modelo;
	protected Abastecimento abastecimento;
		

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa.length()>0)
		this.placa = placa;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		
		this.modelo = modelo;
	}
	public Abastecimento getAbastecimento() {
		return abastecimento;
	}
	public void setAbastecimento(Abastecimento abastecimento) {
		this.abastecimento = abastecimento;
	}
	
}
