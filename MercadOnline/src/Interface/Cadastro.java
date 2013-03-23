package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Main.Cliente;
import Utilitarios.ApenasNum;
import Utilitarios.ApenasStr;
import Utilitarios.Mascara;
import Utilitarios.VerificaPreenchimento;

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
	private JPasswordField txtConfirmarSenha;
	private JPasswordField txtSenhaLogin;
	

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
	
	public String getTxtSenhaLogin() {
		String senha = new String(txtSenhaLogin.getPassword());
		return senha;
	}

	public void setTxtSenhaLogin(JPasswordField txtSenha) {
		this.txtSenhaLogin = txtSenha;
	}


	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		panelCadastro = new JPanel();
		panelCadastro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelCadastro);
		
		JLabel lblNome = new JLabel("Nome*:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNome.setBounds(269, 218, 56, 14);
		
		JLabel lblEmail = new JLabel("E-mail*:");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEmail.setBounds(269, 566, 56, 14);
		
		txtNome = new JTextField(new ApenasStr(50), null, 0);
		txtNome.setName("txtNome");
		txtNome.setBounds(322, 216, 426, 20);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setName("txtEmail");
		txtEmail.setBounds(322, 564, 426, 20);
		txtEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF*:");
		lblCpf.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCpf.setBounds(599, 256, 41, 14);
		
		txtCpf = new JFormattedTextField(Mascara.ExecutaMascara("###.###.###-##"));
		txtCpf.setName("txtCpf");
		txtCpf.setBounds(642, 254, 106, 20);
		txtCpf.setColumns(10);
		
		JLabel lblIdentidade = new JLabel("Identidade*:");
		lblIdentidade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblIdentidade.setBounds(269, 256, 81, 14);
		
		txtIdentidade = new JTextField(new ApenasNum(10), null, 0);
		txtIdentidade.setName("txtIdentidade");
		txtIdentidade.setBounds(343, 254, 81, 20);
		txtIdentidade.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setName("txtSenha");
		txtSenha.setBounds(322, 602, 138, 20);
		
		JLabel lblSenha = new JLabel("Senha*:");
		lblSenha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSenha.setBounds(269, 604, 56, 14);
		
		JButton btnCadastrar = new JButton("Confirmar Cadastro");
		btnCadastrar.setBounds(431, 655, 153, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<JTextField> lista = new ArrayList<JTextField>(
						Arrays.asList(new JTextField[]{
								txtNome,txtEmail,txtCpf,txtDataDeNascimento,txtSexo,txtFone,txtIdentidade,txtLogradouro,txtBairro,txtCidade,txtUf,txtCep
						})
				);
			
				if (new VerificaPreenchimento().Verifica(lista)){
					
					if (ConfirmaSenha(getTxtSenha(), getTxtConfirmarSenha())){
						
						if (new Cliente().cadastrarUsuario(txtNome.getText(),txtEmail.getText(),getTxtSenha(),txtCpf.getText(),
							txtDataDeNascimento.getText(),txtSexo.getText(),txtFone.getText(),txtTelefoneCelular.getText(),txtIdentidade.getText(),
							txtLogradouro.getText(),txtComplemento.getText(),txtBairro.getText(),txtCidade.getText(),txtUf.getText(),txtCep.getText()));{
								LimparCampos();
						}
					}
				}
			}
		});
		
		JLabel lblFone = new JLabel("Telefone Fixo*:");
		lblFone.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFone.setBounds(269, 332, 103, 14);
		
		JLabel lblSexo = new JLabel("Sexo*:");
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSexo.setBounds(680, 294, 41, 14);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento*:");
		lblDataDeNascimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDataDeNascimento.setBounds(269, 294, 147, 14);
		
		JLabel lblLogradouro = new JLabel("Rua*:");
		lblLogradouro.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblLogradouro.setBounds(269, 412, 41, 14);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblComplemento.setBounds(269, 450, 103, 14);
		
		JLabel lblNumero = new JLabel("N\u00BA*:");
		lblNumero.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNumero.setBounds(655, 412, 23, 14);
		
		JLabel lblCidade = new JLabel("Cidade*:");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCidade.setBounds(269, 488, 64, 14);
		
		JLabel lblUf = new JLabel("UF*:");
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblUf.setBounds(558, 488, 34, 14);
		
		txtFone = new JFormattedTextField(Mascara.ExecutaMascara("(##)####-####"));
		txtFone.setName("txtFone");
		txtFone.setBounds(360, 330, 100, 20);
		txtFone.setColumns(10);
		
		txtSexo = new JTextField(new ApenasStr(1), null, 0);
		txtSexo.setName("txtSexo");
		txtSexo.setBounds(725, 292, 23, 20);
		txtSexo.setColumns(10);
		
		txtDataDeNascimento = new JFormattedTextField(Mascara.ExecutaMascara("##/##/####"));
		txtDataDeNascimento.setName("txtDataDeNascimento");
		txtDataDeNascimento.setBounds(400, 292, 74, 20);
		txtDataDeNascimento.setColumns(10);
		
		txtLogradouro = new JTextField(new ApenasStr(50), null, 0);
		txtLogradouro.setName("txtLogradouro");
		txtLogradouro.setBounds(311, 410, 321, 20);
		txtLogradouro.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setName("txtComplemento");
		txtComplemento.setBounds(360, 448, 34, 20);
		txtComplemento.setText("");
		txtComplemento.setColumns(10);
		
		txtNumero = new JTextField(new ApenasNum(6), null, 0);
		txtNumero.setName("txtNumero");
		txtNumero.setBounds(684, 410, 64, 20);
		txtNumero.setText("");
		txtNumero.setColumns(10);
		
		txtCidade = new JTextField(new ApenasStr(50), null, 0);
		txtCidade.setName("txtCidade");
		txtCidade.setBounds(322, 486, 202, 20);
		txtCidade.setText("");
		txtCidade.setColumns(10);
		
		txtUf = new JTextField(new ApenasStr(2), null, 0);
		txtUf.setName("txtUf");
		txtUf.setBounds(588, 486, 34, 20);
		txtUf.setText("");
		txtUf.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro*:");
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBairro.setBounds(430, 450, 51, 14);
		
		txtBairro = new JTextField(new ApenasStr(50), null, 0);
		txtBairro.setName("txtBairro");
		txtBairro.setBounds(482, 448, 266, 20);
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
		lblCadastro.setForeground(Color.BLACK);
		lblCadastro.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblCadastro.setBackground(Color.WHITE);
		lblCadastro.setBounds(482, 144, 81, 20);
		panelCadastro.add(lblCadastro);
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular:");
		lblTelefoneCelular.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTelefoneCelular.setBounds(550, 332, 103, 14);
		panelCadastro.add(lblTelefoneCelular);
		
		txtTelefoneCelular = new JFormattedTextField(Mascara.ExecutaMascara("(##)####-####"));;
		txtTelefoneCelular.setName("txtTelefoneCelular");
		txtTelefoneCelular.setBounds(655, 330, 93, 20);
		panelCadastro.add(txtTelefoneCelular);
		txtTelefoneCelular.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setForeground(new Color(255, 153, 0));
		lblEndereco.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEndereco.setBounds(269, 374, 81, 14);
		panelCadastro.add(lblEndereco);
		
		JLabel lblCep = new JLabel("CEP*:");
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCep.setBounds(638, 488, 46, 14);
		panelCadastro.add(lblCep);
		
		txtCep = new JFormattedTextField(Mascara.ExecutaMascara("##.###-###"));;
		txtCep.setName("txtCep");
		txtCep.setBounds(674, 486, 74, 20);
		panelCadastro.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha*:");
		lblConfirmarSenha.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblConfirmarSenha.setBounds(497, 604, 125, 14);
		panelCadastro.add(lblConfirmarSenha);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		lblHome.setBounds(258, 25, 51, 20);
		panelCadastro.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		lblProdutos.setBounds(311, 25, 74, 20);
		panelCadastro.add(lblProdutos);
		
		JLabel lblCadastromenu = new JLabel("cadastro");
		lblCadastromenu.setForeground(Color.WHITE);
		lblCadastromenu.setFont(new Font("Folks", Font.BOLD, 16));
		lblCadastromenu.setBounds(386, 25, 68, 20);
		panelCadastro.add(lblCadastromenu);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setForeground(Color.WHITE);
		lblPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		lblPromocao.setBounds(463, 25, 81, 20);
		panelCadastro.add(lblPromocao);
		
		JLabel lblSugeridos = new JLabel("sugeridos");
		lblSugeridos.setForeground(Color.WHITE);
		lblSugeridos.setFont(new Font("Folks", Font.BOLD, 16));
		lblSugeridos.setBounds(548, 25, 81, 20);
		panelCadastro.add(lblSugeridos);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Folks", Font.BOLD, 16));
		lblContato.setBounds(632, 25, 70, 20);
		panelCadastro.add(lblContato);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(41, 85, 53, 14);
		panelCadastro.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(210, 85, 56, 14);
		panelCadastro.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(295, 85, 121, 14);
		panelCadastro.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(450, 85, 51, 14);
		panelCadastro.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMercearia.setBounds(540, 85, 64, 14);
		panelCadastro.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
		lblHigiene.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHigiene.setBounds(640, 85, 56, 14);
		panelCadastro.add(lblHigiene);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais:");
		lblDadosPessoais.setForeground(new Color(255, 153, 0));
		lblDadosPessoais.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosPessoais.setBounds(269, 180, 139, 14);
		panelCadastro.add(lblDadosPessoais);
		
		JLabel lblDadosDeAcesso = new JLabel("Dados de acesso ao sistema:");
		lblDadosDeAcesso.setForeground(new Color(255, 153, 0));
		lblDadosDeAcesso.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosDeAcesso.setBounds(269, 528, 196, 14);
		panelCadastro.add(lblDadosDeAcesso);
		
		txtConfirmarSenha = new JPasswordField();
		txtConfirmarSenha.setName("txtConfirmaSenha");
		txtConfirmarSenha.setBounds(610, 602, 138, 20);
		panelCadastro.add(txtConfirmarSenha);
		
		JLabel lblI = new JLabel("I");
		lblI.setForeground(new Color(255, 153, 0));
		lblI.setFont(new Font("Folks", Font.BOLD, 15));
		lblI.setBounds(100, 83, 4, 14);
		panelCadastro.add(lblI);
		
		JLabel label_1 = new JLabel("I");
		label_1.setForeground(new Color(255, 153, 0));
		label_1.setFont(new Font("Folks", Font.BOLD, 15));
		label_1.setBounds(190, 83, 4, 14);
		panelCadastro.add(label_1);
		
		JLabel label_2 = new JLabel("I");
		label_2.setForeground(new Color(255, 153, 0));
		label_2.setFont(new Font("Folks", Font.BOLD, 15));
		label_2.setBounds(275, 83, 4, 14);
		panelCadastro.add(label_2);
		
		JLabel label_3 = new JLabel("I");
		label_3.setForeground(new Color(255, 153, 0));
		label_3.setFont(new Font("Folks", Font.BOLD, 15));
		label_3.setBounds(430, 83, 4, 14);
		panelCadastro.add(label_3);
		
		JLabel label_4 = new JLabel("I");
		label_4.setForeground(new Color(255, 153, 0));
		label_4.setFont(new Font("Folks", Font.BOLD, 15));
		label_4.setBounds(520, 83, 4, 14);
		panelCadastro.add(label_4);
		
		JLabel label_5 = new JLabel("I");
		label_5.setForeground(new Color(255, 153, 0));
		label_5.setFont(new Font("Folks", Font.BOLD, 15));
		label_5.setBounds(620, 83, 4, 14);
		panelCadastro.add(label_5);
		
		JLabel label_6 = new JLabel("I");
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Folks", Font.BOLD, 15));
		label_6.setBounds(705, 83, 4, 14);
		panelCadastro.add(label_6);
		
		JLabel lblAstNumero = new JLabel("*");
		lblAstNumero.setForeground(Color.RED);
		lblAstNumero.setBounds(758, 412, 10, 10);
		panelCadastro.add(lblAstNumero);
		
		JLabel lblAstNome = new JLabel("*");
		lblAstNome.setForeground(Color.RED);
		lblAstNome.setBounds(753, 216, 10, 10);
		panelCadastro.add(lblAstNome);
		
		JLabel lblAstIdentidade = new JLabel("*");
		lblAstIdentidade.setForeground(Color.RED);
		lblAstIdentidade.setBounds(431, 256, 10, 10);
		panelCadastro.add(lblAstIdentidade);
		
		JLabel lblAstCpf = new JLabel("*");
		lblAstCpf.setForeground(Color.RED);
		lblAstCpf.setBounds(753, 256, 10, 10);
		panelCadastro.add(lblAstCpf);
		
		JButton btnValidarCadastro = new JButton("Alterar Cadastro");
		btnValidarCadastro.setBounds(258, 655, 134, 23);
		panelCadastro.add(btnValidarCadastro);
		
		JButton btnExcluirCadastro = new JButton("Excluir Cadastro");
		btnExcluirCadastro.setBounds(631, 655, 129, 23);
		panelCadastro.add(btnExcluirCadastro);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(712, 15, 34, 14);
		panelCadastro.add(lblLogin);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setBounds(859, 14, 42, 14);
		panelCadastro.add(lblSenhaLogin);
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		txtLogin = new JTextField();
		txtLogin.setBounds(753, 12, 96, 18);
		panelCadastro.add(txtLogin);
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(900, 11, 96, 18);
		panelCadastro.add(txtSenhaLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBounds(929, 39, 67, 18);
		panelCadastro.add(btnEntrar);
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(855, 148, 66, 23);
		panelCadastro.add(btnSair);
		btnSair.setBackground(UIManager.getColor("Button.background"));
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(120, 85, 64, 14);
		panelCadastro.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCosmeticos.setBounds(725, 85, 74, 14);
		panelCadastro.add(lblCosmeticos);
		
		JLabel lblLogado = new JLabel("logado");
		lblLogado.setBounds(768, 125, 153, 33);
		panelCadastro.add(lblLogado);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblNewLabel.setBounds(888, 76, 56, 23);
		panelCadastro.add(lblNewLabel);
		
		JLabel lblCarrinho = new JLabel("Carrinho");
		lblCarrinho.setForeground(new Color(255, 153, 0));
		lblCarrinho.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCarrinho.setBounds(852, 80, 56, 14);
		panelCadastro.add(lblCarrinho);
		
		JLabel lblCompras = new JLabel("Compras");
		lblCompras.setForeground(new Color(255, 153, 0));
		lblCompras.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCompras.setBounds(933, 80, 63, 14);
		panelCadastro.add(lblCompras);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setBounds(0, 0, 1024, 768);
		panelCadastro.add(lblBackGround);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(new Cliente().entrarSistema(txtLogin.getText(), getTxtSenhaLogin())){
					LimparCampos();
			}
		}});
		
		
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
