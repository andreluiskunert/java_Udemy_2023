package Secao09StreamAPI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
	public static void main(String[] args) {
		List<String> UltimosdaRepublicaCrista = Arrays.asList("Luca","Luis", "Andre");
		/*for(int i = 0; i <UltimosdaRepublicaCrista.size();i++) {
			System.out.println(UltimosdaRepublicaCrista .get(i));*/
		System.out.println("Usando o foreach...");
		for(String nome: UltimosdaRepublicaCrista ) {
			System.out.println("Ultimos da Republica Crista são " + nome);
		}
		System.out.println("\nUsando Iterador...");
       Iterator<String> it = UltimosdaRepublicaCrista.iterator();
       while(it.hasNext())  {
    	   System.out.println(it.next());
    	   
       }
       Stream<String> stream = UltimosdaRepublicaCrista.stream();
       stream.forEach(System.out::println); // Laço inteiro
		}
	}


