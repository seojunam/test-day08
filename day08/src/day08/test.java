package day08;

import java.util.ArrayList;


public class test {
	public static void main(String[] args) {
		
		
		ArrayList arr =new ArrayList();
		ArrayList att =new ArrayList();
		
		
		arr.add("홍길동");
		arr.add("나동빈");
		arr.add("수야");
		
		att.add("010-3345-4434");
		att.add("010-3665-1255");
		att.add("010-7665-9875");
		
		System.out.println(arr.size());
		System.out.println(att.size());
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(att.get(0));
		System.out.println(att.get(1));
		System.out.println(att.get(2));
		
		System.out.println(arr.contains("감"));
		System.out.println(arr.contains("수야"));
		System.out.println("remove:"+arr.remove(0));
		System.out.println("remove:"+att.remove(0));
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(att.get(0));			
		System.out.println(att.get(1));
		
		System.out.println("=====종료=====");
		
		
	}

}
