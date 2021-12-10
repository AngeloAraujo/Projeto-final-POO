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

	public class ListAbastecimento {
		
		private List<Abastecimento> lista = new ArrayList<Abastecimento>();
		
		public List<Abastecimento> getLista() {
			return lista;
		}

		public void setLista(List<Abastecimento> lista) {
			this.lista = lista;
		}

		public void add(Abastecimento abastecimento) {
			lista.add(abastecimento);
		}
		
		
		public void gravar() {
			GsonBuilder builder = new GsonBuilder();
		    Gson gson = builder.create();
		    FileWriter writer;
			try {
				writer = new FileWriter("json/abastecimento.json");
				writer.write(gson.toJson(lista));
			    writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public List<Abastecimento> ler() {
		    BufferedReader bufferedReader = null;
			try {
				bufferedReader = new BufferedReader(
								 new FileReader("json/abastecimento.json"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		    Type listType = new TypeToken<ArrayList<Abastecimento>>(){}.getType();
		    lista = new ArrayList<Abastecimento>();
		    lista = new Gson().fromJson(bufferedReader, listType);
		    return lista;
		}

	}
