import java.util.Scanner;


public class test10 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		long f[] = new long[x+1];
		int i;
		f[0]=0;
		f[1]=1;
		f[2]=2;
		for(i=3;i<=x;i++){
			f[i]=(f[i-1]+f[i-2]+f[i-3])+1;
		}
		
		System.out.println(f[x]);
		
	}

}
