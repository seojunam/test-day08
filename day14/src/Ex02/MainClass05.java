package Ex02;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int age;
	System.out.println("나이 입력");
	try {
		age= input.nextInt();
		if(age<=0)
			throw new Exception("잘못 입력");
		System.out.println("당신의 나이는:"+age);
	} catch (Exception e) {
		System.out.println(e.getMessage()); 
	}
}
}
