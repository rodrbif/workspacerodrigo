package br.com.excecao.teste;

import java.sql.DriverManager;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			//DriverManager.getConnection("urldobanco","user","senha");
			int numero = Integer.parseInt("7");
			System.out.println("Vari�vel: " + numero);

			String palavra = "";
			if (palavra.length() == 0) {
				throw new RuntimeException ("Eu derrubei a aplica��o");
			}
			System.out.println("Qtde letras: " + palavra.length());

		}catch(NumberFormatException e) {
			System.out.println("N�mero inv�lido");
		}catch(NullPointerException e) {
			System.out.println("Objeto nulo encontrado");
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();

		}finally {
			
			System.out.println("At� logo");
		}














	}

}
