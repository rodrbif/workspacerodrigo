package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1While {

	public static void main(String[] args) {
		short dia = Short.parseShort(JOptionPane.showInputDialog("Digite o dia"));
		while(dia <= 0 || dia > 31) {
			dia = Short.parseShort(JOptionPane.showInputDialog("Digite um dia válido"));
		}

		short mes = Short.parseShort(JOptionPane.showInputDialog("Digite o mês"));
		while(mes <= 0 || mes > 12) {
			mes = Short.parseShort(JOptionPane.showInputDialog("Digite um mês válido"));
		}

		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));

		while(ano <= 0) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite um ano válido"));
		}

		System.out.println("Data digitada: " + dia + "-" + mes + "-" + ano );


	}

}
