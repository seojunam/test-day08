package Ex02;
class BBB{
	public void test() {
		try {
			test1();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void test1()throws Exception {
		System.out.println("test01 실행");
			Thread.sleep(0);
		
		ProcessBuilder pb =new ProcessBuilder("calc");
		pb.start();
		
	}
}
public class MainClass04 {
public static void main(String[] args) {
BBB b=new BBB();
b.test();
}
}
