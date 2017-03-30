import java.util.LinkedList;
import java.util.Scanner;


public class Problem26 {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] nums = new int[length];
		for(int i=0;i<length;i++){
			nums[i] = input.nextInt();
		}
		System.out.println(removeDuplicates(nums));
		
	}
	
public static int removeDuplicates(int[] nums) {
        
	 if(nums.length==0)
         return 0;
     int temp=0;
     for(int i=0;i<nums.length;i++){
         if(nums[i] != nums[temp]){
             nums[++temp] = nums[i];
         }
     }
     
     return ++temp;
        
    }


}
