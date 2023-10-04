
public class Turma {
	private int id;
	private Disciplina subject;
	private Professor professor;
	private Aluno[] alunos = new Aluno[30];
	private int vet = 0;

	public Turma(int id, int codSub, String prof) {
		setId(id);
		setSubject(codSub);
		setProf(prof);
	}

	public int getVet() {
		return vet;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSubject(int codSub) {
		if (codSub == 1) {
			this.subject.setNome("Ciência da Computação");
			this.subject.setId(codSub);
		}
		else if (codSub == 2) {
			this.subject.setNome("Engenharia de Software");
			this.subject.setId(codSub);
		}
		else if (codSub == 3) {
			this.subject.setNome("Engenharia de Computação");
			this.subject.setId(codSub);
		}
		else if (codSub == 4) {
			this.subject.setNome("Análise e Desenvolvimento de Sistemas");
			this.subject.setId(codSub);
		}
	}

	public void setProf(String prof) {
		professor = new Professor();
		professor.setNome(prof);
	}

	public void setAlunos(int id, String nome, String email, double n1, double n2, double n3) {
		if (vet < 30) {
			alunos[vet] = new Aluno(id, nome, email, n1, n2, n3);
			vet += 1;
		}
	}

	public Aluno getAluno(int id) {
		return alunos[id];
	}
	
	public int contAprovados() {
		int cont = 0;
		for (int i = 0; i <= vet; i++) {
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
					id, subject, professor.getNome(), vet, contAprovado, (contAprovado * 100) / vet);
		}
		return "Código da Turma: " + id + "\nDisciplina: " + subject + "\nProfessor: " + professor.getNome()
				+ "\nNúmero de alunos: " + vet + "\n";
	}
}
