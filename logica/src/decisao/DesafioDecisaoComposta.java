package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto");
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Quantidade"));
		float valor_unitario = Float.parseFloat(JOptionPane.showInputDialog("Valor unit�rio"));
		float valor_total = qtde * valor_unitario;
		
		if (qtde < 5) {
			System.out.println("Sem redu��o");
			System.out.println("Valor atualizado = " + valor_total);
		} else if (qtde > 20) {
			System.out.println("12% de redu��o");
			System.out.println("Valor atualizado = " + valor_total*(float) 0.88);
		}else if (qtde >= 5 && qtde <= 9) {
			System.out.println("5% de redu��o");
			System.out.println("Valor atualizado = " + valor_total* (float) 0.95);
		}else if (qtde >= 10 && qtde <= 20) {
			System.out.println("10% de redu��o");
			System.out.println("Valor atualizado = " + valor_total* (float) 0.9);
		}
		
		
		
		
		
		
		

	}

}
