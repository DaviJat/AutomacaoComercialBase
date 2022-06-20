package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ClienteController;
import model.Cliente;

public class ClienteView {
	
public static void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
	
		System.out.println("Gerenciamento de Clientes");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Lista");
		
		System.out.println("Selecione uma opção: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			ClienteController.cadastro();
			break;
		case "2":
			ClienteController.edicao();
			break;
		case "3":
			ClienteController.excluir();
			break;
		case "4":
			ClienteController.listar();
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
		System.out.println("Nome do Cliente: ");
		String nome = entradaCadastro.nextLine();
		
		System.out.println("CPF: ");
		String cpf = entradaCadastro.nextLine();
		
		System.out.println("Email: ");
		String email = entradaCadastro.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = entradaCadastro.nextLine();
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(cpf);
		dadosCadastro.add(email);
		dadosCadastro.add(telefone);

		
		return dadosCadastro; 
	}
	
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";
		
		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		String codigo = Cliente.validaCliente();
		
		System.out.println("1 - Nome do Cliente");
		System.out.println("2 - CPF do Cliente");
		System.out.println("3 - Email do Cliente");
		System.out.println("4 - Telefone do Cliente");
		System.out.println("Opção para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Novo Nome do Cliente: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "2":
			System.out.println("Novo CPF do Cliente: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "3":
			System.out.println("Novo Email do Cliente: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "4":
			System.out.println("Novo Telefone do Cliente: ");
			
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
		
		System.out.println("===== Excluir ====");
		
		String codigo = Cliente.validaCliente();
		
		return codigo;
	}
	
	public static void listar() {
		System.out.println("=============== Lista Clientes ===============");
	}

}
