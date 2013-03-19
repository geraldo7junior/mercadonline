package Main;

public abstract class Usuario {
	private String nome;
	private String senha;
	private String email;
	private String dataNascimento;
	private String sexo;
	private String foto;
	private String cpf;
	private String login;
	private String identidade;
	private String fone;
	private String tipo;
	private String endereço;

	public abstract boolean entrarSistema(String email, String Senha);

	public abstract void sairSistema();

	public abstract boolean cadastrarUsuario(String nome, String email, String senha, String cpf, String dataDeNascimento, String sexo,
			 String fone, String celular, String identidade, String logradouro, String complemento,
			 String bairro, String cidade, String uf, String cep);

	public abstract boolean alterarCadastro();

	public abstract boolean deletarCadastro();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
