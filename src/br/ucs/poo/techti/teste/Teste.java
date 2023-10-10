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

			String data;
			for (int i=1; myReader.hasNextLine();i++) {
				data = myReader.nextLine();
				
				if(!data.isEmpty()) {
					System.out.println(data);
				}
				else {
					System.out.println("--");
				}
				
			}
			
			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
