package ModuloUnico;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto CaixaA = new CaixaObjeto();
		CaixaA.guardar(2.3);
	      Double coisaA = (double) CaixaA.abrir();
	      System.out.println(coisaA);
		/*Integer coisa = (Integer)CaixaA.abrir();
		 * System.out.println(coisa);	
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double
		 * and java.lang.Integer are in module java.base of loader 'bootstrap') at
		 * ModuloUnico.CaixaObjetoTeste.main(CaixaObjetoTeste.java:7
		 */
	      CaixaObjeto CaixaB = new CaixaObjeto();
			CaixaB.guardar(" Hello...my friend..");
		      String coisaB = (String) CaixaB.abrir();
		      System.out.println(coisaB);
	}
}
