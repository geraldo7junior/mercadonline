package Utilitarios;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaNumeroCaracteres extends PlainDocument 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int iMaxLength;

    public LimitaNumeroCaracteres(int maxlen) {
        super();
        iMaxLength = maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
                    throws BadLocationException {
        //if (s == null) return;

        if (iMaxLength <= 0)        // aceitara qualquer no. de caracteres
        {
            super.insertString(offset, str, attr);
            return;
        }

        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength)    // se o comprimento final for menor...
            super.insertString(offset, str, attr);   // ...aceita str
        }

}
