package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.FornecedorController;


public class FornecedorView {
	
	public static void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
	
		System.out.println("Gerenciamento de Fornecedores");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Lista");
		
		System.out.println("Selecione uma opção: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			FornecedorController.cadastro();
			break;
		case "2":
			FornecedorController.edicao();
			break;
		case "3":
			FornecedorController.excluir();
			break;
		case "4":
			FornecedorController.listar();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	public static ArrayList<String> menuCadastro() {
		
		@SuppressWarnings("resource")
		Scanner entradaCadastro = new Scanner(System.in);
		
		System.out.println("======= Cadastrar ======");
		System.out.println("Nome do Fornecedor: ");
		String nome = entradaCadastro.nextLine();
		
		System.out.println("CNPJ: ");
		String cnpj = entradaCadastro.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = entradaCadastro.nextLine();
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(cnpj);
		dadosCadastro.add(endereco);
		
		
		return dadosCadastro; 
	}
	
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";
		
		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		System.out.println("Código do Fornecedor: ");
		String codigo = entradaEdicao.nextLine();
		
		System.out.println("1 - Nome do Fornecedor");
		System.out.println("2 - CNPJ do Fornecedor");
		System.out.println("3 - Endereço do Fornecedor");
		System.out.println("Opção para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Novo Nome do Fornecedor: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "2":
			System.out.println("Novo CNPJ do Fornecedor: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "3":
			System.out.println("Novo Endereço do Fornecedor: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		default:
			System.out.println("Opção inválida");
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
		System.out.println("Código do Fornecedor:");
		
		String codigo = entradaExclusao.nextLine();
		
		return codigo;
	}
	
	public static void listar() {
		System.out.println("=============== Lista Fornecedores ===============");
	}

}
