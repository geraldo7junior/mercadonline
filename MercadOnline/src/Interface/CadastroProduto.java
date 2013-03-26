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

public class CadastroProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;
	private JTextField txtIdProduto;
	private JTextField txtNomeProduto;
	private JTextField txtMarca;
	private JTextField txtCategoria;
	private JTextField txtPeso;
	private JTextField txtValidade;
	private JTextField txtPreco;

	
	public CadastroProduto() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		lblProdutos.setBounds(313, 25, 74, 20);
		contentPane.add(lblProdutos);
		
		JLabel lblcadastro = new JLabel("cadastro");
		lblcadastro.setForeground(Color.WHITE);
		lblcadastro.setFont(new Font("Folks", Font.BOLD, 16));
		lblcadastro.setBounds(388, 25, 68, 20);
		contentPane.add(lblcadastro);
		
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
		
		JLabel lblHome = new JLabel("home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		lblHome.setBounds(260, 25, 51, 20);
		contentPane.add(lblHome);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBackground(SystemColor.menu);
		btnEntrar.setBounds(931, 39, 67, 18);
		contentPane.add(btnEntrar);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(212, 87, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
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
		
		JLabel label_23 = new JLabel("Padaria");
		label_23.setFont(new Font("Calibri", Font.BOLD, 15));
		label_23.setBounds(43, 87, 53, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("Bebidas");
		lblBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblBebidas.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Bebidas().setVisible(true);
			}
		});
		label_24.setFont(new Font("Calibri", Font.BOLD, 15));
		label_24.setBounds(212, 87, 56, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("Frios e Congelados");
		lblFrios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblFrios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Frios().setVisible(true);
			}
		});
		label_25.setFont(new Font("Calibri", Font.BOLD, 15));
		label_25.setBounds(297, 87, 121, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("Limpeza");
		label_26.setFont(new Font("Calibri", Font.BOLD, 15));
		label_26.setBounds(452, 87, 51, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("Mercearia");
		label_27.setFont(new Font("Calibri", Font.BOLD, 15));
		label_27.setBounds(542, 87, 64, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("Higiene");
		label_28.setFont(new Font("Calibri", Font.BOLD, 15));
		label_28.setBounds(642, 87, 56, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("I");
		label_29.setForeground(new Color(255, 153, 0));
		label_29.setFont(new Font("Folks", Font.BOLD, 15));
		label_29.setBounds(102, 85, 4, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("I");
		label_30.setForeground(new Color(255, 153, 0));
		label_30.setFont(new Font("Folks", Font.BOLD, 15));
		label_30.setBounds(192, 85, 4, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("I");
		label_31.setForeground(new Color(255, 153, 0));
		label_31.setFont(new Font("Folks", Font.BOLD, 15));
		label_31.setBounds(277, 85, 4, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("I");
		label_32.setForeground(new Color(255, 153, 0));
		label_32.setFont(new Font("Folks", Font.BOLD, 15));
		label_32.setBounds(432, 85, 4, 14);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("I");
		label_33.setForeground(new Color(255, 153, 0));
		label_33.setFont(new Font("Folks", Font.BOLD, 15));
		label_33.setBounds(522, 85, 4, 14);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel("I");
		label_34.setForeground(new Color(255, 153, 0));
		label_34.setFont(new Font("Folks", Font.BOLD, 15));
		label_34.setBounds(622, 85, 4, 14);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("I");
		label_35.setForeground(new Color(255, 153, 0));
		label_35.setFont(new Font("Folks", Font.BOLD, 15));
		label_35.setBounds(707, 85, 4, 14);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel("Hortifruti");
		label_36.setFont(new Font("Calibri", Font.BOLD, 15));
		label_36.setBounds(122, 87, 64, 14);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel("Cosm\u00E9ticos");
		label_37.setFont(new Font("Calibri", Font.BOLD, 15));
		label_37.setBounds(727, 87, 74, 14);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("Carrinho");
		label_38.setForeground(new Color(255, 153, 0));
		label_38.setFont(new Font("Calibri", Font.BOLD, 15));
		label_38.setBounds(854, 82, 56, 14);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel("");
		label_39.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		label_39.setBounds(889, 78, 56, 23);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel("Compras");
		label_40.setForeground(new Color(255, 153, 0));
		label_40.setFont(new Font("Calibri", Font.BOLD, 15));
		label_40.setBounds(935, 82, 63, 14);
		contentPane.add(label_40);
		
		JLabel lblCadastroDeProduto = new JLabel("CADASTRO DE PRODUTO");
		lblCadastroDeProduto.setForeground(Color.BLACK);
		lblCadastroDeProduto.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblCadastroDeProduto.setBackground(Color.WHITE);
		lblCadastroDeProduto.setBounds(432, 145, 199, 20);
		contentPane.add(lblCadastroDeProduto);
		
		JLabel lblInformaesDoProduto = new JLabel("Informa\u00E7\u00F5es do Produto:");
		lblInformaesDoProduto.setForeground(new Color(255, 153, 0));
		lblInformaesDoProduto.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblInformaesDoProduto.setBounds(336, 214, 157, 14);
		contentPane.add(lblInformaesDoProduto);
		
		JLabel lblIdproduto = new JLabel("IdProduto*:");
		lblIdproduto.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblIdproduto.setBounds(335, 259, 68, 14);
		contentPane.add(lblIdproduto);
		
		JLabel lblNome = new JLabel("Nome*:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNome.setBounds(335, 303, 51, 14);
		contentPane.add(lblNome);
		
		JLabel lblCategoria = new JLabel("Categoria*:");
		lblCategoria.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCategoria.setBounds(335, 391, 68, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblValidade = new JLabel("Validade*:");
		lblValidade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblValidade.setBounds(335, 479, 68, 14);
		contentPane.add(lblValidade);
		
		JLabel lblMarca = new JLabel("Marca*:");
		lblMarca.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMarca.setBounds(335, 347, 51, 14);
		contentPane.add(lblMarca);
		
		JLabel lblPeso = new JLabel("Peso*:");
		lblPeso.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPeso.setBounds(335, 435, 51, 14);
		contentPane.add(lblPeso);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o*:");
		lblPreo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPreo.setBounds(335, 523, 51, 14);
		contentPane.add(lblPreo);
		
		txtIdProduto = new JTextField();
		txtIdProduto.setBounds(431, 257, 114, 20);
		contentPane.add(txtIdProduto);
		txtIdProduto.setColumns(10);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(431, 301, 219, 20);
		contentPane.add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(431, 345, 219, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(431, 389, 219, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(431, 433, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtValidade = new JTextField();
		txtValidade.setBounds(431, 477, 86, 20);
		contentPane.add(txtValidade);
		txtValidade.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(431, 521, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.setBounds(420, 580, 149, 23);
		contentPane.add(btnCadastrarProduto);
		
		JButton btnAlterarProduto = new JButton("Alterar Produto");
		btnAlterarProduto.setBounds(277, 580, 121, 23);
		contentPane.add(btnAlterarProduto);
		
		JButton btnExcluirProduto = new JButton("Excluir Produto");
		btnExcluirProduto.setBounds(592, 580, 135, 23);
		contentPane.add(btnExcluirProduto);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
		
	}
}
