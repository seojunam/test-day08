package day14;
/*
 싱글톤 패턴
 하나의 객체를 만들어 공유하는것 
 */
public class MainClass02 {
public static void main(String[] args) {
	Ex02 ex01=new Ex02();
	Ex02 ex02=ex01;//new Ex02();
	
	
	ex01.num=1234;
	ex02.num=5678;
	
	System.out.println(ex01);//위치 정보
	System.out.println(ex02);
	
	System.out.println(ex01.num);
	System.out.println(ex02.num);
	
}
}
