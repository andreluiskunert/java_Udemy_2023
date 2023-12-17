package Secao09StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriamStreams {
 public static void main(String[] args) {
	//System.out::print; -> Consumer
	 System.out.println("LInguagens de Programação");
	 Consumer<String> print = System.out::print;
	 Consumer<Integer> println = System.out::println;

	 Stream<String> langs = Stream.of("Java ,", "Spring Boot, " , "JavaSCript;\n");
	 langs.forEach(print);
	 String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
	 
	 Stream.of(maisLangs).forEach(print);
	 Arrays.stream(maisLangs).forEach(print);
	 // Aproveitando o horário de almoço
	 // Das 12:15:00 a 12:33:00 h +|-
	 /*
	  * Sabádo 09/12/2023
	  */
	 Arrays.stream(maisLangs, 1, 2).forEach(print);
	 Arrays.stream(maisLangs, 1, 3).forEach(print);
	 Arrays.stream(maisLangs, 1, 4).forEach(print);
	 List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n ");
	 outrasLangs.stream().forEach(print);
	 outrasLangs.parallelStream().forEach(print);
   // Stream.generate(()-> "a" ).forEach(print);//usando ṕele racker oara derrubar servidores
    Stream.iterate(0, n -> n + 1).forEach(println); 
	 
	 
	 
	 
	 
}
}
