package br.ucs.poo.techti.teste;

import br.ucs.poo.techti.instituto.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

//import java.io.IOException;
//import java.io.RandomAccessFile;

public class Teste {
	public static void main(String[] args) {
		Turma turma;
		/*try{
			String preInput = "C:\\TesteImput\\Input.txt";
			RandomAccessFile testFile = new RandomAccessFile(preInput, "r");
			RandomAccessFile useFile = new RandomAccessFile(preInput, "r");

			testFile.seek(useFile.getFilePointer());
			System.out.println("Out:" + useFile.getFilePointer());
			System.out.println("Out:" + testFile.getFilePointer());

			//testFile.seek(useFile.getFilePointer());
			for (int i=0; i<useFile.length();i++){
				int pk = Integer.parseInt(useFile.readLine());
				testFile.seek(useFile.getFilePointer());
				System.out.println("pk: "+testFile.getFilePointer());
				
				int codSub = Integer.parseInt(useFile.readLine());
				testFile.seek(useFile.getFilePointer());
				System.out.println("cod: "+testFile.getFilePointer());

				String prof = useFile.readLine();
				testFile.seek(useFile.getFilePointer());
				System.out.println("prof: "+testFile.getFilePointer());

				turma = new Turma(pk,codSub,prof);

				testFile.seek(useFile.getFilePointer());
				while(useFile.readLine()!=null && !testFile.readLine().equals("--")){
					int id = Integer.parseInt(useFile.readLine());
					testFile.seek(useFile.getFilePointer());
					System.out.println(testFile.getFilePointer());

					String nome = useFile.readLine();
					testFile.seek(useFile.getFilePointer());
					System.out.println(testFile.readLine());

					String email = useFile.readLine();
					testFile.seek(useFile.getFilePointer());
					System.out.println(testFile.readLine());

					double n1 = Double.parseDouble(useFile.readLine());
					testFile.seek(useFile.getFilePointer());
					System.out.println(testFile.readLine());

					double n2 = Double.parseDouble(useFile.readLine());
					testFile.seek(useFile.getFilePointer());
					System.out.println(testFile.readLine());

					double n3 = Double.parseDouble(useFile.readLine());
					testFile.seek(useFile.getFilePointer());
					System.out.println(testFile.readLine());

					turma.setAlunos(id, nome, email, n1, n2, n3);
					//testFile.seek(useFile.getFilePointer());
				}
				System.out.println(turma);
			}
			useFile.close();
			testFile.close();
		}
		catch(IOException e){
			System.out.println(e);
		}*/
	

		try {
			
			/// Scanner in = new Scanner(System.in);
			/// String userInput = in.nextLine();
			String preInput = "C:\\TesteImput\\Input.txt";
			LineNumberReader r = new LineNumberReader(new FileReader(preInput));
			Scanner myReader = new Scanner(new File(preInput));

			System.out.println("Line " + r.getLineNumber() + ": " + myReader.next());

			for (int i = 1; myReader.hasNextLine(); i++) {
				int pk = Integer.parseInt(myReader.nextLine());
				System.out.println("Line " + r.getLineNumber() + ": " + myReader.next());
				int codSub = Integer.parseInt(myReader.nextLine());
				System.out.println("Line " + r.getLineNumber() + ": " + myReader.next());
				String prof = myReader.nextLine();
				System.out.println("Line " + r.getLineNumber() + ": " + myReader.next());
				turma = new Turma(pk,codSub,prof);

				while (myReader.hasNextLine() && !myReader.nextLine().equals("--")) {
					int id = Integer.parseInt(myReader.nextLine());
					String nome = myReader.nextLine();
					String email = myReader.nextLine();
					double n1 = Double.parseDouble(myReader.nextLine());
					double n2 = Double.parseDouble(myReader.nextLine());
					double n3 = Double.parseDouble(myReader.nextLine());
					turma.setAlunos(id, nome, email, n1, n2, n3);
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
