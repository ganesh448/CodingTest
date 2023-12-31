package codingTest;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "dog";

		// Inside the main method
		if(areAnagrams(str1, str2)) {
			System.out.println(str1+" and " + str2+" are anagrams");
			
		}
		else {
			System.out.println(str1+" and "+str2+" are not anagrams.");
		}
	}
	// Add the following method to sort a string
	public static boolean areAnagrams(String str1, String str2) {
		str1 = str1.replaceAll("\\s","").toLowerCase();
		str2 = str2.replaceAll("\\s","").toLowerCase();
		
		if(str1.length()!= str2.length()) {
			return false;
			
		}
		char[] charArray1= str1.toCharArray();
		char[] charArray2= str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
		
		// TODO Auto-generated method stub

	}

}
