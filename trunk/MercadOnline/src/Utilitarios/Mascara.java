package Utilitarios;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Mascara {
	
	public static MaskFormatter ExecutaMascara (String mask){
		MaskFormatter formato = new MaskFormatter();
		try {
			formato.setMask(mask);
			return formato;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
