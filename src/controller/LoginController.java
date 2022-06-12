package controller;

import java.util.ArrayList;

import model.Usuario;
import view.AlertView;
import view.GerenciamentoView;
import view.LoginView;

public class LoginController {
	
	public static String usuarioLogado; 
	
	public static void login() {
		
		ArrayList<String> dadosLogin = new ArrayList<String>();
		
		dadosLogin = LoginView.telaLogin();
		
		String codigo = dadosLogin.get(0);
		String senha = dadosLogin.get(1);
		
		usuarioLogado = codigo;
		
		boolean validaLogin = Usuario.validaUsuario(codigo, senha);
		
		if (validaLogin == false) {
			AlertView.loginInvalido();
			LoginController.login();
		}
		
		if (validaLogin == true) {
			AlertView.loginValido();
			GerenciamentoView.menuPrincipal();
		}
		
	};

}
