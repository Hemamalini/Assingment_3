package assingment3;

public class ReverseEvenWords {
	public static void main(String[] args) {
		
		String test = "I am a software tester";//declare input 
		String finalTestRev = "";
		String[] splitVal = test.split("\s");//split test statement using space
		
		for(int i=0;i<splitVal.length;i++) {
			if(i%2!=0) {//check even position word
				String rev = "";
				char[] splitEvenArray = splitVal[i].toCharArray();//convert to char array
				for(int j=splitEvenArray.length-1;j>=0;j--) {//print each char in reverse
					rev = rev+splitEvenArray[j];//appending reverse char into words
				}
				finalTestRev = finalTestRev+" "+rev;//append even position reverse words with final statement using space
			} else {
				finalTestRev = finalTestRev+" "+splitVal[i];//append odd position reverse words with final statement using space
			}
		}
		System.out.println("ReverseEvenWords : "+finalTestRev);//appended both even(reverse) and odd position words into statement
		
	}

}
//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

/* Pseudo Code:
 
 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/
