package Recursion;

public class MobileKeyPad {
	
	public static String getKeypad(char c) {
		if (c == '2') {
			return "abc";
		} else if (c == '3') {
			return "def";
		}  else if (c == '4') {
			return "ghi";
		} else if (c == '5') {
			return "jkl";
		} else if (c == '6') {
			return "mno";
		} else if (c == '7') {
			return "pqrs";
		}  else if (c == '8') {
			return "tuv";
		} else {
			return "wxyz";
		}
		
	}
	
	public static String[] keypadCombinations(String n) {
		if (n.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		
		String[] smallerOutput = keypadCombinations(n.substring(1));
		String currentCharPossible = getKeypad(n.charAt(0));
		String[] output = new String[smallerOutput.length * currentCharPossible.length()];
		int k = 0;
		for (int i = 0; i < currentCharPossible.length(); i++) {
			for (int j = 0; j < smallerOutput.length; j++) {
				output[k] = currentCharPossible.charAt(i) + smallerOutput[j];
				k++;
			}
		}
		return output;
	}
	
	public static void printKeypad(String input, String outputSoFar) {
		if (input.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}
		String possibleCharForCurrentNumber = getKeypad(input.charAt(0));
		for (int i =0; i < possibleCharForCurrentNumber.length(); i++) {
			printKeypad(input.substring(1), outputSoFar + possibleCharForCurrentNumber.charAt(i));
		}
	}
	public static void main(String[] args)
	{
		printKeypad("234", "");
	}
}
