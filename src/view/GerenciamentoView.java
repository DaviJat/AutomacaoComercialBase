package view;

import java.util.Scanner;

import controller.LoginController;
import controller.UsuarioController;

public class GerenciamentoView {
	
	public static void menuPrincipal() {
		
		String opcao; 
		
		do {
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("Menu Gerenciamento");
			System.out.println("1 - Usu�rios");
			System.out.println("2 - Fornecedores");
			System.out.println("3 - Produtos");
			System.out.println("4 - Card�pio");
			System.out.println("5 - Vendas");
			System.out.println("6 - Relat�rios");
			System.out.println("7 - Sair");
			
			System.out.println("Selecione uma op��o: ");
			
			opcao = entrada.nextLine();
			
			switch (opcao) {
			case "1":
				UsuarioController.menuPrincipal();
				break;
			case "2":
				//FornecedorController.menu();
				break;
			case "3":
				//ProdutoController.menu();
				break;
			case "4":
				//ItemController.menu();
				break;
			case "5":
				//VendaController.menu();
				break;
			case "6":
				//RelatorioController.menu();
				break;
			case "7":
				LoginController.login();
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
			
		} while(!opcao.equals("7"));
		
	}

}
