package model;

/**
 * Classe para instanciar objetos do tipo Usuario, e realizar as funções de
 * gerenciamento desse objeto
 * @author Davi
 *
 */
public class Usuario {
	
	/** 
	 * Atributos da classe Usuário
	 */
	private String codigo;
	private String nome;
	private String senha;
	private boolean gerente;
	
	/**
	 * Construtor do objeto da Classe Usuario
	 * @param codigo
	 * @param nome
	 * @param gerente
	 */
	public Usuario(String codigo, String nome, String senha, boolean gerente) {
		setCodigo(codigo);
		setNome(nome);
		setSenha(senha);
		setGerente(gerente);
	}
	
	/**
	 * Getter que retorna o codigo
	 * @return codigo
	 */
	public String getCodigo() {
		return this.codigo;
	}
	
	/** 
	 * Setter do codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Getter que retorna o nome
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Setter do nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Getter que retorna a senha
	 * @return senha
	 */
	public String getSenha() {
		return this.senha;
	}
	
	/**
	 * Setter da senha
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * Getter do gerente
	 * @return gerente
	 */
	public boolean getGerente() {
		return this.gerente;
	}
	
	/**
	 * Setter gerente
	 * @param gerente
	 */
	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}

}
