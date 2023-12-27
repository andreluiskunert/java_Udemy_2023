package TratamentoDeErros.Excecao.Personalizada;

import TratamentoDeErros.Excecao.Aluno;

public class testeValizacoes {
 public static void main(String[] args) {
	try {
		Aluno aluno = new Aluno("", 07);
		Validar.alunoi(aluno);
		Validar.alunoi(null);

	} catch (StringVaziaException | NumeroForadoIntervalorException  e) {
		System.out.println(e.getMessage());
	} 
	// Validar.alunoi(null);

    System.out.println();	
}
}
