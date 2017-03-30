import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class test7 {
	
	public static void main(String args[]){
		
		LinkedList<Integer> ll = new LinkedList(); 
		int[] arr = new int[7];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]= input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			ll.add(arr[i]);
		}
		
		Collections.sort(ll);
		System.out.println(ll);
		
	}

}
