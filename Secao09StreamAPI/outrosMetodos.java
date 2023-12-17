package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;

public class outrosMetodos {
public static void main(String[] args) {
	 Aluno a1 = new  Aluno("john ", 7.1);
	  Aluno a2 = new  Aluno("Maria ", 9.1);
	  Aluno a3 = new  Aluno("Ana  ", 8.1);
	  Aluno a4 = new  Aluno("Jully ", 6.1);
	  Aluno a5 = new  Aluno("JC ", 7.1);
	  Aluno a6 = new  Aluno("Ana", 9.1);
	  Aluno a7 = new  Aluno("Jully ", 8.1);
	  Aluno a8 = new  Aluno("ALK ", 6.1);
   List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
   System.out.println("Distinçt... ");
   System.out.println("Você não pegar valores duplicados...");
   alunos.stream().distinct().forEach(System.out::println);
   System.out.println("\nSkip/Limit:");
   alunos.stream()
   .distinct()
   .skip(2)
   .limit(2)
   .forEach(System.out::println);
   System.out.println("\nTakeWhile:");
   alunos.stream()
   .distinct() 
   .skip(2)
   .takeWhile(a -> a.nota >= 7)
   .forEach(System.out::println);


   
}
}
