package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		int numero = 0;
		short cont = 0;

		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente adivinhar"));
			if(numero < 30) {
				JOptionPane.showMessageDialog(null, "O n�mero que voce digitou � menor que o n�mero oculto");
			}else if (numero > 30) {
				JOptionPane.showMessageDialog(null, "O n�mero que voce digitou � maior que o n�mero oculto");
			}			
			
			cont++;
			
		}while(numero != 30);

		JOptionPane.showMessageDialog(null, "Parabens, voc� acertou o n�mero !!!");
		JOptionPane.showMessageDialog(null, "Quantidade de tentativas: " + cont);
		
		
	}




	//(JOptionPane.showConfirmDialog(null, "Continuarw" , "Pergunta", JOptionPane.YES_NO_OPTION)== 0);


}
