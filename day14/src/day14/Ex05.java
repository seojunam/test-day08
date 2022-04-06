package day14;
class Ex05_01{
	public Ex05_01() {
		System.out.println("부모 생성자");
	}//부모에 생성자가 생기면 이렇게 다시 만들어준다 super 사용하면 안써도 된다
	public Ex05_01(String s) {
		System.out.println(s+"Ex05_01");
	}
}//  class 만든이유는 파일은 안만들기 위해 만들었다 내부에서만 가능
public class Ex05 extends Ex05_01 {
public Ex05() {
	super("넘겨줌");//부모에 있는 생성자를 실행하때 하는법
	System.out.println("Ex05");
}// extends 상속받은 부모 먼저 실행하고 그다음 자신을 실행한다

}
