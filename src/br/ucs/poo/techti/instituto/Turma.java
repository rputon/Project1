package br.ucs.poo.techti.instituto;

public class Turma {
	private int id;
	private Disciplina[] subject = new Disciplina[30];
	private int contS = 0;
	private Professor professor;
	private Aluno[] alunos = new Aluno[30];
	private int contA = 0;

	/*---- Contrutor ------------------------------------------------------------------------------ */
	public Turma(int id, int key, String subject, String prof) {
		setId(id);
		setSubject(key, subject);
		setProf(prof);
	}

	/*---- Get / Set ------------------------------------------------------------------------------- */
	public int getcontA() {
		return contA;
	}

	public int getcontS() {
		return contS;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno(int id) {
		return alunos[id];
	}

	public void setProf(String prof) {
		professor = new Professor();
		this.professor.setNome(prof);
	}

	/*---- Methods -------------------------------------------------------------------------------- */
	public String getDisciplina(int code) {
		return subject[code].getNome();
	}

	public void setSubject(String nome) {
		if (contS < 30) {
			subject[contS] = new Disciplina(contS, nome);
			contS += 1;
		}
	}

	public void setSubject(int code, String nome) {
		if (code < 30) {
			subject[code] = new Disciplina(contS, nome);
		}
	}

	public void setAlunos(int id, String nome, String email, double n1, double n2, double n3) {
		if (contA < 30) {
			alunos[contA] = new Aluno(id, nome, email, n1, n2, n3);
			contA += 1;
		}
	}

	public int contAprovados() {
		int cont = 0;
		for (int i = 0; i <= contA; i++) {
			if (alunos[i].getAprovacao() == "Aprovado!") {
				cont++;
			}
		}
		return cont;
	}

	public String toString(int cod) {
		if (cod == 1) {
			return "Código da Turma: " + id + "\nDisciplina: " + subject + "\nProfessor: " + professor.getNome() + "\n";
		} else if (cod == 2) {
			int contAprovado = contAprovados();
			return String.format(
					"Código da Turma: %d\nDisciplina: %s \nProfessor: %s \nNúmero de alunos: %d \nAprovados: %d(%.2d)",
					id, subject, professor.getNome(), contA, contAprovado, (contAprovado * 100) / contA);
		}
		return "Código da Turma: " + id + "\nDisciplina: " + subject + "\nProfessor: " + professor.getNome()
				+ "\nNúmero de alunos: " + contA + "\n";
	}

	public String toString() {
		return "Código da Turma: " + id + "\nDisciplina: " + subject + "\nProfessor: " + professor.getNome()
				+ "\nNúmero de alunos: " + contA + "\n";
	}

}
