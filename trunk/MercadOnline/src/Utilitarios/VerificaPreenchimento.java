package Utilitarios;

import java.util.ArrayList;

import javax.swing.JTextField;

public class VerificaPreenchimento {
	String controle;
	
	public void VerTamanho(ArrayList<JTextField> lista){
		lista.remove(0);
		if (lista.size() > 0)
			Verifica(lista);
	}
	
	public boolean Verifica(ArrayList<JTextField> lista){
		if ((!lista.get(0).getText().equals("")) && (!lista.get(0).getText().equals("   .   .   -  ")) && (!lista.get(0).getText().equals("  /  /    ")) && 
				(!lista.get(0).getText().equals("(  )    -    ")) && (!lista.get(0).getText().equals("  .   -   "))){
			VerTamanho(lista);
		}
		
		else{
			String txt = lista.get(0).getName();
			String lblAst = txt.replace("txt", "lblAst");
			
			controle = "false";
			System.out.println(lblAst);
			VerTamanho(lista);
		}
		
		if (controle == "false")
			return false;
		return true;
	}
	
	

}
