
public class Viagem {
	
	protected Veiculo veiculo;
	protected Rota rota;
	protected Motorista motorista;
	
		
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Rota getRota() {
		return rota;
	}


	public void setRota(Rota rota) {
		this.rota = rota;
	}


	public Motorista getMotorista() {
		return motorista;
	}


	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Viagem [veiculo=");
		builder.append(veiculo);
		builder.append(", rota=");
		builder.append(rota);
		builder.append(", motorista=");
		builder.append(motorista);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
