package logger;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str = sc.nextLine();
		
		Logger astLog = new AsterixLogger();
		System.out.println("Asterix Logger:\n");
		astLog.Log(str);
		System.out.println();
		astLog.Error(str);
		
		System.out.println("\nSpaced Logger:\n");
		Logger spaceLog = new SpacedLogger();
		spaceLog.Log(str);
		System.out.println();
		spaceLog.Error(str);
		sc.close();
	}

}
