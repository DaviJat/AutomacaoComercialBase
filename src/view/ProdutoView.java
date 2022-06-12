package view;

import java.util.ArrayList;
import java.util.Scanner;

import base.Geral;
import controller.ProdutoController;
import model.Fornecedor;
import model.Produto;

public class ProdutoView {
	
static int contadorCodigo = 0;
	
	public static void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
	
		System.out.println("Gerenciamento de Produtos");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Lista");
		
		System.out.println("Selecione uma opção: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			ProdutoController.cadastro();
			break;
		case "2":
			ProdutoController.edicao();
			break;
		case "3":
			ProdutoController.excluir();
			break;
		case "4":
			ProdutoController.listar();
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
		System.out.println("Nome do Produto: ");
		String nome = entradaCadastro.nextLine();
		
		System.out.println("Preço do Produto: ");
		String preco = Double.toString(Geral.validaDouble());
		
		System.out.println("Data de Validade do Produto");
		String validade = Geral.validaData();
		
		System.out.println("Quantidade para armazenar no estoque (em gramas): ");
		String estoque = Double.toString(Geral.validaDouble());
		
		
		String codigoFornecedor = Fornecedor.validaFornecedor();
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(preco);
		dadosCadastro.add(validade);
		dadosCadastro.add(estoque);
		dadosCadastro.add(codigoFornecedor);
		
		return dadosCadastro; 
	}
	
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";

		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		String codigo = Produto.validaProduto();
		
		System.out.println("1 - Nome do Produto");
		System.out.println("2 - Preço do Produto");
		System.out.println("3 - Validade do Produto");
		System.out.println("4 - Estoque do Produto");
		System.out.println("5 - Fornecedor do Produto");
		System.out.println("Opção para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Novo Nome do Produto: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "2":
			System.out.println("Novo Preço do Produto: ");
			
			novoValor = Double.toString(Geral.validaDouble());
			break;
		case "3":
			System.out.println("Nova Validade do Produto");

			novoValor = Geral.validaData();
			break;
		case "4":
			System.out.println("Novo Valor do Estoque");

			novoValor = Double.toString(Geral.validaDouble());
			break;
		case "5":
			System.out.println("Código do novo Fornecedor");
			
			novoValor = Fornecedor.validaFornecedor();
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
		
		String codigo = Produto.validaProduto();
		
		return codigo;
	}
	
	public static void listar() {
		System.out.println("======================== Lista Produtos ========================");
	}

}
