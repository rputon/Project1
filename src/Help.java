import java.util.Scanner;

public class Help {
	static int returnInt(Scanner in, String print) {
		boolean test = false;
		int value = 0;

		do {
			try {
				System.out.println(print);
				value = in.nextInt();

				test = true;
				break;
			} catch (Exception type) {
				System.out.println("Valor informado é inválido");
				in.next();
			}
		} while (test == false);
		return value;
	}

	static int returnInt(Scanner in, String print, int minRange, int maxRange) {
		boolean test = false;
		int value = 0;

		do {
			try {
				System.out.println(print);
				value = in.nextInt();

				if ((value >= minRange) && (value <= maxRange)) {
					test = true;
				}
				break;
			} catch (Exception type) {
				System.out.println("Valor informado é inválido");
				in.next();
			}
		} while (test == false);
		return value;
	}

	static double returnDouble(Scanner in, String print) {
		boolean test = false;
		double value = 0;

		do {
			try {
				System.out.println(print);
				value = in.nextDouble();

				test = true;
				break;
			} catch (Exception type) {
				System.out.println("Valor informado é inválido");
				in.next();
			}
		} while (test == false);
		return value;
	}

	static double returnDouble(Scanner in, String print, double minRange, double maxRange) {
		boolean test = false;
		double value = 0;

		do {
			try {
				System.out.println(print);
				value = in.nextDouble();

				if ((value >= minRange) && (value <= maxRange)) {
					test = true;
				}
				break;
			} catch (Exception type) {
				System.out.println("Valor informado é inválido");
				in.next();
			}
		} while (test == false);
		return value;
	}

	static String returnString(Scanner in, String print) {
		boolean test = false;
		String value = "";

		do {
			System.out.println(print);
			value = in.next();
			if (!value.matches(".*\\d.*") && !value.matches(".*[-!@#$%^&´~*()\\[\\]+=<>?/{}|].*")) {
				test = true;
				break;
			} else {
				System.out.println("Valor informado é inválido");
			}
		} while (test == false);
		return value;
	}

	static char returnChar(Scanner in, String print) {
		boolean test = false;
		char value = ' ';

		do {
			System.out.println(print);
			value = Character.toUpperCase(in.next().charAt(0));
			if (value == 'S' || value == 'N') {
				test = true;
				break;
			} else {
				System.out.println("Valor informado é inválido");
			}
		} while (test == false);
		return value;
	}

}
