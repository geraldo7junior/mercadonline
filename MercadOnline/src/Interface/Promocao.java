package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Utilitarios.Login;
import Utilitarios.Menu;


public class Promocao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public Promocao() {
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
		lblPadaria.setBounds(36, 85, 53, 14);
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
		lblBebidas.setBounds(205, 85, 56, 14);
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
		lblFrios.setBounds(290, 85, 121, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblLimpeza.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Limpeza().setVisible(true);
			}
		});
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(445, 85, 51, 14);
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
		lblMercearia.setBounds(535, 85, 64, 14);
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
		lblHigiene.setBounds(635, 85, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_14 = new JLabel("I");
		label_14.setForeground(new Color(255, 153, 0));
		label_14.setFont(new Font("Folks", Font.BOLD, 15));
		label_14.setBounds(95, 85, 4, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("I");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Folks", Font.BOLD, 15));
		label_15.setBounds(185, 85, 4, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("I");
		label_16.setForeground(new Color(255, 153, 0));
		label_16.setFont(new Font("Folks", Font.BOLD, 15));
		label_16.setBounds(270, 85, 4, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("I");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Folks", Font.BOLD, 15));
		label_17.setBounds(425, 85, 4, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("I");
		label_18.setForeground(new Color(255, 153, 0));
		label_18.setFont(new Font("Folks", Font.BOLD, 15));
		label_18.setBounds(515, 85, 4, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("I");
		label_19.setForeground(new Color(255, 153, 0));
		label_19.setFont(new Font("Folks", Font.BOLD, 15));
		label_19.setBounds(615, 85, 4, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("I");
		label_20.setForeground(new Color(255, 153, 0));
		label_20.setFont(new Font("Folks", Font.BOLD, 15));
		label_20.setBounds(700, 85, 4, 14);
		contentPane.add(label_20);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHortifruti.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Hortifruti().setVisible(true);
			}
		});
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(115, 85, 64, 14);
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
		lblCosmeticos.setBounds(720, 85, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCarrinhoCompras.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new CarrinhoCompras().setVisible(true);
			}
		});
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(841, 72, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblPromocao_1 = new JLabel("PROMO\u00C7\u00C3O");
		lblPromocao_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblPromocao_1.setBounds(482, 140, 113, 20);
		contentPane.add(lblPromocao_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\delvalle.png"));
		label.setBounds(66, 207, 88, 116);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\chalise.png"));
		label_1.setBounds(271, 211, 88, 116);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Torta de morango.png"));
		label_2.setBounds(508, 211, 88, 116);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Hortifruti\\melancia.png"));
		label_3.setBounds(799, 211, 88, 116);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\c2.png"));
		label_4.setBounds(64, 454, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Hortifruti\\tomate.png"));
		label_5.setBounds(269, 447, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\h4.png"));
		label_6.setBounds(508, 440, 88, 116);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarrao.png"));
		label_7.setBounds(799, 440, 88, 116);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Del Valle Uva 1L");
		label_8.setBounds(75, 331, 109, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("R$ 5,50");
		label_9.setBounds(92, 345, 51, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Vinho Tinto Chalise");
		label_10.setBounds(272, 333, 114, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("R$ 6,90");
		label_11.setBounds(297, 348, 51, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Torta de Morango Kg");
		label_12.setBounds(503, 333, 159, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("R$ 28,00");
		label_13.setBounds(529, 347, 50, 14);
		contentPane.add(label_13);
		
		JLabel label_21 = new JLabel("Melancia Und");
		label_21.setBounds(810, 332, 103, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("R$ 11,33");
		label_22.setBounds(821, 348, 51, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("Macarr\u00E3o Vitarela 1pct");
		label_23.setVerticalAlignment(SwingConstants.TOP);
		label_23.setHorizontalAlignment(SwingConstants.LEFT);
		label_23.setBounds(795, 562, 146, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("R$ 1,20");
		label_24.setBounds(828, 576, 42, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("Tomate 1kg");
		label_25.setBounds(279, 565, 96, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("R$ 5,20");
		label_26.setBounds(287, 582, 51, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("Monange Toque de Carinho");
		label_27.setBounds(485, 564, 157, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("R$ 5,55");
		label_28.setBounds(529, 577, 46, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("Mini Chicken");
		label_29.setBounds(75, 568, 74, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("R$ 4,29");
		label_30.setBounds(83, 581, 46, 14);
		contentPane.add(label_30);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
