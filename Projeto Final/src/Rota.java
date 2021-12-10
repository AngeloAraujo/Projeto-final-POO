import java.util.ArrayList;

public class Rota {

	private  int km;
	private String partida;
	private String destino;
	
	ArrayList<Viagem> viagem;
	
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		if(km>0)
		this.km = km;
	}
	
	public String getPartida() {
		return partida;
	}
	
	public void setPartida(String partida) {
		if(partida.length()>0)
		this.partida = partida;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		if(destino.length()>0)
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rota= ");
		builder.append("Cidade de partida= ");
		builder.append(partida);
		builder.append(", Cidade de destino=");
		builder.append(destino);
		builder.append(", Distância= ");
		builder.append(km);
		builder.append(" .");
		return builder.toString();
	}
	
	
	
	
}
