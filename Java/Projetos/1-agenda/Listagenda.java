package com.joaobilegra.core.tema06;

import java.util.ArrayList;

public class Listagenda {
	private static ArrayList<Contato> listagenda =new ArrayList<Contato>();

public static ArrayList<Contato> getListagenda() {
		return listagenda;
	}

public void adicionar(Contato a) {
		
		listagenda.add(a);
		
	}
static public String pesquisarN(String nome) {
 String n="";
			
  for (int i=0; i< listagenda.size();i++) {
	Contato l= listagenda.get(i);
      if(l.getNome().equalsIgnoreCase(nome)) {
		 System.out.println("---USUARIO ENCONTRADO ------");
		 System.out.println("NOME:" +listagenda.get(i).getNome());
		 System.out.println("ID: " +listagenda.get(i).getId());
		 System.out.println("CONTATO:"+ listagenda.get(i).getNumero());
				}
	 else {
		 System.out.println("---CONTATO NÃO ECONTRADO---");
	     }
		 }
	 return n ;
	 }


static public boolean remover(int id) {
   for (int i=0; i< listagenda.size();i++) {
	Contato l= listagenda.get(i);
	  if(l.getId()==id) {
		System.out.println("-REMOVENDO USUARIO ID:" + id);
		  listagenda.remove(l);
			}
		else {
			System.out.println("---ID NÃO EXISTE---");
		    }
		    }
		return true;
		}

static public int pesquisarI(int id) {
   int j=0;
   for (int i=0; i< listagenda.size();i++) {
	 Contato l= listagenda.get(i);
	 if(l.getId()==id) {
	   System.out.println("---USUARIO ENCONTRADO ------");
	   System.out.println("NOME:" +listagenda.get(i).getNome());
	   System.out.println("ID: " +listagenda.get(i).getId());
	   System.out.println("CONTATO:"+ listagenda.get(i).getNumero());
			}
	 else {
		System.out.println("---CONTATO NÃO ECONTRADO---");
	    }
		}
		return j;
	}

}
