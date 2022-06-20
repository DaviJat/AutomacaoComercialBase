package controller;

import java.util.ArrayList;

import model.Item;
import model.Venda;
import view.VendaView;

public class VendaController {
	
	static int contadorCodigo = 0;
	
	public static void geraCodigo() {
		contadorCodigo ++;
	}
	
	public static void menuPrincipal() {
		VendaView.menuPrincipal();
	}
	
	public static void cadastro() {
		
		ArrayList<Item> listaItens = Item.getListaItem();
		
		if (listaItens.isEmpty()) {
			
			System.out.println("Ainda não existem Itens cadastrados no cardápio");
			
		} else {
		
			ArrayList<String> dadosCadastro = new ArrayList<String>();
			ArrayList<String> itensCadastro = new ArrayList<String>();
			
			dadosCadastro = VendaView.menuCadastro();
			
			geraCodigo();
			
			String codigo = Integer.toString(contadorCodigo);
			String data = dadosCadastro.get(0);
			String hora = dadosCadastro.get(1);
			String formaPagamento = dadosCadastro.get(2);
			String codigoCliente = dadosCadastro.get(3);
			
			itensCadastro = VendaView.geraListaItens();
			
			double precoTotal = calculaPrecoTotal(itensCadastro);
			
			Venda novaVenda = new Venda(codigo, data, hora, precoTotal, formaPagamento, codigoCliente, itensCadastro);
			Venda.registrar(novaVenda);
		
		}
		
	}
	
	public static double calculaPrecoTotal(ArrayList<String> listaItens) {
		
		double precoTotal = 0.0;
		
		for(String codigo : listaItens) {
			precoTotal += Item.retornaPrecoItem(codigo);
		}
		return precoTotal;
	}
	
	public static void edicao() {

		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao = VendaView.menuEdicao();
		
		String codigo = dadosEdicao.get(0);
		String opcao = dadosEdicao.get(1);
		String valor = dadosEdicao.get(2);
		
		switch (opcao) {
		case "1":
			Venda.editarData(codigo, valor);
			break;
		case "2":
			Venda.editarHora(codigo, valor);
			break;
		case "3":
			Venda.editarPrecoTotal(codigo, valor);
			break;
		case "4":
			Venda.editarFormaPagamento(codigo, valor);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
public static void excluir() {
		
		String codigo = VendaView.menuExcluir();
		Venda.excluir(codigo);
	}
	
	public static void listar() {
		VendaView.listar();
		Venda.listar();
	}

}
