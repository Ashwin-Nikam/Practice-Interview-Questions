
public class bSearch {

	public static void main(String args[]){
		int[] num = {1,2,3,4,5,6,7,8,9};
		int start = 0;
		int end = num.length-1;
		
		int key = 8;
		while(start<end){
			int mid = start + (end-start)/2;
			if(num[mid]==key){
				System.out.print(mid);
				break;
			}else if(num[mid]>key){
				end = mid;
			}else
				start = mid+1;
		}
	}
	
}
