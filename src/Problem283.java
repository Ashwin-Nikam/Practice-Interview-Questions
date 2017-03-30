/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class Problem283 {

	public static void moveZeroes(int[] nums) {
        
	       int pos = 0;
	       for(int n:nums){
	           if(n!=0){
	               nums[pos] = n;
	               pos++;
	           }
	       }
	       
	       while(pos<nums.length){
	            nums[pos] = 0;
	            pos++;
	       }
	        
	    }
	
	public static void main(String args[]){
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}
