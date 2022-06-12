package controller;

import java.util.ArrayList;

import model.Produto;
import view.ProdutoView;


public class ProdutoController {
	
	static int contadorCodigo = 0;
	
	public static void geraCodigo() {
		contadorCodigo ++;
	}
	
	public static void menuPrincipal() {
		ProdutoView.menuPrincipal();
	}
	
	public static void cadastro() {
			
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro = ProdutoView.menuCadastro();
		
		geraCodigo();
		
		String codigo = Integer.toString(contadorCodigo);
		String nome = dadosCadastro.get(0);
		double preco = Double.parseDouble(dadosCadastro.get(1));
		String validade = dadosCadastro.get(2);
		double estoque = Double.parseDouble(dadosCadastro.get(3));
		String codigoFornecedor = dadosCadastro.get(4);
		
		Produto novoProduto = new Produto(codigo, nome, preco, validade, estoque, codigoFornecedor);
		Produto.cadastrar(novoProduto);
		
	};
	
	public static void edicao() {
		
		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao = ProdutoView.menuEdicao();
		
		String codigo = dadosEdicao.get(0);
		String opcao = dadosEdicao.get(1);
		String valor = dadosEdicao.get(2);
		
		switch (opcao) {
		case "1":
			Produto.editarNome(codigo, valor);
			break;
		case "2":
			Produto.editarPreco(codigo, valor);
			break;
		case "3":
			Produto.editarValidade(codigo, valor);
			break;
		case "4":
			Produto.editarEstoque(codigo, valor);
			break;
		case "5":
			Produto.editarFornecedor(codigo, valor);
			break;
		}
		
	};
	
	public static void excluir() {
		
		String codigo = ProdutoView.menuExcluir();
		Produto.excluir(codigo);
	}
	
	public static void listar() {
		System.out.println("======================== Lista Produtos ========================");
		Produto.listar();
	}

}

