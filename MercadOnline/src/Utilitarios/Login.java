package Utilitarios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Main.Cliente;

public class Login{
	
	JPasswordField txtSenhaLogin = new JPasswordField();
	final JLabel lblLogin = new JLabel("Login:");
	final JTextField txtLogin = new JTextField();
	final JLabel lblSenhaLogin = new JLabel("Senha:");
	final JLabel lblLogado = new JLabel(" ");
	final JButton btnSair = new JButton("Sair");
	final JButton btnEntrar = new JButton("Entrar");
	
	public Login(JPanel Painel,final JButton btnCadastrar, final JButton btnConfirmaAlteracao, final JButton btnAlterarCadastro, final JButton btnExcluirCadastro){
		
		
		lblLogin.setBounds(712, 15, 34, 14);
		Painel.add(lblLogin);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		
		txtLogin.setBounds(753, 12, 96, 18);
		Painel.add(txtLogin);
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
	
		txtSenhaLogin.setBounds(900, 11, 96, 18);
		Painel.add(txtSenhaLogin);
		
		
		lblSenhaLogin.setBounds(859, 14, 42, 14);
		Painel.add(lblSenhaLogin);
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		
		lblLogado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogado.setBounds(776, 15, 153, 33);
		lblLogado.setVisible(false);
		Painel.add(lblLogado);
		
		
		btnSair.setBounds(930, 26, 66, 18);
		Painel.add(btnSair);
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setVisible(false);
		
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBounds(929, 39, 67, 18);
		Painel.add(btnEntrar);
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblLogin.setVisible(true);
				txtLogin.setVisible(true);
				lblSenhaLogin.setVisible(true);
				txtSenhaLogin.setVisible(true);
				btnEntrar.setVisible(true);
				lblLogado.setVisible(false);
				lblLogado.setText(" ");
				btnSair.setVisible(false);
				btnCadastrar.setVisible(true);
				btnConfirmaAlteracao.setVisible(false);
				btnExcluirCadastro.setVisible(false);
				btnAlterarCadastro.setVisible(false);
		
				//LimparCampos();
				
			}
		});
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(new Cliente().entrarSistema(txtLogin.getText(), getTxtSenhaLogin())){
					txtLogin.setVisible(false);
					txtSenhaLogin.setVisible(false);
					lblLogin.setVisible(false);
					lblSenhaLogin.setVisible(false);
					btnEntrar.setVisible(false);
					lblLogado.setVisible(true);
					lblLogado.setText(txtLogin.getText());
					btnSair.setVisible(true);
					btnCadastrar.setVisible(false);
					btnAlterarCadastro.setVisible(true);
					btnExcluirCadastro.setVisible(true);
					
					//LimparCampos();
			}
		}});
	}
	
	public Login(JPanel Painel){
		
		
		lblLogin.setBounds(712, 15, 34, 14);
		Painel.add(lblLogin);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		
		txtLogin.setBounds(753, 12, 96, 18);
		Painel.add(txtLogin);
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
	
		txtSenhaLogin.setBounds(900, 11, 96, 18);
		Painel.add(txtSenhaLogin);
		
		
		lblSenhaLogin.setBounds(859, 14, 42, 14);
		Painel.add(lblSenhaLogin);
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		
		lblLogado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogado.setBounds(776, 15, 153, 33);
		lblLogado.setVisible(false);
		Painel.add(lblLogado);
		
		
		btnSair.setBounds(930, 26, 66, 18);
		Painel.add(btnSair);
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setVisible(false);
		
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBounds(929, 39, 67, 18);
		Painel.add(btnEntrar);
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblLogin.setVisible(true);
				txtLogin.setVisible(true);
				lblSenhaLogin.setVisible(true);
				txtSenhaLogin.setVisible(true);
				btnEntrar.setVisible(true);
				lblLogado.setVisible(false);
				lblLogado.setText(" ");
				btnSair.setVisible(false);
			}
		});
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(new Cliente().entrarSistema(txtLogin.getText(), getTxtSenhaLogin())){
					txtLogin.setVisible(false);
					txtSenhaLogin.setVisible(false);
					lblLogin.setVisible(false);
					lblSenhaLogin.setVisible(false);
					btnEntrar.setVisible(false);
					lblLogado.setVisible(true);
					lblLogado.setText(txtLogin.getText());
					btnSair.setVisible(true);
				}				
		}});
	}
	
	public String getTxtSenhaLogin() {
		String senha = new String(txtSenhaLogin.getPassword());
		return senha;
	}

	public void setTxtSenhaLogin(JPasswordField txtSenha) {
		this.txtSenhaLogin = txtSenha;
	}
	
	public void ExcluirCadastro(){
		if (new Cliente().deletarCadastro(lblLogado.getText())){
			lblLogin.setVisible(true);
			txtLogin.setVisible(true);
			lblSenhaLogin.setVisible(true);
			txtSenhaLogin.setVisible(true);
			btnEntrar.setVisible(true);
			lblLogado.setVisible(false);
			lblLogado.setText(" ");
			btnSair.setVisible(false);
			}
	}
	


}
