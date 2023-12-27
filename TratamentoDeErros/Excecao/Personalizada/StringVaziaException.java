package TratamentoDeErros.Excecao.Personalizada;


@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException  {
  private String nomeDoAtributo;
///	private static final long serialVersionUID = 5803252952810641887L;
 public StringVaziaException (String nomeDoAtributo) {
	// Quarta-feira 20/12/2023 
	 // Das 12:10:00 a 12:35:00 h+|-
	 this.nomeDoAtributo = nomeDoAtributo;
	 }

	public String getMessage() {
		
		return String.format("O atributo está vazi," , nomeDoAtributo);
	}
}
