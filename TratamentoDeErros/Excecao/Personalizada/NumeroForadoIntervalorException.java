package TratamentoDeErros.Excecao.Personalizada;


@SuppressWarnings("serial")
public class NumeroForadoIntervalorException extends RuntimeException  {
  private String nomeDoAtributo;
///	private static final long serialVersionUID = 5803252952810641887L;
 public NumeroForadoIntervalorException (String nomeDoAtributo) {
	// Quarta-feira 20/12/2023 
	 // Das 12:10:00 a 12:35:00 h+|-
	 this.nomeDoAtributo = nomeDoAtributo;
	 }

	public String getMessage() {
		
		return String.format("O atributo está  fora do Intervalo," , nomeDoAtributo);
	}
}
