package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3While {

	public static void main(String[] args) {
		String nome = "";
		short idade = 0;
		short qtde_maior_idade = 0;
		short soma_idade = 0;
		short qtde_pessoas = 0;


		do {
			nome = JOptionPane.showInputDialog("Digite o nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));

			if(idade >= 18) {
				qtde_maior_idade++;
			}

			soma_idade += idade;
			qtde_pessoas++;
			
		


		}while(JOptionPane.showConfirmDialog(null, "Continuar?" , "Pergunta", JOptionPane.YES_NO_OPTION)== 0);
		
		
		
		System.out.println("Quantidade de pessoas maiores de idade: " + qtde_maior_idade);
		System.out.println("Média de todas as idades digitadas: " + (soma_idade/qtde_pessoas));
	}

}
