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
import javax.swing.border.EmptyBorder;

import Utilitarios.Login;
import Utilitarios.Menu;


public class Frios extends JFrame {

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
					Frios frame = new Frios();
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
	public Frios() {
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
		lblPadaria.setBounds(48, 85, 53, 14);
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
		lblBebidas.setBounds(217, 85, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(302, 85, 121, 14);
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
		lblLimpeza.setBounds(457, 85, 51, 14);
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
		lblMercearia.setBounds(547, 85, 64, 14);
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
		lblHigiene.setBounds(647, 85, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_6 = new JLabel("I");
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Folks", Font.BOLD, 15));
		label_6.setBounds(107, 87, 4, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("I");
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Folks", Font.BOLD, 15));
		label_7.setBounds(197, 87, 4, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("I");
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Folks", Font.BOLD, 15));
		label_8.setBounds(282, 87, 4, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("I");
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Folks", Font.BOLD, 15));
		label_9.setBounds(437, 87, 4, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("I");
		label_10.setForeground(new Color(255, 153, 0));
		label_10.setFont(new Font("Folks", Font.BOLD, 15));
		label_10.setBounds(527, 87, 4, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("I");
		label_11.setForeground(new Color(255, 153, 0));
		label_11.setFont(new Font("Folks", Font.BOLD, 15));
		label_11.setBounds(627, 87, 4, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("I");
		label_12.setForeground(new Color(255, 153, 0));
		label_12.setFont(new Font("Folks", Font.BOLD, 15));
		label_12.setBounds(712, 87, 4, 14);
		contentPane.add(label_12);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblHortifruti.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Hortifruti().setVisible(true);
			}
		});
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(127, 85, 64, 14);
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
		lblCosmeticos.setBounds(732, 85, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(845, 76, 152, 30);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblFriosECongelados = new JLabel("Frios e Congelados");
		lblFriosECongelados.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblFriosECongelados.setBounds(482, 140, 192, 20);
		contentPane.add(lblFriosECongelados);
		
		JLabel lblCongelados = new JLabel("Congelados");
		lblCongelados.setForeground(new Color(255, 153, 0));
		lblCongelados.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCongelados.setBounds(47, 180, 96, 14);
		contentPane.add(lblCongelados);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label.setBounds(47, 192, 913, 14);
		contentPane.add(label);
		
		JLabel lblFrios_1 = new JLabel("Frios");
		lblFrios_1.setForeground(new Color(255, 153, 0));
		lblFrios_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblFrios_1.setBounds(47, 361, 68, 14);
		contentPane.add(lblFrios_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_2.setBounds(47, 373, 913, 14);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f1.png"));
		label_1.setBounds(57, 215, 88, 116);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f6.png"));
		label_3.setBounds(292, 215, 88, 116);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f3.png"));
		label_4.setBounds(540, 215, 88, 116);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f4.png"));
		label_5.setBounds(790, 215, 88, 116);
		contentPane.add(label_5);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\c1.png"));
		label_13.setBounds(57, 396, 88, 116);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\c3.png"));
		label_14.setBounds(292, 396, 88, 116);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\c4.png"));
		label_15.setBounds(540, 396, 88, 116);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\c2.png"));
		label_16.setBounds(790, 396, 88, 116);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f5.png"));
		label_17.setBounds(57, 565, 88, 116);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\s.png"));
		label_18.setBounds(292, 565, 88, 116);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f8.png"));
		label_19.setBounds(540, 565, 88, 116);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Frios e congelados\\f7.png"));
		label_20.setBounds(790, 565, 88, 116);
		contentPane.add(label_20);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 1, 1024, 768);
		contentPane.add(lblBackGround);
	}

}
