package java8features;

import java.util.stream.Collectors;

public class Palindrome_With_Special_Char
{
	public static void main(String[] args) {
		

	    String str = "a2 , Bb2.a";

		str = "navan";
		String newstr = "";


        //boolean result = checkForPalindrome(str, newstr);
        boolean result = checkForPalindromeOptimize(str, newstr);



        if(result){
            System.out.println("Given Strings is palindrom");
        }else{
            System.out.println("Given Strings not palindrom");
        }
    }

    private static boolean checkForPalindromeOptimize(String str, String newstr) {

	    boolean result = false;

	    str.chars().mapToObj( item ->(char)item).collect(Collectors.toList()).forEach(System.out::print);

	    str.chars().mapToObj( item ->(char)item).map(e ->e.charValue());


	    int left = 0;
	    int right = str.length()-1;
	    while(left <right){
	        if(!(str.charAt(left) == str.charAt(right))){
	            return false;
            }
	        left++;
	        right--;
        }
	    return true;


    }


    private static boolean checkForPalindrome(String str, String newstr) {
        for (int i = 0; i < str.length(); i++){
           if (Character.isLetterOrDigit(str.charAt(i))){
               newstr = newstr + str.charAt(i);
           }
        }

        StringBuffer strBuffer =new StringBuffer();
        for (int j = newstr.length()-1; j>=0; j--){
            strBuffer.append(newstr.charAt(j));
        }

        if(strBuffer.toString().equalsIgnoreCase(newstr)){
            return true;
        }else{
            return false;
        }
    }
}