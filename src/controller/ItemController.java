package controller;

import java.util.ArrayList;

import model.Item;
import model.Produto;
import view.ItemView;
public class ItemController {
	
	static int contadorCodigo = 0;
	
	public static void geraCodigo() {
		contadorCodigo ++;
	}
	
	public static void menuPrincipal() {
		ItemView.menuPrincipal();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void cadastro() {
			
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		ArrayList<Produto> produtosCadastro = new ArrayList<Produto>();
		ArrayList<String> quantidadesCadastro = new ArrayList<String>();
		
		dadosCadastro = ItemView.menuCadastro();
		
		geraCodigo();
		
		String codigo = Integer.toString(contadorCodigo);
		String nome = dadosCadastro.get(0);
		double preco = Double.parseDouble(dadosCadastro.get(1));
		String descricao = dadosCadastro.get(2);
		String categoria = dadosCadastro.get(3);
		
		ArrayList<ArrayList> listaProdutoQuantidade = ItemView.geraListaProdutos();
		produtosCadastro = listaProdutoQuantidade.get(0);
		quantidadesCadastro = listaProdutoQuantidade.get(1);
		
		Item novoItem = new Item(codigo, nome, preco, descricao, categoria, produtosCadastro, quantidadesCadastro);
		Item.cadastrar(novoItem);
		
	}
	
	public static void edicao() {

		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao = ItemView.menuEdicao();
		
		String codigo = dadosEdicao.get(0);
		String opcao = dadosEdicao.get(1);
		String valor = dadosEdicao.get(2);
		
		switch (opcao) {
		case "1":
			Item.editarNome(codigo, valor);
			break;
		case "2":
			Item.editarPreco(codigo, valor);
			break;
		case "3":
			Item.editarDescricao(codigo, valor);
			break;
		case "4":
			Item.editarCategoria(codigo, valor);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	public static void excluir() {
		
		String codigo = ItemView.menuExcluir();
		Item.excluir(codigo);
	}
	
	public static void listar() {
		ItemView.listar();
		Item.listar();
	}
}
