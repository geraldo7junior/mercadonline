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


public class Sugeridos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Sugeridos() {
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
		lblPadaria.setBounds(43, 87, 53, 14);
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
		lblHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHortifruti.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Hortifruti().setVisible(true);
			}
		});
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
		lblCarrinhoCompras.setBounds(832, 72, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblSugeridos_1 = new JLabel("SUGERIDOS");
		lblSugeridos_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblSugeridos_1.setBounds(482, 140, 89, 20);
		contentPane.add(lblSugeridos_1);
		
		JLabel lblIndicadosParaVoc = new JLabel("Indicados para voc\u00EA:");
		lblIndicadosParaVoc.setForeground(new Color(255, 153, 0));
		lblIndicadosParaVoc.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIndicadosParaVoc.setBounds(43, 164, 123, 14);
		contentPane.add(lblIndicadosParaVoc);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_1.setBounds(43, 176, 913, 14);
		contentPane.add(label_1);
		
		JLabel lblHistrico = new JLabel("Hist\u00F3rico:");
		lblHistrico.setForeground(new Color(255, 153, 0));
		lblHistrico.setFont(new Font("Calibri", Font.BOLD, 14));
		lblHistrico.setBounds(43, 367, 81, 14);
		contentPane.add(lblHistrico);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_3.setBounds(43, 379, 913, 14);
		contentPane.add(label_3);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\ades.png"));
		label.setBounds(54, 207, 88, 116);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Hortifruti\\coentro.png"));
		label_2.setBounds(259, 211, 88, 116);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Hortifruti\\cebola.png"));
		label_4.setBounds(496, 211, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Hortifruti\\tomate.png"));
		label_5.setBounds(787, 204, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\feijao.png"));
		label_6.setBounds(54, 412, 88, 116);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\arroz 4.png"));
		label_7.setBounds(259, 416, 88, 116);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarrao.png"));
		label_8.setBounds(496, 416, 88, 116);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\coca 3.png"));
		label_9.setBounds(787, 416, 88, 116);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Coentro Und");
		label_10.setBounds(246, 330, 94, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("R$ 2,20");
		label_11.setBounds(254, 344, 51, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Cebola 1Kg");
		label_12.setBounds(504, 331, 96, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("R$ 2,80");
		label_13.setBounds(511, 346, 51, 14);
		contentPane.add(label_13);
		
		JLabel label_21 = new JLabel("Tomate 1kg");
		label_21.setBounds(787, 327, 96, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("R$ 5,20");
		label_22.setBounds(795, 344, 51, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("Ades Laranja 1L");
		label_23.setBounds(57, 334, 109, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("R$ 4,59");
		label_24.setBounds(66, 348, 51, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("Feij\u00E3o Carioca Turquesa 1Kg");
		label_25.setVerticalAlignment(SwingConstants.TOP);
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setBounds(31, 530, 174, 20);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("R$ 5,00");
		label_26.setBounds(77, 545, 42, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("Arroz Tio Jo\u00E3o 1Kg");
		label_27.setBounds(261, 534, 134, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("R$ 2,20");
		label_28.setBounds(289, 549, 42, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("Macarr\u00E3o Vitarela 1pct");
		label_29.setVerticalAlignment(SwingConstants.TOP);
		label_29.setHorizontalAlignment(SwingConstants.LEFT);
		label_29.setBounds(487, 526, 146, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("R$ 1,20");
		label_30.setBounds(520, 540, 42, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("Coca Cola 3L");
		label_31.setBounds(807, 536, 82, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("R$ 5,15");
		label_32.setBounds(818, 550, 51, 14);
		contentPane.add(label_32);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackgroundSugeridos.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
