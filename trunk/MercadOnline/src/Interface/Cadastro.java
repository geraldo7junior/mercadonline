package Interface;

import java.awt.EventQueue;

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

import Main.ConexaoDB;
import Utilitarios.LimitaNumeroCaracteres;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	
	

	public String getTxtNome() {
		return txtNome.getText();
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setDocument(new LimitaNumeroCaracteres(45));
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		
		JLabel lblIdentidade = new JLabel("Identidade:");
		
		txtIdentidade = new JTextField();
		txtIdentidade.setColumns(10);
		
		txtSenha = new JPasswordField();
		
		JLabel lblSenha = new JLabel("Senha:");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sql = "INSERT INTO usuario (nome, email, senha, cpf, dataNascimento, sexo, fone, " +
						"identidade, logradouro, complemento, bairro, cidade, uf) " +
						"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ConexaoDB conexao = new ConexaoDB();
				conexao.getConnection();
				try {
					PreparedStatement stm = conexao.conn.prepareStatement(sql);
					
					stm.setString(1, txtNome.getText());
					stm.setString(2, txtEmail.getText());
					stm.setString(3, getTxtSenha());
					stm.setString(4, txtCpf.getText());
					stm.setString(5, txtDataDeNascimento.getText());
					stm.setString(6, txtSexo.getText());
					stm.setString(7, txtFone.getText());
					stm.setString(8, txtIdentidade.getText());
					stm.setString(9, txtLogradouro.getText());
					stm.setString(10, txtComplemento.getText());
					stm.setString(11, txtBairro.getText());
					stm.setString(12, txtCidade.getText());
					stm.setString(13, txtUf.getText());
					
					
					stm.executeUpdate();
					
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				conexao.closeConnection();
			}
		});
		
		JLabel lblFone = new JLabel("Fone:");
		
		JLabel lblSexo = new JLabel("Sexo:");
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		
		JLabel lblComplemento = new JLabel("Complemento:");
		
		JLabel lblNumero = new JLabel("Numero:");
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		JLabel lblUf = new JLabel("UF:");
		
		txtFone = new JTextField();
		txtFone.setColumns(10);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		
		txtDataDeNascimento = new JTextField();
		txtDataDeNascimento.setColumns(10);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setText("");
		txtComplemento.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setText("");
		txtNumero.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setText("");
		txtCidade.setColumns(10);
		
		txtUf = new JTextField();
		txtUf.setText("");
		txtUf.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCadastrar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(114)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblFone)
								.addComponent(lblEmail)
								.addComponent(lblNome)
								.addComponent(lblCpf)
								.addComponent(lblIdentidade)
								.addComponent(lblSenha)
								.addComponent(lblSexo)
								.addComponent(lblCidade)
								.addComponent(lblDataDeNascimento)
								.addComponent(lblUf)
								.addComponent(lblLogradouro)
								.addComponent(lblComplemento)
								.addComponent(lblNumero)
								.addComponent(lblBairro))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(1)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addComponent(txtSenha, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtIdentidade, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
												.addGap(126))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtCpf, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
												.addGap(92))))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(txtDataDeNascimento)
										.addGap(166))
									.addComponent(txtLogradouro, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
									.addComponent(txtSexo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtFone, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtComplemento, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
									.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtCidade, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
									.addComponent(txtUf, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))))
					.addGap(392))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCpf))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtIdentidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdentidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFone)
						.addComponent(txtFone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSexo)
						.addComponent(txtSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(txtDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogradouro)
						.addComponent(txtLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblComplemento)
						.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero)
						.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUf)
						.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnCadastrar)
					.addGap(77))
		);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(344)
					.addComponent(lblCadastro)
					.addContainerGap(344, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addComponent(lblCadastro)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
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
