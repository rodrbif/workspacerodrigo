package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		String operacao = JOptionPane.showInputDialog("Opera��o");
		float resultado = num1 + num2;


		if(operacao.equals("-")) {
			resultado = num1 - num2;

		}else if (operacao.equals("*")) {
			resultado = num1 * num2;

		}else if (operacao.equals("/")) {
			resultado = num1 / num2;
		}

		System.out.println("Resultado: " + resultado);

	}

}