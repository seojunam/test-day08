package day02;

import java.util.Scanner;

public class EX04 {
  public static void main(String[] args) {
	Scanner ia =new Scanner (System.in);
	// String =자료형 또는 타입 이라고 부른다
	// name= 변수 데이터를 저장하기위한 공간 
	//변수는 주는 이유는 쓰레기값을 없애기위해 대문자는 null주고 소문자는 숫자 0을준다
	String name=null;
	
	System.out.print("당신의 이름은 무엇입니까??");
	name =ia.next();
	
	
	System.out.println(name+"님의국어점수:"+100);
	System.out.println(name+"님의영어점수"+98);
	System.out.println(name+"님의수학점수"+75);
	
	System.out.println("============");
	System.out.println("이름 :서주남");
	System.out.println("============");
	System.out.println("국어\t :100");
	System.out.println("수학\t :98");
	System.out.println("영어\t :75");
	System.out.println("============");
	System.out.println("합계\t :");
	
}
  
}
