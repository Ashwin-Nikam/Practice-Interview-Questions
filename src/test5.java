import java.util.*;
public class test5 {
	
	   
	    static void firstOccur(char arr[])
	    {
	
	        int min = -1;
	
	        HashSet<Character> set = new HashSet<>();
	 
	        for (int i=arr.length-1; i>=0; i--)
	        {
	            
	            if (set.contains(arr[i]))
	                min = i;
	 
	            else  
	                set.add(arr[i]);
	        }
	 
	        if (min != -1)
	          System.out.println(arr[min]);
	    
	    }
	    public static void main (String[] args) throws java.lang.Exception
	    {
	    	String s = "abcdba";
	        char arr[] = s.toCharArray(); 
	        firstOccur(arr);
	    }
	}


