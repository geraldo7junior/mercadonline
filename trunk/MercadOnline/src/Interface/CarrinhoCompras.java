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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
//<<<<<<< .mine
//=======
import javax.swing.table.DefaultTableModel;
//>>>>>>> .r194

public class CarrinhoCompras extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrinhoCompras frame = new CarrinhoCompras();
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
	public CarrinhoCompras() {
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
		
		JLabel lblPeodutos = new JLabel("produtos");
		lblPeodutos.setForeground(Color.WHITE);
		lblPeodutos.setFont(new Font("Folks", Font.BOLD, 16));
		lblPeodutos.setBounds(313, 25, 74, 20);
		contentPane.add(lblPeodutos);
		
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
		lblPadaria.setBounds(43, 87, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(212, 87, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(297, 87, 121, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(452, 87, 51, 14);
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMercearia.setBounds(542, 87, 64, 14);
		contentPane.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
		lblHigiene.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHigiene.setBounds(642, 87, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_14 = new JLabel("I");
		label_14.setForeground(new Color(255, 153, 0));
		label_14.setFont(new Font("Folks", Font.BOLD, 15));
		label_14.setBounds(102, 85, 4, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("I");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Folks", Font.BOLD, 15));
		label_15.setBounds(192, 85, 4, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("I");
		label_16.setForeground(new Color(255, 153, 0));
		label_16.setFont(new Font("Folks", Font.BOLD, 15));
		label_16.setBounds(277, 85, 4, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("I");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Folks", Font.BOLD, 15));
		label_17.setBounds(432, 85, 4, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("I");
		label_18.setForeground(new Color(255, 153, 0));
		label_18.setFont(new Font("Folks", Font.BOLD, 15));
		label_18.setBounds(522, 85, 4, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("I");
		label_19.setForeground(new Color(255, 153, 0));
		label_19.setFont(new Font("Folks", Font.BOLD, 15));
		label_19.setBounds(622, 85, 4, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("I");
		label_20.setForeground(new Color(255, 153, 0));
		label_20.setFont(new Font("Folks", Font.BOLD, 15));
		label_20.setBounds(707, 85, 4, 14);
		contentPane.add(label_20);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(122, 87, 64, 14);
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCosmeticos.setBounds(727, 87, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel label_23 = new JLabel("Carrinho");
		label_23.setForeground(new Color(255, 153, 0));
		label_23.setFont(new Font("Calibri", Font.BOLD, 15));
		label_23.setBounds(854, 82, 56, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		label_24.setBounds(889, 78, 56, 23);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("Compras");
		label_25.setForeground(new Color(255, 153, 0));
		label_25.setFont(new Font("Calibri", Font.BOLD, 15));
		label_25.setBounds(935, 82, 63, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("Padaria");
		label_26.setFont(new Font("Calibri", Font.BOLD, 15));
		label_26.setBounds(43, 87, 53, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("Bebidas");
		label_27.setFont(new Font("Calibri", Font.BOLD, 15));
		label_27.setBounds(212, 87, 56, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("Frios e Congelados");
		label_28.setFont(new Font("Calibri", Font.BOLD, 15));
		label_28.setBounds(297, 87, 121, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("Limpeza");
		label_29.setFont(new Font("Calibri", Font.BOLD, 15));
		label_29.setBounds(452, 87, 51, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("Mercearia");
		label_30.setFont(new Font("Calibri", Font.BOLD, 15));
		label_30.setBounds(542, 87, 64, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("Higiene");
		label_31.setFont(new Font("Calibri", Font.BOLD, 15));
		label_31.setBounds(642, 87, 56, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("I");
		label_32.setForeground(new Color(255, 153, 0));
		label_32.setFont(new Font("Folks", Font.BOLD, 15));
		label_32.setBounds(102, 85, 4, 14);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("I");
		label_33.setForeground(new Color(255, 153, 0));
		label_33.setFont(new Font("Folks", Font.BOLD, 15));
		label_33.setBounds(192, 85, 4, 14);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel("I");
		label_34.setForeground(new Color(255, 153, 0));
		label_34.setFont(new Font("Folks", Font.BOLD, 15));
		label_34.setBounds(277, 85, 4, 14);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("I");
		label_35.setForeground(new Color(255, 153, 0));
		label_35.setFont(new Font("Folks", Font.BOLD, 15));
		label_35.setBounds(432, 85, 4, 14);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel("I");
		label_36.setForeground(new Color(255, 153, 0));
		label_36.setFont(new Font("Folks", Font.BOLD, 15));
		label_36.setBounds(522, 85, 4, 14);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel("I");
		label_37.setForeground(new Color(255, 153, 0));
		label_37.setFont(new Font("Folks", Font.BOLD, 15));
		label_37.setBounds(622, 85, 4, 14);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("I");
		label_38.setForeground(new Color(255, 153, 0));
		label_38.setFont(new Font("Folks", Font.BOLD, 15));
		label_38.setBounds(707, 85, 4, 14);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel("Hortifruti");
		label_39.setFont(new Font("Calibri", Font.BOLD, 15));
		label_39.setBounds(122, 87, 64, 14);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel("Cosm\u00E9ticos");
		label_40.setFont(new Font("Calibri", Font.BOLD, 15));
		label_40.setBounds(727, 87, 74, 14);
		contentPane.add(label_40);
		
		JLabel label_41 = new JLabel("Carrinho");
		label_41.setForeground(new Color(255, 153, 0));
		label_41.setFont(new Font("Calibri", Font.BOLD, 15));
		label_41.setBounds(854, 82, 56, 14);
		contentPane.add(label_41);
		
		JLabel label_43 = new JLabel("Compras");
		label_43.setForeground(new Color(255, 153, 0));
		label_43.setFont(new Font("Calibri", Font.BOLD, 15));
		label_43.setBounds(935, 82, 63, 14);
		contentPane.add(label_43);
		
		JLabel lblCarrinhoDeCompras = new JLabel("Carrinho de Compras");
		lblCarrinhoDeCompras.setForeground(Color.BLACK);
		lblCarrinhoDeCompras.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblCarrinhoDeCompras.setBackground(Color.WHITE);
		lblCarrinhoDeCompras.setBounds(432, 144, 190, 20);
		contentPane.add(lblCarrinhoDeCompras);
		
		JScrollPane scrollPaneCarrinhoCompras = new JScrollPane();
		scrollPaneCarrinhoCompras.setBounds(277, 222, 475, 255);
		contentPane.add(scrollPaneCarrinhoCompras);
		
		table = new JTable();
		scrollPaneCarrinhoCompras.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produto:", "Pre\u00E7o:"
			}
		));
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
		
		//links dos menus
				new Utilitarios.Frame().Abrir(new Padaria(), lblPadaria);
				new Utilitarios.Frame().Abrir(new Hortifruti(), lblHortifruti);
				new Utilitarios.Frame().Abrir(new Bebidas(), lblBebidas);
				//new Utilitarios.Frame().Abrir(new FriosECongelados(), lblFrios);
				//new Utilitarios.Frame().Abrir(new Limpeza(), lblLimpeza);
				new Utilitarios.Frame().Abrir(new Mercearia(), lblMercearia);
				//new Utilitarios.Frame().Abrir(new Higiene(), lblHigiene);
				//new Utilitarios.Frame().Abrir(new Cosmeticos(), lblCosmeticos);
	}
}
