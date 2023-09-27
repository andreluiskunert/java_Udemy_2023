package ArraysECollections.Equals;

public class Usuario {
 String nome;
 String email;
   public boolean equals(Object objeto) {
	   // TODO Auto-generated methord stub
	  if(objeto instanceof Usuario) {
		     Usuario outro = (Usuario) objeto;
	   /// return super.equals(obj);
		     boolean nomeIgual = outro.nome == this.nome;
		     boolean emailIgual =  outro.email == this.email;
		     return  nomeIgual && emailIgual;
	  }
	  else 
	  {
		  return false;
	  }
   }
}
