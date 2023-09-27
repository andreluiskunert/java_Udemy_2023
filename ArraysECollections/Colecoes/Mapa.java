package ArraysECollections.Colecoes;

import java.util.Scanner;
import java.security.KeyStore.Entry;
import java.util.HashMap;
 import java.util.Map;
public class Mapa {
 public static void main(String[] args) {
	Scanner Map = new Scanner(System.in);
	System.out.println("Mapa:");
	 Map<Integer, String> usuarios =  new HashMap<>();
	 usuarios.put(1, "Sofia ");
	 usuarios.put(2, "Breno ");
	 usuarios.put(3, " Raivy");
	 System.out.println(usuarios.size());
	 System.out.println(usuarios.isEmpty());
	 System.out.println(usuarios.keySet());
	 System.out.println("Meus sobrinhos são ..." + usuarios.values());
	 System.out.println(usuarios.entrySet());
	 System.out.println(usuarios.containsKey(1));
	 System.out.println(usuarios.containsValue("Sofia"));
	 System.out.println(usuarios.get(3));
	 for(int chave: usuarios.keySet()) {
		 System.out.println(chave);
	 }
	    for(String valor: usuarios.values()) {
		 System.out.println(valor);
	     }
	     for(Entry<Integer, String> registro: usuarios.entrySet()) {
	    	 System.out.println(registro.getKey());
	    	 System.out.println(registro.getKeyValue(());
	    	 
	     }
	System.out.println("The End.");
	Map.close();
}
}
