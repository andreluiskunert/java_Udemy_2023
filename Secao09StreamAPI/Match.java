package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
 public static void main(String[] args) {
	 Aluno a1 = new  Aluno("john", 7.1);
	  Aluno a2 = new  Aluno("Maria", 9.1);
	  Aluno a3 = new  Aluno("Ana ", 8.1);
	  Aluno a4 = new  Aluno("Jully", 6.1);
   List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
   Predicate<Aluno> aprovados = a -> a.nota >= 7; 
   Predicate<Aluno> reprovados = aprovados.negate(); 

      System.out.println(alunos.stream().allMatch(aprovados));
      System.out.println(alunos.stream().anyMatch(aprovados));
      System.err.println(alunos.stream().noneMatch(reprovados));

}
}
