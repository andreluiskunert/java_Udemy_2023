package TratamentoDeErros.Excecao.Personalizada;

import TratamentoDeErros.Excecao.Aluno;

public class Validar {
 private  Validar() {}
	public static void  alunoi(Aluno aluno) throws StringVaziaException, NumeroForadoIntervalorException  {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno é está nulo.....");
			
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
		throw new StringVaziaException("nome");
		}
	}
}
