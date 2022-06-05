package view;

import java.util.ArrayList;

public abstract class AbstractView {
	
	public abstract void menuPrincipal();
	
	public abstract ArrayList<String> menuCadastro();
	
	public abstract ArrayList<String> menuEdicao();
	
	public abstract String menuExcluir();
	
	public abstract void listar();

}
