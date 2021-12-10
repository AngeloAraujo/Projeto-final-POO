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

public class ListModelo {
	
	private List<Modelo> lista = new ArrayList<Modelo>();
	
	public List<Modelo> getLista() {
		return lista;
	}

	public void setLista(List<Modelo> lista) {
		this.lista = lista;
	}

	public void add(Modelo modelo) {
		lista.add(modelo);
	}
	
	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/modelo.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Modelo> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/modelo.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Modelo>>(){}.getType();
	    lista = new ArrayList<Modelo>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

}