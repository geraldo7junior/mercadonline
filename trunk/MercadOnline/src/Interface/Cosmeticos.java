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

import Main.Produto;
import Utilitarios.Login;
import Utilitarios.Menu;


public class Cosmeticos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Cosmeticos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		new Menu(contentPane);
		
		new Login(contentPane); //Chama o Login
		
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
		lblLimpeza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblLimpeza.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Limpeza().setVisible(true);
			}
		});
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
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCosmeticos.setBounds(727, 85, 74, 14);
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
		lblCarrinhoCompras.setBounds(827, 73, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblCosmticos = new JLabel("COSM\u00C9TICOS");
		lblCosmticos.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblCosmticos.setBounds(582, 140, 121, 20);
		contentPane.add(lblCosmticos);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_18.setBounds(47, 192, 913, 14);
		contentPane.add(label_18);
		
		JLabel lblColoraes = new JLabel("Colora\u00E7\u00F5es");
		lblColoraes.setForeground(new Color(255, 153, 0));
		lblColoraes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblColoraes.setBounds(47, 180, 96, 14);
		contentPane.add(lblColoraes);
		
		JLabel lblDesodorantes = new JLabel("Desodorantes");
		lblDesodorantes.setForeground(new Color(255, 153, 0));
		lblDesodorantes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblDesodorantes.setBounds(47, 361, 107, 14);
		contentPane.add(lblDesodorantes);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_20.setBounds(47, 373, 913, 14);
		contentPane.add(label_20);
		
		JLabel lblHidratantes = new JLabel("Hidratantes");
		lblHidratantes.setForeground(new Color(255, 153, 0));
		lblHidratantes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblHidratantes.setBounds(47, 536, 107, 14);
		contentPane.add(lblHidratantes);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_21.setBounds(47, 548, 913, 14);
		contentPane.add(label_21);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\cor1.png"));
		label.setBounds(57, 217, 88, 116);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Produto().setInListaCompras("Alta Moda","3.20");
			}
		});
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\cor2.png"));
		label_1.setBounds(292, 217, 88, 116);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\cor3.png"));
		label_2.setBounds(540, 217, 88, 116);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\cor4.png"));
		label_3.setBounds(790, 217, 88, 116);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\des.png"));
		label_4.setBounds(57, 391, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\des2.png"));
		label_5.setBounds(292, 391, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		label_13.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Produto().setInListaCompras("Rexona Powder","9.90");
			}
		});
		label_13.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\des3.png"));
		label_13.setBounds(540, 391, 88, 116);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\des4.png"));
		label_14.setBounds(790, 391, 88, 116);
		contentPane.add(label_14);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\h1.png"));
		label_19.setBounds(57, 571, 88, 116);
		contentPane.add(label_19);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\h2.png"));
		label_22.setBounds(292, 571, 88, 116);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\h3.png"));
		label_23.setBounds(540, 571, 88, 116);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Cosmeticos\\h4.png"));
		label_24.setBounds(790, 571, 88, 116);
		contentPane.add(label_24);
		
		JLabel lblNewLabel = new JLabel("R$ 8,50");
		lblNewLabel.setBounds(813, 520, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAxeSeco = new JLabel("Axe Seco");
		lblAxeSeco.setBounds(810, 509, 46, 14);
		contentPane.add(lblAxeSeco);
		
		JLabel lblR = new JLabel("R$ 9,90");
		lblR.setBounds(562, 520, 46, 14);
		contentPane.add(lblR);
		
		JLabel lblRexonaPowder = new JLabel("Rexona Powder");
		lblRexonaPowder.setBounds(543, 509, 88, 14);
		contentPane.add(lblRexonaPowder);
		
		JLabel lblR_1 = new JLabel("R$ 11,50");
		lblR_1.setBounds(317, 520, 46, 14);
		contentPane.add(lblR_1);
		
		JLabel lblNiveaDoubleEffect = new JLabel("Nivea Double Effect");
		lblNiveaDoubleEffect.setBounds(292, 509, 128, 14);
		contentPane.add(lblNiveaDoubleEffect);
		
		JLabel lblR_2 = new JLabel("R$ 8,89");
		lblR_2.setBounds(77, 520, 46, 14);
		contentPane.add(lblR_2);
		
		JLabel lblDoveRefrescancia = new JLabel("Dove Refresc\u00E2ncia");
		lblDoveRefrescancia.setBounds(52, 509, 116, 14);
		contentPane.add(lblDoveRefrescancia);
		
		JLabel lblR_3 = new JLabel("R$ 7,80");
		lblR_3.setBounds(314, 701, 46, 14);
		contentPane.add(lblR_3);
		
		JLabel lblNiveaMilk = new JLabel("Nivea Body Milk");
		lblNiveaMilk.setBounds(298, 688, 101, 14);
		contentPane.add(lblNiveaMilk);
		
		JLabel lblR_4 = new JLabel("R$ 7,99");
		lblR_4.setBounds(562, 701, 46, 14);
		contentPane.add(lblR_4);
		
		JLabel lblJohsonsSoftlotion = new JLabel("Johnson's Softlotion");
		lblJohsonsSoftlotion.setBounds(534, 688, 135, 14);
		contentPane.add(lblJohsonsSoftlotion);
		
		JLabel lblR_5 = new JLabel("R$ 5,55");
		lblR_5.setBounds(813, 701, 46, 14);
		contentPane.add(lblR_5);
		
		JLabel lblMonange = new JLabel("Monange Toque de Carinho");
		lblMonange.setBounds(769, 688, 157, 14);
		contentPane.add(lblMonange);
		
		JLabel lblR_6 = new JLabel("R$ 44,90");
		lblR_6.setBounds(78, 701, 46, 14);
		contentPane.add(lblR_6);
		
		JLabel lblVictoriasSecret = new JLabel("Victoria's Secret");
		lblVictoriasSecret.setBounds(63, 689, 90, 14);
		contentPane.add(lblVictoriasSecret);
		
		JLabel lblR_7 = new JLabel("R$ 17,90");
		lblR_7.setBounds(79, 345, 46, 14);
		contentPane.add(lblR_7);
		
		JLabel lblPrVital = new JLabel("Pr\u00F3 Vital");
		lblPrVital.setBounds(80, 334, 46, 14);
		contentPane.add(lblPrVital);
		
		JLabel lblR_8 = new JLabel("R$ 13,20");
		lblR_8.setBounds(312, 345, 46, 14);
		contentPane.add(lblR_8);
		
		JLabel lblAltaModa = new JLabel("Alta Moda");
		lblAltaModa.setBounds(310, 334, 70, 14);
		contentPane.add(lblAltaModa);
		
		JLabel lblR_9 = new JLabel("R$ 21,99");
		lblR_9.setBounds(559, 345, 46, 14);
		contentPane.add(lblR_9);
		
		JLabel lblKoleston = new JLabel("Koleston");
		lblKoleston.setBounds(560, 334, 46, 14);
		contentPane.add(lblKoleston);
		
		JLabel lblR_10 = new JLabel("R$ 21,99");
		lblR_10.setBounds(812, 345, 46, 14);
		contentPane.add(lblR_10);
		
		JLabel lblImdiaExcellenceCreme = new JLabel(" Im\u00E9dia Excellence Creme - L'oreal");
		lblImdiaExcellenceCreme.setBounds(750, 334, 181, 14);
		contentPane.add(lblImdiaExcellenceCreme);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
