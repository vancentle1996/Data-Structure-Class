/**
 * Completed by: Hai Le 
 */
import java.util.Scanner;

public class ReverseStringTester {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		  System.out.println("Enter the first word:");
        String inputString1 = input.nextLine();
     
        System.out.println("Enter the second word:");
        String inputString2 = input.nextLine();
     
        //test if reversed
        boolean output = isReverse(inputString1, inputString2);
     
        //report answer
        if (output) {
           System.out.println(inputString1 + " is the reverse of " + inputString2);
        } 
        else {
           System.out.println(inputString1 + " is not the reverse of " + inputString2);
        }
        input.close();
	}
	
	   private static boolean isReverse(String inputString1, String inputString2) {
            //return true if the reverse of the first string/word is the same as the second string/word
            return inputString2.equals(reverse(inputString1)); 	   
      }

      //Reading each character of the first string/word
      //and store them in result variable
      public static String reverse(String inputString1) 
         {
            String result = "";
            for (int i = 0; i < inputString1.length(); i++) {
            result = inputString1.charAt(i) + result;
         }
         return result;
      }
}
