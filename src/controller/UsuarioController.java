package controller;

import java.util.ArrayList;

import view.UsuarioView;

public class UsuarioController extends AbstractController{
	
	public void cadastro() {
			
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro = UsuarioView.menuCadastro();
		
		System.out.println(dadosCadastro);
		
	};

	public void edicao() {};
	
	public void excluir() {};
	
	public void listar() {};

}
