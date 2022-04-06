package day12;

public class Ex01 {
public int a =10;
public void func01() {
	int a=10000;//변수가 같은면 안에 있는 변수가 실행된다
	System.out.println("01:"+a);
}
public void func02() {
	System.out.println("02:"+a);
}
}
