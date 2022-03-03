package com.joaobilegra.tema7.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tema07_1.Inteiro;
import tema07_1.Romanos;

public class TestConversor {
Inteiro inteiro=new Inteiro();
Romanos romanos= new Romanos();

	
@Test
public void Testaint() {
	
 assertFalse(inteiro.convertRomano(21))	;     //DEVE SER FALSO  N�MEROS QUE NAO S�O DE 1 AT� 20 RECEBEM FALSO
 assertTrue(inteiro.convertRomano(20));
 assertFalse(inteiro.convertRomano(0));
}
@Test
public void Testaromanos() {
 assertTrue(romanos.converInteiro("II") );
 assertFalse(romanos.converInteiro("xxi"));      //N�MERO ROMANO MAIOR QUE XX RECEBE FALSO
 assertFalse(romanos.converInteiro("oi"));	     //N�O � UM N�MERO ROMANO
 assertFalse(romanos.converInteiro(null));   
  
                                             
}

	
	



}
