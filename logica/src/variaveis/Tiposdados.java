package variaveis;

import javax.swing.JOptionPane;

public class Tiposdados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		double altura = 1.73;
		System.out.println(nome);
		System.out.println(idade);
		System.out.print(altura);
		
		

	}

}
