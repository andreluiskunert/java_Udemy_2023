package TratamentoDeErros.Excecao;

public class Causa {
  public static void main(String[] args) {
	  metodoA(null);
}
  static void metodoA(Aluno aluno) {
	  
	   try {
		    metodoB(aluno);
	   } catch (IllegalArgumentException e){
		   //throw new IllegalArgumentException(causa);
		   if(e.getCause() != null){
	       System.out.println(e.getCause().getMessage());
	   }
	   }
  }
  static void metodoB(Aluno aluno) {
	if(aluno == null) {
		throw new NullPointerException(" Aluno está nulloooooo");
		
	}
	System.out.println(aluno.nome);
  }
}
