package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Digite a mat�ria: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Faltas"));
		float media = (nota1 + nota2)/2;

		if (faltas >= 20) {
			System.out.println("Reprovado por faltas");
		}


		else {

			if(media >= 6) {
				System.out.println("Parabens, voce foi aprovado na disciplina " + disciplina);
			}else if (media < 4) {
				System.out.println("Voce foi reprovado na disciplina " + disciplina);			
			}else {
				System.out.println("Voc� ficou de exame na disciplina " + disciplina);
			}
			System.out.println("Media: " + media);
			System.out.println("Faltas: " + faltas);

		} 










	}

}