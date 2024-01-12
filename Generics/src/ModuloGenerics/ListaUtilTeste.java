package ModuloGenerics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
 /// banheiro... 
	public static void main(String[] args) {
		List<String> langs  = Arrays.asList("Java ", "Spring_Java", "JS");
	    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
	    
	    String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
	    System.out.println(ultimaLinguagem1);
	    //
	    Integer utlimoNumero1 =(Integer) ListaUtil.getUltimo1(nums);
	    System.out.println(utlimoNumero1);
	    // 
	    // Tipo generico...
	    Object ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
	    System.out.println(ultimaLinguagem2);
	    //
	    Object utlimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
	    System.out.println(utlimoNumero2);
	    }
}
