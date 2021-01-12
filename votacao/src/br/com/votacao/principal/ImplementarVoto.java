package br.com.votacao.principal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {


		Candidato candidato1 = new Candidato(1,"Xpto","xpto@xpto.com.br",1234,"Vereador", "pjava");
		Candidato candidato2 = new Candidato(2,"abc","abc@abc.com.br",4321,"Vereador", "pdev");

		List<Voto> lista = new ArrayList<Voto>();

		do {
			int resp = JOptionPane.showConfirmDialog(null, "Continuar?","Titulo",JOptionPane.YES_NO_OPTION);
			if(resp ==1) {

				lista.add(
						new Voto(
								new Eleitor(
										Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do eleitor")),
										JOptionPane.showInputDialog("Digite o nome do eleitor"),
										JOptionPane.showInputDialog("Digite o email do eleitor"),
										Integer.parseInt(JOptionPane.showInputDialog("Digite o número do título")),
										Boolean.parseBoolean(JOptionPane.showInputDialog("Está ativo?")								
												),
										candidato1,
										true								
										));
			}




		}while(JOptionPane.showConfirmDialog(null, "Continuar?","Titulo",JOptionPane.YES_NO_OPTION) == 0);



	}

}

