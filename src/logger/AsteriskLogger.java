package logger;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String s) {
		System.out.println("***" + s + "***");
	}

	@Override
	public void Error(String s) {
		//Bounds is a StringBuilder with the same number of asterisks as the length of word
		StringBuilder bounds = new StringBuilder("**********");
		for(int i = 0; i < s.length(); i++) {
			bounds.append("*");
		}
		bounds.append("***");
		System.out.println(bounds + "\n***Error: " + s + "***\n" + bounds);
	}
	
}
