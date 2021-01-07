package br.com.elevador.modelo;

public class Elevador {
	
	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short quantidadePessoas;
	private short andarAtual;
	
	
	public void inicializar (short capacidade, short maior, short menor) {
		capacidadeMaxima = capacidade;
		andarMaximo = maior;
		andarMinimo = menor;
	}
	
	public String verificaStatus() {
		return "Quantidade de pesssoas: " + quantidadePessoas + "\n" + "Andar atual: " + andarAtual + "\n" + "Capacidade Maxima: " + capacidadeMaxima;
	}
	
	public void subir() {
		if(andarAtual >= andarMinimo && andarAtual < andarMaximo) {
			andarAtual++;
		}
	}
	
	public void descer() {
		if (andarAtual > andarMinimo) {
			andarAtual--;
		}
	}
	
	public void entrar(short qtde) {
		if((quantidadePessoas + qtde) <= capacidadeMaxima) {
			quantidadePessoas += qtde; 
		}
	}
	
	public void sair() {
		if(quantidadePessoas > 0) {
			quantidadePessoas--;
		}
	}
	
	public void sair(short qtde) {
		if (quantidadePessoas - qtde > 0) {
			quantidadePessoas-=qtde;
		}
	}




}
