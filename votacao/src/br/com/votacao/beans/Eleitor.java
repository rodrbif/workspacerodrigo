package br.com.votacao.beans;

public class Eleitor extends Pessoa{
	
	private int titulo;
	private boolean ativo;
	
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Eleitor(int id, String nome, String email, int titulo, boolean ativo) {
		super(id, nome, email);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	public Eleitor() {
		super();
	}
	@Override
	public String toString() {
		return "Eleitor [titulo=" + titulo + ", ativo=" + ativo + "Pessoa" + super.toString()+"]";
	}
	public void setAll(int id, String nome, String email, int titulo, boolean ativo) {
		super.setAll(id, nome, email);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	
	
	
	
	

}
