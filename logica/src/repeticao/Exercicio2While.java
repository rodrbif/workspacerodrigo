package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2While {

	public static void main(String[] args) {
		String escolaridade = "";
		short md = 0;
		short sup = 0;
		short pos = 0;
		short votos = 0;
		String votada = "";

		do {
			escolaridade = JOptionPane.showInputDialog("Digite o n�vel de escolaridade").toLowerCase();
			
			if(escolaridade.equals("medio")) {
				md++;
			}else if (escolaridade.equals("superior")) {
				sup++;
			}else if(escolaridade.equals("pos")) {
				pos++;
			}
						
		}while(escolaridade.equals("medio") || escolaridade.equals("superior") || escolaridade.equals("pos"));

		System.out.println("Voc� digitou uma escolaridade inv�lida. Finalizando a contagem...");
		
		if(md > sup && md > pos) {
			votos = md;
			votada = "Medio";
		}else if (sup > md && sup > pos) {
			votos = sup;
			votada = "Superior";
		}else if (pos > md && pos > sup) {
			votos = pos;
			votada = "Pos";
		}

		System.out.println("A escolaridade " + votada + " foi a mais votada com " + votos + " votos");
	}

}
