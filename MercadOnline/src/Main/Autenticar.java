package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Autenticar {

	public Autenticar(String login, String senha) {
		String sql = " ";
		ConexaoDB conexao = new ConexaoDB();
		conexao.getConnection();
		try {
			Statement stm = conexao.conn.createStatement();
			
			ResultSet resultado = stm.executeQuery(sql);
			resultado.getArray(0);   // <<<Revisar
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
