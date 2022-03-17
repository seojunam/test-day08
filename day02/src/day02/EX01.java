package day02;

public class EX01 {
     public static void main(String[] args) {
	/*
	 변수 
	 -데이터를 저장하기 위한 공간
	 -저장하기 위한 공간이기에 언제든지 값의 변경이 가능
	 -저장공간(변수)이름을 지울때 공백은 허용하지 않는다
	 -자료형
	 int :정수를 표현 :4byte
	 char :문자 표현 :1byte 키포드의 자판
	 float :실수 표현 :4byte 소수점 6번째 자리까지
	 double :실수 표현 :8byte 	 
	 */
    /*int age = 30;
    double weigth =55.0;
    double heigth =163.6;
    System.out.println("나의 나이는 "+age);
    System.out.println("나의 몸무게는 "+weigth);
    System.out.println("나의 키는 "+heigth);
    */
   char ch='A';
   //int num =5;
   //int ret; 밑에가 한번에 만든 내용
   int num =5, ret;
   ret =ch+num;
   System.out.println("ret ="+ret);
   System.out.println("ch :"+ch);
   System.out.println("num :"+num);
   
   ch ='B';
   num =1;
   
   System.out.println("변경 후");
   
   System.out.println("ret ="+ret);
   System.out.println("ch :"+ch);
   System.out.println("num :"+num);
   
   /*
    형변환 
    -자료형에 대하여 변화
    -형변환 -> type -casting
    */
   System.out.println("ret ="+ (char)ret);
   System.out.println("ch :"+(int)ch);
    	 
}
}
