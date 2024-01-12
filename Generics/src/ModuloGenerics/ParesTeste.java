package ModuloGenerics;

public class ParesTeste {
  public static void main(String[] args) {
	Pares<Integer, String> resultandoConcurso = new Pares<>();
	 resultandoConcurso.adicionar(1, "Arci");
	 resultandoConcurso.adicionar(2 , " Debora");
	 resultandoConcurso.adicionar(3, "Gesi");
	 resultandoConcurso.adicionar(4, "Sidineia");
	 resultandoConcurso.adicionar(2 , " Diane");
	 resultandoConcurso.adicionar(6, "Dani");
	 System.out.println(resultandoConcurso.getValor(1));
	 System.out.println(resultandoConcurso.getValor(3));
	 System.out.println(resultandoConcurso.getValor(2));

	
	
}
}