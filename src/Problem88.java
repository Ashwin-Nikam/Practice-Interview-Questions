/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */


public class Problem88 {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       /* LinkedList<Integer> list = new LinkedList();
	        for(int i=0;i<m;i++){
	            list.add(nums1[i]);
	        }
	        
	        for(int i=0;i<n;i++){
	            list.add(nums2[i]);
	        }
	        
	        Collections.sort(list);
	        for(int i=0;i<list.size();i++){
	            nums1[i]=list.get(i);
	        }*/
	        
	        
	        while(n>0){
	            nums1[m+n-1] = (m==0||nums2[n-1] > nums1[m-1]) ? nums2[--n] : nums1[--m];  
	        } 
	    }

	 public static void main(String args[]){
		int[] nums1 = {3,4,0,0};
		int [] nums2 = {1,2,0,0};
		merge(nums1,2,nums2,2);
		for(int i=0;i<(2+2);i++){
			System.out.println(nums1[i]);
		}
		
	 }
}
