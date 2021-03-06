package model;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Classe para instanciar objetos do tipo Cliente, e realizar as fun??es de
 * gerenciamento desse objeto
 * @author Davi
 */
public class Cliente {
	
	/** 
	 * Atributos da classe Cliente
	 */
	private String codigo;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	//Methods
	
	/**
	 * Construtor do objeto da Classe Cliente
	 * @param codigo
	 * @param nome
	 * @param cpf
	 * @param email
	 * @param telefone
	 */
	public Cliente(String codigo, String nome, String cpf, String email, String telefone) {
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
		setEmail(email);
		setTelefone(telefone);
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
	 * Getter que retorna o cpf
	 * @return cpf
	 */
	public String getCpf() {
		return this.cpf;
	}
	
	/** 
	 * Setter do cpf
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Getter que retorna o email
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/** 
	 * Setter do email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Getter que retorna o telefone
	 * @return telefone
	 */
	public String getTelefone() {
		return this.telefone;
	}
	
	/** 
	 * Setter do email
	 * @param email
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Getter que retorna a listaCliente
	 * @return listaCliente
	 */
	public static ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}
	
	//Fim Get/Set
	
	/**
	 * Recebe objeto com os valores e insere na listaCliente
	 * @param novoCliente
	 */
	public static void cadastrar(Cliente novoCliente) {
	
		listaCliente.add(novoCliente);
	}
	
	/**
	 * Recebe o codigo do Cliente e o novo nome, e edita no objeto da lista
	 * @param codigoString
	 * @param novoNome
	 */
	public static void editarNome(String codigoString, String novoNome) {
		
		int i = buscaCliente(codigoString);
		
		if (i != -1) {
			listaCliente.get(i).setNome(novoNome);
		}
	}
	
	/**
	 * Recebe o codigo do Cliente e o novo cpf, e edita no objeto da lista
	 * @param codigoString
	 * @param novoCpf
	 */
	public static void editarCpf(String codigoString, String novoCpf) {
		
		int i = buscaCliente(codigoString);
		
		if (i != -1) {
			listaCliente.get(i).setCpf(novoCpf);
		}
	}
	
	/**
	 * Recebe o codigo do Cliente e o novo Email, e edita no objeto da lista
	 * @param codigoString
	 * @param novoEmail
	 */
	public static void editarEmail(String codigoString, String novoEmail) {
		
		int i = buscaCliente(codigoString);
		
		if (i != -1) {
			listaCliente.get(i).setEmail(novoEmail);
		}
	}
	
	/**
	 * Recebe o codigo do Cliente e o novo Telefone, e edita no objeto da lista
	 * @param codigoString
	 * @param novoTelefone
	 */
	public static void editarTelefone(String codigoString, String novoTelefone) {
		
		int i = buscaCliente(codigoString);
		
		if (i != -1) {
			listaCliente.get(i).setTelefone(novoTelefone);
		}
	}
	
	/**
	 * Recebe o codigo do Cliente, e exclui da lista
	 * @param codigoString
	 */
	public static void excluir(String codigoString) {
		
		int i = buscaCliente(codigoString);
		
		if (i != -1) {
			listaCliente.remove(i);
		}
	}
	
	/**
	 * Printa a lista de Clientes
	 */
	public static void listar() {
		for (Cliente cliente : listaCliente) {
            
            System.out.println("| Codigo: "       + cliente.getCodigo()+  
			 				   " | Nome: "      + cliente.getNome() +  
			 				   " | CPF: "      + cliente.getCpf() +  
			 				   " | Email: "  + cliente.getEmail() +
            				   " | Telefone: "  + cliente.getTelefone());
        }
	}
	
	/**
	 * Recebe um c?digo de Cliente e encontra o index do objeto com esse c?digo,
	 * na lista
	 * @param codigo
	 * @return 
	 */
	public static int buscaCliente(String codigo) {
		int indice = 0; 
		for(Cliente u : listaCliente){
		    if (u.getCodigo().equals(codigo)) {
		    	return indice; 
		    }                  
		    indice++;
		}
		return -1;
	}
	
	/**
	 * Loop que verifica se foi encontrado um cliente com o c?digo digitado
	 * @return 
	 */
	public static String validaCliente() {
		String codigoCliente = null;
		
		@SuppressWarnings("resource")
		Scanner entradaCliente = new Scanner(System.in);
		
		boolean validaCliente = false;
		
		while (validaCliente == false) {
			System.out.println("C?digo do Cliente: ");
			codigoCliente = entradaCliente.nextLine();
			int resultadoBusca = Cliente.buscaCliente(codigoCliente);
			if (resultadoBusca == -1) {
				System.out.println("Cliente N?o Cadastrado: ");
			} else {
				validaCliente = true;
			}
		}
		
		return codigoCliente;
		
	}
	
	/**
	 * Limpa lista de Cliente (Exclusiva para teste)
	 */
	public static void limpaLista() {
		listaCliente.clear();
	}
	
	/** 
	 * Fun??o que  retorna o nome do cliente buscando pelo c?digo
	 * @param codigo
	 * @return
	 */
	public static String retornaNomeCliente(String codigoCliente) {
		
		int indice = Cliente.buscaCliente(codigoCliente);
		
		String nome = listaCliente.get(indice).nome;
		
		return nome;
	}

}
