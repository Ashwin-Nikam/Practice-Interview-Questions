import java.util.LinkedList;

/*
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */


public class Problem38 {
	
	public static void main(String args[]){
		System.out.println(countAndSay(112));
	}
	
	public static String countAndSay(int n) {       
		String num = Integer.toString(n);
		char[] arr = num.toCharArray();
		LinkedList<Integer> list = new LinkedList();
		for(int i=0;i<arr.length;i++){
			list.add(Character.getNumericValue(arr[i]));
		}
		
		System.out.println(list);
		LinkedList<Integer> fList = new LinkedList();
		int count=0;
		boolean flag = false;
		A: for(int i=0;i<list.size();i++){
			while(list.get(i)==list.get(i+1) && flag == false){
				if(i+1==list.size()-1){
					flag=true;
				}
				count++;
				i++;
			}
			count++;
			if(flag == true){
				fList.add(count);
				fList.add(list.get(i));
				break A;
			}
			fList.add(count);
			fList.add(list.get(i));
			System.out.println(fList);
			
		}
		
		System.out.println(fList);
		
		return "11";
	}
}
