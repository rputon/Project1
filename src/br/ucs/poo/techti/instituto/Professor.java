package br.ucs.poo.techti.instituto;

public class Professor {
	private int id;
	private String nome;
	private String email;
	private Instituto faculdade;

	/*---- Contrutor ------------------------------------------------------------------------------ */
	public Professor() {

	}

	/*---- Get / Set ------------------------------------------------------------------------------- */
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacul() {
		return faculdade.getNome();
	}

	public void setFacul(String facul) {
		faculdade = new Instituto();
		this.faculdade.setNome(facul);
	}

	/*---- Methods -------------------------------------------------------------------------------- */
	public String toString(){
		return String.format("%d - %s\nEmail: %s\nFaculdade: %s",id,nome,email,faculdade.getNome());
	}

}
