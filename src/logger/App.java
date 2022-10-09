package logger;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Scanner reads input after prompt
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str = sc.nextLine();
		
		//Creates new AsterixLogger and runs both methods
		Logger astLog = new AsteriskLogger();
		System.out.println("Asterisk Logger:\n");
		astLog.Log(str);
		System.out.println();
		astLog.Error(str);
		
		//Creates new SpacedLogger and runs both methods
		System.out.println("\nSpaced Logger:\n");
		Logger spaceLog = new SpacedLogger();
		spaceLog.Log(str);
		System.out.println();
		spaceLog.Error(str);
		sc.close();
	}

}
