import java.util.LinkedList;


public class test6 {
	
	public static void main(String args[]){
		System.out.println(solution(1,8,3,2));
	}
	
	public static String solution(int a, int b, int c, int d){
		int h1 = 0,h2 = 0,m1 = 0,m2;
		LinkedList <Integer> ll = new LinkedList();
		ll.add(a);
		ll.add(b);
		ll.add(c);
		ll.add(d);
	A:	for(int i=2;i>=0;i--){
			for(int j=0;j<ll.size();j++){
				if(i==ll.get(j)){
					h1=ll.get(j);
					ll.remove(j);
					break A;
				}
			}

		}
	if(h1==2){	
		B:	for(int i=3;i>=0;i--){
			for(int j=0;j<ll.size();j++){
				if(i==ll.get(j)){
					h2=ll.get(j);
					ll.remove(j);
					break B;
				}
			}

		}
	}else{
		
		B:	for(int i=9;i>=0;i--){
			for(int j=0;j<ll.size();j++){
				if(i==ll.get(j)){
					h2=ll.get(j);
					ll.remove(j);
					break B;
				}
			}

		}
		
	}
	
		
	C:	for(int i=5;i>=0;i--){
			for(int j=0;j<ll.size();j++){
				if(i==ll.get(j)){
					m1=ll.get(j);
					ll.remove(j);
					break C;
				}
			}

		}
	
		if(ll.size()==1){
			m2 = ll.get(0);
			String hour1 = Integer.toString(h1);
			String hour2 = Integer.toString(h2);
			String min1 = Integer.toString(m1);
			String min2 = Integer.toString(m2);
			String finalTime = hour1+hour2+":"+min1+min2;
			return finalTime;
			
		}else{
			return "NOT POSSIBLE";
		}
	}

}
