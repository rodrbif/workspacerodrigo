package br.com.universidade.beans;

public class Aluno {
	public int rm;
	public String fone;
	public String nome;
	public boolean ativo;
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	
	public Aluno() {
		super();
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Aluno(int rm, String fone, String nome, boolean ativo) {
		super();
		this.rm = rm;
		this.fone = fone;
		this.nome = nome;
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", fone=" + fone + ", nome=" + nome + ", ativo=" + ativo + "]";
	}
	
	public void setAll(int rm, String fone, String nome, boolean ativo) {
		this.rm = rm;
		this.fone = fone;
		this.nome = nome;
		this.ativo = ativo;
	}
	
	public String getSaudacao() {
		return nome.substring(0,nome.indexOf(" "));
	}
	

}
