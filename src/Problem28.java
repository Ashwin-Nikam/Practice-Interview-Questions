/* Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

public class Problem28 {
	
	public static void main(String args[]){
		System.out.println(strStr("mississippi","issipi"));
	}
	
	
	
		public static int strStr(String haystack, String needle) {
	        
			if(haystack.length()<needle.length()){
				return -1;
			}
			
			else if(needle.length()==0)
				return 0;
			
	        int threshhold = haystack.length()-needle.length();
	        for(int i=0;i<=threshhold;i++){
	        	if(haystack.substring(i,i+needle.length()).equals(needle)){
	        		return i;
	        	}
	        }
	        
	        return -1;

	  }

}