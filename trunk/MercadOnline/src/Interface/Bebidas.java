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
import javax.swing.border.EmptyBorder;

public class Bebidas extends JFrame {

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
					Bebidas frame = new Bebidas();
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
	public Bebidas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setBounds(260, 25, 51, 20);
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		contentPane.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setBounds(313, 25, 74, 20);
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		contentPane.add(lblProdutos);
		
		JLabel lblCadastro = new JLabel("cadastro");
		lblCadastro.setBounds(388, 25, 68, 20);
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Folks", Font.BOLD, 16));
		contentPane.add(lblCadastro);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setBounds(465, 25, 81, 20);
		lblPromocao.setForeground(Color.WHITE);
		lblPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		contentPane.add(lblPromocao);
		
		JLabel lblSugeridos = new JLabel("sugeridos");
		lblSugeridos.setBounds(550, 25, 81, 20);
		lblSugeridos.setForeground(Color.WHITE);
		lblSugeridos.setFont(new Font("Folks", Font.BOLD, 16));
		contentPane.add(lblSugeridos);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setBounds(634, 25, 70, 20);
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Folks", Font.BOLD, 16));
		contentPane.add(lblContato);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(714, 15, 34, 14);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblLogin);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setBounds(861, 14, 42, 14);
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblSenhaLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(755, 12, 96, 18);
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
		contentPane.add(txtLogin);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(902, 11, 96, 18);
		contentPane.add(txtSenhaLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(931, 39, 67, 18);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBackground(SystemColor.menu);
		contentPane.add(btnEntrar);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setBounds(43, 85, 53, 14);
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setBounds(212, 85, 56, 14);
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setBounds(297, 85, 121, 14);
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setBounds(452, 85, 51, 14);
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setBounds(542, 85, 64, 14);
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
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
		lblHortifruti.setBounds(122, 85, 64, 14);
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setBounds(727, 85, 74, 14);
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(lblCosmeticos);
		
		JLabel label_15 = new JLabel("Carrinho");
		label_15.setBounds(854, 80, 56, 14);
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setBounds(890, 76, 56, 23);
		label_16.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("Compras");
		label_17.setBounds(935, 80, 63, 14);
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Calibri", Font.BOLD, 15));
		contentPane.add(label_17);
		
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\skol.png"));
		lblNewLabel.setBounds(108, 209, 88, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\Heineken.png"));
		lblNewLabel_1.setBounds(313, 213, 88, 116);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\chalise.png"));
		lblNewLabel_2.setBounds(550, 213, 88, 116);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\blue.png"));
		lblNewLabel_3.setBounds(841, 213, 88, 116);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\ades.png"));
		lblNewLabel_4.setBounds(102, 393, 88, 116);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\delvalle.png"));
		lblNewLabel_5.setBounds(313, 398, 88, 116);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\pessego.png"));
		lblNewLabel_6.setBounds(550, 398, 88, 116);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\tampico.png"));
		lblNewLabel_7.setBounds(841, 398, 88, 116);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\coca.png"));
		lblNewLabel_8.setBounds(108, 573, 88, 116);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\guarana.png"));
		lblNewLabel_9.setBounds(313, 573, 88, 116);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\sprite.png"));
		lblNewLabel_10.setBounds(550, 573, 88, 116);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\coca 3.png"));
		lblNewLabel_11.setBounds(841, 573, 88, 116);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setBounds(10, 0, 1024, 768);
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(lblBackGround);
	}
}
