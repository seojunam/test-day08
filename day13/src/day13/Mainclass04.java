package day13;
/*
 생성자
 반환타입은 없으면 클래스 이름과 동일하게 만든다
 초기화 목적으로 만들어 사용한다
 객체 생성시 자동으로 호출 된다 
 */
class AAA{
//public AAA() {System.out.println("생성자 실행");}

public AAA(String s) {System.out.println(s+"생성자 실행");}
 public AAA() {System.out.println();}
void test()
{System.out.println("test");}
}
public class Mainclass04 {
public static void main(String[] args) {
	//AAA a =new AAA();// 객체를 만들면 자동으로 실행된다  
	AAA aa= new AAA("초기화 진행");//생성자를 만들면 무조건 디폴들 생성자를 만들어야 한다
	AAA a= new AAA();
}
}
