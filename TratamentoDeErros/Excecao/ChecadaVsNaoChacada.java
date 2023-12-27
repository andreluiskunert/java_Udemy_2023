package TratamentoDeErros.Excecao;

public class ChecadaVsNaoChacada {
    public static void main(String[] args) {
    	
    	try {
    		geraErro1();
    		
    	} catch(Exception e) {
    		///e.printStackTrace();
    		System.out.println(e.getMessage());
    	}
    
    	try {
    		geraErro2();
    	} catch(Throwable e) {
    		System.out.println(e.getMessage());
    	}
    	System.out.println("(Fim)");
    	
	}
    // Não checada não verificada
    static void geraErro1() {
     throw 	new RuntimeException("Ocorre um erro bem legal #01");
    }
     /// Exceção Checada ou Verifica...
    static void geraErro2() throws Exception{
     throw  new Exception("Ocorre um erro bem legal #02");

    }
}
