
public class Abastecimento {

	private double preco;
	private float litros;
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco>0)
		this.preco = preco;
	}
	
	public float getLitros() {
		return litros;
	}
	
	public void setLitros(float litros) {
		if(litros>0)
		this.litros = litros;
	}
	
	public float custo() {
		return (float) (getLitros()*getPreco());
	
}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Abastecimento Preço=");
		builder.append(preco);
		builder.append(", litros= ");
		builder.append(litros);
		builder.append(", Custo Total= ");
		builder.append(custo());
		builder.append(", ");
		builder.append(super.toString());
		builder.append(" ");
		return builder.toString();
	}

	
	
}