package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("FiaT");
		objeto.preencherModelo("Siena");
		objeto.preencherVelocidadeMaxima(150);
		objeto.preencherValor(150000);
				
		System.out.println(objeto.retornarMontadora());
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarVelocidadeMaxima());
		System.out.println(objeto.retornarValor());
		
		System.out.println(objeto.ligar());
		objeto.acelerar();
		objeto.acelerar(5);
		objeto.acelerar(15);
		System.out.println(objeto.verificarStatus());
		
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.verificarStatus());
		
		
		
		
		
		
		
		
		

	}

}
