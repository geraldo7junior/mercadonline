package Utilitarios;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame {
	
	public void Abrir(final JFrame telaAbrir, JLabel label){
	
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				telaAbrir.setVisible(true);
			}
		});
	}

}
