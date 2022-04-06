package day11;

public class Test04 {
   public int cnt=100;//공통적인 변수는 바깥에 만든다 그 외는 안쪽에 만든다
   public void test01() 
   {
	   System.out.println("test01:"+cnt);
	   cnt+=1000;
   }
   public void test02() 
   {
	   System.out.println("test02:"+cnt);
   }
}
