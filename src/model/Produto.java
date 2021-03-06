package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe para instanciar objetos do tipo Produto, e realizar as fun??es de
 * gerenciamento desse objeto
 * @author Davi
 */
public class Produto {
	
	/**
	 * Atributos da classe Produto
	 */
	private String codigo;
	private String nome;
	private double preco;
	private String validade;
	private double estoque;
	private String codigoFornecedor;
	
	private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	//Methods
	
	/**
	 * Construtor do objeto da Classe Produto
	 * @param codigo
	 * @param nome
	 * @param preco
	 * @param validade
	 */
	public Produto(String codigo, String nome, double preco, String validade, double estoque, String codigoFornecedor) {
		setCodigo(codigo);
		setNome(nome);
		setPreco(preco);
		setValidade(validade);
		setEstoque(estoque);
		setCodigoFornecedor(codigoFornecedor);
	}
	
	//Inicio Get/Set
	
	/**
	 * Getter que retorna o codigo
	 * @return codigo
	 */
	public String getCodigo() {
		return this.codigo;
	}
	
	/** 
	 * Setter do codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Getter que retorna o nome
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}
	
	/** 
	 * Setter do nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Getter que retorna o preco
	 * @return preco
	 */
	public double getPreco() {
		return this.preco;
	}
	
	/** 
	 * Setter do preco
	 * @param preco
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	/**
	 * Getter que retorna a validade
	 * @return validade
	 */
	public String getValidade() {
		return this.validade;
	}
	
	/** 
	 * Setter da validade
	 * @param validade
	 */
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	/**
	 * Getter que retorna a quantidade em estoque
	 * @return estoque
	 */
	public double getEstoque() {
		return this.estoque;
	}
	
	/** 
	 * Setter do estoque
	 * @param estoque
	 */
	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
	
	/**
	 * Getter que retorna o codigo do fornecedor
	 * @return codigoFornecedor
	 */
	public String getCodigoFornecedor() {
		return this.codigoFornecedor;
	}
	
	/** 
	 * Setter do codigoFornecedor
	 * @param codigoFornecedor
	 */
	public void setCodigoFornecedor(String codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
	
	/**
	 * Getter que retorna um objeto produto escolhido 
	 * @param i
	 * @return produto
	 */
	static public Produto getProduto(int i) {
		Produto produto;
		produto = listaProduto.get(i);
		return produto;
	}
	
	/**
	 * Getter que retorna a listaProduto
	 * @return listaProduto
	 */
	public static ArrayList<Produto> getListaProduto() {
		return listaProduto;
	}
	
	//Fim Get/Set
	
	/**
	 * Recebe objeto com os valores e insere na listaProduto
	 * @param novoProduto
	 */
	public static void cadastrar(Produto novoProduto) {
	
		listaProduto.add(novoProduto); 
	}
	
	/**
	 * Recebe o codigo do Produto e o novo nome, e edita no objeto da lista
	 * @param codigoString
	 * @param novoNome
	 */
	public static void editarNome(String codigoString, String novoNome) {
		
		int i = buscaProduto(codigoString); 
		
		if (i != -1) {
			listaProduto.get(i).setNome(novoNome);
		}
	}
	
	/**
	 * Recebe o codigo do Produto e o novo preco, e edita no objeto da lista
	 * @param codigoString
	 * @param novoPreco
	 */
	public static void editarPreco(String codigoString, String novoPrecoString) {
		
		double novoPreco = Double.parseDouble(novoPrecoString);
		
		int i = buscaProduto(codigoString); 
		
		if (i != -1) {
			listaProduto.get(i).setPreco(novoPreco);
		}
	}
	
	/**
	 * Recebe o codigo do Produto e a nova validade, e edita no objeto da lista
	 * @param codigoString
	 * @param novaValidade
	 */
	public static void editarValidade(String codigoString, String novaValidade) {
		
		int i = buscaProduto(codigoString); 
		
		if (i != -1) {
			listaProduto.get(i).setValidade(novaValidade);
		}
	}
	
	/**
	 * Recebe o codigo do Produto e a nova quantidade do estoque, e edita no objeto da lista
	 * @param codigoString
	 * @param novoEstoque
	 */
	public static void editarEstoque(String codigoString, String novoEstoqueString) {
		
		double novoEstoque = Double.parseDouble(novoEstoqueString);
		
		int i = buscaProduto(codigoString); 
		
		if (i != -1) {
			listaProduto.get(i).setEstoque(novoEstoque);
		}
	}
	
	/**
	 * Recebe o codigo do Produto e o novo fornecedor, e edita no objeto da lista
	 * @param codigoString
	 * @param novoFornecedor
	 */
	public static void editarFornecedor(String codigoString, String novoFornecedor) {
		
		int i = buscaProduto(codigoString); 
		
		if (i != -1) {
			listaProduto.get(i).setCodigoFornecedor(novoFornecedor);
		}
	}
	
	/**
	 * Recebe o codigo do Produto, e exclui da lista
	 * @param codigoString
	 */
	public static void excluir(String codigoString) {
		
		int i = buscaProduto(codigoString); 
		
		if (i != -1) {
			listaProduto.remove(i);
		}
	}
	
	/**
	 * Printa a lista de Produtos
	 */
	public static void listar() {	
		for (Produto produto : listaProduto) {
			
			String nomeFornecedor = Fornecedor.retornaNomeFornecedor(produto.getCodigoFornecedor());
			
            System.out.println("| Codigo: "         + produto.getCodigo()+  
            				   " | Nome: "          + produto.getNome() +  
            				   " | Validade: "      + produto.getValidade() +  
            				   " | Pre?o: R$"       + produto.getPreco() +  
            				   " | Fornecedor: "    + nomeFornecedor +
            				   " | Estoque: "    + produto.getEstoque() + " (gramas)");
        }
	}
	
	/**
	 * Recebe um c?digo de Produto e encontra o index do objeto com esse c?digo,
	 * na lista
	 * @param codigo
	 * @return
	 */
	public static int buscaProduto(String codigo) {
		int indice = 0; 
		for(Produto u : listaProduto){
		    if (u.getCodigo().equals(codigo)) {
		    	return indice; 
		    }                  
		    indice++;
		}
		return -1; 
	}
	
	/**
	 * Loop que verifica se foi encontrado um fornecedor com o c?digo digitado
	 * @return 
	 */
	public static String validaProduto() {
		String codigoProduto = null;
		
		@SuppressWarnings("resource")
		Scanner entradaProduto = new Scanner(System.in);
		
		boolean validaProduto = false;
		
		while (validaProduto == false) {
			System.out.println("C?digo do produto: ");
			codigoProduto = entradaProduto.nextLine();
			int resultadoBusca = Fornecedor.buscaFornecedor(codigoProduto);
			if (resultadoBusca == -1) {
				System.out.println("Produto N?o Cadastrado: ");
			} else {
				validaProduto = true;
			}
		}
		
		return codigoProduto;
		
	}
	
	@SuppressWarnings("static-access")
	/**
	 * Fun??o para remover do estoque a quantidade de cada produto de cada item da venda
	 * @param produtoVenda
	 * @param quantidade
	 */
	public static void removerEstoque(Produto produtoVenda, double quantidade) {
		
		int indice = 0;
		
        if(quantidade <= produtoVenda.getEstoque()) {
        	
        	for(Produto produto : listaProduto) {
        		if (produto.equals(produtoVenda)) {
        			produto.listaProduto.get(indice).estoque -= quantidade;
                    System.out.println("Estoque de " + produto.listaProduto.get(indice).nome + ": "
                    		+ produto.listaProduto.get(indice).estoque + " (gramas)");
        		}
        		indice ++;
        	}
        
            
        }else {
            System.out.println("Sem quantidade necess?ria de produtos para produzir o item");
        }
		
	}
	
	/**
	 * Limpa lista de Produto (Exclusiva para teste)
	 */
	public static void limpaListaProduto() {
		listaProduto.clear();
	}
}
