package day12;

public class Ex02 {
int a=10;
public void setA(int a) {
	System.out.println(this);
	this.a=a;//this는 자기 정보를 알고 있으니까 실행하면 알고 있는 것을 출력한다
}
public void print() {
	System.out.println("a:"+a);
	//a이라는 변수가 없으니까 밖에 있는 변수를 실행시킨다
}
}
