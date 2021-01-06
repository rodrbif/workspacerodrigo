package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		int numero = 0;
		short cont = 0;

		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente adivinhar"));
			if(numero < 30) {
				JOptionPane.showMessageDialog(null, "O número que voce digitou é menor que o número oculto");
			}else if (numero > 30) {
				JOptionPane.showMessageDialog(null, "O número que voce digitou é maior que o número oculto");
			}			
			
			cont++;
			
		}while(numero != 30);

		JOptionPane.showMessageDialog(null, "Parabens, você acertou o número !!!");
		JOptionPane.showMessageDialog(null, "Quantidade de tentativas: " + cont);
		
		
	}




	//(JOptionPane.showConfirmDialog(null, "Continuarw" , "Pergunta", JOptionPane.YES_NO_OPTION)== 0);


}
