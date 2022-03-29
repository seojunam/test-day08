package day07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 배열 
		 같은 자료형으로 여러개의 공간을 만드는것
		 형식
		 자료형[] 변수명 =new 자료형[개수]
		 자료형 변수명[]=new 자료형 [개수]
		 		*/
		int[] arr =new int[5];// arr 배열명이다 
        arr[2]=100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        
        System.out.println(arr.length);//해당하는 배열 개수를 알려준다 length
        
        for(int i=0;i<arr.length;i++) { 
        	arr[i] =100*i;
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.println("출력:"+arr[i]);
        }
        double d[]=new double[] {10.1,20.2,30.3}; //d= 3개 값을 가지고 있다
        for(int i=0;i<3 ;i++) {
        	System.out.println("d:"+d[i]);
        }
        for(double d2 : d) {//d2한테 하나씩 출력
        	System.out.println(d2);
        }
        
        
        
        Scanner input =new Scanner(System.in);
        String[] names =new String[3];
        for(int i=0; i<names.length ;i++) {
        	System.out.println(i+".이름 입력:");
        	names[i]=input.next();
        }
        System.out.println("----출력------");
        for(String s:names) {
        	System.out.println(s);
        }
        
        // for(int i=0; i<names.length ;i++) {
    	//System.out.print(naems[i]); 간편하게 사용
	}

}
