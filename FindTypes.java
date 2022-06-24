package assingment3;;

public class FindTypes {
	public static void main(String[] args) {
		//input value
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		//initalise value
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		//Convert the String to character array
		char[] StringArray = test.toCharArray();
		int lengthVal = StringArray.length;
		//loop array
		for(int i =0;i<=lengthVal-1;i++) {
			//check digit number space special char
			if(Character.isLetter(StringArray[i])==true) {
				letter=letter+1;

			} else if(Character.isDigit(StringArray[i])==true) {	
				num++;

			} else if(Character.isSpaceChar(StringArray[i])==true) {
				space++;
			} else{
				specialChar++;
			}
		}	

		// print the value
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);
		System.out.println("specialCharcter: " + specialChar);




	}
}
