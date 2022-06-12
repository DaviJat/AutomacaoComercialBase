/***
Autor: Davi Jatob� Galdino
Componente Curricular: MI - Programa��o II
Concluido em: 20/06/2022
Declaro que este c�digo foi elaborado por mim de forma individual e n�o cont�m nenhum
trecho de c�digo de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e p�ginas ou documentos eletr�nicos da Internet. Qualquer trecho de c�digo
de outra autoria que n�o a minha est� destacado com uma cita��o para o autor e a fonte
do c�digo, e estou ciente que estes trechos n�o ser�o considerados para fins de avalia��o.
**/

package base;

import controller.LoginController;
import model.Fornecedor;
import model.Usuario;

public class Main {
	
	public static void main(String[] args) {
		
		Usuario novoUsuario = new Usuario("1", "Administrador", "adm", true);
		Usuario.cadastrar(novoUsuario);
		
		Fornecedor novoFornecedor = new Fornecedor("1", "Piracanjuba", "88888888", "Rua Argentina");
		Fornecedor.cadastrar(novoFornecedor);
		
		LoginController.login();
		
	}
}
