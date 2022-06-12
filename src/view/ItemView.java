package view;

import java.util.ArrayList;
import java.util.Scanner;

import base.Geral;
import model.Produto;

public class ItemView {
	
	public static void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
	
		System.out.println("Gerenciamento de Itens do Card�pio");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Ver card�pio");
		
		System.out.println("Selecione uma op��o: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			//ItemController.cadastro();
			break;
		case "2":
			//ItemController.edicao();
			break;
		case "3":
			//ItemController.excluir();
			break;
		case "4":
			//ItemController.listar();
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
	}
	
	public static ArrayList<String> menuCadastro() {
			
		@SuppressWarnings("resource")
		Scanner entradaCadastro = new Scanner(System.in);
		
		System.out.println("======= Cadastrar ======");
		System.out.println("Nome do Item: ");
		String nome = entradaCadastro.nextLine();
		
		String mensagem = "Pre�o do Item: ";
		String preco = Double.toString(Geral.validaDouble(mensagem));
		
		System.out.println("Descri��o: ");
		String descricao = entradaCadastro.nextLine();

		System.out.println("Categoria: ");
		String categoria = entradaCadastro.nextLine();
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(preco);
		dadosCadastro.add(descricao);
		dadosCadastro.add(categoria);
		
		return dadosCadastro; 
		
	}
	
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";

		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		System.out.println("C�digo do Item: ");
		String codigo = entradaEdicao.nextLine();
		
		System.out.println("1 - Nome do Item");
		System.out.println("2 - Pre�o do Item");
		System.out.println("3 - Descri��o do Item");
		System.out.println("4 - Categoria do Item");
		System.out.println("Op��o para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Novo nome do Item: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "2":
			System.out.println("Novo Pre�o do Item: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "3":
			System.out.println("Novo Descri��o do Item: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "4":
			System.out.println("Nova Categoria do Item: ");
			
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
		System.out.println("C�digo do Item:");
		
		String codigo = entradaExclusao.nextLine();
		
		return codigo;
	}
	
	public static void listar() {
		System.out.println("======================== Card�pio ========================");
	}
	
	@SuppressWarnings("rawtypes")
	public static ArrayList<ArrayList> geraListaProdutos() {
		
		String opcao = "1";
		
		ArrayList<ArrayList> lista = new ArrayList<ArrayList>();
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<String> quantidades = new ArrayList<String>();
		
		do {
			
			boolean validator = true;
			
			String codigoProduto;
			String quantidadeProduto;
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("== Adicionar produto ao Item ==");
				
			try {
				
				System.out.println("C�digo do produto:");
				
				codigoProduto = entrada.nextLine();
				
				int i = Produto.buscaProduto(codigoProduto);
				produtos.add(Produto.getProduto(i));
				
			} catch (Exception e) {                  
				System.out.println("Produto n�o cadastrado.");
				validator = false;
			} 
			
			if (validator == true) {
				
				System.out.println("Quantidade do produto (em gramas):");
				
				quantidadeProduto = entrada.nextLine();
				quantidades.add(quantidadeProduto);
			
				System.out.println("Deseja adicionar mais um produto?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				
				System.out.println("Selecione uma op��o: ");
				
				opcao = entrada.nextLine();
			}
			
			
		} while(!opcao.equals("2"));
	
		lista.add(produtos);
		lista.add(quantidades);
		return lista;
	}
}


