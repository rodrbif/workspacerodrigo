package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("email");

		while (email.contains("@") == false) {
			System.out.println("Email invalido, digite novamente");	
		}


		System.out.println("Seja bem vindo, " + email.substring(email.indexOf("@")));


	}
}
