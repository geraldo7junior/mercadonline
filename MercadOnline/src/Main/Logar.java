package Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Logar {
		
	public Logar(String login, String senha){
	try {
		autenticar(login, senha);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	public Boolean autenticar(String login, String senha)throws SQLException{

		ConexaoDB conexao = new ConexaoDB();
		conexao.getConnection();
		
		String sql = "select email, senha from usuario where email ='"+login+"' and senha='"+senha+"' ";
		PreparedStatement stm = conexao.conn.prepareStatement(sql);


		try {
		ResultSet rs = stm.executeQuery(sql);
		
		System.out.println(rs.toString());	
		
		JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
		
		int ela = rs.getRow();
		
		System.out.println(ela);



		} catch (SQLException e) {
		e.printStackTrace();

		}
		return true;

			
		}
	}