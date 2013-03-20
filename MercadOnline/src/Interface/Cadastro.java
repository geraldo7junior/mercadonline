package Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Main.Cliente;
import Utilitarios.ApenasNum;
import Utilitarios.ApenasStr;
import Utilitarios.Mascara;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class Cadastro extends JFrame {
	
	
	
	
	private static final long serialVersionUID = 1L;
	private JPanel panelCadastro;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtIdentidade;
	private JPasswordField txtSenha;
	private JTextField txtFone;
	private JTextField txtSexo;
	private JTextField txtDataDeNascimento;
	private JTextField txtLogradouro;
	private JTextField txtComplemento;
	private JTextField txtNumero;
	private JTextField txtCidade;
	private JTextField txtUf;
	private JTextField txtBairro;
	private JTextField txtTelefoneCelular;
	private JTextField txtCep;
	private JTextField txtLogin;
	private JTextField txtSenhaLogin;
	private JPasswordField txtConfirmarSenha;
	

	public JTextField getTxtNome() {
		return txtNome;
	}

	
	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtCpf() {
		return txtCpf;
	}

	public void setTxtCpf(JTextField txtCpf) {
		this.txtCpf = txtCpf;
	}

	public JTextField getTxtIdentidade() {
		return txtIdentidade;
	}

	public void setTxtIdentidade(JTextField txtIdentidade) {
		this.txtIdentidade = txtIdentidade;
	}

	public String getTxtSenha() {
		String senha = new String(txtSenha.getPassword());
		return senha;
	}

	public void setTxtSenha(JPasswordField txtSenha) {
		this.txtSenha = txtSenha;
	}
	

	public String getTxtConfirmarSenha() {
		String confirmarSenha = new String(txtConfirmarSenha.getPassword());
		return confirmarSenha;
	}

	public void setTxtConfirmarSenha(JPasswordField txtConfirmarSenha) {
		this.txtConfirmarSenha = txtConfirmarSenha;
	}

	public JTextField getTxtFone() {
		return txtFone;
	}

	public void setTxtFone(JTextField txtFone) {
		this.txtFone = txtFone;
	}

	public JTextField getTxtSexo() {
		return txtSexo;
	}

	public void setTxtSexo(JTextField txtSexo) {
		this.txtSexo = txtSexo;
	}

	public JTextField getTxtDataDeNascimento() {
		return txtDataDeNascimento;
	}

	public void setTxtDataDeNascimento(JTextField txtDataDeNascimento) {
		this.txtDataDeNascimento = txtDataDeNascimento;
	}

	public JTextField getTxtLogradouro() {
		return txtLogradouro;
	}

	public void setTxtLogradouro(JTextField txtLogradouro) {
		this.txtLogradouro = txtLogradouro;
	}

	public JTextField getTxtComplemento() {
		return txtComplemento;
	}

	public void setTxtComplemento(JTextField txtComplemento) {
		this.txtComplemento = txtComplemento;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtCidade() {
		return txtCidade;
	}

	public void setTxtCidade(JTextField txtCidade) {
		this.txtCidade = txtCidade;
	}

	public JTextField getTxtUf() {
		return txtUf;
	}

	public void setTxtUf(JTextField txtUf) {
		this.txtUf = txtUf;
	}
	
	public JTextField getTxtBairro() {
		return txtBairro;
	}

	public void setTxtBairro(JTextField txtBairro) {
		this.txtBairro = txtBairro;
	}


	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		panelCadastro = new JPanel();
		panelCadastro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelCadastro);
		
		JLabel lblNome = new JLabel("Nome*:");
		lblNome.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNome.setBounds(151, 180, 56, 14);
		
		JLabel lblEmail = new JLabel("E-mail*:");
		lblEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEmail.setBounds(151, 429, 56, 14);
		
		txtNome = new JTextField(new ApenasStr(50), null, 0);
		txtNome.setBounds(209, 174, 353, 20);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(218, 427, 251, 20);
		txtEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF*:");
		lblCpf.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCpf.setBounds(325, 201, 41, 14);
		
		txtCpf = new JFormattedTextField(Mascara.ExecutaMascara("###.###.###-##"));
		txtCpf.setBounds(366, 199, 93, 20);
		txtCpf.setColumns(10);
		
		JLabel lblIdentidade = new JLabel("Identidade*:");
		lblIdentidade.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblIdentidade.setBounds(151, 205, 81, 14);
		
		txtIdentidade = new JTextField(new ApenasNum(10), null, 0);
		txtIdentidade.setBounds(241, 199, 74, 20);
		txtIdentidade.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(216, 452, 125, 20);
		
		JLabel lblSenha = new JLabel("Senha*:");
		lblSenha.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblSenha.setBounds(151, 454, 56, 14);
		
		JButton btnCadastrar = new JButton("Confirmar Cadastro");
		btnCadastrar.setBounds(301, 502, 153, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ConfirmaSenha(getTxtSenha(), getTxtConfirmarSenha())){
					if (new Cliente().cadastrarUsuario(txtNome.getText(),txtEmail.getText(),getTxtSenha(),txtCpf.getText(),
						txtDataDeNascimento.getText(),txtSexo.getText(),txtFone.getText(),txtTelefoneCelular.getText(),txtIdentidade.getText(),
						txtLogradouro.getText(),txtComplemento.getText(),txtBairro.getText(),txtCidade.getText(),txtUf.getText(),txtCep.getText()));{
					LimparCampos();}}
			}

		});
		
		JLabel lblFone = new JLabel("Telefone Fixo*:");
		lblFone.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblFone.setBounds(151, 255, 103, 14);
		
		JLabel lblSexo = new JLabel("Sexo*:");
		lblSexo.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblSexo.setBounds(401, 230, 53, 14);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento*:");
		lblDataDeNascimento.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDataDeNascimento.setBounds(151, 230, 147, 14);
		
		JLabel lblLogradouro = new JLabel("Rua*:");
		lblLogradouro.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblLogradouro.setBounds(151, 309, 41, 14);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblComplemento.setBounds(151, 334, 103, 14);
		
		JLabel lblNumero = new JLabel("N\u00BA*:");
		lblNumero.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNumero.setBounds(440, 309, 41, 14);
		
		JLabel lblCidade = new JLabel("Cidade*:");
		lblCidade.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCidade.setBounds(151, 359, 64, 14);
		
		JLabel lblUf = new JLabel("UF*:");
		lblUf.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblUf.setBounds(151, 384, 34, 14);
		
		txtFone = new JFormattedTextField(Mascara.ExecutaMascara("(##)####-####"));
		txtFone.setBounds(259, 253, 100, 20);
		txtFone.setColumns(10);
		
		txtSexo = new JTextField(new ApenasStr(1), null, 0);
		txtSexo.setBounds(458, 224, 23, 20);
		txtSexo.setColumns(10);
		
		txtDataDeNascimento = new JFormattedTextField(Mascara.ExecutaMascara("##/##/####"));
		txtDataDeNascimento.setBounds(301, 224, 74, 20);
		txtDataDeNascimento.setColumns(10);
		
		txtLogradouro = new JTextField(new ApenasStr(50), null, 0);
		txtLogradouro.setBounds(193, 307, 237, 20);
		txtLogradouro.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(256, 332, 34, 20);
		txtComplemento.setText("");
		txtComplemento.setColumns(10);
		
		txtNumero = new JTextField(new ApenasNum(6), null, 0);
		txtNumero.setBounds(468, 307, 64, 20);
		txtNumero.setText("");
		txtNumero.setColumns(10);
		
		txtCidade = new JTextField(new ApenasStr(50), null, 0);
		txtCidade.setBounds(217, 357, 252, 20);
		txtCidade.setText("");
		txtCidade.setColumns(10);
		
		txtUf = new JTextField(new ApenasStr(2), null, 0);
		txtUf.setBounds(186, 382, 34, 20);
		txtUf.setText("");
		txtUf.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro*:");
		lblBairro.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblBairro.setBounds(296, 334, 51, 14);
		
		txtBairro = new JTextField(new ApenasStr(50), null, 0);
		txtBairro.setBounds(359, 332, 224, 20);
		txtBairro.setColumns(10);
		
		panelCadastro.setLayout(null);
		panelCadastro.add(btnCadastrar);
		panelCadastro.add(lblFone);
		panelCadastro.add(lblEmail);
		panelCadastro.add(lblNome);
		panelCadastro.add(lblCpf);
		panelCadastro.add(lblIdentidade);
		panelCadastro.add(lblSenha);
		panelCadastro.add(lblSexo);
		panelCadastro.add(lblCidade);
		panelCadastro.add(lblDataDeNascimento);
		panelCadastro.add(lblUf);
		panelCadastro.add(lblLogradouro);
		panelCadastro.add(lblComplemento);
		panelCadastro.add(lblNumero);
		panelCadastro.add(lblBairro);
		panelCadastro.add(txtBairro);
		panelCadastro.add(txtNome);
		panelCadastro.add(txtEmail);
		panelCadastro.add(txtSenha);
		panelCadastro.add(txtIdentidade);
		panelCadastro.add(txtCpf);
		panelCadastro.add(txtDataDeNascimento);
		panelCadastro.add(txtLogradouro);
		panelCadastro.add(txtSexo);
		panelCadastro.add(txtFone);
		panelCadastro.add(txtComplemento);
		panelCadastro.add(txtNumero);
		panelCadastro.add(txtCidade);
		panelCadastro.add(txtUf);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setForeground(new Color(255, 153, 0));
		lblCadastro.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		lblCadastro.setBackground(Color.WHITE);
		lblCadastro.setBounds(359, 112, 71, 20);
		panelCadastro.add(lblCadastro);
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular:");
		lblTelefoneCelular.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblTelefoneCelular.setBounds(366, 255, 125, 14);
		panelCadastro.add(lblTelefoneCelular);
		
		txtTelefoneCelular = new JFormattedTextField(Mascara.ExecutaMascara("(##)####-####"));;
		txtTelefoneCelular.setBounds(497, 253, 93, 20);
		panelCadastro.add(txtTelefoneCelular);
		txtTelefoneCelular.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setForeground(new Color(255, 153, 0));
		lblEndereco.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEndereco.setBounds(151, 284, 81, 14);
		panelCadastro.add(lblEndereco);
		
		JLabel lblCep = new JLabel("CEP*:");
		lblCep.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCep.setBounds(480, 359, 46, 14);
		panelCadastro.add(lblCep);
		
		txtCep = new JFormattedTextField(Mascara.ExecutaMascara("##.###-###"));;
		txtCep.setBounds(524, 357, 74, 20);
		panelCadastro.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha*:");
		lblConfirmarSenha.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblConfirmarSenha.setBounds(359, 454, 125, 14);
		panelCadastro.add(lblConfirmarSenha);
		
		JLabel lblFotoImg = new JLabel("");
		lblFotoImg.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\foto.png"));
		lblFotoImg.setBounds(27, 174, 117, 115);
		panelCadastro.add(lblFotoImg);
		
		JLabel lblNewLabel = new JLabel("Foto*");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNewLabel.setBounds(66, 298, 41, 14);
		panelCadastro.add(lblNewLabel);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBorder(null);
		panelLogin.setBackground(new Color(255, 204, 153));
		panelLogin.setBounds(571, 110, 196, 109);
		panelCadastro.add(panelLogin);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtSenhaLogin = new JTextField();
		txtSenhaLogin.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(new Cliente().entrarSistema(txtLogin.getText(), txtSenhaLogin.getText())){
					LimparCampos();
			}
		}});
		
		JLabel lblLogado = new JLabel("New label");
		GroupLayout gl_panelLogin = new GroupLayout(panelLogin);
		gl_panelLogin.setHorizontalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addComponent(lblSenhaLogin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSenhaLogin, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
						.addComponent(btnEntrar, Alignment.TRAILING)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addGroup(gl_panelLogin.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblLogado)
								.addComponent(lblLogin))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtLogin, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panelLogin.setVerticalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addComponent(lblLogado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenhaLogin)
						.addComponent(txtSenhaLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnEntrar)
					.addContainerGap())
		);
		panelLogin.setLayout(gl_panelLogin);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		lblHome.setBounds(236, 11, 53, 20);
		panelCadastro.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		lblProdutos.setBounds(291, 11, 74, 20);
		panelCadastro.add(lblProdutos);
		
		JLabel lblCadastromenu = new JLabel("cadastro");
		lblCadastromenu.setForeground(Color.WHITE);
		lblCadastromenu.setFont(new Font("Folks", Font.BOLD, 16));
		lblCadastromenu.setBounds(371, 11, 74, 20);
		panelCadastro.add(lblCadastromenu);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setForeground(Color.WHITE);
		lblPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		lblPromocao.setBounds(455, 11, 86, 20);
		panelCadastro.add(lblPromocao);
		
		JLabel lblSugeridos = new JLabel("sugeridos");
		lblSugeridos.setForeground(Color.WHITE);
		lblSugeridos.setFont(new Font("Folks", Font.BOLD, 16));
		lblSugeridos.setBounds(551, 11, 81, 20);
		panelCadastro.add(lblSugeridos);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Folks", Font.BOLD, 16));
		lblContato.setBounds(642, 11, 64, 20);
		panelCadastro.add(lblContato);
		
		JLabel lblPaes = new JLabel("P\u00E3es e Bolos");
		lblPaes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPaes.setBounds(10, 66, 74, 14);
		panelCadastro.add(lblPaes);
		
		JLabel lblFrutas = new JLabel("Frutas");
		lblFrutas.setFont(new Font("Calibri", Font.BOLD, 14));
		lblFrutas.setBounds(97, 66, 41, 14);
		panelCadastro.add(lblFrutas);
		
		JLabel lblLegumes = new JLabel("Legumes e Verduras");
		lblLegumes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblLegumes.setBounds(151, 66, 123, 14);
		panelCadastro.add(lblLegumes);
		
		JLabel lblBebidas = new JLabel("Bebidas e Sucos");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 14));
		lblBebidas.setBounds(288, 66, 99, 14);
		panelCadastro.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Latic\u00EDnios");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 14));
		lblFrios.setBounds(400, 66, 100, 14);
		panelCadastro.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 14));
		lblLimpeza.setBounds(515, 66, 51, 14);
		panelCadastro.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 14));
		lblMercearia.setBounds(581, 66, 64, 14);
		panelCadastro.add(lblMercearia);
		
		JLabel lblPerfume = new JLabel("Perfume e Higiene");
		lblPerfume.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPerfume.setBounds(656, 66, 117, 14);
		panelCadastro.add(lblPerfume);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(124, 41, 623, 14);
		panelCadastro.add(label_16);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais:");
		lblDadosPessoais.setForeground(new Color(255, 153, 0));
		lblDadosPessoais.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosPessoais.setBounds(151, 155, 139, 14);
		panelCadastro.add(lblDadosPessoais);
		
		JLabel lblDadosDeAcesso = new JLabel("Dados de acesso ao sistema:");
		lblDadosDeAcesso.setForeground(new Color(255, 153, 0));
		lblDadosDeAcesso.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosDeAcesso.setBounds(151, 409, 196, 14);
		panelCadastro.add(lblDadosDeAcesso);
		
		txtConfirmarSenha = new JPasswordField();
		txtConfirmarSenha.setBounds(492, 452, 125, 20);
		panelCadastro.add(txtConfirmarSenha);
		
		JLabel lblI = new JLabel("I");
		lblI.setForeground(new Color(255, 153, 0));
		lblI.setFont(new Font("Folks", Font.BOLD, 15));
		lblI.setBounds(87, 64, 4, 14);
		panelCadastro.add(lblI);
		
		JLabel label_1 = new JLabel("I");
		label_1.setForeground(new Color(255, 153, 0));
		label_1.setFont(new Font("Folks", Font.BOLD, 15));
		label_1.setBounds(141, 64, 4, 14);
		panelCadastro.add(label_1);
		
		JLabel label_2 = new JLabel("I");
		label_2.setForeground(new Color(255, 153, 0));
		label_2.setFont(new Font("Folks", Font.BOLD, 15));
		label_2.setBounds(278, 64, 4, 14);
		panelCadastro.add(label_2);
		
		JLabel label_3 = new JLabel("I");
		label_3.setForeground(new Color(255, 153, 0));
		label_3.setFont(new Font("Folks", Font.BOLD, 15));
		label_3.setBounds(390, 64, 4, 14);
		panelCadastro.add(label_3);
		
		JLabel label_4 = new JLabel("I");
		label_4.setForeground(new Color(255, 153, 0));
		label_4.setFont(new Font("Folks", Font.BOLD, 15));
		label_4.setBounds(505, 64, 4, 14);
		panelCadastro.add(label_4);
		
		JLabel label_5 = new JLabel("I");
		label_5.setForeground(new Color(255, 153, 0));
		label_5.setFont(new Font("Folks", Font.BOLD, 15));
		label_5.setBounds(571, 64, 4, 14);
		panelCadastro.add(label_5);
		
		JLabel label_6 = new JLabel("I");
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Folks", Font.BOLD, 15));
		label_6.setBounds(646, 64, 4, 14);
		panelCadastro.add(label_6);
		
		JLabel lblAstNumero = new JLabel("*");
		lblAstNumero.setForeground(Color.RED);
		lblAstNumero.setBounds(536, 310, 10, 10);
		panelCadastro.add(lblAstNumero);
		
		JLabel lblAstNome = new JLabel("*");
		lblAstNome.setForeground(Color.RED);
		lblAstNome.setBounds(563, 175, 10, 10);
		panelCadastro.add(lblAstNome);
		
		JLabel lblAstIdentidade = new JLabel("*");
		lblAstIdentidade.setForeground(Color.RED);
		lblAstIdentidade.setBounds(316, 200, 10, 10);
		panelCadastro.add(lblAstIdentidade);
		
		JLabel lblAstCpf = new JLabel("*");
		lblAstCpf.setForeground(Color.RED);
		lblAstCpf.setBounds(460, 199, 10, 10);
		panelCadastro.add(lblAstCpf);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setBounds(0, 0, 800, 600);
		panelCadastro.add(lblBackGround);
		
		
	}

	private void LimparCampos() {
		txtNome.setText("");
		txtEmail.setText("");
		txtSenha.setText("");
		txtConfirmarSenha.setText("");
		txtCpf.setText("");
		txtDataDeNascimento.setText("");
		txtSexo.setText("");
		txtFone.setText("");
		txtTelefoneCelular.setText("");
		txtIdentidade.setText("");
		txtLogradouro.setText("");
		txtComplemento.setText("");
		txtBairro.setText("");
		txtCidade.setText("");
		txtUf.setText("");
		txtCep.setText("");
		txtLogin.setText("");
		txtSenhaLogin.setText("");
		
	}
	
	private boolean ConfirmaSenha(String senha, String confirmarSenha) {
		if (senha == confirmarSenha)
			return true; 
		return false;
	}
}
