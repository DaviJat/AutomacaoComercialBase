package model;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Classe para instanciar objetos do tipo Fornecedor, e realizar as fun??es de
 * gerenciamento desse objeto
 * @author Davi
 */
public class Fornecedor {
	
	/** 
	 * Atributos da classe Fornecedor
	 */
	private String codigo;
	private String nome;
	private String cnpj;
	private String endereco;
	
	private static ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
	
	//Methods
	
	/**
	 * Construtor do objeto da Classe Fornecedor
	 * @param codigo
	 * @param nome
	 * @param cnpj
	 * @param endereco
	 */
	public Fornecedor(String codigo, String nome, String cnpj, String endereco) {
		setCodigo(codigo);
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
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
	 * Getter que retorna o cnpj
	 * @return cnpj
	 */
	public String getCnpj() {
		return this.cnpj;
	}
	
	/** 
	 * Setter do cnpj
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Getter que retorna o endereco
	 * @return endereco
	 */
	public String getEndereco() {
		return this.endereco;
	}
	
	/** 
	 * Setter do endereco
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * Getter que retorna a listaFornecedor
	 * @return listaFornecedor
	 */
	public static ArrayList<Fornecedor> getListaFornecedor() {
		return listaFornecedor;
	}
	
	//Fim Get/Set
	
	/**
	 * Recebe objeto com os valores e insere na listaFornecedor
	 * @param novoFornecedor
	 */
	public static void cadastrar(Fornecedor novoFornecedor) {
	
		listaFornecedor.add(novoFornecedor);
	}
	
	/**
	 * Recebe o codigo do Fornecedor e o novo nome, e edita no objeto da lista
	 * @param codigoString
	 * @param novoNome
	 */
	public static void editarNome(String codigoString, String novoNome) {
		
		int i = buscaFornecedor(codigoString);
		
		if (i != -1) {
			listaFornecedor.get(i).setNome(novoNome);
		}
	}
	
	/**
	 * Recebe o codigo do Fornecedor e o novo cnpj, e edita no objeto da lista
	 * @param codigoString
	 * @param novoCnpj
	 */
	public static void editarCnpj(String codigoString, String novoCnpj) {
		
		int i = buscaFornecedor(codigoString);
		
		if (i != -1) {
			listaFornecedor.get(i).setCnpj(novoCnpj);
		}
	}
	
	/**
	 * Recebe o codigo do Fornecedor e o novo Endereco, e edita no objeto da lista
	 * @param codigoString
	 * @param novoEndereco
	 */
	public static void editarEndereco(String codigoString, String novoEndereco) {
		
		int i = buscaFornecedor(codigoString);
		
		if (i != -1) {
			listaFornecedor.get(i).setEndereco(novoEndereco);
		}
	}
	
	/**
	 * Recebe o codigo do Fornecedor, e exclui da lista
	 * @param codigoString
	 */
	public static void excluir(String codigoString) {
		
		int i = buscaFornecedor(codigoString);
		
		if (i != -1) {
			listaFornecedor.remove(i);
		}
	}
	
	/**
	 * Printa a lista de Fornecedors
	 */
	public static void listar() {
		for (Fornecedor fornecedor : listaFornecedor) {
            
            System.out.println("| Codigo: "       + fornecedor.getCodigo()+  
			 				   " | Nome: "      + fornecedor.getNome() +  
			 				   " | CNPJ: "      + fornecedor.getCnpj() +  
			 				   " | Endere?o: "  + fornecedor.getEndereco());
        }
	}
	
	/**
	 * Recebe um c?digo de Fornecedor e encontra o index do objeto com esse c?digo,
	 * na lista
	 * @param codigo
	 * @return 
	 */
	public static int buscaFornecedor(String codigo) {
		int indice = 0; 
		for(Fornecedor u : listaFornecedor){
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
	public static String validaFornecedor() {
		String codigoFornecedor = null;
		
		@SuppressWarnings("resource")
		Scanner entradaFornecedor = new Scanner(System.in);
		
		boolean validaFornecedor = false;
		
		while (validaFornecedor == false) {
			System.out.println("C?digo do Fornecedor: ");
			codigoFornecedor = entradaFornecedor.nextLine();
			int resultadoBusca = Fornecedor.buscaFornecedor(codigoFornecedor);
			if (resultadoBusca == -1) {
				System.out.println("Fornecedor N?o Cadastrado: ");
			} else {
				validaFornecedor = true;
			}
		}
		
		return codigoFornecedor;
		
	}
	
	/**
	 * Limpa lista de Fornecedor (Exclusiva para teste)
	 */
	public static void limpaLista() {
		listaFornecedor.clear();
	}
	
	/** 
	 * Fun??o que  retorna o nome do fornecedor buscando pelo c?digo
	 * @param codigo
	 * @return
	 */
	public static String retornaNomeFornecedor(String codigoFornecedor) {
		
		int indice = Fornecedor.buscaFornecedor(codigoFornecedor);
		
		String nome = listaFornecedor.get(indice).nome;
		
		return nome;
	}

}
