package ModuloGenerics;

public class CaixaIntTeste {
  public static void main(String[] args) {
	  CaixaInt<String> caixaA = new CaixaInt<>();
	  caixaA.guardar("Testando.....");
	  ///
	  String coisaA = caixaA.abrir();
	  System.out.println(coisaA);
	  
}
}
