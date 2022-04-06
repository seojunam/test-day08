package day14;
class AAA {
  public void aaa() {
	  System.out.println(" 자식 aaa");
  }	
}
class BBB extends AAA{
  protected int num;
	public void bbb() {
	  System.out.println("bbb");
  }	
  
  }

public class Ex07 extends BBB {
  public void test() {
	 num=100;
	  aaa();
	  bbb();
  }
  
  
}
