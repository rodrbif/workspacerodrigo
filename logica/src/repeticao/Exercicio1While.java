package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1While {

	public static void main(String[] args) {
		short dia = Short.parseShort(JOptionPane.showInputDialog("Digite o dia"));
		while(dia <= 0 || dia > 31) {
			dia = Short.parseShort(JOptionPane.showInputDialog("Digite um dia v�lido"));
		}

		short mes = Short.parseShort(JOptionPane.showInputDialog("Digite o m�s"));
		while(mes <= 0 || mes > 12) {
			mes = Short.parseShort(JOptionPane.showInputDialog("Digite um m�s v�lido"));
		}

		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));

		while(ano <= 0) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite um ano v�lido"));
		}

		System.out.println("Data digitada: " + dia + "-" + mes + "-" + ano );


	}

}
