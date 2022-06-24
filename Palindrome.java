package assingment3;

public class Palindrome {

	public static void main(String[] args) {
		// Declare String
		String palindromeString = "madam";
		String reverseString = "";
		//Iterate loop to reverse String
		for(int i=(palindromeString.length())-1;i>=0;i--) {
			reverseString= reverseString+palindromeString.charAt(i);
		}
		//Check given and reversed string
		if(reverseString.equals(palindromeString)) {
			System.out.println("The Given input is Palindrome");
		}else {
			System.out.println("The Given input is not Palindrome");
		}
		
	}
}
