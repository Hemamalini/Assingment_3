package assingment3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//set flag 
		boolean flag = false;
		//declare value
		String text1 = "stops";
		String text2 = "potss";
		//find the length of string
		int textLength1 = text1.length();
		int textLength2 = text2.length();
		//compare length of string
		if(textLength1==textLength2) {
			//convert string to array
			char[] text1Val = text1.toCharArray();
			char[] text2Val = text2.toCharArray();
			Arrays.sort(text1Val);
			Arrays.sort(text2Val);
			//iterate and cheack the value of array
			for(int i=0;i<=textLength1-1;i++) {
				if(text1Val[i]==text2Val[i]) {
					flag = true;
				}
			}
		}else {
			flag = false;
		}
		//compare the flag
		if(flag==true) {
			System.out.println("The Given text is Anagram");
		}else
			System.out.println("The Given text is not Anagram");
	}
}
