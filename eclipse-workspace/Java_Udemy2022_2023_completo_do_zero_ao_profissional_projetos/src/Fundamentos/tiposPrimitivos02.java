package Fundamentos;

import java.util.Scanner;

public class tiposPrimitivos02 {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		System.out.println("Tipos Primitivos #02");
		System.out.println("André Luuis Kunert:");
     // Informação  do funcionario:
	
	// Tipos  numéricos inteiros:
		byte anosDeEmpresa= 23;
		short numeroDeVoos = 753;
		int id = 775533;
		long pontosAcumulados = 3_243_843_223L;
    // Tipos numericos reais:
    	float salario = 11_445.44F;
    	double vendasAcumuladas = 2_991_797_103.01;
     // tipo booleano{tipo lógico):
    	boolean estarDeFerias =  false; // true or false; ->  Em  Java você não pode inserir o número "0" isto ira da error....
   // tipo caractere:
    	char status = 'A'; // Ativo ou Inativo...
   // Dias de empresa 
    	System.out.println("Dias de empresa: " + anosDeEmpresa * 365  + ";");
   // Numeros de voos :
    	System.out.println("Viajou de aviã0: " + numeroDeVoos +  ";");
   // Pontos por real:
    	System.out.println("Quantos pontos por voo : " + pontosAcumulados /vendasAcumuladas + ";");
   // Salario {Id}
    	System.out.println("O funcionário nº" + id + ":ganha = " + salario +  ";");
   // Férias:
    	System.out.println("Está de Ferias? " + estarDeFerias  + ";");
    	System.out.println("Esta ativo na empresa {Status}:" + status +";" );
    	
     
	
	
    	System.out.println("The End.");
	entrada.close();
}
}
