import java.util.LinkedList;
import java.util.Scanner;

//Determine whether a given string is a palindrome

public class Facebook {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		String mainStr = input.nextLine();
		mainStr = mainStr.replaceAll("\\s","");
		System.out.println(mainStr);
		
		char[] arr1 = mainStr.toCharArray();
		int j=mainStr.length()-1;
		LinkedList<Character> list1 = new LinkedList();
		LinkedList<Character> list2 = new LinkedList();
		for(int i=0;i<arr1.length;i++){
			list1.add(arr1[i]);
		}
		
		for(int i=arr1.length-1;i>=0;i--){
			list2.add(arr1[i]);
		}
		
		boolean flag = true;
		
		for(int i=0;i<list1.size();i++){
			if(list1.get(i).equals(list2.get(i)))
				continue;
			else
				flag = false;
		}
		
		if(flag==true)
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string isn't a palindrome");
		
	}

}
