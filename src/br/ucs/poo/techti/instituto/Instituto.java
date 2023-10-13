package br.ucs.poo.techti.instituto;

public class Instituto {
	private String nome;
	private int cep;
	private Curso [] cursos = {new Curso(1,"Ciência da Computação"),new Curso(2, "Engenharia da Computação"), new Curso(3,"Engenharia de Software"),new Curso(4,"Análise e Desenvolvimento de Sistemas")};
	
	public Instituto() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}

	public Curso [] getCursos(){
		return cursos;
	}
}
