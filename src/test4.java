import java.util.Scanner;


public class test4 {
	public static void main(String args[]){
		        Scanner input = new Scanner(System.in);
		        int n = input.nextInt();
		        for(int i=0;i<n;i++){
		        	int a = input.nextInt();
		        	int b = input.nextInt();
		        	int c = input.nextInt();
		        	
		        	if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
		        		if(a==b && b==c){
		        			System.out.println("Equilateral");
		        		}else if(a==b || b==c || a==c){
		        			System.out.println("Isosceles");
		        		}else{
		        			System.out.println("None of these");
		        		}
		        	}else{
	        			System.out.println("None of these");
	        		}
		        }
		        
		        
		        	
		    }
}
