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

public class Produtos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Produtos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		new Menu(contentPane); //Chama o menu principal
		
		new Login(contentPane); //Chama o Login
		
		JLabel lblProdutos_1 = new JLabel("PRODUTOS");
		lblProdutos_1.setForeground(Color.BLACK);
		lblProdutos_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblProdutos_1.setBackground(Color.WHITE);
		lblProdutos_1.setBounds(482, 144, 99, 20);
		contentPane.add(lblProdutos_1);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(43, 87, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(212, 87, 56, 14);
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
		lblFrios.setBounds(297, 87, 121, 14);
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
		lblLimpeza.setBounds(452, 87, 51, 14);
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
		lblMercearia.setBounds(542, 87, 64, 14);
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
		lblHigiene.setBounds(642, 87, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_14 = new JLabel("I");
		label_14.setForeground(new Color(255, 153, 0));
		label_14.setFont(new Font("Folks", Font.BOLD, 15));
		label_14.setBounds(102, 87, 4, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("I");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Folks", Font.BOLD, 15));
		label_15.setBounds(192, 87, 4, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("I");
		label_16.setForeground(new Color(255, 153, 0));
		label_16.setFont(new Font("Folks", Font.BOLD, 15));
		label_16.setBounds(277, 87, 4, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("I");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Folks", Font.BOLD, 15));
		label_17.setBounds(432, 87, 4, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("I");
		label_18.setForeground(new Color(255, 153, 0));
		label_18.setFont(new Font("Folks", Font.BOLD, 15));
		label_18.setBounds(522, 87, 4, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("I");
		label_19.setForeground(new Color(255, 153, 0));
		label_19.setFont(new Font("Folks", Font.BOLD, 15));
		label_19.setBounds(622, 87, 4, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("I");
		label_20.setForeground(new Color(255, 153, 0));
		label_20.setFont(new Font("Folks", Font.BOLD, 15));
		label_20.setBounds(707, 87, 4, 14);
		contentPane.add(label_20);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(122, 87, 64, 14);
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
		lblCosmeticos.setBounds(727, 87, 74, 14);
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
		lblCarrinhoCompras.setBounds(845, 74, 152, 30);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblIconPadaria = new JLabel("New label");
		lblPadaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblPadaria.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Padaria().setVisible(true);
			}
		});
		lblIconPadaria.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\Padaria.png"));
		lblIconPadaria.setBounds(124, 208, 120, 120);
		contentPane.add(lblIconPadaria);
		
		JLabel lblIconHortifruti = new JLabel("New label");
		lblHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHortifruti.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Hortifruti().setVisible(true);
			}
		});
		lblIconHortifruti.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\Hortifruti.png"));
		lblIconHortifruti.setBounds(312, 208, 120, 120);
		contentPane.add(lblIconHortifruti);
		
		JLabel lblIconBebidas = new JLabel("New label");
		lblBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblBebidas.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Bebidas().setVisible(true);
			}
		});
		lblIconBebidas.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\Bebidas.png"));
		lblIconBebidas.setBounds(531, 208, 120, 120);
		contentPane.add(lblIconBebidas);
		
		JLabel lblIconFriosCongelados = new JLabel("New label");
		lblIconFriosCongelados.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\frios e congelados.png"));
		lblIconFriosCongelados.setBounds(759, 208, 120, 120);
		contentPane.add(lblIconFriosCongelados);
		
		JLabel lblIconLimpeza = new JLabel("New label");
		lblIconLimpeza.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\limpeza.png"));
		lblIconLimpeza.setBounds(124, 438, 120, 120);
		contentPane.add(lblIconLimpeza);
		
		JLabel lblIconMercearia = new JLabel("New label");
		lblIconMercearia.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\Mercearia.png"));
		lblIconMercearia.setBounds(316, 438, 120, 120);
		contentPane.add(lblIconMercearia);
		
		JLabel lblIconHigiene = new JLabel("New label");
		lblIconHigiene.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\Higiene.png"));
		lblIconHigiene.setBounds(531, 438, 120, 120);
		contentPane.add(lblIconHigiene);
		
		JLabel lblIconCosmeticos = new JLabel("New label");
		lblIconCosmeticos.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Categorias\\Cosmeticos.png"));
		lblIconCosmeticos.setBounds(759, 438, 120, 120);
		contentPane.add(lblIconCosmeticos);
		
		JLabel lblPadaria_1 = new JLabel("Padaria");
		lblPadaria_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPadaria_1.setBounds(166, 339, 46, 14);
		contentPane.add(lblPadaria_1);
		
		JLabel lblHortifruti_1 = new JLabel("Hortifruti");
		lblHortifruti_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHortifruti_1.setBounds(350, 339, 85, 14);
		contentPane.add(lblHortifruti_1);
		
		JLabel lblBebidas_1 = new JLabel("Bebidas");
		lblBebidas_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBebidas_1.setBounds(571, 339, 68, 14);
		contentPane.add(lblBebidas_1);
		
		JLabel lblCongelados = new JLabel("Congelados");
		lblCongelados.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCongelados.setBounds(783, 339, 92, 14);
		contentPane.add(lblCongelados);
		
		JLabel lblLimpeza_1 = new JLabel("Limpeza");
		lblLimpeza_1.setBounds(158, 569, 46, 14);
		contentPane.add(lblLimpeza_1);
		
		JLabel lblFrios_1 = new JLabel("Frios");
		lblFrios_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrios_1.setBounds(357, 569, 46, 14);
		contentPane.add(lblFrios_1);
		
		JLabel lblHigiene_1 = new JLabel("Higiene");
		lblHigiene_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHigiene_1.setBounds(571, 569, 46, 14);
		contentPane.add(lblHigiene_1);
		
		JLabel lblCosmticos = new JLabel("Cosm\u00E9ticos");
		lblCosmticos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCosmticos.setBounds(787, 569, 92, 14);
		contentPane.add(lblCosmticos);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	
	}
}
