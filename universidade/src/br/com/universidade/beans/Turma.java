package br.com.universidade.beans;

public class Turma {
	public String sigla;
	public String periodo;
	public String sala;
	public Aluno aluno;
	public Professor professor;
	public Curso curso;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Turma(String sigla, String periodo, String sala, Aluno aluno, Professor professor, Curso curso) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.sala = sala;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}
	public Turma() {
		super();
	}
	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", sala=" + sala + ", aluno=" + aluno + ", professor="
				+ professor + ", curso=" + curso + "]";
	}
	public void setAll(String sigla, String periodo, String sala, Aluno aluno, Professor professor, Curso curso) {
		this.sigla = sigla;
		this.periodo = periodo;
		this.sala = sala;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}
	
	public String getResumo() {
		return "Nome do curso: " + curso.getDescricao() + "\n" + "Sala: " + sala + "\n" + "Saudação do aluno: " + aluno.getSaudacao() + "\n" +
	"Saudação do professor: " + professor.getSaudacao();
		
	}
	
	

}
