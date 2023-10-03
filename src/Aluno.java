
public class Aluno {
	private int id;
	private String nome;
	private String email;
	private String curso;
	private double n1;
	private double n2;
	private double n3;
	private double nota;
	private String aprovacao;

	public Aluno(int id, String nome, String email, double n1, double n2, double n3) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		setNota();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public void setNota() {
		this.nota = (n1 + n2 + n3) / 3;
		if (this.nota >= 7) {
			setAprovacao("Aprovado!");
		} else {
			setAprovacao("Reprovado!");
		}
	}

	public String getAprovacao() {
		return aprovacao;
	}

	private void setAprovacao(String aprovacao) {
		this.aprovacao = aprovacao;
	}

	public String toString() {
		return "Nome: " + nome + "\nNota 1: " + n1 + "\nNota 2: " + n2 + "\nNota 3:" + n3 + "\nNota final: "
				+ String.format("%.2f", nota) + "\nSituação: " + aprovacao + "\n";
	}

}
