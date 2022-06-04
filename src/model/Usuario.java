/***
Autor: Davi Jatob� Galdino
Componente Curricular: MI - Programa��o II
Concluido em: 20/06/2022
Declaro que este c�digo foi elaborado por mim de forma individual e n�o cont�m nenhum
trecho de c�digo de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e p�ginas ou documentos eletr�nicos da Internet. Qualquer trecho de c�digo
de outra autoria que n�o a minha est� destacado com uma cita��o para o autor e a fonte
do c�digo, e estou ciente que estes trechos n�o ser�o considerados para fins de avalia��o.
**/

package model;

/**
 * Classe para instanciar objetos do tipo Usuario, e realizar as fun��es de
 * gerenciamento desse objeto
 * @author Davi
 *
 */
public class Usuario {
	
	/** 
	 * Atributos da classe Usu�rio
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
