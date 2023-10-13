package br.ucs.poo.techti.instituto;

public class Disciplina {
	private int id;
	private String nome;
	
	public Disciplina(int id, String nome) {
		setId(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
