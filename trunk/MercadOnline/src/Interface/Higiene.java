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


public class Higiene extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Higiene() {
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
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCarrinhoCompras.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new CarrinhoCompras().setVisible(true);
			}
		});
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(825, 73, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblHigiene_1 = new JLabel("HIGIENE");
		lblHigiene_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblHigiene_1.setBounds(582, 140, 74, 20);
		contentPane.add(lblHigiene_1);
		
		JLabel lblPapelHiginico = new JLabel("Papel  Higi\u00EAnico");
		lblPapelHiginico.setForeground(new Color(255, 153, 0));
		lblPapelHiginico.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPapelHiginico.setBounds(47, 180, 139, 14);
		contentPane.add(lblPapelHiginico);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_1.setBounds(47, 192, 913, 14);
		contentPane.add(label_1);
		
		JLabel lblSabonete = new JLabel("Sabonete");
		lblSabonete.setForeground(new Color(255, 153, 0));
		lblSabonete.setFont(new Font("Calibri", Font.BOLD, 14));
		lblSabonete.setBounds(47, 361, 96, 14);
		contentPane.add(lblSabonete);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_2.setBounds(47, 373, 913, 14);
		contentPane.add(label_2);
		
		JLabel lblHigieneDoBeb = new JLabel("Higiene do Beb\u00EA");
		lblHigieneDoBeb.setForeground(new Color(255, 153, 0));
		lblHigieneDoBeb.setFont(new Font("Calibri", Font.BOLD, 14));
		lblHigieneDoBeb.setBounds(47, 536, 149, 14);
		contentPane.add(lblHigieneDoBeb);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_3.setBounds(47, 548, 913, 14);
		contentPane.add(label_3);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\papel1.png"));
		label.setBounds(56, 198, 88, 116);
		contentPane.add(label);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\papel2.png"));
		label_4.setBounds(292, 215, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\papel3.png"));
		label_5.setBounds(540, 215, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\papel4.png"));
		label_13.setBounds(788, 207, 88, 116);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\s1.png"));
		label_14.setBounds(57, 385, 88, 116);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\s2.png"));
		label_15.setBounds(296, 378, 88, 116);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\s3.png"));
		label_16.setBounds(540, 378, 88, 116);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\s4.png"));
		label_17.setBounds(788, 377, 88, 116);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\bb3.png"));
		label_18.setBounds(57, 565, 88, 116);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\bb4.png"));
		label_19.setBounds(292, 565, 88, 116);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\bb2.png"));
		label_20.setBounds(540, 565, 88, 116);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Higiene\\bb.png"));
		label_21.setBounds(790, 565, 88, 116);
		contentPane.add(label_21);
		
		JLabel lblPapelHiginicoNeve = new JLabel("Papel Higi\u00EAnico Neve-12 rolos");
		lblPapelHiginicoNeve.setBounds(34, 332, 154, 14);
		contentPane.add(lblPapelHiginicoNeve);
		
		JLabel lblNewLabel = new JLabel("R$ 18,89");
		lblNewLabel.setBounds(74, 346, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPapelHiginicoScott = new JLabel("Papel Higi\u00EAnico Scott-4 rolos");
		lblPapelHiginicoScott.setBounds(269, 330, 176, 14);
		contentPane.add(lblPapelHiginicoScott);
		
		JLabel lblNewLabel_1 = new JLabel("R$ 3,89");
		lblNewLabel_1.setBounds(312, 343, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPapelHiginicoNeve_1 = new JLabel("Papel Higi\u00EAnico Neve-4 rolos");
		lblPapelHiginicoNeve_1.setBounds(510, 330, 162, 14);
		contentPane.add(lblPapelHiginicoNeve_1);
		
		JLabel lblPapelHiginicoPersonal = new JLabel("Papel Higi\u00EAnico Personal-8 rolos");
		lblPapelHiginicoPersonal.setBounds(759, 331, 187, 14);
		contentPane.add(lblPapelHiginicoPersonal);
		
		JLabel lblR = new JLabel("R$ 2,50");
		lblR.setBounds(813, 345, 46, 14);
		contentPane.add(lblR);
		
		JLabel lblR_1 = new JLabel("R$ 6,05");
		lblR_1.setBounds(558, 345, 46, 14);
		contentPane.add(lblR_1);
		
		JLabel lblEvenLuxo = new JLabel("Even Luxo");
		lblEvenLuxo.setBounds(84, 498, 74, 14);
		contentPane.add(lblEvenLuxo);
		
		JLabel lblProtex = new JLabel("Protex");
		lblProtex.setBounds(321, 498, 46, 14);
		contentPane.add(lblProtex);
		
		JLabel lblAsepxia = new JLabel("Asepxia");
		lblAsepxia.setBounds(562, 498, 46, 14);
		contentPane.add(lblAsepxia);
		
		JLabel lblDove = new JLabel("Dove");
		lblDove.setBounds(823, 498, 46, 14);
		contentPane.add(lblDove);
		
		JLabel lblR_2 = new JLabel("R$ 1,59");
		lblR_2.setBounds(320, 511, 46, 14);
		contentPane.add(lblR_2);
		
		JLabel lblR_3 = new JLabel("R$ 1,78");
		lblR_3.setBounds(818, 512, 46, 14);
		contentPane.add(lblR_3);
		
		JLabel lblR_4 = new JLabel("R$ 4,09");
		lblR_4.setBounds(564, 511, 46, 14);
		contentPane.add(lblR_4);
		
		JLabel lblR_5 = new JLabel("R$ 1,68");
		lblR_5.setBounds(86, 513, 46, 14);
		contentPane.add(lblR_5);
		
		JLabel lblLenosUmidecidos = new JLabel("Len\u00E7os Umidecidos");
		lblLenosUmidecidos.setBounds(790, 679, 110, 14);
		contentPane.add(lblLenosUmidecidos);
		
		JLabel lblR_6 = new JLabel("R$ 8,39");
		lblR_6.setBounds(813, 692, 46, 14);
		contentPane.add(lblR_6);
		
		JLabel lblFraldasPampers = new JLabel("Fraldas Pampers ");
		lblFraldasPampers.setBounds(61, 678, 120, 14);
		contentPane.add(lblFraldasPampers);
		
		JLabel lblR_7 = new JLabel("R$ 67,89");
		lblR_7.setBounds(68, 694, 46, 14);
		contentPane.add(lblR_7);
		
		JLabel lblMamadeira = new JLabel("Mamadeira");
		lblMamadeira.setBounds(560, 682, 113, 14);
		contentPane.add(lblMamadeira);
		
		JLabel lblR_8 = new JLabel("R$ 3,10");
		lblR_8.setBounds(560, 694, 46, 14);
		contentPane.add(lblR_8);
		
		JLabel lblTalcoJohnsons = new JLabel("Talco Johnson's");
		lblTalcoJohnsons.setBounds(294, 688, 91, 14);
		contentPane.add(lblTalcoJohnsons);
		
		JLabel lblR_9 = new JLabel("R$ 6,99");
		lblR_9.setBounds(313, 702, 46, 14);
		contentPane.add(lblR_9);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
