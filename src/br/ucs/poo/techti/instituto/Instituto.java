package br.ucs.poo.techti.instituto;

public class Instituto {
	private String nome;
	private int cep;
	private Curso [] cursos = {new Curso(1,"Ciência da Computação"),new Curso(2, "Engenharia da Computação"), 
			new Curso(3,"Engenharia de Software"), new Curso(4,"Análise e Desenvolvimento de Sistemas")};
	
	/*---- Contrutor -------------------------------------------------------------------------------- */
	public Instituto() {
		
	}
	
	/*---- Get / Set -------------------------------------------------------------------------------- */
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

	/*---- Methods ---------------------------------------------------------------------------------- */
	public String toString(){
		String formatCep = Integer.toString(this.cep).replaceFirst("(\\d{5})(\\d+)", "$1-$2");
		return String.format("Instituição: %s \nCEP: %s \nCursos: \n\t%d - %s\n\t%d - %s\n\t%d - %s\n\t%d - %s",
		 	nome,formatCep,1,cursos[0].getNome(),2,cursos[1].getNome(),3,cursos[2].getNome(),4,cursos[3].getNome()); 
	}
}
