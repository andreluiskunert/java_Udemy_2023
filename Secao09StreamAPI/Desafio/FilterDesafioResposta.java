package Secao09StreamAPI.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafioResposta {
  public static void main(String[] args) {
	  ProdutoFilterDesafioResposta p1 = new ProdutoFilterDesafioResposta("Notebook_Lenovo",1.799 ,012 , 0);
// Farei o restante a noite em Casa...
	  // Quarta-feira 13 / 12 /2023
	  ProdutoFilterDesafioResposta p2 = new ProdutoFilterDesafioResposta("Notebook_Lenovo",1.799 ,012 , 0);

	  ProdutoFilterDesafioResposta p3 = new ProdutoFilterDesafioResposta("Bateria Lenovo Thinkpad W540 T540p T440p T440 45n1150",104.76 ,012 , 0 );

	  ProdutoFilterDesafioResposta p4 = new ProdutoFilterDesafioResposta("Placa_de_som_not",1.799 ,012 , 0 );

	  ProdutoFilterDesafioResposta p5  = new ProdutoFilterDesafioResposta("Teclado Lenovo Thinkpad Edge T440 T440s T440p E431 T431 Novo ",183.95,012 , 0 );
 
       List<ProdutoFilterDesafioResposta> ProdutoFilterDesafioResposta =
    		   Arrays.asList(p1, p2, p3, p4, p5);
       // Filter, filter ,map
       Predicate<ProdutoFilterDesafioResposta> superPromocao = p -> p.desconto >= 0.3;
       Predicate<ProdutoFilterDesafioResposta> freteGratis = p -> p.valorFrete == 0;
       Predicate<ProdutoFilterDesafioResposta>  produtosRelevante = p -> p.preco  >= 500;
       Function<ProdutoFilterDesafioResposta, String> chamadaPromocional = 
    		   p -> "Aproveite!!!" + p.nome + "por R$"  + p.preco;
       ProdutoFilterDesafioResposta.stream()
        .filter(superPromocao)      
        .filter(freteGratis)
        .filter(produtosRelevante)
        .map(chamadaPromocional )
        .forEach(System.out::println);
       
}
  }
