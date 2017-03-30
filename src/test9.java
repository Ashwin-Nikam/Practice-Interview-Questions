import java.util.Scanner;


public class test9 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size");
		int n;
		n = input.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		int smallest;
		int secondSmallest;
		
		if(arr[0]<arr[1]){
			smallest = arr[0]; 
		    secondSmallest = arr[1]; 
		}else{
			smallest = arr[1]; 
		    secondSmallest = arr[0]; 
		}
		
	    for(int i=2;i<n;i++){
	    	if (arr[i]<smallest){
	    		secondSmallest = smallest;
	    		smallest = arr[i];
	    	}else if(arr[i]<secondSmallest && arr[i]>smallest){
	    		secondSmallest = arr[i];
	    	}
	    }
	    
	    System.out.println("\n"+secondSmallest);
		
	}
	
	
}
