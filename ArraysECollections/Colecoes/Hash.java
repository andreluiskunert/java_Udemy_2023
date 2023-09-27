package ArraysECollections.Colecoes;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
 public static void main(String[] args) {
	Scanner Hash01 = new Scanner(System.in);
	    System.out.println("Hash");
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Deia "));
		usuarios.add(new Usuario("Diane "));
		usuarios.add(new Usuario("Dane "));
		boolean resultado = usuarios.contains(new  Usuario("Deia") );
		System.out.println("A guria mais dos jovens solteiros de Pato Branco PR"
				+ " é a irmão Deia é  " + resultado + " ;" );
		System.out.println("The End. ");

		
		Hash01.close();
}
}
