import java.util.ArrayList;

public class Motorista  {
	
	private String cpf;
	private String nome;
	
	
	
	public Motorista(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motorista CPF=");
		builder.append(cpf);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(" ");
		return builder.toString();
	}
	
	
	
	
	
}
	