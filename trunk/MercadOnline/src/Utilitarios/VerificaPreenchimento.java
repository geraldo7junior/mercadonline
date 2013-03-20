package Utilitarios;

import java.util.ArrayList;

import javax.swing.JTextField;

public class VerificaPreenchimento {
	String controle;
	
	public boolean Verifica(ArrayList<JTextField> lista){
		if ((!lista.get(0).getText().equals("")) && (!lista.get(0).getText().equals("   .   .   -  ")) && (!lista.get(0).getText().equals("  /  /    ")) && 
				(!lista.get(0).getText().equals("(  )    -    ")) && (!lista.get(0).getText().equals("  .   -   "))){
			lista.remove(0);
			if (lista.size() > 0)
				Verifica(lista);
		}
		
		else{
			
			controle = "false";
			System.out.println(lista.get(0).getText() + "eu");
			lista.remove(0);
			if (lista.size() > 0)
				Verifica(lista);
		}
		
		if (controle == "false")
			return false;
		return true;
	}
	
	

}
