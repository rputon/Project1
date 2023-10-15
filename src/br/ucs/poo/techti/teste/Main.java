package br.ucs.poo.techti.teste;
import br.ucs.poo.techti.instituto.*;

import java.util.Scanner;

public class Main {

	static int TAM = 5;

	public static void main(String[] args) {

		Turma[] turma = new Turma[TAM];

		Scanner in = new Scanner(System.in);
		int opcao;

		/* ---------------- Constructs -------------------- */
		turma[1] = new Turma(1,1, "POO", "Alexandre");
		turma[1].setAlunos(1, "Roberta", "rputon", 3.3, 6, 9.2);
		turma[2] = new Turma(2,2, "Prog1", "Fardo");
		turma[2].setAlunos(2, "Bruno", "bboni", 4.4, 7, 9.2);
		turma[2].setAlunos(3, "Carlos", "csilva", 4, 8, 9);

		/* ---------------- Constructs -------------------- */
		do {
			System.out.print(
					"---------------------------------\n" + "\tInstituição TI\n" + "---------------------------------\n"
							+ "Escolha uma das opções a seguir:\n" + "1) Listar todas as turmas\n"
							+ "2) Informar dados de uma turma:\n" + "3) Consultar os dados de uma turma\n"
							+ "4) Consultar estatísticas gerais\n" + "5) Sair do sistema\n");
			opcao = in.nextInt();
			System.out.println("");

			switch (opcao) {
			case 1:
				int contPrint = 0;
				for (int i = 0; i < TAM; i++) {
					if (turma[i] != null) {
						System.out.println(turma[i].toString() + "\n");
						contPrint++;
					}
				}
				
				if (contPrint == 0) {
					System.out.println("Nenhuma turma cadastrada\n");
				}
				in.nextLine();
				break;

			case 2:
				int pk = 0;
				char sobreescreve = 'N';
				while (sobreescreve == 'N') {
					pk = Help.returnInt(in, "Digite o código da turma:");
					if (turma[pk] != null) {
						System.out.println("Este código já está em uso para uma turma:\n");
						System.out.println(turma[pk]);
						sobreescreve = Help.returnChar(in,
								"Deseja continuar com a substinuição da turma?\n\"S\"-Sim, \"N\"-Não");
					} else {
						break;
					}
				}

				int key =0;
				sobreescreve = 'N';
				while (sobreescreve == 'N') {
					key = Help.returnInt(in, "Digite o código da disciplina:");
					if (turma[pk].getDisciplina(key) != null) {
						System.out.println("Este código já está em uso para uma disciplina:\n");
						System.out.println(turma[pk].getDisciplina(key));
						sobreescreve = Help.returnChar(in,
								"Deseja continuar com a substinuição da turma?\n\"S\"-Sim, \"N\"-Não");
					} else {
						break;
					}
				}

				String subject = Help.returnString(in, "Digite o nome da disciplina:");

				String prof = Help.returnString(in, "Digite o nome do professor:");

				turma[pk] = new Turma(pk, key, subject, prof);

				char continua = 'S';
				while (turma[pk].getcontA() < 30 && continua == 'S') {
					int id;
					String nome;
					String email;
					double n1, n2, n3;

					id = Help.returnInt(in, "Digite o código do aluno:");
					nome = Help.returnString(in, "Digite o nome do alunos:");
					email = Help.returnString(in, "Digite o email do aluno:");
					n1 = Help.returnDouble(in, "Digite a nota 1 do aluno:", 0, 10);
					n2 = Help.returnDouble(in, "Digite a nota 2 do aluno:", 0, 10);
					n3 = Help.returnDouble(in, "Digite a nota 3 do aluno:", 0, 10);

					turma[pk].setAlunos(id, nome, email, n1, n2, n3);
					continua = Help.returnChar(in,
							"Deseja continuar informando os dados de alunos?\n\"S\"-Sim, \"N\"-Não");
				}
				if (turma[pk].getcontA() == 30) {
					System.out.println("Número limite de alunos para essa turma atingido");
				}
				break;

			case 3:
				continua = 'S';
				while (continua == 'S') {
					int cod = Help.returnInt(in, "Digite o código da turma:");
					if (turma[cod] != null) {
						System.out.println(turma[cod].toString(1));
						for (int i = 0; i <= turma[cod].getcontA(); i++) {
							System.out.println(turma[cod].getAluno(i));
						}
						continua = 'N';
						break;
					} else {
						System.out.println("Turma não existe");
						continua = Help.returnChar(in, "Deseja informar outro coódigo? \n\"S\"-Sim, \"N\"-Não");
					}
				}
				in.nextLine();
				break;

			case 4:
				int contAlunos = 0;
				int contAprovado = 0;

				for (int i = 0; i < TAM; i++) {
					if (turma[i] != null) {
						turma[i].toString(2);
						contAlunos += turma[i].getcontA();
						contAprovado += turma[i].contAprovados();
					}
				}
				System.out.println("Total de alunos aprovados: " + contAprovado);

				int perAprovados = (contAprovado * 100) / contAlunos;
				System.out.println("Percentual total de aprovados: " + perAprovados);

				in.nextLine();
				break;

			case 5:
				char select = Help.returnChar(in, "Deseja realmente sair?\n\"S\"-Sim, \"N\"-Não");
				if (select == 'S') {
					System.exit(0);
				}
				break;

			default:
				System.out.println("Esta opção não existe");
			}

		} while (opcao != 5);

		in.close();

	}
}
