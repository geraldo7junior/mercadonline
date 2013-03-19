package Utilitarios;

import javax.swing.text.AttributeSet;   
import javax.swing.text.BadLocationException;   
  
public class ApenasStr extends LimitaNumeroCaracteres {   
	private static final long serialVersionUID = 1L;

	public ApenasStr(int maxlen) {   
        super(maxlen);   
    }   
  
    @Override   
    public void insertString(int offset, String str, AttributeSet attr)   
            throws BadLocationException {   
        if (str == null)   
            return;   
           
        try {   
            Integer.parseInt(str);
            
        } catch (Exception e) {
        	super.insertString(offset, str, attr);   
        }   
        
        return;           
           
    }   
}  

