package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Fliter02 {
 public static void main(String[] args) {
	Aluno a1 = new Aluno("Ana", 7.8);
	Aluno a2 = new Aluno("Leo", 7.8);
	Aluno a3 = new Aluno("ALK", 7.8);
	Aluno a4 = new Aluno("jC", 7.8);
	Aluno a5 = new Aluno("LC", 7.8);
    
	 List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
	 Predicate<Aluno> aprovados = a -> a.nota >= 7 ;
	 // Descanta ...
	 // Terça-feira 12:12:00 h+|-
	 Function<Aluno, String> saudacaoAprovados =
			 a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
	 alunos.stream()
	 .filter(aprovados)
	 .map(saudacaoAprovados)
	 .forEach(System.out::println);
	 
	 
	
}
}
