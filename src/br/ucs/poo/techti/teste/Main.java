package br.ucs.poo.techti.teste;

import java.util.Scanner;

public class Main {

	static int TAM = 5;

	public static void main(String[] args) {

		Turma[] turma = new Turma[TAM];

		Scanner in = new Scanner(System.in);
		int opcao;

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

				int key = Help.returnInt(in,
						"Escolha uma das disiplinas:\n" + "1) Ciência da Computação\n" + "2) Engenharia de Software\n"
								+ "3) Engenharia de Computação\n" + "4) Análise e Desenvolvimento de Sistemas",
						1, 4);

				String prof = Help.returnString(in, "Digite o nome do professor:");

				turma[pk] = new Turma(pk, key, prof);

				char continua = 'S';
				while (turma[pk].getVet() < 30 && continua == 'S') {
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
				if (turma[pk].getVet() == 30) {
					System.out.println("Número limite de alunos para essa turma atingido");
				}
				break;

			case 3:
				continua = 'S';
				while (continua == 'S') {
					int cod = Help.returnInt(in, "Digite o código da turma:");
					if (turma[cod] != null) {
						System.out.println(turma[cod].toString(1));
						for (int i = 0; i <= turma[cod].getVet(); i++) {
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
						contAlunos += turma[i].getVet();
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
