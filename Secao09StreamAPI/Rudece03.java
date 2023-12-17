package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Rudece03 {
 public static void main(String[] args) {
	  Aluno a1 = new  Aluno("john", 7.1);
	  Aluno a2 = new  Aluno("Maria", 9.1);
	  Aluno a3 = new  Aluno("Ana ", 8.1);
	  Aluno a4 = new  Aluno("Jully", 6.1);
    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
    Predicate<Aluno> aprovados = a -> a.nota >= 7;
    Function<Aluno, Double> apenasNota = a -> a.nota;
    BiFunction<Media, Double, Media> calcularMedia =
    		(media , nota) -> media.adicionar(nota);
    BinaryOperator<Media> combinarMedia = 
    		(m1, m2) -> 	Media.combinar(m1, m2);
 Media media = alunos.stream()
     .filter(aprovados)
     .map(apenasNota)
     .reduce(new Media(), calcularMedia, combinarMedia);
    System.out.println("A média da turna  é  " + media.getValor());
    
}
}
