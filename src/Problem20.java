import java.util.LinkedList;

public class Problem20 {
	
	public static void main(String args[]){
		boolean val = isValid("({]])]})]}([)}{][)]{}{(])}([]}])})}([]}({}([{][{}");
		System.out.println(val);
	}
	
	 public static boolean isValid(String s) {
	        
	        char[ ] array = s.toCharArray();
	        LinkedList<Character> list1 = new LinkedList();
	        LinkedList<Character> list2 = new LinkedList();
	        LinkedList<Character> list3 = new LinkedList();
	        
	        list1.add('(');
	        list1.add('{');
	        list1.add('[');
	        list2.add(')');
	        list2.add('}');
	        list2.add(']');
	        int count=0;
	        for(int i=0;i<array.length;i++){
	        	if(list1.contains(array[0])==false){  //Check if first bracket isn't in list2
	                return false;
	            }else if(list1.contains(array[i])==true){
	        		list3.add(array[i]);
	        		count++;
	            }
	        	else{
	        		if(count==0){    //For input like "]"
	        			return false;
	        		}else{
	        			
	        			System.out.println(list3.get(list3.size()-1));   //Find top of list3
		        		if(list1.indexOf(list3.get(list3.size()-1))== list2.indexOf(array[i])){    //if top of list3 == new element then remove from list3 else return false
		        			list3.remove(list3.size()-1);
			        		count--;
		        		}else{
		        			return false;
		        		}
	        			
	        		}
	        		
	
	        	}
	        		
	        }
	        if(count==0)
	        	return true;
	        else 
	        	return false;
	   
	    }

}
