package variaveis;

public class Strings {

	public static void main(String[] args) {
		String email = "rodrigo_bifulco@hotmAIL.com";
		System.out.println("Original: " + email);
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Qtde caracteres: " + email.length());
		System.out.println("Tem arrobaw" + email.contains("@"));
		System.out.println("Posi��o do arroba: " + email.indexOf("@"));
		System.out.println("Do 2o ao 5o: " + email.substring(1,5));
		System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@") +1 , email.length()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}