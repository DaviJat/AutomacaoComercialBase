package view;

import java.util.ArrayList;

public abstract class AbstractView {
	
	/**
	 * View com o Menu Principal do Gerenciamento Selecionado
	 */
	public abstract void menuPrincipal();
	
	/**
	 * View com o menu de Cadastro, retornando uma Lista com os dados inseridos pelo Usu�rio	
	 * @return
	 */
	public abstract ArrayList<String> menuCadastro();
	
	/**
	 * Tela com o menu de Edi��o, retornando uma lista com a refer�ncia do campo a ser editado
	 * e o novo valor que ir� substitui-lo 
	 * @return
	 */
	public abstract ArrayList<String> menuEdicao();
	
	/**
	 * View com o menu de Exclus�o, retornando c�digo do elemento a ser exclu�do
	 * @return
	 */
	public abstract String menuExcluir();
	
	/**
	 * View para listagem dos elementos cadastrados
	 * @return
	 */
	public abstract void listar();

}
