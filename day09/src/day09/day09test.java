package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class day09test {
	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);
		 HashMap map =new HashMap();
		 String name =null;
		 String value =null;
		  int num=0;
		  while(true) {
			  System.out.println("1.메뉴 등록");
			  System.out.println("2.메뉴별 가격 보기");
			  System.out.println("3.종료");
			  System.out.print(">>>>");
			  num=input.nextInt();//Scanner 클래스의 매소드 중 정수를 입력 받고 num 값에 변수값을 넣는다
			  
			  if(num==1) {
				  System.out.println("매뉴 입력:");
				  name=input.next();
				  if(map.containsKey  (name)==false)/*containsKey는 조사 결과값을 리턴 해준다 */ {
				  System.out.println("가격 등록");
				  value=input.next();
				  map.put(name,value);
				  System.out.println("등록 되었습니다");
			  }
			  else {
				  System.out.println("존재하는 매뉴 입니다");
			  }
				  
			  
			  
		  }
			  else if( num==2) {
				  Iterator it=map.keySet().iterator();
				  while(it.hasNext()) {
					  name=(String)it.next();
					  System.out.println(name+":"+map.get(name));
				  }
				  
				  
				  
			  }
		  }

	
}
}


