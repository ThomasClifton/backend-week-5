package logger;

public class AsterixLogger implements Logger {

	@Override
	public void Log(String s) {
		System.out.println("***" + s + "***");
	}

	@Override
	public void Error(String s) {
		StringBuilder bounds = new StringBuilder("**********");
		for(int i = 0; i < s.length(); i++) {
			bounds.append("*");
		}
		bounds.append("***");
		System.out.println(bounds + "\n***Error: " + s + "***\n" + bounds);
	}
	
}
