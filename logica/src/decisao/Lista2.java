package decisao;

import javax.swing.JOptionPane;

public class Lista2 {

	public static void main(String[] args) {
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Quantidade de di�rias"));
		float valor;
		if(diaria > 15) {
			valor = diaria * (80 + (float) 5.5);
		} else if(diaria == 15){
			valor = diaria * (80 + 6);
		}else {
			valor = diaria *(80 + 8);
		}
		System.out.println("Conta do cliente: " + valor);

	}

}
