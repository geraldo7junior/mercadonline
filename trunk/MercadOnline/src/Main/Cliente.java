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
