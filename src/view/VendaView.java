package view;

import java.util.ArrayList;
import java.util.Scanner;

import base.Geral;
import controller.VendaController;
import model.Item;
import model.Produto;
import model.Venda;

public class VendaView {
	
	public static void menuPrincipal() {
		
		@SuppressWarnings("resource")
		Scanner entradaMenu = new Scanner(System.in);
		
		System.out.println("Registrar Venda");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Lista");
		
		System.out.println("Selecione uma opção: ");
		
		String opcaoMenu = entradaMenu.nextLine();
		
		switch (opcaoMenu) {
		case "1":
			VendaController.cadastro();
			break;
		case "2":
			VendaController.edicao();
			break;
		case "3":
			VendaController.excluir();
			break;
		case "4":
			VendaController.listar();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	public static ArrayList<String> menuCadastro() {
		
		@SuppressWarnings("resource")
		Scanner entradaCadastro = new Scanner(System.in);
		
		System.out.println("======= Registrar ======");
		
		System.out.println("Data da Venda: ");
		String data = Geral.validaData();
		
		System.out.println("Hora da Venda: ");
		String hora = Geral.validaHora();
		
		System.out.println("Forma de pagamento da venda: ");
		String formaPagamento = entradaCadastro.nextLine();
		
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro.add(data);
		dadosCadastro.add(hora);
		dadosCadastro.add(formaPagamento);
		
		return dadosCadastro; 
	}
	
	public static ArrayList<String> menuEdicao() {
		
		String novoValor = "";

		@SuppressWarnings("resource")
		Scanner entradaEdicao = new Scanner(System.in);
		
		System.out.println("===== Editar =====");
		System.out.println("Código da Venda: ");
		String codigo = entradaEdicao.nextLine();
		
		System.out.println("1 - Data da Venda");
		System.out.println("2 - Hora da Venda");
		System.out.println("3 - Preço Total da Venda");
		System.out.println("4 - Forma de Pagamento");
		System.out.println("Opção para editar: ");
		String opcao = entradaEdicao.nextLine();
		
		switch (opcao) {
		case "1":
			System.out.println("Nova data da Venda: ");
			
			novoValor = Geral.validaData();
			break;
		case "2":
			System.out.println("Nova hora da Venda");
			
			novoValor = Geral.validaHora();
			break;
		case "3":
			System.out.println("Novo Preço Total da Venda: ");
			
			novoValor = Double.toString(Geral.validaDouble());
			break;
		case "4":
			System.out.println("Nova Forma de Pagamento: ");
			
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
		
		String codigo = Venda.validaVenda();
		
		return codigo;
	}
		
	public static void listar() {
		System.out.println("======================== Lista Vendas ========================");
	}
	
	public static ArrayList<String> geraListaItens() {
		
		String opcao = "1";
		
		ArrayList<String> listaItens = new ArrayList<String>();
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		ArrayList<String> listaQuantidades = new ArrayList<String>();
		
		do {
			
			boolean validator = true;
			
			String codigoItem = null;
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("== Adicionar item a Venda ==");
					
			try {
				
				System.out.println("Código do item:");
				
				codigoItem = entrada.nextLine();
				
				listaProdutos = Item.retornaListaProdutos(codigoItem);
				listaQuantidades = Item.retornaListaQuantidades(codigoItem);
				
				if (listaProdutos == null) {
					System.out.println("Item não cadastrado.");
					validator = false;
				}
								
			} catch (Exception e) {                 
				System.out.println("Item não cadastrado.");
				validator = false;
			}
			
			if (validator == true) {
				
				listaItens.add(codigoItem);
				
				int indice = 0; 
				
				for(Produto produto : listaProdutos){
					
					String quantidadeString =  Item.retornaQuantidadeProduto(indice, listaQuantidades);
					
					double quantidade = Double.parseDouble(quantidadeString);
					
					Produto.removerEstoque(produto, quantidade);
					indice ++;
				}
				
				System.out.println("Deseja adicionar mais um item?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				
				System.out.println("Selecione uma opção: ");
				
				opcao = entrada.nextLine();
			}
			
		} while(!opcao.equals("2"));
		
		return listaItens;
	}
}
