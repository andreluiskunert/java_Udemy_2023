package ArraysECollections.Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void main(String[] args) {
		Scanner List = new Scanner(System.in);
		System.out.println(" List... ");
		 ArrayList<Usuario> list = new  ArrayList<Usuario>();
		 Usuario u1 = new Usuario("Deia");
		 list.add(u1);
		 list.add(new Usuario("Diane"));
		 list.add(new Usuario("Leticia"));
		 list.add(new Usuario("Melina"));
		 list.add(new Usuario("Arcy"));
		 System.out.println(list.get(3));
		System.out.println(">>>>"  +list.remove(1)); 
		 //list.remove(1);
		 //list.remove(new Usuario("Diane"));
		 System.out.println( list.remove(new Usuario("Diane")));
		 for(Usuario u: list) {
			// System.out.println("Jovens solteiras na Igreja são..."+  u.nome +";");
			 System.out.println(u.toString());
		 }
		System.out.println("The End.");
		List.close();
	}

}
