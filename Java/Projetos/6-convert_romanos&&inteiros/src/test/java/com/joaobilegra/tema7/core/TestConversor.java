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
	
 assertFalse(inteiro.convertRomano(21))	;     //DEVE SER FALSO  NÚMEROS QUE NAO SÃO DE 1 ATÉ 20 RECEBEM FALSO
 assertTrue(inteiro.convertRomano(20));
 assertFalse(inteiro.convertRomano(0));
}
@Test
public void Testaromanos() {
 assertTrue(romanos.converInteiro("II") );
 assertFalse(romanos.converInteiro("xxi"));      //NÚMERO ROMANO MAIOR QUE XX RECEBE FALSO
 assertFalse(romanos.converInteiro("oi"));	     //NÃO É UM NÚMERO ROMANO
 assertFalse(romanos.converInteiro(null));   
  
                                             
}

	
	



}
