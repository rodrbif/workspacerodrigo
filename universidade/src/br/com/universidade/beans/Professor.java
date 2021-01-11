package br.com.universidade.beans;

public class Professor {

	public String nome;
	public float valorHora;
	public String formacao;
	public String area;
	public String email;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao.toLowerCase();
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Professor(String nome, float valorHora, String formacao, String area, String email) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}
	public Professor() {
		super();
	}
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", valorHora=" + valorHora + ", formacao=" + formacao + ", area=" + area
				+ ", email=" + email + "]";
	}

	public void setAll(String nome, float valorHora, String formacao, String area, String email) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao.toLowerCase();
		this.area = area;
		this.email = email;
	}

	public String getSaudacao() {

		if(nome.contains(" ") == true) {
			if(formacao.equals("doutor")) {
				return "PhD " + nome.substring(0,nome.indexOf(" "));
			}else if(formacao.equals("mestre")) {
				return "Ms. " + nome.substring(0,nome.indexOf(" "));
			}else if(formacao.equals("especialista")) {
				return "Especialista " + nome.substring(0,nome.indexOf(" "));
			}
		}
		return nome + " - Sem formação";
	}

	public String calculaSalario(int qtdeHoras) {

		float salarioBruto = (float) (valorHora * 1.06) *qtdeHoras; 
		float fgts = salarioBruto * (float) 0.08;
		float salarioLiquido = salarioBruto - fgts;
		return "Salário Bruto: " + salarioBruto + "\n" + 
		"FGTS: " + fgts + "\n" + 
		"Salário Líquido: " + salarioLiquido;
	}



}
