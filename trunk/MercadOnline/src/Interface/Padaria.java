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

public class Padaria extends JFrame {

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
					Padaria frame = new Padaria();
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
	public Padaria() {
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
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBackground(SystemColor.menu);
		btnEntrar.setBounds(931, 39, 67, 18);
		contentPane.add(btnEntrar);
		
		txtLogin = new JTextField();
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
		txtLogin.setBounds(755, 12, 96, 18);
		contentPane.add(txtLogin);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(902, 11, 96, 18);
		contentPane.add(txtSenhaLogin);
		
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
		label_6.setBounds(102, 85, 4, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("I");
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Folks", Font.BOLD, 15));
		label_7.setBounds(192, 85, 4, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("I");
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Folks", Font.BOLD, 15));
		label_8.setBounds(277, 85, 4, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("I");
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Folks", Font.BOLD, 15));
		label_9.setBounds(432, 85, 4, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("I");
		label_10.setForeground(new Color(255, 153, 0));
		label_10.setFont(new Font("Folks", Font.BOLD, 15));
		label_10.setBounds(522, 85, 4, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("I");
		label_11.setForeground(new Color(255, 153, 0));
		label_11.setFont(new Font("Folks", Font.BOLD, 15));
		label_11.setBounds(622, 85, 4, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("I");
		label_12.setForeground(new Color(255, 153, 0));
		label_12.setFont(new Font("Folks", Font.BOLD, 15));
		label_12.setBounds(707, 85, 4, 14);
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
		
		JLabel lblPadaria_1 = new JLabel("PADARIA");
		lblPadaria_1.setForeground(Color.BLACK);
		lblPadaria_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblPadaria_1.setBackground(Color.WHITE);
		lblPadaria_1.setBounds(482, 140, 64, 20);
		contentPane.add(lblPadaria_1);
		
		JLabel lblPes = new JLabel("P\u00E3es");
		lblPes.setForeground(new Color(255, 153, 0));
		lblPes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPes.setBounds(47, 176, 27, 14);
		contentPane.add(lblPes);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_1.setBounds(47, 188, 913, 14);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label.setBounds(47, 373, 913, 14);
		contentPane.add(label);
		
		JLabel lblBolos = new JLabel("Bolos");
		lblBolos.setForeground(new Color(255, 153, 0));
		lblBolos.setFont(new Font("Calibri", Font.BOLD, 14));
		lblBolos.setBounds(47, 361, 46, 14);
		contentPane.add(lblBolos);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_2.setBounds(47, 548, 913, 14);
		contentPane.add(label_2);
		
		JLabel lblNoSei = new JLabel("Salgados");
		lblNoSei.setForeground(new Color(255, 153, 0));
		lblNoSei.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNoSei.setBounds(47, 536, 67, 14);
		contentPane.add(lblNoSei);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pao frances.png"));
		lblNewLabel.setBounds(108, 209, 88, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\p\u00E3o criolo.png"));
		lblNewLabel_1.setBounds(313, 213, 88, 116);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\bolacha.png"));
		lblNewLabel_2.setBounds(550, 213, 88, 116);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pao de caixa.png"));
		lblNewLabel_3.setBounds(841, 213, 88, 116);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\floresta negra.png"));
		lblNewLabel_4.setBounds(102, 393, 88, 116);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Torta de morango.png"));
		lblNewLabel_5.setBounds(313, 398, 88, 116);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Modelo de tamanho de produtos.png"));
		lblNewLabel_6.setBounds(550, 398, 88, 116);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\formigueiro.png"));
		lblNewLabel_7.setBounds(841, 398, 88, 116);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pastel.png"));
		lblNewLabel_8.setBounds(108, 573, 88, 116);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\bolinho.png"));
		lblNewLabel_9.setBounds(313, 573, 88, 116);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\coxinha.png"));
		lblNewLabel_10.setBounds(550, 573, 88, 116);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Empada.png"));
		lblNewLabel_11.setBounds(841, 573, 88, 116);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblPaoFrancesKg = new JLabel("P\u00E3o Franc\u00EAs Kg");
		lblPaoFrancesKg.setBounds(115, 330, 74, 14);
		contentPane.add(lblPaoFrancesKg);
		
		JLabel lblR = new JLabel("R$ 9,50");
		lblR.setBounds(130, 345, 42, 14);
		contentPane.add(lblR);
		
		JLabel lblPaoDeForma = new JLabel("P\u00E3o de Forma Pct");
		lblPaoDeForma.setBounds(841, 330, 88, 14);
		contentPane.add(lblPaoDeForma);
		
		JLabel lblPaesDiversosUnd = new JLabel("P\u00E3es Diversos Und");
		lblPaesDiversosUnd.setBounds(313, 330, 95, 14);
		contentPane.add(lblPaesDiversosUnd);
		
		JLabel lblR_1 = new JLabel("R$ 4,60");
		lblR_1.setBounds(861, 345, 42, 14);
		contentPane.add(lblR_1);
		
		JLabel lblR_2 = new JLabel("R$ 1,00");
		lblR_2.setBounds(337, 345, 42, 14);
		contentPane.add(lblR_2);
		
		JLabel lblPaoParaHD = new JLabel("P\u00E3o para Hot Dog Pct");
		lblPaoParaHD.setBounds(550, 330, 103, 14);
		contentPane.add(lblPaoParaHD);
		
		JLabel lblR_3 = new JLabel("R$ 5,20");
		lblR_3.setBounds(578, 345, 42, 14);
		contentPane.add(lblR_3);
		
		JLabel lblTortaDeMorango = new JLabel("Torta de Morango Kg");
		lblTortaDeMorango.setBounds(313, 513, 105, 14);
		contentPane.add(lblTortaDeMorango);
		
		JLabel lblR_4 = new JLabel("R$ 28,00");
		lblR_4.setBounds(339, 527, 50, 14);
		contentPane.add(lblR_4);
		
		JLabel lblR_5 = new JLabel("R$ 42,00");
		lblR_5.setBounds(127, 527, 50, 14);
		contentPane.add(lblR_5);
		
		JLabel lblTortaFlorestaNegra = new JLabel("Torta Floresta Negra Kg");
		lblTortaFlorestaNegra.setBounds(89, 513, 121, 14);
		contentPane.add(lblTortaFlorestaNegra);
		
		JLabel lblR_6 = new JLabel("R$ 2,70");
		lblR_6.setBounds(570, 527, 42, 14);
		contentPane.add(lblR_6);
		
		JLabel lblTortinhaUnd = new JLabel("Tortinha Und");
		lblTortinhaUnd.setBounds(560, 513, 71, 14);
		contentPane.add(lblTortinhaUnd);
		
		JLabel lblR_7 = new JLabel("R$ 11,00");
		lblR_7.setBounds(861, 527, 49, 14);
		contentPane.add(lblR_7);
		
		JLabel lblBoloTradicionalKg = new JLabel("Bolo Tradicional Kg");
		lblBoloTradicionalKg.setBounds(841, 514, 96, 14);
		contentPane.add(lblBoloTradicionalKg);
		
		JLabel lblR_8 = new JLabel("R$ 2,50");
		lblR_8.setBounds(129, 700, 42, 14);
		contentPane.add(lblR_8);
		
		JLabel lblPastelUnd = new JLabel("Pastel Und");
		lblPastelUnd.setBounds(124, 688, 53, 14);
		contentPane.add(lblPastelUnd);
		
		JLabel lblR_9 = new JLabel("R$ 0,70");
		lblR_9.setBounds(337, 700, 42, 14);
		contentPane.add(lblR_9);
		
		JLabel lblBolinhoBacalhau = new JLabel("Bolinho de Bacalhau Und");
		lblBolinhoBacalhau.setBounds(298, 688, 121, 14);
		contentPane.add(lblBolinhoBacalhau);
		
		JLabel lblR_10 = new JLabel("R$ 3,00");
		lblR_10.setBounds(578, 700, 42, 14);
		contentPane.add(lblR_10);
		
		JLabel lblCoxinhaUnd = new JLabel("Coxinha Und");
		lblCoxinhaUnd.setBounds(563, 688, 64, 14);
		contentPane.add(lblCoxinhaUnd);
		
		JLabel lblR_11 = new JLabel("R$ 2,40");
		lblR_11.setBounds(866, 700, 42, 14);
		contentPane.add(lblR_11);
		
		JLabel lblEmpadinhaUnd = new JLabel("Empadinha Und");
		lblEmpadinhaUnd.setBounds(846, 688, 81, 14);
		contentPane.add(lblEmpadinhaUnd);
		
		JLabel lblBackGround = new JLabel("R$ 28,00");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
