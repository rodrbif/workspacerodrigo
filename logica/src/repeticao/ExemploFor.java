package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada"));
		
		for(int contador=1; contador<= 10; contador++) {
			System.out.println(tabuada + "x" + contador + "=" + (tabuada*contador));
			
		}

	}

}
