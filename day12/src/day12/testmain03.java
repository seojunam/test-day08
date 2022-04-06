package day12;

import java.util.Scanner;

public class testmain03 {
 public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int num,result=0;
	test03 login =new test03();
	String inputld =null,inputpwd=null,
	saveld=null,savepwd=null;
	
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.가입");
		System.out.println("3.종료");
		num=input.nextInt();
		switch(num) {
		case 1:
			System.out.println("아이디 입력");
			inputld =input.next();
			System.out.println("비밀번호입력");
			inputpwd=input.next();
			result=login.userChk(inputld,inputpwd);
			if(result==0) {
				System.out.println("인증통과");
			}
			else {
				System.out.println("인증실패");
			}
			break;
		case 2:
			login.register();
		break;
		case 3:break;
		}
	}
}
}
