package day08;

import java.util.ArrayList;
import java.util.Iterator;

public class EX02 {
	public static void main(String[] args) {
		/*
		 컬렉션
		 -자료구조
		 프리엠워크
		 -틀,형식에 맞춰져 있다.
		 */
		/*
		 ArrayList
		 -순서가 유지 되는 자료형
		 -배열과 비슷하게 사용된다
		 -가변적인 크기를 가지고 있다  
		  */
		ArrayList arr =new ArrayList();//클레스(ArrayList) 들은 기능을 가지고 있다 
		arr.add("aaa");
		arr.add("111");
		arr.add("222");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(arr.size());// 파일갯수를 나타남
		System.out.println(arr.contains("aaa"));//값이 존재 하냐 물어본는 값
		System.out.println("remove:"+arr.remove("aaa")); //데이터 삭제
		System.out.println(arr.contains("aaa"));
		System.out.println("=====삭제후 확인=====");
		System.out.println(arr.size());//3개중 1개가 삭제되어 2개로 출력된다
		System.out.println(arr.get(0));//원래는1이였지만 0으로 나오는 이유는 aaa는 삭제가 되어서 111 나온다
		arr.clear();//완전 삭제
		System.out.println(arr.size());
		
		arr.add("aaa");//0
		arr.add("111");//1
		arr.add("222");//2
		
		System.out.println(arr.indexOf("aaa"));//해당하는 값이 있으면 0으로 표현
		System.out.println(arr.indexOf("aaa1"));//해당하는 값이 없으면 -1로 나타 낸다
		
		
		}
		
	}


























