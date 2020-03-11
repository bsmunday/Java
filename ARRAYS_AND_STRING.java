package Assignment;

public class ARRAYS_AND_STRING {

	public static void main(String[] args) {
	
		//----------------------------------------------------------------------//
		// Problem 1: Test														//
		//----------------------------------------------------------------------//
		/*String line = "  1111111  1111111 1111111 1111111 ";
		int shortestLength = getLengthShortestWord(line);
		System.out.println("Length of the shortest word: " + shortestLength);*/
		
		//----------------------------------------------------------------------//
		// Problem 2: Test														//
		//----------------------------------------------------------------------//
		/*int[] array = {4, 2, 3, 1};
		int sum = sumAllExceptHighestLowest(array);
		System.out.print("Sum of all the values of array except ");
		System.out.println("the highest and lowest values: " + sum);*/
		
		//----------------------------------------------------------------------//
		// Problem 3: Test														//
		//----------------------------------------------------------------------//
		/*String str = " h el l o        w    orld    ";
		String result = removeSpaces(str);
		System.out.println("Output: " + result);*/
		
		//----------------------------------------------------------------------//
		// Problem 4: Test														//
		//----------------------------------------------------------------------//
		/*String str = "ABCDEFGHIJ";
		boolean strHasUnqLetters = stringHasUniqueLetters(str);
		System.out.println("String has unique letters: " + strHasUnqLetters);*/
		
		/*
		String str = "A B CD EF GH I J";
		String result = reverse(str);
		System.out.println("Output: " + result);
		 */
		
		//----------------------------------------------------------------------//
		// Problem 5: Test														//
		//----------------------------------------------------------------------//
		/*String listName = "odd";
		int[] oddList =  {23,25,75,87,47,1,91,51,2};
		int result = takeOutNumber(oddList, listName);
		System.out.println("Output: " + result);
		
		listName = "even";
		int[] evenList =  {22,44,64,76,98,12,43,54,90};
		result = takeOutNumber(evenList, listName);
		System.out.println("Output: " + result);*/
		
		//----------------------------------------------------------------------//
		// Problem 6: Test														//
		//----------------------------------------------------------------------//
		/*String str = "a A b B cC Dd";
		String result = swapsCaseAlphabets(str);
		System.out.println("Output: " + result); */
		
		//----------------------------------------------------------------------//
		// Problem 7: Test														//
		//----------------------------------------------------------------------//
		/*String str = "{}{}{}{{}}{}{}{}{{{}}}{{{{{}}}}}";
		boolean isBalanced = stringHasBalancedBraces(str);
		System.out.println("Output: " + isBalanced);*/
		
	}
	
	//----------------------------------------------------------------------//
	// Problem 1															//
	//----------------------------------------------------------------------//
	private static int getLengthShortestWord(String line){
		int shortestLength = line.length();
		int currentLength  = 0;		
	    for (int i = 0; i < line.length(); i++) {
	    	if (line.charAt(i) != ' ') {
	    		currentLength  = 0;
	    		while (i < line.length() && line.charAt(i) != ' ') {
	    			currentLength++;
	    			i++;
	    		}
	    		if (shortestLength > currentLength ) {
	    			shortestLength = currentLength;
	    		}
	    		i--;
	    	} 
	    }
		return shortestLength;
	}

	//----------------------------------------------------------------------//
	// Problem 2															//
	//----------------------------------------------------------------------//
	// min length 3
	// returns the sum of all the values of array except 
	// the highest and lowest values.
	private static int sumAllExceptHighestLowest(int [] array) {
		if (array.length < 3) { return 0; }
		int min = array[0];
		int max = array[1];
		int sum = 0;
		if (array[0] > array[1]) {
			min = array[1];
			max = array[0];
		}
		for (int i = 2; i < array.length; i++) {
			if (min < array[i] && array[i] < max) {
				sum += array[i];
			}
			else if (array[i] < min) {
				sum += min;
				min = array[i];
			}
			else if (max < array[i]) {
				sum += max;
				max = array[i];
			}
			else {
				// not sure this is the case when 
				// two of three are equal or 
				// all three are equal
			}
		}
		return sum;
	}
	
	//----------------------------------------------------------------------//
	// Problem 3															//
	//----------------------------------------------------------------------//
	private static String removeSpaces(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result += String.valueOf(str.charAt(i));
			}
		}
		return result;
	}
	
	//----------------------------------------------------------------------//
	// Problem 4															//
	//----------------------------------------------------------------------//
	private static boolean stringHasUniqueLetters(String str) {
		boolean fondDublicateLetter = true;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					fondDublicateLetter = false;
				}
			}
		}
		return fondDublicateLetter;
	}
	
	//----------------------------------------------------------------------//
	// Problem 4a															//
	//----------------------------------------------------------------------//
	private static String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += String.valueOf(str.charAt(i));
		}
		return result;
	}
	
	//----------------------------------------------------------------------//
	// Problem 5															//
	//----------------------------------------------------------------------//
	private static int takeOutNumber(int[] list, String listName) {
		int isEvenList = listName.equals("even") ? 1 : 0;
		int number = 0;
		for (int i = 0; i < list.length; i++) {
			// checks odd number if list is even otherwise checks even
			if ((list[i] % 2) == isEvenList) {
				number = list[i];
			}
		}
		return number;
	}
	
	//----------------------------------------------------------------------//
	// Problem 6															//
	//----------------------------------------------------------------------//
	private static String swapsCaseAlphabets(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.toUpperCase(str.charAt(i)) == str.charAt(i)) {
				result += String.valueOf(Character.toLowerCase(str.charAt(i)));
			}
			else {
				result += String.valueOf(Character.toUpperCase(str.charAt(i)));
			}
		}
		return result;
	}
	
	//----------------------------------------------------------------------//
	// Problem 7															//
	//----------------------------------------------------------------------//
	private static boolean stringHasBalancedBraces(String str) {
		char[] braces = new char[str.length()];
		char prevChar = ' ';
		int nextIndex = 0;
		boolean isBalanced= true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '[' ||  
				str.charAt(i) == '{') {
				braces[nextIndex] = str.charAt(i);
				nextIndex++;			
			}
			else if (str.charAt(i) == ')' ||  str.charAt(i) == ']' ||
					 str.charAt(i) == '}') {
				
				if (str.charAt(i) == ')') { prevChar = '('; }
				if (str.charAt(i) == ']') { prevChar = '['; }
				if (str.charAt(i) == '}') { prevChar = '{'; }
				
				if (nextIndex > 0 && braces[nextIndex-1] == prevChar) {
					nextIndex--;
				}
				else {
					isBalanced = false;
					break;
				}
			}
			else {
				// nothing if there are other characters like 'a', 'b', '/'
			}	
		}
		return (nextIndex > 0) ? false : isBalanced;
	}
	//----------------------------------------------------------------------//
}
