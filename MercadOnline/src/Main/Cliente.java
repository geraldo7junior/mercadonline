package Main;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente extends Usuario {

	public static Produto pesquisarProduto(int id) {
		return null;
		
	}

	public void entrarSistema() {
		
	}

	public void sairSistema() {
		
	}

	public boolean cadastrarUsuario(String nome, String email, String senha, String cpf, String dataDeNascimento, String sexo,
			 String fone, String identidade, String logradouro, String complemento, String bairro, String cidade, String uf) {
		String sql = "INSERT INTO usuario (nome, email, senha, cpf, dataNascimento, sexo, fone, " +
				"identidade, logradouro, complemento, bairro, cidade, uf) " +
				"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
			stm.setString(8, identidade);
			stm.setString(9, logradouro);
			stm.setString(10, complemento);
			stm.setString(11, bairro);
			stm.setString(12, cidade);
			stm.setString(13, uf);
			
			
			stm.executeUpdate();
			
			stm.close();
			conexao.closeConnection();
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
