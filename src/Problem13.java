import java.util.LinkedList;
import java.util.Scanner;

/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999. */

public class Problem13 {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String ip = input.next();
		int ans = romanToInt(ip);
		System.out.println(ans);
	}
	
public static int romanToInt(String s) {
        
        char[] mainArr = s.toCharArray();
        int num=0;
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(50);
        list.add(100);
        list.add(500);
        list.add(1000);
        
        LinkedList<Character> list1 = new LinkedList();
        list1.add('I');
        list1.add('V');
        list1.add('X');
        list1.add('L');
        list1.add('C');
        list1.add('D');
        list1.add('M');
        
        int temp;
        for(int i=0;i<mainArr.length;i++){
            if(i<mainArr.length-1 && list1.indexOf(mainArr[i])<list1.indexOf(mainArr[i+1])){
                temp=list.get(list1.indexOf(mainArr[i+1]))-list.get(list1.indexOf(mainArr[i])); 
                num+=temp;
                i++;
            }else{
                switch(mainArr[i]){
                case 'I':
                    num+=1;
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    num+=10;
                    break;
                case 'L':
                    num+=50;
                    break;
                case 'C':
                    num+=100;
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
            }
            }
            
        }
        
        System.out.println(num);
        return num;
        
        
    }

}
