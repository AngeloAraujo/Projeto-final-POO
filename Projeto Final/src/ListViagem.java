


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

	public class ListViagem {
		
		private List<Viagem> lista = new ArrayList<Viagem>();
		
		public List<Viagem> getLista() {
			return lista;
		}

		public void setLista(List<Viagem> lista) {
			this.lista = lista;
		}

		public void add(Viagem viagem) {
			lista.add(viagem);
		}
		
		
		public void gravar() {
			GsonBuilder builder = new GsonBuilder();
		    Gson gson = builder.create();
		    FileWriter writer;
			try {
				writer = new FileWriter("json/viagem.json");
				writer.write(gson.toJson(lista));
			    writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public List<Viagem> ler() {
		    BufferedReader bufferedReader = null;
			try {
				bufferedReader = new BufferedReader(
								 new FileReader("json/viagem.json"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		    Type listType = new TypeToken<ArrayList<Viagem>>(){}.getType();
		    lista = new ArrayList<Viagem>();
		    lista = new Gson().fromJson(bufferedReader, listType);
		    return lista;
		}

	}


