package day07;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
		int arr[]= new int[] {10,54,13,17,25,30};
		
		for(int i=0;i<arr.length;i++) {
			
        	/*if(arr[i]%2 ==0) {
    			System.out.println("입력 값 짝수:"+arr[i]);
    		}
    		if(arr[i]%2 !=0) {
    			System.out.println("입력 값 홀수: "+arr[i]);
    		}*/
			Scanner input =new Scanner(System.in);
    		 String odd_even;
    		 System.out.println("홀수짝수 입력");
    		 odd_even=input.next();
    		 for(i=0;i<arr.length;i++) {
    			 if("짝수".equals(odd_even)&& i%2==0) {
    				 System.out.println("짝수:"+arr[i]);
    			 }
    			 if("홀수".equals(odd_even)&& i%2!=0) {
    				 System.out.println("홀수:"+arr[i]);
    			 }
    		 }
    		/* System.out.println("=========");
    		 if(odd_even.equals("짝수")) {
    			 for( i=0; i<arr.length;i+=2) {
    				 System.out.println("짝수:"+arr[i]);
    			 }
    		 }
    		 else {
    			 for(i=1; i<arr.length;i+=2) {
    				 System.out.println("홀수:"+arr[i]);
    			 }
    		 }*/
        }
	}

}
