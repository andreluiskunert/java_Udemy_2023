package ArraysECollections.Equals;   

//import java.util.Date;
import java.util.Scanner;

public class EqualsNaPratica {
   public static void main(String[] args) {
	Scanner equalsNaPratica =  new Scanner(System.in);
	 System.out.println("  equals Na Pratica ");
	  Usuario u1 = new Usuario();
	  u1.nome = "Lucas Camargo";
	  u1.email ="lucascamargo@gmail.com";
	  // duplicar os usuarios 
	  Usuario u2 = new Usuario();
	  u2.nome = "Luis Carlos";
	  u2.email ="luiscarlos@gamil.com";
	  System.out.println(u1 == u2);
	  System.out.println(u1.equals(u2));
	  System.out.println(u2.equals(u1));
	//  System.out.println(u1 ==u1);
	  System.out.println(u1.equals(u1));
	//  System.out.println(u2.equals(new Date()));
	 System.out.println("The End.");
	 equalsNaPratica.close();		
}
}
