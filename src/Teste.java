import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String teste = "";
		do {
			teste = Help.returnString(in, "Digite algo");
		} while (teste != "end");
	}
}
