package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EX03 {
	public static void main(String[] args) {
		/*
		 HashSet
		 -순서가 없으며, 중복은 허용하지 않는다 
		  */
		HashSet set =new HashSet();
		ArrayList arr =new ArrayList();
		
		set.add("라면");set.add("진미김밥질려");
		set.add("순대");set.add("라면");
		
		arr.add("라면");arr.add("진미김밥질려");
		arr.add("순대");arr.add("라면");
		
		System.out.println("set:"+set);
		System.out.println("arr:"+set);
		
		Iterator it =set.iterator();
		while(it.hasNext()) {
			
			
			
			//System.out.println(it.next());//()소괄호가 있으면 어떠한 기능이 있구나 생각
		}
		
		/*
		Iterator it =set.iterator();
		System.out.print(it.hasNext()+":");
		System.out.println(it.next()); 
		System.out.print(it.hasNext()+":");
		System.out.println(it.next());  
		System.out.print(it.hasNext()+":");
		System.out.println(it.next());  
		System.out.print(it.hasNext()+":");
		System.out.println(it.next());  
		System.out.print(it.hasNext()+":");
		System.out.println(it.next());  
		*/
		
 		
		
		
	
	}

}
