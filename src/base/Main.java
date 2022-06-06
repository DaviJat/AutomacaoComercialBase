/***
Autor: Davi Jatobá Galdino
Componente Curricular: MI - Programação II
Concluido em: 20/06/2022
Declaro que este código foi elaborado por mim de forma individual e não contêm nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
**/

package base;

import controller.LoginController;
import model.Usuario;

public class Main {
	
	public static void main(String[] args) {
		
		Usuario novoUsuario = new Usuario("1", "Administrador", "adm", true);
		Usuario.cadastrar(novoUsuario);
		
		LoginController.login();
		
	}
}
