package view;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioView extends AbstractView{
	
	public void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
	
		System.out.println("Gerenciamento de Usuários");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Lista");
		
		System.out.println("Selecione uma opção: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			menuCadastro();
			break;
		case "2":
			menuEdicao();
			break;
		case "3":
			menuExcluir();
			break;
		case "4":
			listar();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	public ArrayList<String> menuCadastro() {
		
		String gerente = "false";
		
		@SuppressWarnings("resource")
		Scanner entradaCadastro = new Scanner(System.in);
		
		System.out.println("======= Cadastrar ======");
		System.out.println("Nome do Usuário: ");
		String nome = entradaCadastro.nextLine();
		
		System.out.println("Senha: ");
		String senha = entradaCadastro.nextLine();
		
		System.out.println("1 - Gerente");
		System.out.println("2 - Funcionário");
		System.out.println("Cargo do Usuário: ");
		String opcao = entradaCadastro.nextLine();
		
		switch (opcao) {
		case "1":
			gerente = "true";
			break;
		case "2":
			gerente = "false";
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(senha);
		dadosCadastro.add(gerente);
		
		
		return dadosCadastro; 
	}
	
	public ArrayList<String> menuEdicao() {
		
		String novoValor = "";
		
		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		System.out.println("Código do Usuário: ");
		String codigoEditar = entradaEdicao.nextLine();
		
		System.out.println("1 - Nome do Usuário");
		System.out.println("2 - Cargo do Usuário");
		System.out.println("Opção para editar: ");
		String opcaoEditar = entradaEdicao.nextLine();
		
		switch (opcaoEditar) {
		case "1":
			System.out.println("Novo nome do Usuário: ");
			
			novoValor = entradaEdicao.nextLine();
			
			break;
		case "2":
			System.out.println("1 - Gerente");
			System.out.println("2 - Funcionario");
			System.out.println("Novo Cargo do Usuário: ");
			
			novoValor = entradaEdicao.nextLine();
			
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao.add(codigoEditar);
		dadosEdicao.add(opcaoEditar);
		dadosEdicao.add(novoValor);
		
		return dadosEdicao; 
		
	}
	
	public String menuExcluir() {
		
		@SuppressWarnings("resource")
		Scanner entradaExclusao = new Scanner(System.in);
		
		System.out.println("===== Excluir ====");
		System.out.println("Código do Usuário:");
		
		String codigo = entradaExclusao.nextLine();
		
		return codigo;
	}
	
	public void listar() {
		System.out.println("======== Lista ========");
		System.out.println("Código / Nome / Gerente");
	}
}
