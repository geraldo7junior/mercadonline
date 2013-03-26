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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

import Utilitarios.Menu;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Comprar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;
	private JTable table;
	private JTextField txtRua;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	private JTextField txtUf;
	private JTextField txtBairro;
	private JTextField txtN;
	private JTextField txtcep;
	private JTextField txtFrete;
	private JTextField txtTotal;
	private JTextField txtProtocolo;

	public Comprar() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		new Menu(contentPane); //Chama o menu principal
		
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
		
		JLabel lblCarrinhoCompras = new JLabel("");
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(838, 75, 152, 30);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblFinalizarCompras = new JLabel("FINALIZAR COMPRAS");
		lblFinalizarCompras.setForeground(Color.BLACK);
		lblFinalizarCompras.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblFinalizarCompras.setBackground(Color.WHITE);
		lblFinalizarCompras.setBounds(482, 144, 150, 20);
		contentPane.add(lblFinalizarCompras);
		
		JScrollPane scrollPaneCarrinhoCompras = new JScrollPane();
		scrollPaneCarrinhoCompras.setBounds(260, 224, 475, 173);
		contentPane.add(scrollPaneCarrinhoCompras);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produto:", "Pre\u00E7o"
			}
		));
		scrollPaneCarrinhoCompras.setViewportView(table);
		
		JLabel lblCarrinhoDeCompras = new JLabel("Carrinho de Compras:");
		lblCarrinhoDeCompras.setForeground(new Color(255, 153, 0));
		lblCarrinhoDeCompras.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCarrinhoDeCompras.setBounds(260, 199, 146, 14);
		contentPane.add(lblCarrinhoDeCompras);
		
		JLabel lblEndereoDeEntrega = new JLabel("Endere\u00E7o para entrega:");
		lblEndereoDeEntrega.setForeground(new Color(255, 153, 0));
		lblEndereoDeEntrega.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEndereoDeEntrega.setBounds(260, 408, 166, 14);
		contentPane.add(lblEndereoDeEntrega);
		
		JLabel lblCidade = new JLabel("Cidade*:");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCidade.setBounds(260, 511, 64, 14);
		contentPane.add(lblCidade);
		
		JLabel lblUf = new JLabel("UF*:");
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblUf.setBounds(549, 511, 34, 14);
		contentPane.add(lblUf);
		
		JLabel lblRua = new JLabel("Rua*:");
		lblRua.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRua.setBounds(260, 435, 41, 14);
		contentPane.add(lblRua);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblComplemento.setBounds(260, 473, 103, 14);
		contentPane.add(lblComplemento);
		
		JLabel lblBairro = new JLabel("Bairro*:");
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBairro.setBounds(421, 473, 51, 14);
		contentPane.add(lblBairro);
		
		txtRua = new JTextField((Document) null, (String) null, 0);
		txtRua.setName("txtLogradouro");
		txtRua.setColumns(10);
		txtRua.setBounds(302, 433, 321, 20);
		contentPane.add(txtRua);
		
		txtComplemento = new JTextField();
		txtComplemento.setText("");
		txtComplemento.setName("txtComplemento");
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(351, 471, 34, 20);
		contentPane.add(txtComplemento);
		
		txtCidade = new JTextField((Document) null, (String) null, 0);
		txtCidade.setText("");
		txtCidade.setName("txtCidade");
		txtCidade.setColumns(10);
		txtCidade.setBounds(313, 509, 202, 20);
		contentPane.add(txtCidade);
		
		txtUf = new JTextField((Document) null, (String) null, 0);
		txtUf.setText("");
		txtUf.setName("txtUf");
		txtUf.setColumns(10);
		txtUf.setBounds(579, 509, 34, 20);
		contentPane.add(txtUf);
		
		txtBairro = new JTextField((Document) null, (String) null, 0);
		txtBairro.setName("txtBairro");
		txtBairro.setColumns(10);
		txtBairro.setBounds(482, 471, 266, 20);
		contentPane.add(txtBairro);
		
		JLabel lblN = new JLabel("N\u00BA*:");
		lblN.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblN.setBounds(655, 435, 23, 14);
		contentPane.add(lblN);
		
		txtN = new JTextField((Document) null, (String) null, 0);
		txtN.setText("");
		txtN.setName("txtNumero");
		txtN.setColumns(10);
		txtN.setBounds(684, 433, 64, 20);
		contentPane.add(txtN);
		
		JLabel lblCep = new JLabel("CEP*:");
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCep.setBounds(638, 511, 46, 14);
		contentPane.add(lblCep);
		
		txtcep = new JTextField();
		txtcep.setBounds(678, 509, 70, 20);
		contentPane.add(txtcep);
		txtcep.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor total + Frete");
		lblValorTotal.setForeground(new Color(255, 153, 0));
		lblValorTotal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblValorTotal.setBounds(260, 553, 166, 14);
		contentPane.add(lblValorTotal);
		
		JLabel lblFrete = new JLabel("Frete:");
		lblFrete.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFrete.setBounds(260, 578, 64, 14);
		contentPane.add(lblFrete);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setForeground(Color.RED);
		lblTotal.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTotal.setBounds(260, 619, 51, 14);
		contentPane.add(lblTotal);
		
		txtFrete = new JTextField();
		txtFrete.setBounds(320, 576, 86, 20);
		contentPane.add(txtFrete);
		txtFrete.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(320, 617, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.setBounds(482, 653, 150, 23);
		contentPane.add(btnFinalizarCompra);
		
		JButton btnCancelarPedido = new JButton("Cancelar Pedido");
		btnCancelarPedido.setBounds(308, 653, 110, 23);
		contentPane.add(btnCancelarPedido);
		
		JLabel lblProtocoloDoPedido = new JLabel("Protocolo do pedido:");
		lblProtocoloDoPedido.setForeground(Color.RED);
		lblProtocoloDoPedido.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblProtocoloDoPedido.setBounds(482, 620, 124, 14);
		contentPane.add(lblProtocoloDoPedido);
		
		txtProtocolo = new JTextField();
		txtProtocolo.setBounds(618, 617, 86, 20);
		contentPane.add(txtProtocolo);
		txtProtocolo.setColumns(10);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
		
		
	}

}
