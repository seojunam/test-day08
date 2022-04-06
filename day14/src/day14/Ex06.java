package day14;
class Ex06_01 {
	public Ex06_01(String s) {
		System.out.println(s+"부모");
	}
	public void aaa() {
		System.out.println("부모"+"aaa");
	}
}
public class Ex06  extends Ex06_01{
public Ex06(String s) {
		super(s);
		System.out.println(s+"자식");
	}
	public void test() {
		this.aaa();
	}
	public void aaa() {
		System.out.println("자식 aaaa");
	}
}

