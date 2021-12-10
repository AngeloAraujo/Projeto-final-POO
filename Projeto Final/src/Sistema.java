import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		//System.out.println("Insira 1 para Usuário, 2 para Motorista, 3 para Admin");
		//int user = entrada.nextInt();
		
		
		Viagem v = new Viagem();
		Motorista m= new Motorista();
		Veiculo ve = new Veiculo ();
		Rota r = new Rota();
		Modelo mo = new Modelo ();
		Endereco e= new Endereco();
		Usuario u = new Usuario ();
		Abastecimento a= new Abastecimento();
		ListAbastecimento ab =new ListAbastecimento ();
		ListModelo mod =new ListModelo();
		ListMotorista mot = new ListMotorista();
		ListRota ro =new ListRota();
		ListUsuario us= new ListUsuario();
		ListVeiculo vei = new ListVeiculo();
		ListViagem via = new ListViagem();
		
		System.out.println("Prepare-se para a sua viagem!!");
		

			Usuario a= new Usuário();
			System.out.println("Insira os seu nome");
			a.setNome() = entrada.nextLine();
			System.out.println("Insira o seu CPF");
			a.setCpf()= entrada.nextString();
			a.setRua() = entrada .next;
			a.setNumero();
			a.setBairro();
			a.setCidade();
		
			System.out.println("Seu cadastro foi efetuado, verifique os dados abaixo");
			System.out.println(a);
				
			
	

		 /*c = new Conta();
		TipoReceita tr = new TipoReceita();
		TipoDespesa td = new TipoDespesa();
		Receita r = new Receita();
		ListTipoReceita trecl = new ListTipoReceita();
		ListReceita l = new ListReceita();
		
		System.out.println("-------ORÇAMENTO PESSOAL---------\n");
		
		
		tr = new TipoReceita();
		tr.setCategoria("Salário");
		trecl.add(tr);
			
		tr = new TipoReceita();
		tr.setCategoria("Variável");
		trecl.add(tr);
			
		tr = new TipoReceita();
		tr.setCategoria("Outro");
		trecl.add(tr);
			
		trecl.gravar();
			
		trecl = new ListTipoReceita();
			
		trecl.setLista(trecl.ler());
		
		while(true){
			
			
			System.out.println("O que você deseja gerenciar? \n1 - Receita\n2 - Despesa\n3 - Conta\n0 - Para finalizar qualquer operação ou sub operação");
			int og = input.nextInt();
			
			System.out.println("-------------------");
	
			if(og == 1) {
				System.out.println("O que deseja fazer?\n1 - Inserir receita\n2 - Ver receita total por categoria de receita");
				int or = input.nextInt();
				
				if(or == 1) {
					
					while(true) {
							
						System.out.println("\n------LISTA DE TIPOS DE RECEITA------\n");
						
						for (TipoReceita p : trecl.getLista()) {
							System.out.println(p);
						}   
						 
						r = new Receita();
						
						System.out.println("\nDigite o valor da receita: ");
						r.setValor(input.nextDouble());
						input.nextLine();
						
						System.out.println("Digite a data:");
						r.setData(input.nextLine());
						
						System.out.println("\nDigite a categoria da receita por índice (de 0 a 2):");
						r.setTipoReceita(trecl.getLista().get(input.nextInt()));
						
	
						l.add(r);
						c.setLr(l);
			
						l.gravar();
						
						l.setLista(l.ler());
						
					    for (Receita p : l.getLista()) {
							System.out.println(p);
						}   
					    

						System.out.println("\nCadastrar mais receitas? 1 - Sim e 2 - Não");
						int a = input.nextInt();
						if(a == 2) {
							break;
						}
					
					}
					
				}if(or == 2) {
					System.out.println("\nSelecione o catergoria da receita:");
					System.out.println("\n0 - Sálario 1 - Variável 2 - Outro");
					int cat = input.nextInt();
					
					switch (cat) {
						
					case 0:
						System.out.println("Valor total da receita pela categoria Salário " + c.somaPorCatReceita("Salário"));
						break;
					case 1:
						System.out.println("Valor total da receita pela categoria Variável " + c.somaPorCatReceita("Variável"));
						break;
					default:
						System.out.println("Valor total da receita pela categoria Outro " + c.somaPorCatReceita("Outro"));
						break;
					}
					
				}