package Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Cliente extends Usuario {
	
	String emailSql;


	public static Produto pesquisarProduto(int id) {
		return null;
		
	}

	public boolean entrarSistema(String email, String senha) {
		String sql = "SELECT * FROM mercadondb.usuario Where email= '" + email + "' AND senha= '" + senha + "'";
		ConexaoDB conexao = new ConexaoDB();
		conexao.getConnection();
		try {
			PreparedStatement stm = conexao.conn.prepareStatement(sql);			
			
			ResultSet rs = stm.executeQuery(); //fazer receber o resultado. Ver como fazer isso.
			
			while (rs.next()) {
				emailSql = rs.getString(3);
			}
			
			stm.close();
			conexao.closeConnection();
			
			if (emailSql != null) 
				return true;
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			conexao.closeConnection();
			return false;
		}	
	}

	public void sairSistema() {
		
	}

	public boolean cadastrarUsuario(String nome, String email, String senha, String cpf, String dataDeNascimento, String sexo,
			 String fone, String celular, String identidade, String logradouro, String complemento,
			 String bairro, String cidade, String uf, String cep) {
		String sql = "INSERT INTO usuario (nome, email, senha, cpf, dataNascimento, sexo, fone, celular, " +
				"identidade, logradouro, complemento, bairro, cidade, uf, cep) " +
				"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		ConexaoDB conexao = new ConexaoDB();
		conexao.getConnection();
		try {
			PreparedStatement stm = conexao.conn.prepareStatement(sql);
			
			stm.setString(1, nome);
			stm.setString(2, email);
			stm.setString(3, senha);
			stm.setString(4, cpf);
			stm.setString(5, dataDeNascimento);
			stm.setString(6, sexo);
			stm.setString(7, fone);
			stm.setString(8, celular);
			stm.setString(9, identidade);
			stm.setString(10, logradouro);
			stm.setString(11, complemento);
			stm.setString(12, bairro);
			stm.setString(13, cidade);
			stm.setString(14, uf);
			stm.setString(15, cep);
			
			
			stm.executeUpdate();
			
			stm.close();
			conexao.closeConnection();
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			conexao.closeConnection();
			return false;
		}
		
	}

	public boolean alterarCadastro() {
		return false;
	}

	public boolean deletarCadastro() {
		return false;
	}
	
	public Produto pesquisarProduto(){
		return null;
	}
	
	public void historicoCompra() {
		
	}
}
