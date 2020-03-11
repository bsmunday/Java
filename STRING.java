package Assignment;

public class STRING {
	
	public static void main(String[] args) {
		
		String result = "";
		String str = "";
		int number = 0;
		
		System.out.println("//----------------------------------------------//");
		System.out.println("TEST: count Distinct Alphabetic And Numeric Digits");
		System.out.println("//----------------------------------------------//");
		
		String[] s1 = {"abcde", "aabbcde", "aabBcde", 
				"indivisibility", "Indivisibilities", "aA11", "ABBA"};
		
		for (int i = 0; i < s1.length; i++) {
			str = s1[i];
			number = countDistinctAlphabeticAndNumeric(str);
			System.out.println("Input : " + str);
			System.out.println("Output: " + number);
			System.out.print("\n");	
		}

		System.out.println("//----------------------------------------------//");
		System.out.println("TEST: Dna Strand make Complement");
		System.out.println("//----------------------------------------------//");
		
		String[] s2 = {"ATTGC", "TAACG", "GTAT", "CATA"};
		
		for (int i = 0; i < s2.length; i++) {
			str = s2[i];
			result = DnaStrandmakeComplement(str);
			System.out.println("Input : " + str);
			System.out.println("Output: " + result);
			System.out.print("\n");		
		}
		

		System.out.println("//----------------------------------------------//");
		System.out.println("TEST: Spin Words");
		System.out.println("//----------------------------------------------//");
		
		String[] s3 = {
				"Hey fellow warriors", 
				"Hey wollef sroirraw",
				"This is a test",
				"This is another test",
				"This is rehtona test"
		};
		
		for (int i = 0; i < s3.length; i++) {
			str = s3[i];
			result = spinWords(str);
			System.out.println("Input : " + str);
			System.out.println("Output: " + result);
			System.out.print("\n");		
		}
		
		System.out.println("//----------------------------------------------//");
		System.out.println("TEST: remove Vowels From String");
		System.out.println("//----------------------------------------------//");
		
		String[] s4 = {
				"aAeEiIoOuUeE",
				"This website is for All!",
				"abcdefghijklmnopqrstuvwxyz",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		};
		
		for (int i = 0; i < s4.length; i++) {
			str = s4[i];
			result = removeVowelsFromString(str);
			System.out.println("Input : " + str);
			System.out.println("Output: " + result);
			System.out.print("\n");		
		}
	}

	//////////////////////////////////////////////////////////////////////
	// return the count of distinct case-insensitive alphabetic 		//
	// characters and numeric digits that occur more than once in the 	//
	// input string. The input string can be assumed to contain only 	//
	// alphabets (both uppercase and lowercase) and numeric digits		//
	//////////////////////////////////////////////////////////////////////
	public static int countDistinctAlphabeticAndNumeric(String str) {
		boolean foundDupl = false;
		int countDistinct = 0;
		char currChar = ' ';
		char duplChar = ' ';
		char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = Character.toLowerCase(str.charAt(i)); 
        } 
        for (int i = 0; i < ch.length; i++) {
        	currChar = ch[i];
        	if (currChar != ' ') {
        		foundDupl = false;
            	for (int j = i + 1; j < str.length(); j++) {
            		duplChar = ch[j];
            		if (currChar == duplChar) {
            			foundDupl = true;
            			ch[j] = ' ';
            		}
            	}
            	if (foundDupl) {
            		countDistinct++;
            	}
        	}        	
        }
		return countDistinct;
	}
	//////////////////////////////////////////////////////////////////////
	// DnaStrandmakeComplement("ATTGC") // return "TAACG" 				//
	// (in the result the A is replaced by T, also, 					//
	// C is replaced by G and vice versa.)								//
	// DnaStrandmakeComplement("GTAT") // return "CATA"					//
	//////////////////////////////////////////////////////////////////////
	public static String DnaStrandmakeComplement(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if      (str.charAt(i) == 'A') { result += "T"; } 
			else if (str.charAt(i) == 'T') { result += "A"; } 
			else if (str.charAt(i) == 'C') { result += "G"; } 
			else if (str.charAt(i) == 'G') { result += "C"; } 
		}
		return result;
	}
	//////////////////////////////////////////////////////////////////////////
	// Requires: This function takes in a string of one or more words, and  //
	// returns the same string, but with all five or more letter words		//
	// reversed.Strings passed in will consist of only letters and spaces.	//
	// Spaces will be included only when more than one word is present		//
	//////////////////////////////////////////////////////////////////////////
	public static String spinWords(String str) {
		if (str.length() < 5) { return str; }
		String result = "";
		int word_si = 0;
		int word_ei = 0;
		int word_ln = 0;
		for (int i = 0; i < str.length(); i++) {
			// if a space at current index then put back into the result
			if (str.charAt(i) == ' ') { 
				result += " "; 
			}
			else {
				// 1: finds the current word's end index
				word_si = i;
				word_ei = i;
				while (word_ei < str.length() && str.charAt(word_ei) != ' ') {
					word_ei++;
				}
				i = word_ei - 1;
				// 2: finds the length of the word
				word_ln = word_ei - word_si;
				// 3: puts the word back into the result depends on "2:" 
				if (word_ln >= 5) {
					while (word_si < word_ei) {
						result += String.valueOf(str.charAt(word_ei-1));
						word_ei--;
					}
				}
				else {
					while (word_si < word_ei) {
						result += String.valueOf(str.charAt(word_si));
						word_si++;
					}
				}	
			}	
		}
		return result;
	}
	//////////////////////////////////////////////////////////////////////////
	// Requires: This function takes a valid String	str						//
	// Effects : Returns a new string with all vowels removed				//
	//////////////////////////////////////////////////////////////////////////
	private static String removeVowelsFromString(String str) {
		boolean foundVowel = false;
		String result = "";
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i < str.length(); i++) {
			foundVowel = false;
			// checks if current charater  is a vowel
			for (int j = 0; j < vowels.length; j++) {
				if (Character.toLowerCase(str.charAt(i)) == vowels[j]) {
					foundVowel = true;
				}
			}
			// if current charater is not vowel 
			// then put back into the result
			if (!foundVowel) {
				result += String.valueOf(str.charAt(i));
			}
		}
		return result;
	}
	//////////////////////////////////////////////////////////////////////////
}
