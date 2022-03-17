package day02;

public class EX02 {
    public static void main(String[] args) {
	/*100 =상수화 고정되있는 값
	 final 값을 변환시키지 않는다
	 */
   final double PI =3.14; 	
   final String KOREA ="대한민국";
   //KOREA ="미국";
   System.out.println("KOREA:"+KOREA);
   
   
   String name="김말이";
   int age =20, iq=120;
   
   float ki =173.3f;
   //float ki2=(float)173.3; float 사용시 이렇게 사용
   
   double ki3 =173.4;
   String grade ="B";
   char grade1 ='B';
   
   System.out.println("이름:"+name);
   System.out.println("나이:"+age);
   System.out.println("키 :"+ki);
   System.out.println("아이큐:"+iq);
   System.out.println("emdrmq:"+grade);
}
   
}
