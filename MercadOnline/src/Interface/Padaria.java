package Interface;

import java.awt.Color;
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

public class Padaria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Padaria() {
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
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(43, 85, 53, 14);
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
		lblBebidas.setBounds(212, 85, 56, 14);
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
		lblFrios.setBounds(297, 85, 121, 14);
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
		lblLimpeza.setBounds(452, 85, 51, 14);
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
		lblMercearia.setBounds(542, 85, 64, 14);
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
		lblHigiene.setBounds(642, 85, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_6 = new JLabel("I");
		label_6.setForeground(new Color(255, 153, 0));
		label_6.setFont(new Font("Folks", Font.BOLD, 15));
		label_6.setBounds(102, 85, 4, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("I");
		label_7.setForeground(new Color(255, 153, 0));
		label_7.setFont(new Font("Folks", Font.BOLD, 15));
		label_7.setBounds(192, 85, 4, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("I");
		label_8.setForeground(new Color(255, 153, 0));
		label_8.setFont(new Font("Folks", Font.BOLD, 15));
		label_8.setBounds(277, 85, 4, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("I");
		label_9.setForeground(new Color(255, 153, 0));
		label_9.setFont(new Font("Folks", Font.BOLD, 15));
		label_9.setBounds(432, 85, 4, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("I");
		label_10.setForeground(new Color(255, 153, 0));
		label_10.setFont(new Font("Folks", Font.BOLD, 15));
		label_10.setBounds(522, 85, 4, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("I");
		label_11.setForeground(new Color(255, 153, 0));
		label_11.setFont(new Font("Folks", Font.BOLD, 15));
		label_11.setBounds(622, 85, 4, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("I");
		label_12.setForeground(new Color(255, 153, 0));
		label_12.setFont(new Font("Folks", Font.BOLD, 15));
		label_12.setBounds(707, 85, 4, 14);
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
		lblHortifruti.setBounds(122, 85, 64, 14);
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
		lblCosmeticos.setBounds(727, 85, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lblCarrinhoCompras.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new CarrinhoCompras().setVisible(true);
			}
		});
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(846, 74, 152, 30);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblPadaria_1 = new JLabel("PADARIA");
		lblPadaria_1.setForeground(Color.BLACK);
		lblPadaria_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblPadaria_1.setBackground(Color.WHITE);
		lblPadaria_1.setBounds(482, 140, 64, 20);
		contentPane.add(lblPadaria_1);
		
		JLabel lblPes = new JLabel("P\u00E3es");
		lblPes.setForeground(new Color(255, 153, 0));
		lblPes.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPes.setBounds(47, 176, 27, 14);
		contentPane.add(lblPes);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_1.setBounds(47, 188, 913, 14);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label.setBounds(47, 373, 913, 14);
		contentPane.add(label);
		
		JLabel lblBolos = new JLabel("Bolos");
		lblBolos.setForeground(new Color(255, 153, 0));
		lblBolos.setFont(new Font("Calibri", Font.BOLD, 14));
		lblBolos.setBounds(47, 361, 46, 14);
		contentPane.add(lblBolos);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\linha.png"));
		label_2.setBounds(47, 548, 913, 14);
		contentPane.add(label_2);
		
		JLabel lblNoSei = new JLabel("Salgados");
		lblNoSei.setForeground(new Color(255, 153, 0));
		lblNoSei.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNoSei.setBounds(47, 536, 67, 14);
		contentPane.add(lblNoSei);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pao frances.png"));
		lblNewLabel.setBounds(108, 209, 88, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\p\u00E3o criolo.png"));
		lblNewLabel_1.setBounds(313, 213, 88, 116);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\bolacha.png"));
		lblNewLabel_2.setBounds(550, 213, 88, 116);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pao de caixa.png"));
		lblNewLabel_3.setBounds(841, 213, 88, 116);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\floresta negra.png"));
		lblNewLabel_4.setBounds(102, 393, 88, 116);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Torta de morango.png"));
		lblNewLabel_5.setBounds(313, 398, 88, 116);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Modelo de tamanho de produtos.png"));
		lblNewLabel_6.setBounds(550, 398, 88, 116);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\formigueiro.png"));
		lblNewLabel_7.setBounds(841, 398, 88, 116);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\pastel.png"));
		lblNewLabel_8.setBounds(108, 573, 88, 116);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\bolinho.png"));
		lblNewLabel_9.setBounds(313, 573, 88, 116);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\coxinha.png"));
		lblNewLabel_10.setBounds(550, 573, 88, 116);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\Produtos\\Padaria\\Empada.png"));
		lblNewLabel_11.setBounds(841, 573, 88, 116);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblPaoFrancesKg = new JLabel("P\u00E3o Franc\u00EAs Kg");
		lblPaoFrancesKg.setBounds(115, 330, 112, 14);
		contentPane.add(lblPaoFrancesKg);
		
		JLabel lblR = new JLabel("R$ 9,50");
		lblR.setBounds(130, 345, 42, 14);
		contentPane.add(lblR);
		
		JLabel lblPaoDeForma = new JLabel("P\u00E3o de Forma Pct");
		lblPaoDeForma.setBounds(841, 330, 119, 14);
		contentPane.add(lblPaoDeForma);
		
		JLabel lblPaesDiversosUnd = new JLabel("P\u00E3es Diversos Und");
		lblPaesDiversosUnd.setBounds(313, 330, 123, 14);
		contentPane.add(lblPaesDiversosUnd);
		
		JLabel lblR_1 = new JLabel("R$ 4,60");
		lblR_1.setBounds(861, 345, 42, 14);
		contentPane.add(lblR_1);
		
		JLabel lblR_2 = new JLabel("R$ 1,00");
		lblR_2.setBounds(337, 345, 42, 14);
		contentPane.add(lblR_2);
		
		JLabel lblPaoParaHD = new JLabel("P\u00E3o para Hot Dog Pct");
		lblPaoParaHD.setBounds(550, 330, 154, 14);
		contentPane.add(lblPaoParaHD);
		
		JLabel lblR_3 = new JLabel("R$ 5,20");
		lblR_3.setBounds(578, 345, 42, 14);
		contentPane.add(lblR_3);
		
		JLabel lblTortaDeMorango = new JLabel("Torta de Morango Kg");
		lblTortaDeMorango.setBounds(313, 513, 159, 14);
		contentPane.add(lblTortaDeMorango);
		
		JLabel lblR_4 = new JLabel("R$ 28,00");
		lblR_4.setBounds(339, 527, 50, 14);
		contentPane.add(lblR_4);
		
		JLabel lblR_5 = new JLabel("R$ 42,00");
		lblR_5.setBounds(127, 527, 50, 14);
		contentPane.add(lblR_5);
		
		JLabel lblTortaFlorestaNegra = new JLabel("Torta Floresta Negra Kg");
		lblTortaFlorestaNegra.setBounds(89, 513, 170, 14);
		contentPane.add(lblTortaFlorestaNegra);
		
		JLabel lblR_6 = new JLabel("R$ 2,70");
		lblR_6.setBounds(570, 527, 42, 14);
		contentPane.add(lblR_6);
		
		JLabel lblTortinhaUnd = new JLabel("Tortinha Und");
		lblTortinhaUnd.setBounds(560, 513, 121, 14);
		contentPane.add(lblTortinhaUnd);
		
		JLabel lblR_7 = new JLabel("R$ 11,00");
		lblR_7.setBounds(861, 527, 49, 14);
		contentPane.add(lblR_7);
		
		JLabel lblBoloTradicionalKg = new JLabel("Bolo Tradicional Kg");
		lblBoloTradicionalKg.setBounds(841, 514, 129, 14);
		contentPane.add(lblBoloTradicionalKg);
		
		JLabel lblR_8 = new JLabel("R$ 2,50");
		lblR_8.setBounds(129, 700, 42, 14);
		contentPane.add(lblR_8);
		
		JLabel lblPastelUnd = new JLabel("Pastel Und");
		lblPastelUnd.setBounds(124, 688, 72, 14);
		contentPane.add(lblPastelUnd);
		
		JLabel lblR_9 = new JLabel("R$ 0,70");
		lblR_9.setBounds(337, 700, 42, 14);
		contentPane.add(lblR_9);
		
		JLabel lblBolinhoBacalhau = new JLabel("Bolinho de Bacalhau Und");
		lblBolinhoBacalhau.setBounds(298, 688, 174, 14);
		contentPane.add(lblBolinhoBacalhau);
		
		JLabel lblR_10 = new JLabel("R$ 3,00");
		lblR_10.setBounds(578, 700, 42, 14);
		contentPane.add(lblR_10);
		
		JLabel lblCoxinhaUnd = new JLabel("Coxinha Und");
		lblCoxinhaUnd.setBounds(563, 688, 118, 14);
		contentPane.add(lblCoxinhaUnd);
		
		JLabel lblR_11 = new JLabel("R$ 2,40");
		lblR_11.setBounds(866, 700, 42, 14);
		contentPane.add(lblR_11);
		
		JLabel lblEmpadinhaUnd = new JLabel("Empadinha Und");
		lblEmpadinhaUnd.setBounds(846, 688, 124, 14);
		contentPane.add(lblEmpadinhaUnd);
		
		JLabel lblBackGround = new JLabel("R$ 28,00");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	
	}
}
