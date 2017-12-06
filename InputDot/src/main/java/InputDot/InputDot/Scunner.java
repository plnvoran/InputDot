package InputDot.InputDot;

import java.util.Scanner;

public class Scunner {

	Scanner scanner = new Scanner(System.in);

	public String input() {

		System.out.print("Input symbol: ");
		return scanner.nextLine();
	}

}
