package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Utilitarios.Login;
import Utilitarios.Menu;


public class Limpeza extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Limpeza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		new Menu(contentPane); //Chama o menu principal
		
		new Login(contentPane);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblPadaria.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Padaria().setVisible(true);
			}
		});
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(43, 85, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblBebidas.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Bebidas().setVisible(true);
			}
		});
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(212, 85, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblFrios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Frios().setVisible(true);
			}
		});
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(297, 85, 121, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(452, 85, 51, 14);
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblMercearia.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Mercearia().setVisible(true);
			}
		});
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMercearia.setBounds(542, 85, 64, 14);
		contentPane.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
		lblHigiene.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHigiene.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Higiene().setVisible(true);
			}
		});
		lblHigiene.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHigiene.setBounds(642, 85, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_6 = new JLabel("I");
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Folks", Font.BOLD, 15));
		label_6.setBounds(102, 87, 4, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("I");
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Folks", Font.BOLD, 15));
		label_7.setBounds(192, 87, 4, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("I");
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Folks", Font.BOLD, 15));
		label_8.setBounds(277, 87, 4, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("I");
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Folks", Font.BOLD, 15));
		label_9.setBounds(432, 87, 4, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("I");
		label_10.setForeground(new Color(255, 153, 0));
		label_10.setFont(new Font("Folks", Font.BOLD, 15));
		label_10.setBounds(522, 87, 4, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("I");
		label_11.setForeground(new Color(255, 153, 0));
		label_11.setFont(new Font("Folks", Font.BOLD, 15));
		label_11.setBounds(622, 87, 4, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("I");
		label_12.setForeground(new Color(255, 153, 0));
		label_12.setFont(new Font("Folks", Font.BOLD, 15));
		label_12.setBounds(707, 87, 4, 14);
		contentPane.add(label_12);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHortifruti.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Hortifruti().setVisible(true);
			}
		});
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(122, 85, 64, 14);
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCosmeticos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Cosmeticos().setVisible(true);
			}
		});
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCosmeticos.setBounds(727, 85, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel label_15 = new JLabel("Carrinho");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Calibri", Font.BOLD, 15));
		label_15.setBounds(854, 80, 56, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		label_16.setBounds(890, 76, 56, 23);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("Compras");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Calibri", Font.BOLD, 15));
		label_17.setBounds(935, 80, 63, 14);
		contentPane.add(label_17);
		
		JLabel lblLimpeza_1 = new JLabel("LIMPEZA");
		lblLimpeza_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblLimpeza_1.setBounds(482, 140, 74, 20);
		contentPane.add(lblLimpeza_1);
		
		JLabel lblLimpezaDaCozinha = new JLabel("Limpeza da Cozinha");
		lblLimpezaDaCozinha.setForeground(new Color(255, 153, 0));
		lblLimpezaDaCozinha.setFont(new Font("Calibri", Font.BOLD, 14));
		lblLimpezaDaCozinha.setBounds(47, 180, 139, 14);
		contentPane.add(lblLimpezaDaCozinha);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_1.setBounds(47, 192, 913, 14);
		contentPane.add(label_1);
		
		JLabel lblLimpezaDaRoupa = new JLabel("Limpeza da Roupa");
		lblLimpezaDaRoupa.setForeground(new Color(255, 153, 0));
		lblLimpezaDaRoupa.setFont(new Font("Calibri", Font.BOLD, 14));
		lblLimpezaDaRoupa.setBounds(47, 361, 127, 14);
		contentPane.add(lblLimpezaDaRoupa);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_2.setBounds(47, 373, 913, 14);
		contentPane.add(label_2);
		
		JLabel lblLimpezaDoBanheiro = new JLabel("Limpeza do Banheiro");
		lblLimpezaDoBanheiro.setForeground(new Color(255, 153, 0));
		lblLimpezaDoBanheiro.setFont(new Font("Calibri", Font.BOLD, 14));
		lblLimpezaDoBanheiro.setBounds(47, 536, 149, 14);
		contentPane.add(lblLimpezaDoBanheiro);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_3.setBounds(47, 548, 913, 14);
		contentPane.add(label_3);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
