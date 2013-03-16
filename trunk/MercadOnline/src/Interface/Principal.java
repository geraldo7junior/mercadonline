package Interface;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

import Main.Logar;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Principal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	
		
	public Principal() {
		setBounds(100, 100, 800, 600);
		
		JPanel PainelLogin = new JPanel();
		PainelLogin.setBackground(Color.WHITE);
		ImageIcon arroba = new ImageIcon("C:\\Users\\Dell\\Desktop\\imagens para o Mercadon\\cadeado.gif");
		arroba.setImage(arroba.getImage().getScaledInstance(50, 50, 100));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(561, Short.MAX_VALUE)
					.addComponent(PainelLogin, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(PainelLogin, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(303, Short.MAX_VALUE))
		);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Logar(txtLogin.getText(), txtSenha.toString());
			}
		});
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		JLabel lblCadastrar = new JLabel("Cadastre-se");
		GroupLayout gl_PainelLogin = new GroupLayout(PainelLogin);
		gl_PainelLogin.setHorizontalGroup(
			gl_PainelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelLogin.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addGroup(gl_PainelLogin.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PainelLogin.createSequentialGroup()
							.addGroup(gl_PainelLogin.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_PainelLogin.createSequentialGroup()
									.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtLogin, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
								.addGroup(gl_PainelLogin.createSequentialGroup()
									.addComponent(lblSenha)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtSenha)))
							.addGap(18))
						.addGroup(gl_PainelLogin.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_PainelLogin.createSequentialGroup()
								.addComponent(lblCadastrar)
								.addGap(15))
							.addGroup(gl_PainelLogin.createSequentialGroup()
								.addComponent(btnEntrar)
								.addGap(20)))))
		);
		gl_PainelLogin.setVerticalGroup(
			gl_PainelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelLogin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PainelLogin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_PainelLogin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEntrar)
					.addGap(5)
					.addComponent(lblCadastrar)
					.addContainerGap(150, Short.MAX_VALUE))
		);
		PainelLogin.setLayout(gl_PainelLogin);
		getContentPane().setLayout(groupLayout);

	}
}
