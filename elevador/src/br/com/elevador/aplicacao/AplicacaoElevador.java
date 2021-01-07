package br.com.elevador.aplicacao;

import br.com.elevador.modelo.Elevador;

public class AplicacaoElevador {

	public static void main(String[] args) {
		Elevador objeto = new Elevador();
		objeto.inicializar((short) 10, (short) 3, (short) 0);
		objeto.entrar((short) 5);
		objeto.sair((short) 3);

		
		
	

		System.out.println(objeto.verificaStatus());




		

	}

}
