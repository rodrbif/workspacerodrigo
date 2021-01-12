package br.com.excecao.teste;

import java.sql.DriverManager;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			//DriverManager.getConnection("urldobanco","user","senha");
			int numero = Integer.parseInt("7");
			System.out.println("Variável: " + numero);

			String palavra = "";
			if (palavra.length() == 0) {
				throw new RuntimeException ("Eu derrubei a aplicação");
			}
			System.out.println("Qtde letras: " + palavra.length());

		}catch(NumberFormatException e) {
			System.out.println("Número inválido");
		}catch(NullPointerException e) {
			System.out.println("Objeto nulo encontrado");
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();

		}finally {
			
			System.out.println("Até logo");
		}














	}

}
