import java.util.Collections;
import java.util.LinkedList;

/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
 */

public class Problem125 {
	
	public static void main(String args[]){
		isPalindrome("ab");
	}
	
	 public static boolean isPalindrome(String s) {
	        if (s.isEmpty()) {
	        	return true;
	        }
	        int head = 0, tail = s.length() - 1;
	        char cHead, cTail;
	        while(head <= tail) {
	        	cHead = s.charAt(head);
	        	cTail = s.charAt(tail);
	        	if (!Character.isLetterOrDigit(cHead)) {
	        		head++;
	        	} else if(!Character.isLetterOrDigit(cTail)) {
	        		tail--;
	        	} else {
	        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
	        			return false;
	        		}
	        		head++;
	        		tail--;
	        	}
	        }
	        
	        return true;

	 }
}
