//Google interview
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class test2 {
	
	public static void main(String args[]){
   
		int x =623315;
		//System.out.println("Question "+x);
		int temp = x;
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		int l=0;
		int [] main = new int [10];
		do{
		    array.add(temp % 10);
		    temp /= 10;
		} while  (temp > 0);
		
		Collections.reverse(array);
		System.out.println(array);
		
		double average = 0;
		
		A: for(int i=0;i<array.size()-1;i++){
			B : for(int j=i+1;j<array.size();j++){
				average = (double)(array.get(i)+array.get(j))/2;
				int avg = (int) Math.ceil(average);
				for(int q=0;q<i;q++){
					array1.add(array.get(q));
				}
				
				array1.add(avg);
				
				for(int z=j+1;z<array.size();z++){
					array1.add(array.get(z));
				}
				
				//System.out.println(array1);
				
				String s = "";
				for(int w=0;w<array1.size();w++){
					s+=array1.get(w).toString();
				}
				array2.add(Integer.parseInt(s));
				array1.clear();
				break B;
				
			}
		}
		/*
		for(int i=0;i<main.length;i++){
			System.out.println(main[i]);
		}*/
		
		System.out.println(array2);
		System.out.println("\nMax\n"+Collections.max(array2));
		
	}
}
	
	


