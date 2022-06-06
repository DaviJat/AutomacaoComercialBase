package controller;

import java.util.ArrayList;

import model.Usuario;
import view.UsuarioView;

public class UsuarioController{
	
	static int contadorCodigo = 1;
	
	public static void geraCodigo() {
		contadorCodigo ++;
	}
	
	public static void menuPrincipal() {
		UsuarioView.menuPrincipal();
	}
	
	public static void cadastro() {
		
		boolean gerente = false;
			
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro = UsuarioView.menuCadastro();
		
		geraCodigo();
		
		String codigo = Integer.toString(contadorCodigo);
		String nome = dadosCadastro.get(0);
		String senha = dadosCadastro.get(1);
		String gerenteString = dadosCadastro.get(2);
		
		if (gerenteString == "true"){
			gerente = true;
		}
		
		
		Usuario novoUsuario = new Usuario(codigo, nome, senha, gerente);
		Usuario.cadastrar(novoUsuario);
		
	};

	public static void edicao() {
		
		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao = UsuarioView.menuEdicao();
		
		String codigo = dadosEdicao.get(0);
		String opcao = dadosEdicao.get(1);
		String valor = dadosEdicao.get(2);
		
		switch (opcao) {
		case "1":
			Usuario.editarNome(codigo, valor);
			break;
		case "2":
			Usuario.editarCargo(codigo, valor);
			break;
		}
		
	};
	
	public static void excluir() {
		
		String codigo = UsuarioView.menuExcluir();
		Usuario.excluir(codigo);
		
	};
	
	public static void listar() {
		UsuarioView.listar();
		Usuario.listar();
	};

}
