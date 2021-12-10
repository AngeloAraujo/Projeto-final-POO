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

public class ListVeiculo {
	
	private List<Veiculo> lista = new ArrayList<Veiculo>();
	
	public List<Veiculo> getLista() {
		return lista;
	}

	public void setLista(List<Veiculo> lista) {
		this.lista = lista;
	}

	public void add(Veiculo veiculo) {
		lista.add(veiculo);
	}
	
	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/veiculo.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Veiculo> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/veiculo.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Veiculo>>(){}.getType();
	    lista = new ArrayList<Veiculo>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

}