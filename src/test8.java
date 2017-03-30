import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class test8 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList();
		int[] arr = new int[7];
		for(int i=0;i<arr.length;i++){
			arr[i] = input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			ll.add(arr[i]);
		}
		
		Collections.sort(ll);
		System.out.println(ll);
		
		int start=0,end=0;
		
		A: for(int i=0;i<arr.length;i++){
			if(arr[i]!=ll.get(i)){
				start = i;
				break A;
			}
		}
		
		
		for(int i=0;i<ll.size();i++){
			if(arr[i]!=ll.get(i)){
				end=i;
			}
		}
		
		if(start==0 && end==0){
			System.out.println(0);
		}else{
			System.out.println(start+" "+end+" : "+(end-start+1));
		}
		
	}

}
