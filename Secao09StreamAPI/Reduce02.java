package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {
  public static void main(String[] args) {
	// Quinta-feira, 14 de dezembro de 2023
	  // das 12:10:00 a 12:35:00 h+|-
	  Aluno a1 = new  Aluno("john", 7.1);
	  Aluno a2 = new  Aluno("Maria", 9.1);
	  Aluno a3 = new  Aluno("Ana ", 8.1);
	  Aluno a4 = new  Aluno("Jully", 6.1);
    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
    Predicate<Aluno> aprovados = a -> a.nota >= 7;
    Function<Aluno, Double> apenasNota = a -> a.nota;
    BinaryOperator<Double> somatorio = (a ,b) -> a + b;
    alunos.parallelStream()
     	.filter(aprovados)
        .map(apenasNota)
        .reduce(somatorio)
        .ifPresent(System.out::println);
  }
}
