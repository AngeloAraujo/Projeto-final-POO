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

public class ListRota {
	
	private List<Rota> lista = new ArrayList<Rota>();
	
	public List<Rota> getLista() {
		return lista;
	}

	public void setLista(List<Rota> lista) {
		this.lista = lista;
	}

	public void add(Rota rota) {
		lista.add(rota);
	}
	
	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/rota.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Rota> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/rota.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Rota>>(){}.getType();
	    lista = new ArrayList<Rota>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

}