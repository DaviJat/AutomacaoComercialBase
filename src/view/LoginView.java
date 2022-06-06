package view;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginView {
	
	public static ArrayList<String> login() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tela de login");
		
		System.out.println("C�digo do Usuario: ");
		String codigo = entrada.nextLine();
		
		System.out.println("Senha: ");
		String senha = entrada.nextLine();
		
		ArrayList<String> dadosLogin = new ArrayList<String>();
		
		dadosLogin = UsuarioView.menuCadastro();
		
		dadosLogin.add(codigo);
		dadosLogin.add(senha);
		
		return dadosLogin;
		
	}
	
}
