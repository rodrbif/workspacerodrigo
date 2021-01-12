package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListObjeto {

	public static void main(String[] args) {

		List<Cargo> lista = new ArrayList<Cargo>();		

		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Nivel"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))

					)

					);
		}while(JOptionPane.showConfirmDialog(null, "Pergunta","Titulo",JOptionPane.YES_NO_OPTION) == 0);

		lista.add(new Cargo("DBA", "JR", 6000));
		lista.add(new Cargo("Gerente de Projeto", "PL", 12000));
		lista.add(new Cargo("Dev", "JR", 4000));

		Collections.sort(lista);
		
		System.out.println(lista);

		for (Cargo c : lista) {
			if(c.getSalario() > 1000) {
				System.out.println("Nome do cargo: " + c.getNome());
				System.out.println("Sal�rio: " + c.getSalario());
				
			}
		}










	}

}
