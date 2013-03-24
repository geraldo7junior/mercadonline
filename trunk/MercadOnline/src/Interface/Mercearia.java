package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Mercearia extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mercearia frame = new Mercearia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mercearia() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		lblHome.setBounds(260, 25, 51, 20);
		contentPane.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		lblProdutos.setBounds(313, 25, 74, 20);
		contentPane.add(lblProdutos);
		
		JLabel lblCadastro = new JLabel("cadastro");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Folks", Font.BOLD, 16));
		lblCadastro.setBounds(388, 25, 68, 20);
		contentPane.add(lblCadastro);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setForeground(Color.WHITE);
		lblPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		lblPromocao.setBounds(465, 25, 81, 20);
		contentPane.add(lblPromocao);
		
		JLabel lblSugeridos = new JLabel("sugeridos");
		lblSugeridos.setForeground(Color.WHITE);
		lblSugeridos.setFont(new Font("Folks", Font.BOLD, 16));
		lblSugeridos.setBounds(550, 25, 81, 20);
		contentPane.add(lblSugeridos);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Folks", Font.BOLD, 16));
		lblContato.setBounds(634, 25, 70, 20);
		contentPane.add(lblContato);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblLogin.setBounds(714, 15, 34, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblSenhaLogin.setBounds(861, 14, 42, 14);
		contentPane.add(lblSenhaLogin);
		
		txtLogin = new JTextField();
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
		txtLogin.setBounds(755, 12, 96, 18);
		contentPane.add(txtLogin);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(902, 11, 96, 18);
		contentPane.add(txtSenhaLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBackground(SystemColor.menu);
		btnEntrar.setBounds(931, 39, 67, 18);
		contentPane.add(btnEntrar);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(43, 85, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(212, 85, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(297, 85, 121, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(452, 85, 51, 14);
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
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
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(122, 85, 64, 14);
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
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
		lblTurquesa.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\feijao.png"));
		lblTurquesa.setBounds(108, 209, 88, 116);
		contentPane.add(lblTurquesa);
		
		JLabel lblFeijaoCariocaTurquesa = new JLabel("Feij\u00E3o Carioca Turquesa 1Kg");
		lblFeijaoCariocaTurquesa.setVerticalAlignment(SwingConstants.TOP);
		lblFeijaoCariocaTurquesa.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeijaoCariocaTurquesa.setBounds(90, 330, 154, 20);
		contentPane.add(lblFeijaoCariocaTurquesa);
		
		JLabel lblR = new JLabel("R$ 5,00");
		lblR.setBounds(128, 345, 46, 14);
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
		lblArrozemocoes.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\arroz.png"));
		lblArrozemocoes.setBounds(102, 393, 88, 116);
		contentPane.add(lblArrozemocoes);
		
		JLabel lblR_1 = new JLabel("R$ 3,50");
		lblR_1.setBounds(128, 525, 46, 14);
		contentPane.add(lblR_1);
		
		JLabel lblArrozEmoeskg = new JLabel("Arroz Emo\u00E7\u00F5es 1Kg");
		lblArrozEmoeskg.setVerticalAlignment(SwingConstants.TOP);
		lblArrozEmoeskg.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrozEmoeskg.setBounds(110, 510, 106, 20);
		contentPane.add(lblArrozEmoeskg);
		
		JLabel lblMacarraovitarela = new JLabel("MacarraoVitarela");
		lblMacarraovitarela.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\macarrao.png"));
		lblMacarraovitarela.setBounds(108, 573, 88, 116);
		contentPane.add(lblMacarraovitarela);
		
		JLabel lblMacarroVitarelapct = new JLabel("Macarr\u00E3o Vitarela 1pct");
		lblMacarroVitarelapct.setVerticalAlignment(SwingConstants.TOP);
		lblMacarroVitarelapct.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacarroVitarelapct.setBounds(95, 684, 121, 20);
		contentPane.add(lblMacarroVitarelapct);
		
		JLabel lblR_2 = new JLabel("R$ 1,20");
		lblR_2.setBounds(128, 698, 46, 14);
		contentPane.add(lblR_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\feijao2.png"));
		lblNewLabel.setBounds(313, 213, 88, 116);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\feijao3.png"));
		label.setBounds(550, 213, 88, 116);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(841, 213, 88, 116);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(841, 398, 88, 116);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\arroz2.png"));
		label_3.setBounds(313, 398, 88, 116);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\arroz3.png"));
		label_4.setBounds(550, 398, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(841, 573, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\macarr\u00E3o2.png"));
		label_13.setBounds(313, 573, 88, 116);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\macarrao3.png"));
		label_14.setBounds(550, 573, 88, 116);
		contentPane.add(label_14);
		
		JLabel lblArrozNamoradokg = new JLabel("Arroz Namorado 1Kg");
		lblArrozNamoradokg.setVerticalAlignment(SwingConstants.TOP);
		lblArrozNamoradokg.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrozNamoradokg.setBounds(312, 513, 124, 20);
		contentPane.add(lblArrozNamoradokg);
		
		JLabel lblR_3 = new JLabel("R$ 2,00");
		lblR_3.setBounds(335, 528, 46, 14);
		contentPane.add(lblR_3);
		
		JLabel lblArrozCamilkg = new JLabel("Arroz Camil 1Kg");
		lblArrozCamilkg.setVerticalAlignment(SwingConstants.TOP);
		lblArrozCamilkg.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrozCamilkg.setBounds(555, 513, 96, 20);
		contentPane.add(lblArrozCamilkg);
		
		JLabel lblR_4 = new JLabel("R$ 2,45");
		lblR_4.setBounds(569, 528, 46, 14);
		contentPane.add(lblR_4);
		
		JLabel lblFeijoPretoMximo = new JLabel("Feij\u00E3o Preto M\u00E1ximo 1Kg");
		lblFeijoPretoMximo.setVerticalAlignment(SwingConstants.TOP);
		lblFeijoPretoMximo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeijoPretoMximo.setBounds(299, 330, 137, 20);
		contentPane.add(lblFeijoPretoMximo);
		
		JLabel lblR_5 = new JLabel("R$ 3,50");
		lblR_5.setBounds(329, 345, 46, 14);
		contentPane.add(lblR_5);
		
		JLabel lblFeijoMacassarKicaldo = new JLabel("Feij\u00E3o Macassar Kicaldo 1Kg");
		lblFeijoMacassarKicaldo.setVerticalAlignment(SwingConstants.TOP);
		lblFeijoMacassarKicaldo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeijoMacassarKicaldo.setBounds(522, 330, 154, 20);
		contentPane.add(lblFeijoMacassarKicaldo);
		
		JLabel lblR_6 = new JLabel("R$ 3,75");
		lblR_6.setBounds(560, 345, 46, 14);
		contentPane.add(lblR_6);
		
		JLabel lblMacarroPilarpct = new JLabel("Macarr\u00E3o Pilar 1pct");
		lblMacarroPilarpct.setVerticalAlignment(SwingConstants.TOP);
		lblMacarroPilarpct.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacarroPilarpct.setBounds(310, 687, 108, 20);
		contentPane.add(lblMacarroPilarpct);
		
		JLabel lblR_7 = new JLabel("R$ 1,83");
		lblR_7.setBounds(330, 700, 46, 14);
		contentPane.add(lblR_7);
		
		JLabel lblMacarroDonaBenta = new JLabel("Macarr\u00E3o Dona Benta 1pct");
		lblMacarroDonaBenta.setVerticalAlignment(SwingConstants.TOP);
		lblMacarroDonaBenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacarroDonaBenta.setBounds(542, 688, 162, 20);
		contentPane.add(lblMacarroDonaBenta);
		
		JLabel lblR_8 = new JLabel("R$ 3,20");
		lblR_8.setBounds(575, 700, 46, 14);
		contentPane.add(lblR_8);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
