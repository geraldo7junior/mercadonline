package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Utilitarios.Login;
import Utilitarios.Menu;

public class Pedidos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public Pedidos() {
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
		lblCarrinhoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCarrinhoCompras.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new CarrinhoCompras().setVisible(true);
			}
		});
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(846, 75, 152, 30);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setForeground(Color.BLACK);
		lblPedidos.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblPedidos.setBackground(Color.WHITE);
		lblPedidos.setBounds(482, 144, 74, 20);
		contentPane.add(lblPedidos);
		
		JScrollPane scrollPanePedidos = new JScrollPane();
		scrollPanePedidos.setBounds(228, 221, 565, 332);
		contentPane.add(scrollPanePedidos);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IdPedido:", "Status:"
			}
		));
		scrollPanePedidos.setViewportView(table);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackground.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackground.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackground);
		
	}

}
