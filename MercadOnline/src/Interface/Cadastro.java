package Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Main.Cliente;
import Utilitarios.LimitaNumeroCaracteres;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
	private JTextField txtConfirmarSenha;
	private JTextField txtLogin;
	private JTextField txtSenhaLogin;
	
	

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome*:");
		lblNome.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNome.setBounds(150, 155, 56, 14);
		
		JLabel lblEmail = new JLabel("E-mail*:");
		lblEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEmail.setBounds(150, 404, 56, 14);
		
		txtNome = new JTextField();
		txtNome.setBounds(208, 149, 353, 20);
		txtNome.setColumns(10);
		txtNome.setDocument(new LimitaNumeroCaracteres(45));
		
		txtEmail = new JTextField();
		txtEmail.setBounds(217, 402, 251, 20);
		txtEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF*:");
		lblCpf.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCpf.setBounds(324, 176, 41, 14);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(365, 174, 88, 20);
		txtCpf.setColumns(10);
		
		JLabel lblIdentidade = new JLabel("Identidade*:");
		lblIdentidade.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblIdentidade.setBounds(150, 180, 81, 14);
		
		txtIdentidade = new JTextField();
		txtIdentidade.setBounds(240, 174, 74, 20);
		txtIdentidade.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(215, 427, 125, 20);
		
		JLabel lblSenha = new JLabel("Senha*:");
		lblSenha.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblSenha.setBounds(150, 429, 56, 14);
		
		JButton btnCadastrar = new JButton("Confirmar Cadastro");
		btnCadastrar.setBounds(300, 477, 137, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Cliente().cadastrarUsuario(txtNome.getText(),txtEmail.getText(),getTxtSenha(),txtCpf.getText(),
						txtDataDeNascimento.getText(),txtSexo.getText(),txtFone.getText(),txtIdentidade.getText(),
						txtLogradouro.getText(),txtComplemento.getText(),txtBairro.getText(),txtCidade.getText(),txtUf.getText());
			}
		});
		
		JLabel lblFone = new JLabel("Telefone Fixo*:");
		lblFone.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblFone.setBounds(150, 230, 103, 14);
		
		JLabel lblSexo = new JLabel("Sexo*:");
		lblSexo.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblSexo.setBounds(400, 205, 53, 14);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento*:");
		lblDataDeNascimento.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDataDeNascimento.setBounds(150, 205, 147, 14);
		
		JLabel lblLogradouro = new JLabel("Rua*:");
		lblLogradouro.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblLogradouro.setBounds(150, 284, 41, 14);
		
		JLabel lblComplemento = new JLabel("Complemento*:");
		lblComplemento.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblComplemento.setBounds(150, 309, 103, 14);
		
		JLabel lblNumero = new JLabel("N\u00BA*:");
		lblNumero.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNumero.setBounds(439, 284, 41, 14);
		
		JLabel lblCidade = new JLabel("Cidade*:");
		lblCidade.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCidade.setBounds(150, 334, 64, 14);
		
		JLabel lblUf = new JLabel("UF*:");
		lblUf.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblUf.setBounds(150, 359, 34, 14);
		
		txtFone = new JTextField();
		txtFone.setBounds(258, 228, 100, 20);
		txtFone.setColumns(10);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(457, 199, 23, 20);
		txtSexo.setColumns(10);
		
		txtDataDeNascimento = new JTextField();
		txtDataDeNascimento.setBounds(300, 199, 86, 20);
		txtDataDeNascimento.setColumns(10);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(192, 282, 237, 20);
		txtLogradouro.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(255, 307, 34, 20);
		txtComplemento.setText("");
		txtComplemento.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(467, 282, 64, 20);
		txtNumero.setText("");
		txtNumero.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(216, 332, 252, 20);
		txtCidade.setText("");
		txtCidade.setColumns(10);
		
		txtUf = new JTextField();
		txtUf.setBounds(185, 357, 34, 20);
		txtUf.setText("");
		txtUf.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro*:");
		lblBairro.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblBairro.setBounds(295, 309, 51, 14);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(358, 307, 224, 20);
		txtBairro.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(btnCadastrar);
		contentPane.add(lblFone);
		contentPane.add(lblEmail);
		contentPane.add(lblNome);
		contentPane.add(lblCpf);
		contentPane.add(lblIdentidade);
		contentPane.add(lblSenha);
		contentPane.add(lblSexo);
		contentPane.add(lblCidade);
		contentPane.add(lblDataDeNascimento);
		contentPane.add(lblUf);
		contentPane.add(lblLogradouro);
		contentPane.add(lblComplemento);
		contentPane.add(lblNumero);
		contentPane.add(lblBairro);
		contentPane.add(txtBairro);
		contentPane.add(txtNome);
		contentPane.add(txtEmail);
		contentPane.add(txtSenha);
		contentPane.add(txtIdentidade);
		contentPane.add(txtCpf);
		contentPane.add(txtDataDeNascimento);
		contentPane.add(txtLogradouro);
		contentPane.add(txtSexo);
		contentPane.add(txtFone);
		contentPane.add(txtComplemento);
		contentPane.add(txtNumero);
		contentPane.add(txtCidade);
		contentPane.add(txtUf);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		lblCadastro.setBackground(Color.WHITE);
		lblCadastro.setBounds(394, 67, 57, 20);
		contentPane.add(lblCadastro);
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular*:");
		lblTelefoneCelular.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblTelefoneCelular.setBounds(365, 230, 125, 14);
		contentPane.add(lblTelefoneCelular);
		
		txtTelefoneCelular = new JTextField();
		txtTelefoneCelular.setBounds(496, 228, 86, 20);
		contentPane.add(txtTelefoneCelular);
		txtTelefoneCelular.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o*:");
		lblEndereco.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEndereco.setBounds(150, 259, 81, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblCep = new JLabel("CEP*:");
		lblCep.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCep.setBounds(479, 334, 46, 14);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(523, 332, 67, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha*:");
		lblConfirmarSenha.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblConfirmarSenha.setBounds(358, 429, 125, 14);
		contentPane.add(lblConfirmarSenha);
		
		txtConfirmarSenha = new JTextField();
		txtConfirmarSenha.setBounds(479, 427, 103, 20);
		contentPane.add(txtConfirmarSenha);
		txtConfirmarSenha.setColumns(10);
		
		JLabel lblFotoImg = new JLabel("");
		lblFotoImg.setIcon(new ImageIcon("C:\\Users\\Gera3d6\\workspace\\MercadOnline\\imagem\\foto.png"));
		lblFotoImg.setBounds(26, 149, 117, 115);
		contentPane.add(lblFotoImg);
		
		JLabel lblNewLabel = new JLabel("Foto*");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNewLabel.setBounds(65, 273, 41, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(240, 230, 140));
		panelLogin.setBounds(571, 110, 196, 109);
		contentPane.add(panelLogin);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtSenhaLogin = new JTextField();
		txtSenhaLogin.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		GroupLayout gl_panelLogin = new GroupLayout(panelLogin);
		gl_panelLogin.setHorizontalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 196, Short.MAX_VALUE)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addComponent(lblLogin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtLogin, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addComponent(lblSenhaLogin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSenhaLogin, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
						.addComponent(btnEntrar, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_panelLogin.setVerticalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 109, Short.MAX_VALUE)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenhaLogin)
						.addComponent(txtSenhaLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEntrar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelLogin.setLayout(gl_panelLogin);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		lblHome.setBounds(229, 11, 32, 20);
		contentPane.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		lblProdutos.setBounds(276, 11, 64, 20);
		contentPane.add(lblProdutos);
		
		JLabel lblCadastromenu = new JLabel("cadastro");
		lblCadastromenu.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		lblCadastromenu.setBounds(349, 11, 57, 20);
		contentPane.add(lblCadastromenu);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		lblPromocao.setBounds(416, 11, 74, 20);
		contentPane.add(lblPromocao);
		
		JLabel label_6 = new JLabel("sugeridos");
		label_6.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		label_6.setBounds(509, 11, 59, 20);
		contentPane.add(label_6);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setFont(new Font("AR BONNIE", Font.BOLD, 16));
		lblContato.setBounds(586, 11, 55, 20);
		contentPane.add(lblContato);
		
		JLabel lblPaes = new JLabel("P\u00E3es e Bolos");
		lblPaes.setFont(new Font("Calibri", Font.BOLD, 11));
		lblPaes.setBounds(142, 42, 56, 14);
		contentPane.add(lblPaes);
		
		JLabel lblFrutas = new JLabel("Frutas");
		lblFrutas.setFont(new Font("Calibri", Font.BOLD, 11));
		lblFrutas.setBounds(208, 42, 28, 14);
		contentPane.add(lblFrutas);
		
		JLabel lblLegumes = new JLabel("Legumes e Verduras");
		lblLegumes.setFont(new Font("Calibri", Font.BOLD, 11));
		lblLegumes.setBounds(250, 42, 93, 14);
		contentPane.add(lblLegumes);
		
		JLabel lblBebidas = new JLabel("Bebidas e Sucos");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 11));
		lblBebidas.setBounds(357, 42, 72, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Latic\u00EDnios");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 11));
		lblFrios.setBounds(441, 42, 76, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 11));
		lblLimpeza.setBounds(534, 42, 38, 14);
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 11));
		lblMercearia.setBounds(588, 42, 48, 14);
		contentPane.add(lblMercearia);
		
		JLabel lblPerfume = new JLabel("Perfume e Higiene");
		lblPerfume.setFont(new Font("Calibri", Font.BOLD, 11));
		lblPerfume.setBounds(650, 42, 86, 14);
		contentPane.add(lblPerfume);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(124, 41, 623, 14);
		contentPane.add(label_16);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais*:");
		lblDadosPessoais.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosPessoais.setBounds(150, 130, 139, 14);
		contentPane.add(lblDadosPessoais);
		
		JLabel lblDadosDeAcesso = new JLabel("Dados de acesso ao sistema*:");
		lblDadosDeAcesso.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosDeAcesso.setBounds(150, 384, 196, 14);
		contentPane.add(lblDadosDeAcesso);
		
		JLabel lblSugeridos = new JLabel("");
		lblSugeridos.setIcon(new ImageIcon("C:\\Users\\Gera3d6\\workspace\\MercadOnline\\imagem\\BackGround.png"));
		lblSugeridos.setBounds(0, 0, 784, 562);
		contentPane.add(lblSugeridos);
		
		
	}
	public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return F_Mascara;
        } 
}
