package Utilitarios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Interface.Cadastro;
import Interface.Contato;
import Interface.Home;
import Interface.Produtos;
import Interface.Promocao;
import Interface.Sugeridos;


public class Menu extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Menu(JPanel Panel){
		JLabel lblHome = new JLabel("home");
		lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHome.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Home().setVisible(true);
			}
		});		
		lblHome.setBounds(270, 25, 51, 20);
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		Panel.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblProdutos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Produtos().setVisible(true);
			}
		});
		lblProdutos.setBounds(323, 25, 74, 20);
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		Panel.add(lblProdutos);
		
		JLabel lblCadastro = new JLabel("cadastro");
		lblCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCadastro.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Cadastro().setVisible(true);
			}
		});
		lblCadastro.setBounds(398, 25, 68, 20);
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Folks", Font.BOLD, 16));
		Panel.add(lblCadastro);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblPromocao.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Promocao().setVisible(true);
			}
		});
		lblPromocao.setBounds(475, 25, 81, 20);
		lblPromocao.setForeground(Color.WHITE);
		lblPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		Panel.add(lblPromocao);
		
		JLabel lblSugeridos = new JLabel("sugeridos");
		lblSugeridos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblSugeridos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Sugeridos().setVisible(true);
			}
		});
		lblSugeridos.setBounds(560, 25, 81, 20);
		lblSugeridos.setForeground(Color.WHITE);
		lblSugeridos.setFont(new Font("Folks", Font.BOLD, 16));
		Panel.add(lblSugeridos);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblContato.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Contato().setVisible(true);
			}
		});
		lblContato.setBounds(644, 25, 70, 20);
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Folks", Font.BOLD, 16));
		Panel.add(lblContato);
	}

}
