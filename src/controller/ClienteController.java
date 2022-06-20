package controller;

import java.util.ArrayList;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	
static int contadorCodigo = 1;
	
	public static void geraCodigo() {
		contadorCodigo ++;
	}
	
	public static void menuPrincipal() {
		ClienteView.menuPrincipal();
	}
	
	public static void cadastro() {
			
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro = ClienteView.menuCadastro();
		
		geraCodigo();
		
		String codigo = Integer.toString(contadorCodigo);
		String nome = dadosCadastro.get(0);
		String cpf = dadosCadastro.get(1);
		String endereco = dadosCadastro.get(2);
		String telefone = dadosCadastro.get(3);
		
		Cliente novoCliente = new Cliente(codigo, nome, cpf, endereco, telefone);
		Cliente.cadastrar(novoCliente);
		
	};

	public static void edicao() {
		
		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao = ClienteView.menuEdicao();
		
		String codigo = dadosEdicao.get(0);
		String opcao = dadosEdicao.get(1);
		String valor = dadosEdicao.get(2);
		
		switch (opcao) {
		case "1":
			Cliente.editarNome(codigo, valor);
			break;
		case "2":
			Cliente.editarCpf(codigo, valor);
			break;
		case "3":
			Cliente.editarEmail(codigo, valor);
			break;
		case "4":
			Cliente.editarEmail(codigo, valor);
			break;
		}
		
	};
	
	public static void excluir() {
		
		String codigo = ClienteView.menuExcluir();
		Cliente.excluir(codigo);
		
	};
	
	public static void listar() {
		ClienteView.listar();
		Cliente.listar();
	};

}
