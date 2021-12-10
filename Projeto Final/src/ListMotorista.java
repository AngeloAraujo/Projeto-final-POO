import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ListMotorista {
	
	private List<Motorista> lista = new ArrayList<Motorista>();
	
	public List<Motorista> getLista() {
		return lista;
	}

	public void setLista(List<Motorista> lista) {
		this.lista = lista;
	}

	public void add(Motorista motorista) {
		lista.add(motorista);
	}
	
	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/motorista.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Motorista> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/motorista.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Motorista>>(){}.getType();
	    lista = new ArrayList<Motorista>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

}