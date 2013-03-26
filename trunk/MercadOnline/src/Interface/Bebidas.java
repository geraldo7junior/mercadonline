package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Utilitarios.*;
public class Bebidas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;

	public Bebidas() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		new Menu(contentPane); //Chama o menu principal		
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(724, 15, 34, 14);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblLogin);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setBounds(871, 14, 42, 14);
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblSenhaLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(765, 12, 96, 18);
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
		contentPane.add(txtLogin);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(912, 11, 96, 18);
		contentPane.add(txtSenhaLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(931, 39, 67, 18);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBackground(SystemColor.menu);
		contentPane.add(btnEntrar);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblPadaria.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Padaria().setVisible(true);
			}
		});
		lblPadaria.setBounds(43, 85, 53, 14);
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setBounds(212, 85, 56, 14);
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblFrios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Frios().setVisible(true);
			}
		});
		lblFrios.setBounds(297, 85, 121, 14);
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblLimpeza.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Limpeza().setVisible(true);
			}
		});
		lblLimpeza.setBounds(452, 85, 51, 14);
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblMercearia.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Mercearia().setVisible(true);
			}
		});
		lblMercearia.setBounds(542, 85, 64, 14);
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
		lblHigiene.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHigiene.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//dispose();
				//new Higiene().setVisible(true);
			}
		});
		lblHigiene.setBounds(642, 85, 56, 14);
		lblHigiene.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblHigiene);
		
		JLabel label_6 = new JLabel("I");
		label_6.setBounds(102, 85, 4, 14);
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("I");
		label_7.setBounds(192, 85, 4, 14);
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("I");
		label_8.setBounds(277, 85, 4, 14);
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("I");
		label_9.setBounds(432, 85, 4, 14);
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("I");
		label_10.setBounds(522, 85, 4, 14);
		label_10.setForeground(new Color(255, 153, 0));
		label_10.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("I");
		label_11.setBounds(622, 85, 4, 14);
		label_11.setForeground(new Color(255, 153, 0));
		label_11.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("I");
		label_12.setBounds(707, 85, 4, 14);
		label_12.setForeground(new Color(255, 153, 0));
		label_12.setFont(new Font("Folks", Font.BOLD, 15));
		contentPane.add(label_12);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHortifruti.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Hortifruti().setVisible(true);
			}
		});
		lblHortifruti.setBounds(122, 85, 64, 14);
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCosmeticos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//dispose();
				//new Cosmeticos().setVisible(true);
			}
		});
		lblCosmeticos.setBounds(727, 85, 74, 14);
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblCosmeticos);
		
		JLabel lblBebidas_1 = new JLabel("BEBIDAS");
		lblBebidas_1.setBounds(482, 140, 64, 20);
		lblBebidas_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		contentPane.add(lblBebidas_1);
		
		JLabel lblBebidasAlcolicas = new JLabel("Bebidas Alco\u00F3licas");
		lblBebidasAlcolicas.setBounds(47, 180, 114, 14);
		lblBebidasAlcolicas.setForeground(new Color(255, 153, 0));
		lblBebidasAlcolicas.setFont(new Font("Calibri", Font.BOLD, 14));
		contentPane.add(lblBebidasAlcolicas);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setBounds(47, 192, 913, 14);
		label_19.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		contentPane.add(label_19);
		
		JLabel lblSucos = new JLabel("Sucos");
		lblSucos.setBounds(47, 365, 42, 14);
		lblSucos.setForeground(new Color(255, 153, 0));
		lblSucos.setFont(new Font("Calibri", Font.BOLD, 14));
		contentPane.add(lblSucos);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setBounds(47, 377, 913, 14);
		label_20.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		contentPane.add(label_20);
		
		JLabel lblRefrigerantes = new JLabel("Refrigerantes");
		lblRefrigerantes.setBounds(47, 536, 86, 14);
		lblRefrigerantes.setForeground(new Color(255, 153, 0));
		lblRefrigerantes.setFont(new Font("Calibri", Font.BOLD, 14));
		contentPane.add(lblRefrigerantes);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setBounds(47, 548, 913, 14);
		label_21.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		contentPane.add(label_21);
		
		JLabel lblSkolI = new JLabel("New label");
		lblSkolI.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\skol.png"));
		lblSkolI.setBounds(108, 213, 88, 116);
		contentPane.add(lblSkolI);
		
		JLabel lblHeinekenI = new JLabel("New label");
		lblHeinekenI.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\Heineken.png"));
		lblHeinekenI.setBounds(343, 213, 88, 116);
		contentPane.add(lblHeinekenI);
		
		JLabel lblChaliseI = new JLabel("New label");
		lblChaliseI.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\chalise.png"));
		lblChaliseI.setBounds(591, 213, 88, 116);
		contentPane.add(lblChaliseI);
		
		JLabel lblBlueI = new JLabel("New label");
		lblBlueI.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\blue.png"));
		lblBlueI.setBounds(841, 213, 88, 116);
		contentPane.add(lblBlueI);
		

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\ades.png"));
		lblNewLabel_4.setBounds(103, 392, 88, 116);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\delvalle.png"));
		lblNewLabel_5.setBounds(343, 392, 88, 116);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\pessego.png"));
		lblNewLabel_6.setBounds(591, 392, 88, 116);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\tampico.png"));
		lblNewLabel_7.setBounds(841, 392, 88, 116);
		contentPane.add(lblNewLabel_7);

		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\coca.png"));
		lblNewLabel_8.setBounds(108, 570, 88, 116);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblGuaranaI = new JLabel("New label");
		lblGuaranaI.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\guarana.png"));
		lblGuaranaI.setBounds(348, 570, 88, 116);
		contentPane.add(lblGuaranaI);
		

		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\sprite.png"));
		lblNewLabel_10.setBounds(592, 570, 88, 116);
		contentPane.add(lblNewLabel_10);

		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\coca 3.png"));
		lblNewLabel_11.setBounds(841, 570, 88, 116);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblSkolLata = new JLabel("Skol lata 350 ml");
		lblSkolLata.setBounds(114, 333, 96, 14);
		contentPane.add(lblSkolLata);
		
		JLabel lblR = new JLabel("R$ 1,62");
		lblR.setBounds(136, 348, 51, 14);
		contentPane.add(lblR);
		
		JLabel lblHeinekenGarrafa = new JLabel("Heineken Garrafa 355 ml");
		lblHeinekenGarrafa.setBounds(333, 332, 144, 14);
		contentPane.add(lblHeinekenGarrafa);
		
		JLabel lblR_1 = new JLabel("R$ 2,30");
		lblR_1.setBounds(367, 348, 51, 14);
		contentPane.add(lblR_1);
		
		JLabel lblR_2 = new JLabel("R$ 6,90");
		lblR_2.setBounds(617, 348, 51, 14);
		contentPane.add(lblR_2);
		
		JLabel lblVinhoTintoChalise = new JLabel("Vinho Tinto Chalise");
		lblVinhoTintoChalise.setBounds(592, 333, 114, 14);
		contentPane.add(lblVinhoTintoChalise);
		
		JLabel lblR_3 = new JLabel("R$ 750,00");
		lblR_3.setBounds(859, 348, 66, 14);
		contentPane.add(lblR_3);
		
		JLabel lblWhyski = new JLabel("Whisky Blue Label");
		lblWhyski.setBounds(841, 333, 109, 14);
		contentPane.add(lblWhyski);
		
		JLabel lblR_4 = new JLabel("R$ 4,59");
		lblR_4.setBounds(131, 524, 51, 14);
		contentPane.add(lblR_4);
		
		JLabel lblAdesLaranja = new JLabel("Ades Laranja 1L");
		lblAdesLaranja.setBounds(122, 510, 109, 14);
		contentPane.add(lblAdesLaranja);
		
		JLabel lblR_5 = new JLabel("R$ 5,50");
		lblR_5.setBounds(372, 524, 51, 14);
		contentPane.add(lblR_5);
		
		JLabel lblDellValeUva = new JLabel("Del Valle Uva 1L");
		lblDellValeUva.setBounds(355, 510, 109, 14);
		contentPane.add(lblDellValeUva);
		
		JLabel lblDelVallePessego = new JLabel("Del Valle P\u00EAssego Lata");
		lblDelVallePessego.setBounds(584, 510, 129, 14);
		contentPane.add(lblDelVallePessego);
		
		JLabel lblR_6 = new JLabel("R$ 3,80");
		lblR_6.setBounds(618, 524, 51, 14);
		contentPane.add(lblR_6);
		
		JLabel lblR_9 = new JLabel("R$ 1,49");
		lblR_9.setBounds(864, 524, 51, 14);
		contentPane.add(lblR_9);
		
		JLabel lblTampico = new JLabel("Tampico Frutas C\u00EDtricas");
		lblTampico.setBounds(824, 510, 138, 14);
		contentPane.add(lblTampico);
		
		JLabel lblR_7 = new JLabel("R$ 1,43");
		lblR_7.setBounds(126, 700, 51, 14);
		contentPane.add(lblR_7);
		
		JLabel lblCocacolaLata = new JLabel("Coca Cola lata 350 ml");
		lblCocacolaLata.setBounds(100, 686, 129, 14);
		contentPane.add(lblCocacolaLata);
		
		JLabel lblR_8 = new JLabel("R$ 1,15");
		lblR_8.setBounds(375, 700, 51, 14);
		contentPane.add(lblR_8);
		
		JLabel lblGuaranAntarcticaLata = new JLabel("Guaran\u00E1 Antarctica lata 350 ml");
		lblGuaranAntarcticaLata.setBounds(316, 686, 179, 14);
		contentPane.add(lblGuaranAntarcticaLata);
		
		JLabel lblR_10 = new JLabel("R$ 1,50");
		lblR_10.setBounds(620, 700, 51, 14);
		contentPane.add(lblR_10);
		
		JLabel lblSprite = new JLabel("Sprite Lata 350 ml");
		lblSprite.setBounds(589, 686, 129, 14);
		contentPane.add(lblSprite);
		
		JLabel lblR_11 = new JLabel("R$ 5,15");
		lblR_11.setBounds(875, 700, 51, 14);
		contentPane.add(lblR_11);
		
		JLabel lblCocaCola = new JLabel("Coca Cola 3L");
		lblCocaCola.setBounds(864, 686, 82, 14);
		contentPane.add(lblCocaCola);
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(848, 72, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setBounds(10, 0, 1024, 768);
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(lblBackGround);
		
		
	}
}
