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


public class Mercearia extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Mercearia() {
		setResizable(false);
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
		label_6.setBounds(102, 83, 4, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("I");
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Folks", Font.BOLD, 15));
		label_7.setBounds(192, 83, 4, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("I");
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Folks", Font.BOLD, 15));
		label_8.setBounds(277, 83, 4, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("I");
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Folks", Font.BOLD, 15));
		label_9.setBounds(432, 83, 4, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("I");
		label_10.setForeground(new Color(255, 153, 0));
		label_10.setFont(new Font("Folks", Font.BOLD, 15));
		label_10.setBounds(522, 83, 4, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("I");
		label_11.setForeground(new Color(255, 153, 0));
		label_11.setFont(new Font("Folks", Font.BOLD, 15));
		label_11.setBounds(622, 83, 4, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("I");
		label_12.setForeground(new Color(255, 153, 0));
		label_12.setFont(new Font("Folks", Font.BOLD, 15));
		label_12.setBounds(707, 83, 4, 14);
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
		
		JLabel lblMercearia_1 = new JLabel("MERCEARIA");
		lblMercearia_1.setForeground(Color.BLACK);
		lblMercearia_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblMercearia_1.setBackground(Color.WHITE);
		lblMercearia_1.setBounds(482, 140, 81, 20);
		contentPane.add(lblMercearia_1);
		
		JLabel lblFeijao = new JLabel("Feij\u00E3o");
		lblFeijao.setForeground(new Color(255, 153, 0));
		lblFeijao.setFont(new Font("Calibri", Font.BOLD, 14));
		lblFeijao.setBounds(47, 176, 46, 14);
		contentPane.add(lblFeijao);
		
		JLabel lblLinha1 = new JLabel("New label");
		lblLinha1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		lblLinha1.setBounds(47, 188, 913, 14);
		contentPane.add(lblLinha1);
		
		JLabel lblTurquesa = new JLabel("New label");
		lblTurquesa.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\feijao.png"));
		lblTurquesa.setBounds(108, 209, 88, 116);
		contentPane.add(lblTurquesa);
		
		JLabel lblFeijaoCariocaTurquesa = new JLabel("Feij\u00E3o Carioca Turquesa 1Kg");
		lblFeijaoCariocaTurquesa.setVerticalAlignment(SwingConstants.TOP);
		lblFeijaoCariocaTurquesa.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeijaoCariocaTurquesa.setBounds(82, 330, 174, 20);
		contentPane.add(lblFeijaoCariocaTurquesa);
		
		JLabel lblR = new JLabel("R$ 5,00");
		lblR.setBounds(128, 345, 42, 14);
		contentPane.add(lblR);
		
		JLabel lblArroz = new JLabel("Arroz");
		lblArroz.setForeground(new Color(255, 153, 0));
		lblArroz.setFont(new Font("Calibri", Font.BOLD, 14));
		lblArroz.setBounds(47, 361, 46, 14);
		contentPane.add(lblArroz);
		
		JLabel lblLinha2 = new JLabel("New label");
		lblLinha2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		lblLinha2.setBounds(47, 373, 913, 14);
		contentPane.add(lblLinha2);
		
		JLabel lblMacarrao = new JLabel("Macarr\u00E3o");
		lblMacarrao.setForeground(new Color(255, 153, 0));
		lblMacarrao.setFont(new Font("Calibri", Font.BOLD, 14));
		lblMacarrao.setBounds(47, 536, 67, 14);
		contentPane.add(lblMacarrao);
		
		JLabel lblLinha = new JLabel("New label");
		lblLinha.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		lblLinha.setBounds(47, 548, 913, 14);
		contentPane.add(lblLinha);
		
		JLabel lblArrozemocoes = new JLabel("ArrozEmocoes");
		lblArrozemocoes.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\arroz.png"));
		lblArrozemocoes.setBounds(102, 393, 88, 116);
		contentPane.add(lblArrozemocoes);
		
		JLabel lblR_1 = new JLabel("R$ 3,50");
		lblR_1.setBounds(130, 525, 42, 14);
		contentPane.add(lblR_1);
		
		JLabel lblArrozEmoeskg = new JLabel("Arroz Emo\u00E7\u00F5es 1Kg");
		lblArrozEmoeskg.setVerticalAlignment(SwingConstants.TOP);
		lblArrozEmoeskg.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrozEmoeskg.setBounds(108, 510, 133, 20);
		contentPane.add(lblArrozEmoeskg);
		
		JLabel lblMacarraovitarela = new JLabel("MacarraoVitarela");
		lblMacarraovitarela.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarrao.png"));
		lblMacarraovitarela.setBounds(108, 573, 88, 116);
		contentPane.add(lblMacarraovitarela);
		
		JLabel lblMacarroVitarelapct = new JLabel("Macarr\u00E3o Vitarela 1pct");
		lblMacarroVitarelapct.setVerticalAlignment(SwingConstants.TOP);
		lblMacarroVitarelapct.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacarroVitarelapct.setBounds(95, 684, 146, 14);
		contentPane.add(lblMacarroVitarelapct);
		
		JLabel lblR_2 = new JLabel("R$ 1,20");
		lblR_2.setBounds(128, 698, 42, 14);
		contentPane.add(lblR_2);
		
		JLabel lblMaximo = new JLabel("");
		lblMaximo.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\feijao2.png"));
		lblMaximo.setBounds(313, 213, 88, 116);
		contentPane.add(lblMaximo);
		
		JLabel lblKicaldo = new JLabel("");
		lblKicaldo.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\feijao3.png"));
		lblKicaldo.setBounds(550, 213, 88, 116);
		contentPane.add(lblKicaldo);
		
		JLabel lblUrbano = new JLabel("New label");
		lblUrbano.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\feijao4.png"));
		lblUrbano.setBounds(841, 213, 88, 116);
		contentPane.add(lblUrbano);
		
		JLabel lblTiojoao = new JLabel("New label");
		lblTiojoao.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\arroz 4.png"));
		lblTiojoao.setBounds(841, 398, 88, 116);
		contentPane.add(lblTiojoao);
		
		JLabel lblNamorado = new JLabel("");
		lblNamorado.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\arroz2.png"));
		lblNamorado.setBounds(313, 398, 88, 116);
		contentPane.add(lblNamorado);
		
		JLabel lblCamil = new JLabel("");
		lblCamil.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\arroz3.png"));
		lblCamil.setBounds(550, 398, 88, 116);
		contentPane.add(lblCamil);
		
		JLabel lblPetybon = new JLabel("New label");
		lblPetybon.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarrao 4 copy.png"));
		lblPetybon.setBounds(841, 573, 88, 116);
		contentPane.add(lblPetybon);
		
		JLabel lblPilar = new JLabel("");
		lblPilar.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarr\u00E3o2.png"));
		lblPilar.setBounds(313, 573, 88, 116);
		contentPane.add(lblPilar);
		
		JLabel lblDonaBenta = new JLabel("");
		lblDonaBenta.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarrao3.png"));
		lblDonaBenta.setBounds(550, 573, 88, 116);
		contentPane.add(lblDonaBenta);
		
		JLabel lblArrozNamoradokg = new JLabel("Arroz Namorado 1Kg");
		lblArrozNamoradokg.setVerticalAlignment(SwingConstants.TOP);
		lblArrozNamoradokg.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrozNamoradokg.setBounds(312, 513, 144, 20);
		contentPane.add(lblArrozNamoradokg);
		
		JLabel lblR_3 = new JLabel("R$ 2,00");
		lblR_3.setBounds(340, 528, 42, 14);
		contentPane.add(lblR_3);
		
		JLabel lblArrozCamilkg = new JLabel("Arroz Camil 1Kg");
		lblArrozCamilkg.setVerticalAlignment(SwingConstants.TOP);
		lblArrozCamilkg.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrozCamilkg.setBounds(555, 513, 127, 14);
		contentPane.add(lblArrozCamilkg);
		
		JLabel lblR_4 = new JLabel("R$ 2,45");
		lblR_4.setBounds(572, 528, 42, 14);
		contentPane.add(lblR_4);
		
		JLabel lblFeijoPretoMximo = new JLabel("Feij\u00E3o Preto M\u00E1ximo 1Kg");
		lblFeijoPretoMximo.setVerticalAlignment(SwingConstants.TOP);
		lblFeijoPretoMximo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeijoPretoMximo.setBounds(303, 330, 169, 20);
		contentPane.add(lblFeijoPretoMximo);
		
		JLabel lblR_5 = new JLabel("R$ 3,50");
		lblR_5.setBounds(337, 345, 46, 14);
		contentPane.add(lblR_5);
		
		JLabel lblFeijoMacassarKicaldo = new JLabel("Feij\u00E3o Macassar Kicaldo 1Kg");
		lblFeijoMacassarKicaldo.setVerticalAlignment(SwingConstants.TOP);
		lblFeijoMacassarKicaldo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeijoMacassarKicaldo.setBounds(529, 330, 182, 20);
		contentPane.add(lblFeijoMacassarKicaldo);
		
		JLabel lblR_6 = new JLabel("R$ 3,75");
		lblR_6.setBounds(569, 345, 42, 14);
		contentPane.add(lblR_6);
		
		JLabel lblMacarroPilarpct = new JLabel("Macarr\u00E3o Pilar 1pct");
		lblMacarroPilarpct.setVerticalAlignment(SwingConstants.TOP);
		lblMacarroPilarpct.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacarroPilarpct.setBounds(310, 687, 146, 14);
		contentPane.add(lblMacarroPilarpct);
		
		JLabel lblR_7 = new JLabel("R$ 1,83");
		lblR_7.setBounds(336, 700, 42, 14);
		contentPane.add(lblR_7);
		
		JLabel lblMacarroDonaBenta = new JLabel("Macarr\u00E3o Dona Benta 1pct");
		lblMacarroDonaBenta.setVerticalAlignment(SwingConstants.TOP);
		lblMacarroDonaBenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacarroDonaBenta.setBounds(542, 688, 169, 14);
		contentPane.add(lblMacarroDonaBenta);
		
		JLabel lblR_8 = new JLabel("R$ 3,20");
		lblR_8.setBounds(579, 700, 42, 14);
		contentPane.add(lblR_8);
		
		JLabel lblR_9 = new JLabel("R$ 2,20");
		lblR_9.setBounds(869, 528, 42, 14);
		contentPane.add(lblR_9);
		
		JLabel lblArrozTioJoo = new JLabel("Arroz Tio Jo\u00E3o 1Kg");
		lblArrozTioJoo.setBounds(841, 513, 134, 14);
		contentPane.add(lblArrozTioJoo);
		
		JLabel lblR_10 = new JLabel("R$ 3,50");
		lblR_10.setBounds(868, 345, 42, 14);
		contentPane.add(lblR_10);
		
		JLabel lblFeijoPretoUrbano = new JLabel("Feij\u00E3o Preto Urbano 1Kg");
		lblFeijoPretoUrbano.setBounds(829, 330, 146, 14);
		contentPane.add(lblFeijoPretoUrbano);
		
		JLabel lblR_11 = new JLabel("R$ 1,89");
		lblR_11.setBounds(868, 700, 42, 14);
		contentPane.add(lblR_11);
		
		JLabel lblMacarroPetybo = new JLabel("Macarr\u00E3o Petybon 1pct");
		lblMacarroPetybo.setBounds(822, 688, 153, 14);
		contentPane.add(lblMacarroPetybo);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
