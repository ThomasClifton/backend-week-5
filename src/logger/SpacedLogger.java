package logger;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String s) {
		System.out.println(spaced(s));
	}

	@Override
	public void Error(String s) {
		System.out.println("Error: " + spaced(s));
	}
	
	//Returns String of word with spaces
	public String spaced(String word) {
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
			str.append(word.charAt(i));
			if(i < word.length() - 1) {
				str.append(" ");
			}
		}
		return str.toString();
	}

}
