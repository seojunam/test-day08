package day02;

import java.util.Scanner;

public class EX04 {
  public static void main(String[] args) {
	Scanner ia =new Scanner (System.in);
	// String =자료형 또는 타입 이라고 부른다
	// name= 변수는 데이터를 저장하기위한 공간 
	// 초기화 주는 이유는 쓰레기값을 없애기위해 대문자는 null주고 소문자는 숫자 0을준다
	String name=null;
	int korea=0, eng=0 ,math=0, sum=0; 

	
	
	System.out.print("당신의 이름은 무엇입니까??");
	name =ia.next();
	
	
	System.out.print(name+"님의국어점수:");
	korea=ia.nextInt();
	System.out.print(name+"님의영어점수:");
	eng=ia.nextInt();
	System.out.print(name+"님의수학점수:");
	math=ia.nextInt();
	sum=korea+eng+math;
	
	System.out.println("============");
	System.out.println("이름 :서주남");
	System.out.println("============");
	System.out.println("국어:"+korea);
	System.out.println("수학:"+math);
	System.out.println("영어:"+eng);
	System.out.println("============");
	System.out.println("합계 :"+sum);
	System.out.println("평균:"+(sum/3));
}
  
}
