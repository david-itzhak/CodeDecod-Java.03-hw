package telran.numbers;

public class CodeDecode {
	String keyCodeDecode;
	public CodeDecode(String keyCodeDecode) {
		this.keyCodeDecode = keyCodeDecode;
	}

	public String code (int number) {
		
		String result = "";
		int base = getBase();
		do {
			int digit = number % base;
			char digitChar = getDigitChar(digit);
			result = digitChar + result;
			number /= base;
		} while (number != 0);
		return result;
		
	}

	private char getDigitChar(int digit) {
		return keyCodeDecode.charAt(digit);
	}

	private int getBase() {
		return keyCodeDecode.length();
	}
	
	public int decode (String numberStr) {
		int length = numberStr.length();
		int result = 0;
		int base = getBase();
		for(int i = 0; i < length; i++) {
			char digitChar = numberStr.charAt(i);
			int digit = getDigit(digitChar);
			result = result * base + digit;
		}
		return result;
	}

	private int getDigit(char digitChar) {
		return keyCodeDecode.indexOf(digitChar);
	}

}
