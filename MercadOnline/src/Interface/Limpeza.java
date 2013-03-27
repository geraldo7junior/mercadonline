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
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\espanador.png"));
		label.setBounds(57, 205, 88, 116);
		contentPane.add(label);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\vasoura.png"));
		label_4.setBounds(292, 205, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\luvas.png"));
		label_5.setBounds(540, 205, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\limpa uax.png"));
		label_13.setBounds(790, 205, 88, 116);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\amaciante.png"));
		label_14.setBounds(69, 390, 88, 116);
		contentPane.add(label_14);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\ariel.png"));
		label_18.setBounds(292, 390, 88, 116);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\omo.png"));
		label_19.setBounds(540, 390, 88, 116);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\vanish.png"));
		label_20.setBounds(790, 390, 88, 116);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\rodo.png"));
		label_21.setBounds(57, 563, 88, 116);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\pinho sol.png"));
		label_22.setBounds(292, 563, 88, 116);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\agua sanitaria.png"));
		label_23.setBounds(540, 563, 88, 116);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Limpeza\\veja.png"));
		label_24.setBounds(790, 563, 88, 116);
		contentPane.add(label_24);
		
		JLabel lblEspanador = new JLabel("Espanador");
		lblEspanador.setBounds(81, 324, 53, 14);
		contentPane.add(lblEspanador);
		
		JLabel lblR = new JLabel("R$ 6,00");
		lblR.setBounds(89, 339, 51, 14);
		contentPane.add(lblR);
		
		JLabel lblVassoura = new JLabel("Vassoura");
		lblVassoura.setBounds(310, 324, 51, 14);
		contentPane.add(lblVassoura);
		
		JLabel lblR_1 = new JLabel("R$ 15,00");
		lblR_1.setBounds(306, 339, 51, 14);
		contentPane.add(lblR_1);
		
		JLabel lblLuvas = new JLabel("Luvas");
		lblLuvas.setBounds(569, 324, 37, 14);
		contentPane.add(lblLuvas);
		
		JLabel lblR_2 = new JLabel("R$ 3,50");
		lblR_2.setBounds(564, 339, 51, 14);
		contentPane.add(lblR_2);
		
		JLabel lblLimpaMax = new JLabel("Limpa MAX");
		lblLimpaMax.setBounds(804, 324, 56, 14);
		contentPane.add(lblLimpaMax);
		
		JLabel lblR_3 = new JLabel("R$ 8,00");
		lblR_3.setBounds(807, 339, 51, 14);
		contentPane.add(lblR_3);
		
		JLabel lblAmaciante = new JLabel("Amaciante");
		lblAmaciante.setBounds(83, 508, 53, 14);
		contentPane.add(lblAmaciante);
		
		JLabel lblR_4 = new JLabel("R$ 5,80");
		lblR_4.setBounds(87, 523, 51, 14);
		contentPane.add(lblR_4);
		
		JLabel lblAriel = new JLabel("Ariel");
		lblAriel.setBounds(321, 508, 51, 14);
		contentPane.add(lblAriel);
		
		JLabel lblR_5 = new JLabel("R$ 12,00");
		lblR_5.setBounds(309, 523, 51, 14);
		contentPane.add(lblR_5);
		
		JLabel lblSaboEmP = new JLabel("Sab\u00E3o em p\u00F3 OMO");
		lblSaboEmP.setBounds(537, 508, 113, 14);
		contentPane.add(lblSaboEmP);
		
		JLabel lblR_6 = new JLabel("R$ 10,50");
		lblR_6.setBounds(562, 523, 51, 14);
		contentPane.add(lblR_6);
		
		JLabel lblVanish = new JLabel("Vanish");
		lblVanish.setBounds(817, 508, 56, 14);
		contentPane.add(lblVanish);
		
		JLabel lblR_7 = new JLabel("R$ 10,00");
		lblR_7.setBounds(805, 523, 51, 14);
		contentPane.add(lblR_7);
		
		JLabel lblRodo = new JLabel("Rodo");
		lblRodo.setBounds(81, 681, 53, 14);
		contentPane.add(lblRodo);
		
		JLabel lblR_8 = new JLabel("R$ 14,00");
		lblR_8.setBounds(70, 696, 51, 14);
		contentPane.add(lblR_8);
		
		JLabel lblPinhoSol = new JLabel("Pinho Sol");
		lblPinhoSol.setBounds(316, 681, 51, 14);
		contentPane.add(lblPinhoSol);
		
		JLabel lblR_9 = new JLabel("R$ 6,50");
		lblR_9.setBounds(310, 696, 51, 14);
		contentPane.add(lblR_9);
		
		JLabel lblguaSanitriaDrago = new JLabel("\u00C1gua Sanit\u00E1ria drag\u00E3o");
		lblguaSanitriaDrago.setBounds(533, 681, 117, 14);
		contentPane.add(lblguaSanitriaDrago);
		
		JLabel lblR_10 = new JLabel("R$ 1,50");
		lblR_10.setBounds(568, 696, 51, 14);
		contentPane.add(lblR_10);
		
		JLabel lblVeja = new JLabel("Veja");
		lblVeja.setBounds(819, 681, 56, 14);
		contentPane.add(lblVeja);
		
		JLabel lblR_11 = new JLabel("R$ 4,50");
		lblR_11.setBounds(810, 696, 51, 14);
		contentPane.add(lblR_11);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
