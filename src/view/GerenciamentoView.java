package view;

import java.util.Scanner;

import controller.ClienteController;
import controller.FornecedorController;
import controller.ItemController;
import controller.LoginController;
import controller.ProdutoController;
import controller.UsuarioController;
import controller.VendaController;

public class GerenciamentoView {
	
	public static void menuPrincipal() {
		
		String opcao; 
		
		do {
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("Menu Gerenciamento");
			System.out.println("1 - Usuários");
			System.out.println("2 - Fornecedores");
			System.out.println("3 - Produtos");
			System.out.println("4 - Itens");
			System.out.println("5 - Vendas");
			System.out.println("5 - Clientes");
			System.out.println("6 - Relatórios");
			System.out.println("7 - Sair");
			
			System.out.println("Selecione uma opção: ");
			
			opcao = entrada.nextLine();
			
			switch (opcao) {
			case "1":
				UsuarioController.menuPrincipal();
				break;
			case "2":
				FornecedorController.menuPrincipal();
				break;
			case "3":
				ProdutoController.menuPrincipal();
				break;
			case "4":
				ItemController.menuPrincipal();
				break;
			case "5":
				VendaController.menuPrincipal();
				break;
			case "6":
				ClienteController.menuPrincipal();
				break;
			case "7":
				//RelatorioController.menu();
				break;
			case "8":
				LoginController.login();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		} while(!opcao.equals("7"));
		
	}

}
