package view;

import java.util.ArrayList;
import java.util.Scanner;

import base.Geral;
import controller.ProdutoController;
import model.Fornecedor;

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
		
		System.out.println("Selecione uma op��o: ");
		
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
			System.out.println("Op��o inv�lida");
			break;
		}
	}
	
	public static ArrayList<String> menuCadastro() {
		
		@SuppressWarnings("resource")
		Scanner entradaCadastro = new Scanner(System.in);
		
		System.out.println("======= Cadastrar ======");
		System.out.println("Nome do Produto: ");
		String nome = entradaCadastro.nextLine();
		
		String mensagem = "Pre�o do Produto: ";
		String preco = Double.toString(Geral.validaDouble(mensagem));
		
		System.out.println("Data de Validade do Produto");
		String validade = Geral.validaData();
		
		mensagem = "Quantidade para armazenar no estoque (em gramas): ";
		String estoque = Double.toString(Geral.validaDouble(mensagem));
		
		
		String codigoFornecedor = Fornecedor.validaFornecedor();
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(nome);
		dadosCadastro.add(preco);
		dadosCadastro.add(validade);
		dadosCadastro.add(estoque);
		dadosCadastro.add(codigoFornecedor);
		
		return dadosCadastro; 
	}
	
	/**
	 * Recebe os valores para ser feita a edi��o e manda como par�metro 
	 * para a fun��o de edi��o, da classe Produto
	 * @return 
	 */
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";

		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		System.out.println("C�digo do Produto: ");
		String codigo = entradaEdicao.nextLine();
		
		System.out.println("1 - Nome do Produto");
		System.out.println("2 - Pre�o do Produto");
		System.out.println("3 - Validade do Produto");
		System.out.println("4 - Estoque do Produto");
		System.out.println("5 - Fornecedor do Produto");
		System.out.println("Op��o para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Novo Nome do Produto: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "2":
			System.out.println("Novo Pre�o do Produto: ");
			
			novoValor = entradaEdicao.nextLine();
			break;
		case "3":
			System.out.println("Nova Validade do Produto");

			novoValor = entradaEdicao.nextLine();
			break;
		case "4":
			System.out.println("Novo Valor do Estoque");

			novoValor = entradaEdicao.nextLine();
			break;
		case "5":
			System.out.println("C�digo do novo Fornecedor");
			
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
	
	/**
	 * Recebe o c�digo do objeto a ser excluido e envia como par�metro 
	 * para a fun��o de exclus�o, da classe Produto
	 * @return 
	 */
	public static String menuExcluir() {
		
		@SuppressWarnings("resource")
		Scanner entradaExclusao = new Scanner(System.in);
		
		System.out.println("===== Excluir ====");
		System.out.println("C�digo do Produto:");
		
		String codigo = entradaExclusao.nextLine();
		
		return codigo;
	}
	
	/**
	 * Executa a fun��o de listagem, da classe Produto
	 */
	public static void listar() {
		System.out.println("======================== Lista Produtos ========================");
	}

}
