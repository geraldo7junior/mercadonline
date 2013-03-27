package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Utilitarios.Login;
import Utilitarios.Menu;


public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contato frame = new Contato();
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

	public Home() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		new Menu(contentPane); //Chama o menu principal
		
		new Login(contentPane);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblPadaria.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Padaria().setVisible(true);
			}
		});
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(43, 84, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblBebidas.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Bebidas().setVisible(true);
			}
		});
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(212, 84, 56, 14);
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
		lblFrios.setBounds(297, 84, 121, 14);
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
		lblLimpeza.setBounds(452, 84, 51, 14);
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
		lblMercearia.setBounds(542, 84, 64, 14);
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
		lblHigiene.setBounds(642, 84, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_14 = new JLabel("I");
		label_14.setForeground(new Color(255, 153, 0));
		label_14.setFont(new Font("Folks", Font.BOLD, 15));
		label_14.setBounds(102, 84, 4, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("I");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Folks", Font.BOLD, 15));
		label_15.setBounds(192, 84, 4, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("I");
		label_16.setForeground(new Color(255, 153, 0));
		label_16.setFont(new Font("Folks", Font.BOLD, 15));
		label_16.setBounds(277, 84, 4, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("I");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Folks", Font.BOLD, 15));
		label_17.setBounds(432, 84, 4, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("I");
		label_18.setForeground(new Color(255, 153, 0));
		label_18.setFont(new Font("Folks", Font.BOLD, 15));
		label_18.setBounds(522, 84, 4, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("I");
		label_19.setForeground(new Color(255, 153, 0));
		label_19.setFont(new Font("Folks", Font.BOLD, 15));
		label_19.setBounds(622, 84, 4, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("I");
		label_20.setForeground(new Color(255, 153, 0));
		label_20.setFont(new Font("Folks", Font.BOLD, 15));
		label_20.setBounds(707, 84, 4, 14);
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
		lblHortifruti.setBounds(122, 84, 64, 14);
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
		lblCosmeticos.setBounds(727, 84, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel lblDestaques = new JLabel("Destaques:");
		lblDestaques.setForeground(new Color(255, 153, 0));
		lblDestaques.setFont(new Font("Calibri", Font.BOLD, 14));
		lblDestaques.setBounds(43, 152, 114, 14);
		contentPane.add(lblDestaques);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_1.setBounds(43, 164, 913, 14);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pao frances.png"));
		label.setBounds(65, 189, 88, 116);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\coca 3.png"));
		label_2.setBounds(270, 193, 88, 116);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\arroz 4.png"));
		label_3.setBounds(507, 193, 88, 116);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\feijao.png"));
		label_4.setBounds(798, 193, 88, 116);
		contentPane.add(label_4);
		
		JLabel lblPromoo = new JLabel("Promo\u00E7\u00F5es:");
		lblPromoo.setForeground(new Color(255, 153, 0));
		lblPromoo.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPromoo.setBounds(43, 334, 81, 14);
		contentPane.add(lblPromoo);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_6.setBounds(43, 346, 913, 14);
		contentPane.add(label_6);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Bebidas\\delvalle.png"));
		label_5.setBounds(65, 359, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Hortifruti\\tomate.png"));
		label_7.setBounds(270, 363, 88, 116);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Mercearia\\macarrao.png"));
		label_8.setBounds(507, 363, 88, 116);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Torta de morango.png"));
		label_9.setBounds(798, 363, 88, 116);
		contentPane.add(label_9);
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCarrinhoCompras.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new CarrinhoCompras().setVisible(true);
			}
		});
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(841, 72, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel label_10 = new JLabel("P\u00E3o Franc\u00EAs Kg");
		label_10.setBounds(71, 306, 112, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("R$ 9,50");
		label_11.setBounds(86, 321, 42, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Torta de Morango Kg");
		label_12.setBounds(789, 468, 159, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("R$ 28,00");
		label_13.setBounds(815, 482, 50, 14);
		contentPane.add(label_13);
		
		JLabel label_21 = new JLabel("Coca Cola 3L");
		label_21.setBounds(292, 309, 82, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("R$ 5,15");
		label_22.setBounds(303, 323, 51, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("Del Valle Uva 1L");
		label_23.setBounds(75, 476, 109, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("R$ 5,50");
		label_24.setBounds(92, 490, 51, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("Feij\u00E3o Carioca Turquesa 1Kg");
		label_25.setVerticalAlignment(SwingConstants.TOP);
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setBounds(763, 314, 174, 20);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("R$ 5,00");
		label_26.setBounds(809, 329, 42, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("Arroz Tio Jo\u00E3o 1Kg");
		label_27.setBounds(508, 315, 134, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("R$ 2,20");
		label_28.setBounds(536, 330, 42, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("Macarr\u00E3o Vitarela 1pct");
		label_29.setVerticalAlignment(SwingConstants.TOP);
		label_29.setHorizontalAlignment(SwingConstants.LEFT);
		label_29.setBounds(497, 474, 146, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("R$ 1,20");
		label_30.setBounds(530, 488, 42, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("Tomate 1kg");
		label_31.setBounds(286, 465, 96, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("R$ 5,20");
		label_32.setBounds(294, 482, 51, 14);
		contentPane.add(label_32);
		
		JLabel lblBackGrpund = new JLabel("");
		lblBackGrpund.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGroundHome.png"));
		lblBackGrpund.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGrpund.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGrpund);
	}
}
