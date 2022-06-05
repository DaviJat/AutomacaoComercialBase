package view;

import java.util.ArrayList;

public abstract class AbstractView {
	
	/**
	 * View com o Menu Principal do Gerenciamento Selecionado
	 */
	public abstract void menuPrincipal();
	
	/**
	 * View com o menu de Cadastro, retornando uma Lista com os dados inseridos pelo Usuário	
	 * @return
	 */
	public abstract ArrayList<String> menuCadastro();
	
	/**
	 * Tela com o menu de Edição, retornando uma lista com a referência do campo a ser editado
	 * e o novo valor que irá substitui-lo 
	 * @return
	 */
	public abstract ArrayList<String> menuEdicao();
	
	/**
	 * View com o menu de Exclusão, retornando código do elemento a ser excluído
	 * @return
	 */
	public abstract String menuExcluir();
	
	/**
	 * View para listagem dos elementos cadastrados
	 * @return
	 */
	public abstract void listar();

}
