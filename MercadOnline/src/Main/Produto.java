package Main;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Produto {
	private int idProduto;
	private String nome;
	private String categoria;
	private boolean promocao;
	private boolean sugerido;
	private Date validade;
	private String marca;
	private float peso;
	private double preco;
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	public boolean isSugerido() {
		return sugerido;
	}
	public void setSugerido(boolean sugerido) {
		this.sugerido = sugerido;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setInListaCompras(String produto, String valor){
		String sql = "INSERT INTO Produto (idProduto, Preco) " +
				"VALUES (?,?)";
		ConexaoDB conexao = new ConexaoDB();
		conexao.getConnection();
		try {
			PreparedStatement stm = conexao.conn.prepareStatement(sql);
			
			stm.setString(1, produto);
			stm.setString(2, valor);
						
			stm.executeUpdate();
			
			stm.close();
			conexao.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			conexao.closeConnection();
		}
		
	}
	
	
	
}
