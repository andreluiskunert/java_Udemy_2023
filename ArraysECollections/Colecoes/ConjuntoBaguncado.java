package ArraysECollections.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
  conjunto.add(1.2); // double  -> DOuble
  conjunto.add(true); // boolena -> Boolean
  conjunto.add("Teste") ; // String 
  conjunto.add(1); //  int -> INteger
  conjunto.add('x'); // Char -> Caracter
   System.out.println("O tamnanho é   " + conjunto.size());
   conjunto.add("teste");
   System.out.println("O tamnanho é   " + conjunto.size());
   System.out.println(conjunto.remove("Teste")); 
   System.out.println(conjunto.remove("teste"));
   System.out.println(conjunto.remove('x'));
   System.out.println("O tamnanho é   " + conjunto.size());
   System.out.println(conjunto.contains('x'));
   System.out.println(conjunto.contains(1));
   System.out.println(conjunto.contains(false));
   System.out.println(conjunto.contains(true));
   ///
	Set nums = new HashSet();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	System.out.println(nums);
	System.out.println(conjunto);
    conjunto.addAll(nums);
	System.out.println(conjunto);
	conjunto.clear();
	System.out.println(conjunto);


   


   
		  
   } 
}
  
