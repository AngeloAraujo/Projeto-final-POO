
public class Main {

	public static void main(String[] args) {
		

		
		ListMotorista l = new ListMotorista();
		
		Motorista pes = new Motorista();
		pes.setCpf("0452198462");
		pes.setNome("Curvello");
		pes.setRua("Rua Brasil");
		pes.setBairro("Boa Vista");
		pes.setNumero(110);
		pes.setCidade("Rio do Sul");
		l.add(pes);
		
		pes = new Motorista();
		pes.setCpf("25594165");
		pes.setNome("Nara");
		pes.setRua("Rua Estados unidos");
		pes.setBairro("Jardim América");
		pes.setNumero(210);
		pes.setCidade("Rio do Sul");
		l.add(pes);
		
		l.gravar();
		
		l = new ListMotorista();
		
		l.setLista(l.ler());
		
	    for (Motorista p : l.getLista()) {
			System.out.println(p);
		}
	    
	    ListModelo m = new ListModelo();
		
		Modelo mod = new Modelo();
		mod.setModelo("Gol");
		mod.setConsumo(13.3);
		mod.setTanque(50);
		m.add(mod);
		
		mod = new Modelo();
		mod.setModelo("Onix");
		mod.setConsumo(14.3);
		mod.setTanque(48);
		m.add(mod);
		
		m.gravar();
		
		m = new ListModelo();
		
		m.setLista(m.ler());
		
	    for (Modelo modelo : m.getLista()) {
			System.out.println(modelo);
		}
	    
	    ListAbastecimento ab = new ListAbastecimento();
		
		Abastecimento a = new Abastecimento();
		a.setPreco(4.45);
		a.setLitros(32);
		ab.add(a);
		
		a = new Abastecimento();
		a.setPreco(5.55);
		a.setLitros(45);
		ab.add(a);
		
		ab.gravar();
		
		ab = new ListAbastecimento();
		
		ab.setLista(ab.ler());
		
	    for (Abastecimento p : ab.getLista()) {
			System.out.println(p);
		}  
	    ListRota ro = new ListRota();
		
	    Rota r = new Rota();
		r.setPartida("Rio do Sul");
		r.setDestino("Lontras");
		r.setKm(15);
		ro.add(r);
		
		r = new Rota();
		r.setPartida("Lontras");
		r.setDestino("Blumenau");
		r.setKm(75);
		ro.add(r);
		
		ro.gravar();
		
		ro = new ListRota();
		
		ro.setLista(ro.ler());
		
	    for (Rota p : ro.getLista()) {
			System.out.println(p);
		}  
	    
	    ListVeiculo v = new ListVeiculo();
		
	    Veiculo ve = new Veiculo();
		ve.setAbastecimento(a);
		ve.setModelo(mod);
		ve.setPlaca("1259");
		ve.setRota(r);
		v.add(ve);
		
		ve = new Veiculo();
		ve.setModelo(mod);
		ve.setRota(r);
		ve.setAbastecimento(a);
		ve.setPlaca("2547");
		v.add(ve);
		
		v.gravar();
		
		v = new ListVeiculo();
		
		v.setLista(v.ler());
		
	    for (Veiculo p : v.getLista()) {
			System.out.println(p);
		} 
	}
	
}