
public class Modelo {

	private String modelo;
	private double consumo;
	private int tanque;
	
	
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getConsumo() {
		return consumo;
	}



	public void setConsumo(double consumo) {
		if("Gol".equalsIgnoreCase(modelo)) {
			consumo=(float) 13.3;
		}
		else if ("Onix".equalsIgnoreCase(modelo)){
			consumo=(float) 14.3;
		}
		else if ("Uno".equalsIgnoreCase(modelo)){
			consumo=(float) 13.2;
		}
		else if("Sandero".equalsIgnoreCase(modelo)) {
			consumo=(float) 13.2;
		}
		this.consumo = consumo;
	}


	public int getTanque() {
		return tanque;
	}



	public void setTanque(int tanque) {
		if("gol".equalsIgnoreCase(modelo)) {
			tanque=50;
		}
		else if ("Onix".equalsIgnoreCase(modelo)){
			tanque=54;
		}
		else if ("Uno".equalsIgnoreCase(modelo)){
			tanque=48;
		}
		else if("Sandero".equalsIgnoreCase(modelo)) {
			tanque=50;
		}
		this.tanque = tanque;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Modelo= ");
		builder.append(modelo);
		builder.append(", consumo= ");
		builder.append(consumo);
		builder.append(", tanque= ");
		builder.append(tanque);
		builder.append(".");
		return builder.toString();
	}


	

	
}
