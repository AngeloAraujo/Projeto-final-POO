
public class Usuario extends Endereco {

		
		private String cpf;
		private String nome;
		private int id;
		protected Veiculo veiculo;
		protected Rota rotas;
		protected Motorista motorista;
		
		public String getCpf() {
			return cpf;
		}
		
		public void setCpf(String cpf) {
			if (cpf.length()>0)
			this.cpf = cpf;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			if (nome.length()>0)
			this.nome = nome;
		}
		
		public Veiculo getVeiculo() {
			return veiculo;
		}
		
		public void setVeiculo(Veiculo veiculo) {
			this.veiculo = veiculo;
		}
		
		public Rota getRotas() {
			return rotas;
		}
		
		public void setRotas(Rota rotas) {
			this.rotas = rotas;
		}
		
		public Motorista getMotorista() {
			return motorista;
		}
		
		public void setMotorista(Motorista motorista) {
			this.motorista = motorista;
		}
		
}
		