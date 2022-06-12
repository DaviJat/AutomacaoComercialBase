package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.UsuarioController;
import model.Usuario;

public class UsuarioView{
	
	public static void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
	
		System.out.println("Gerenciamento de Usu�rios");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Lista");
		
		System.out.println("Selecione uma op��o: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			UsuarioController.cadastro();
			break;
		case "2":
			UsuarioController.edicao();
			break;
		case "3":
			UsuarioController.excluir();
			break;
		case "4":
			UsuarioController.listar();
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
	}
	
	public static ArrayList<String> menuCadastro() {
		
		String gerente = "false";
		
		@SuppressWarnings("resource")
		Scanner entradaCadastro = new Scanner(System.in);
		
		System.out.println("======= Cadastrar ======");
		System.out.println("Nome do Usu�rio: ");
		String nome = entradaCadastro.nextLine();
		
		System.out.println("Senha: ");
		String senha = entradaCadastro.nextLine();
		
		System.out.println("1 - Gerente");
		System.out.println("2 - Funcion�rio");
		System.out.println("Cargo do Usu�rio: ");
		String opcao = entradaCadastro.nextLine();
		
		switch (opcao) {
		case "1":
			gerente = "true";
			break;
		case "2":
			gerente = "false";
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(senha);
		dadosCadastro.add(gerente);
		
		
		return dadosCadastro; 
	}
	
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";
		
		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		String codigo = Usuario.validaUsuario();
		
		System.out.println("1 - Nome do Usu�rio");
		System.out.println("2 - Cargo do Usu�rio");
		System.out.println("Op��o para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Novo Nome do Usu�rio: ");
			
			novoValor = entradaEdicao.nextLine();
			
			break;
		case "2":
			System.out.println("1 - Gerente");
			System.out.println("2 - Funcionario");
			System.out.println("Novo Cargo do Usu�rio: ");
			
			novoValor = entradaEdicao.nextLine();
			
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		
		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao.add(codigo);
		dadosEdicao.add(opcao);
		dadosEdicao.add(novoValor);
		
		return dadosEdicao; 
		
	}
	
	public static String menuExcluir() {
		
		@SuppressWarnings("resource")
		Scanner entradaExclusao = new Scanner(System.in);
		
		System.out.println("===== Excluir ====");
		System.out.println("C�digo do Usu�rio:");
		
		String codigo = entradaExclusao.nextLine();
		
		return codigo;
	}
	
	public static void listar() {
		System.out.println("======== Lista ========");
		System.out.println("C�digo / Nome / Gerente");
	}
}
