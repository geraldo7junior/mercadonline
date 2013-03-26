package Utilitarios;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
	
	public void Abrir(final JFrame telaAbrir, JLabel label){
		label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				dispose();
				telaAbrir.setVisible(true);
			}
		});
	}

}
