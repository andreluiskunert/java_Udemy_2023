package TratamentoDeErros.Excecao;

public class Basico {
  public static void main(String[] args) {
	// System.out.println(7 / 0);
	/*
	  Exception in thread "main" java.lang.ArithmeticException: / by zero
	  at CursoJavaUdemy/TratamentoDeErros.Excecao.Basico.main(Basico.java:5) 
	 */

  /* Aluno a1 = null;
  imprimirNomeDoAluno(a1); 
   * Exception in thread "main" java.lang.NullPointerException: Cannot read field "nome" because "aluno" is null
	at CursoJavaUdemy/TratamentoDeErros.Excecao.Basico.imprimirNomeDoAluno(Basico.java:14)
	at CursoJavaUdemy/TratamentoDeErros.Excecao.Basico.main(Basico.java:11)

   */
	  Aluno a1 = null;
	  try {  imprimirNomeDoAluno(a1);
		 }catch(Exception  excecao) {
			 System.out.println("Ocorreu um erro no Sistema,pedimos desculpa...");
		 }
  
     try {
    	 System.out.println(7 / 0);
  } catch(ArithmeticException  e) {
	//  e.printStackTrace();
	  System.out.println("Caro cliente:");
	  System.out.println("Pedimos desculpa,nossos servidores estão em manutenção" 
	  + e.getMessage());
  }
	  // Descansar um pouco depois vejo sobre isso...
  }
   public static void imprimirNomeDoAluno(Aluno aluno) {
	   System.out.println(aluno.nome);
   }
  
}
