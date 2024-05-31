package jimPractice;

public class MorseCodeDecoder {
	public static void main(String[] args) {
		String frustration = decode(".... . -.--   .--- ..- -.. ."); 
		System.out.println(frustration);
	}

	public static String decode(String morseCode) {
		String[] words = morseCode.split(" {3}");
		StringBuilder newPhrase = new StringBuilder();
		for (String word : words) {

			String[] letters = word.split(" ");
			for (String letter : letters) {
				newPhrase.append(switcher(letter));
			}
			newPhrase.append((" "));
		}

		String finalPhrase = newPhrase.toString().trim();
		return finalPhrase;
	}

	public static String switcher(String letter) {
		String result = "";
		switch (letter) {
		case "-.-.--":
            result = "!";
            break;
		case ".-.-.-":
			result = ".";
			break;
		case "--..--":
			result = ",";
			break;
		case "---...":
			result = ":";
			break;
		case "-.-.-.":
			result = ";";
			break;
		case "..--..":
			result = "?";
			break;
		case ".----.":
			result = "'";
			break;
		case "-....-":
			result = "-";
			break;
		case "-..-.":
			result = "/";
			break;
		case ".-..-.":
			result = "\"";
			break;
		case ".--.-.":
			result = "@";
			break;
		case ".-":
			result = "A";
			break;
		case "-...":
			result = "B";
			break;
		case "-.-.":
			result = "C";
			break;
		case "-..":
			result = "D";
			break;
		case ".":
			result = "E";
			break;
		case "..-.":
			result = "F";
			break;
		case "--.":
			result = "G";
			break;
		case "....":
			result = "H";
			break;
		case "..":
			result = "I";
			break;
		case ".---":
			result = "J";
			break;
		case "-.-":
			result = "K";
			break;
		case ".-..":
			result = "L";
			break;
		case "--":
			result = "M";
			break;
		case "-.":
			result = "N";
			break;
		case "---":
			result = "O";
			break;
		case ".--.":
			result = "P";
			break;
		case "--.-":
			result = "Q";
			break;
		case ".-.":
			result = "R";
			break;
		case "...":
			result = "S";
			break;
		case "-":
			result = "T";
			break;
		case "..-":
			result = "U";
			break;
		case "...-":
			result = "V";
			break;
		case ".--":
			result = "W";
			break;
		case "-..-":
			result = "X";
			break;
		case "-.--":
			result = "Y";
			break;
		case "--..":
			result = "Z";
			break;
		
		default:
			result = "";
			break;
		}
		return result;

	}

}