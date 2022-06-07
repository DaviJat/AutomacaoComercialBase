package controller;

import java.util.ArrayList;

import model.Fornecedor;
import view.FornecedorView;

public class FornecedorController {
	
static int contadorCodigo = 0;
	
	public static void geraCodigo() {
		contadorCodigo ++;
	}
	
	public static void menuPrincipal() {
		FornecedorView.menuPrincipal();
	}
	
	public static void cadastro() {
			
		ArrayList<String> dadosCadastro = new ArrayList<String>();
		
		dadosCadastro = FornecedorView.menuCadastro();
		
		geraCodigo();
		
		String codigo = Integer.toString(contadorCodigo);
		String nome = dadosCadastro.get(0);
		String cnpj = dadosCadastro.get(1);
		String endereco = dadosCadastro.get(2);
		
		Fornecedor novoFornecedor = new Fornecedor(codigo, nome, cnpj, endereco);
		Fornecedor.cadastrar(novoFornecedor);
		
	};

	public static void edicao() {
		
		ArrayList<String> dadosEdicao = new ArrayList<String>();
		
		dadosEdicao = FornecedorView.menuEdicao();
		
		String codigo = dadosEdicao.get(0);
		String opcao = dadosEdicao.get(1);
		String valor = dadosEdicao.get(2);
		
		switch (opcao) {
		case "1":
			Fornecedor.editarNome(codigo, valor);
			break;
		case "2":
			Fornecedor.editarCnpj(codigo, valor);
			break;
		case "3":
			Fornecedor.editarEndereco(codigo, valor);
			break;
		}
		
	};
	
	public static void excluir() {
		
		String codigo = FornecedorView.menuExcluir();
		Fornecedor.excluir(codigo);
		
	};
	
	public static void listar() {
		FornecedorView.listar();
		Fornecedor.listar();
	};

}
