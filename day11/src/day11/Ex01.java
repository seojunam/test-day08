package day11;
/*
 변수
 클래스 변수 :클래스 영역에서 만드는 변수
 인스턴스(객체)변수 : 인스턴스 (객체)가 생성될때 만들어 지는 변수
 지역 변수 :특징 지역에서 생성되는 변수
  */
public class Ex01 {
	public static void main(String[] args) 
	{//바깥쪽에서 만든 범위는 작은 범위 까지 사용가능 반대로 경우는 사용할수 없다
		int num=123;
		if(true) {
			System.out.println(num);
		
		}
	
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*3)+10);
			
		}
	}
	

}
