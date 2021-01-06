package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome e sobrenome").toUpperCase();
		while(nome.length() < 5 || nome.length() > 20 || nome.contains(" ") == false) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente");
		}

		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		while (idade < 18 || idade > 80) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade novamente"));

		}	
		
		System.out.println("Nome: " + nome.substring(0,nome.indexOf(" ")));
		System.out.println("Sobrenome: " + nome.substring(nome.indexOf(" "),nome.length()));		
		System.out.println("Idade: " + idade);




	}
}