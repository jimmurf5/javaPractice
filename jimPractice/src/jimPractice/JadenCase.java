package jimPractice;

public class JadenCase {
	public String toJadenCase(String phrase) {
		if(phrase == null || phrase.isEmpty()) {
			return null;
		}
		
		//split the string on each space
		String[] splitPhrase = phrase.split(" ");
		StringBuilder newPhrase = new StringBuilder();
		
		for(String word: splitPhrase) {
			String firstLetter = word.substring(0, 1).toUpperCase();
			String restOfWord = word.substring(1);
			String newWord = firstLetter + restOfWord;
			newPhrase.append(newWord).append(" ");
		}
		
		
		
		return newPhrase.toString().trim();
	}

}
