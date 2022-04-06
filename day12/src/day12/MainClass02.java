package day12;
/*
 this
 자기 자신의 정보를 저장하는 매개 변수
 따로 생성하지 않더라도 메소드의 0번째 매개변수로 생성됨
*/
public class MainClass02 {
public static void main(String[] args) {
	Ex02 ex=new Ex02();
	System.out.println(ex);
	ex.setA(12345);
	
	//ex.a=789;
	ex.print();
}
}
 