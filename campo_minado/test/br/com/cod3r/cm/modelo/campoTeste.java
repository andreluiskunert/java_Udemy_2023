package br.com.cod3r.cm.modelo;
import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.execao.ExplosaoException;


public class campoTeste {
	private campo campo;
   @BeforeEach
   void inciarCampo() {
	   campo = new campo(3 ,3);
	   
   }
   @Test
   void testeVizinhoRealDistancia1Esquerda(){
	   campo vizinho = new campo(3, 2);
	   boolean resultado = campo.adicionarVizinho(vizinho);
	  	   assertTrue(resultado);

	   
   }
   @Test
   void testeVizinhoRealDistancia1Direita(){
	   campo vizinho = new campo(3, 4);
	   boolean resultado = campo.adicionarVizinho(vizinho);
	  	   assertTrue(resultado);
	   // dar uma pausa...
	   
   }
   @Test
   void testeVizinhoRealDistancia1EmCima(){
	   campo vizinho = new campo(2, 3);
	   boolean resultado = campo.adicionarVizinho(vizinho);
	  	   assertTrue(resultado);	      
   }
   @Test
   void testeVizinhoRealDistancia1Embaixo() {
	   campo vizinho = new campo(4, 3);
	   boolean resultado = campo.adicionarVizinho(vizinho);
	  	   assertTrue(resultado);
	   // dar uma pausa...
	   
   }
   @Test
   void testeVizinhoRealDistancia2() {
	   campo vizinho = new campo(2, 2);
	   boolean resultado = campo.adicionarVizinho(vizinho);
	  	   assertTrue(resultado);
	   // dar uma pausa...
	   
   }
   @Test
   void testeNaoVizinho(){
	   campo vizinho = new campo(4, 3);
	   boolean resultado = campo.adicionarVizinho(vizinho);
	  	   assertFalse(resultado);
	   // dar uma pausa...
	   
   }
   @Test
   void testeValorPadraoMarcado() {
	   assertFalse(campo.isMarcado());
	   
   }
   @Test
   void testeAlterarMarcacao() {
	   campo.alternarMarcacao();
	   assertTrue(campo.isMarcado());
	   
   }
   @Test
   void testeAlternarMarcacaoDuasChamadas() {
	   campo.alternarMarcacao();
	   campo.alternarMarcacao();
	   assertFalse(campo.isMarcado());
	   
   }
   @Test
   void testeAbrirNaoMinadoNaoMarcado( ) {
	   assertTrue(campo.abrir());
   }
   @Test
   void testeAbrirNaoMinadoMarcado( ) {
	   campo.alternarMarcacao();
	   assertFalse(campo.abrir());
   }
   @Test
   void testeAbrirMinadoMarcado( ) {
	   campo.alternarMarcacao();
	   campo.minar();
	   assertFalse(campo.abrir());
   }
   @Test
   void testeAbrirMinadoNaoMarcado( ) {
	   campo.alternarMarcacao();
	   campo.minar();
	   assertThrows(ExplosaoException.class,  ()-> {
		    //assertFalse(campo.abrir());
		   campo.abrir();
	   });
	  
   }
   // terça-feira 02/01/2024 
   // das 22:15:00 a 22:41:00 h +|-
	/*
	 * @Test void testeAbriComVizinhos() { campo vizinhoDoVizinho1 = new campo(1,
	 * 1); campo vizinho1 = new campo(2, 2);
	 * vizinho1.adicionarVizinho(vizinhoDoVizinho1);
	 * campo.adicionarVizinho(vizinho1); campo.abrir(); assertTrue(campo.abrir());
	 * 
	 * }
	 */
   @Test
   void testeAbriComVizinhos1() {
	   campo campo11 = new campo(1, 1);
	   campo campo22 = new campo(2, 2);
     campo22.adicionarVizinho(campo11); 
     campo.adicionarVizinho(campo22);
      campo.abrir();
	   assertTrue(campo22.isAberto() && campo11.isAberto());
	   
   }
   @Test
   void testeAbriComVizinhos2() {
	   campo campo11 = new campo(1, 1);
	   campo campo12 = new campo(1, 1);
       campo12.minar();
	   campo campo22 = new campo(2, 2);
     campo22.adicionarVizinho(campo11); 
     campo22.adicionarVizinho(campo12); 

     campo.adicionarVizinho(campo22);
      campo.abrir();
	   assertTrue(campo22.isAberto() && campo11.isFechadoo());
	   
   }
  }

