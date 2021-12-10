import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		
		Viagem v = new Viagem();
		Veiculo ve = new Veiculo ();
		Motorista m = new Motorista(null, null);
		Rota r = new Rota();
		Modelo mo = new Modelo ();
		Endereco e= new Endereco();
		Abastecimento a= new Abastecimento();
		v= new Viagem();
		ListAbastecimento ab =new ListAbastecimento ();
		ListModelo mod =new ListModelo();
		ListMotorista mot = new ListMotorista();
		ListRota ro =new ListRota();
		ListVeiculo vei = new ListVeiculo();
		ListViagem via = new ListViagem();
		ListEndereco end= new ListEndereco();
		
		System.out.println("Prepare-se para a sua viagem!!");
		
		System.out.println("Digite o que você quer cadastrar: (1) Viagem  (2) Veiculo (3) Motorista (4) Modelo (5)Endereço (6) Rota (7) Abastecimento");
		int opcao= entrada.nextInt();
		
		/*if (opcao == 1) {
			
			while(true) {
				
				v= new Viagem();
				System.out.println("Insira os dados da Viagem");
				v.setMotorista(m);
				v.setRota(r);
				v.setVeiculo(ve);
				
				
				System.out.println("Insira o seu Nome");
				m.setNome(entrada.nextLine());
				entrada.nextLine();
				
				mot.add(m);
				via.add(v);
				
				mot.gravar();
				
				mot.setLista(mot.ler());
				
			    for (Motorista p : mot.getLista()) {
					System.out.println(p);
				 
			}
			   
			    System.out.println("Deseja continuar cadastrando: Se sim digite 1 se não digite 0. ");
			    int cad= entrada.nextInt();  
			    if (cad==0) {
			    	break;
			    }
			
		}
	}*/
		if (opcao == 3) {
			
			while(true) {
				
				m= new Motorista(null, null);
				System.out.println("Insira o seu CPF");
				m.setCpf(entrada.nextLine());
				
				
				System.out.println("Insira o seu Nome");
				String nome=entrada.nextLine();
				m.setNome(nome);
				
				
				mot.add(m);
				
				
				mot.gravar();
				
				mot.setLista(mot.ler());
				
			    for (Motorista p : mot.getLista()) {
					System.out.println(p);
				 
			}
			   
			    System.out.println("Deseja continuar cadastrando: Se sim digite 1 se não digite 0. ");
			    int cad= entrada.nextInt();  
			    if (cad==0) {
			    	break;
			    }
			
		}
	}
}
}

				