package br.ucs.poo.techti.teste;

import br.ucs.poo.techti.instituto.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Turma turma;
		try {

			/// Scanner in = new Scanner(System.in);
			/// String userInput = in.nextLine();
			String preInput = "C:\\TesteImput\\Input.txt";
			File myObj = new File(preInput);
			Scanner myReader = new Scanner(myObj);

			for (int i = 1; myReader.hasNextLine(); i++) {
				int pk = Integer.parseInt(myReader.nextLine());
				int codSub = Integer.parseInt(myReader.nextLine());
				String prof = myReader.nextLine();
				turma = new Turma(pk,codSub,prof);

				while (myReader.hasNextLine()) {
					int id = Integer.parseInt(myReader.nextLine());
					String nome = myReader.nextLine();
					String email = myReader.nextLine();
					double n1 = Double.parseDouble(myReader.nextLine());
					double n2 = Double.parseDouble(myReader.nextLine());
					double n3 = Double.parseDouble(myReader.nextLine());

					turma.setAlunos(id, nome, email, n1, n2, n3);
					if(myReader.nextLine()==""){
						System.out.println("EXIT");
						break;
					}
				}
				System.out.println(turma);
			}
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
