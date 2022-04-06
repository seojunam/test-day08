package day12;

import java.util.Scanner;

public class test03 {
private String saveld,savepwd;
public String getSavepwd() {
	return savepwd;
}
public String getSaveld(){
	return saveld;
}
public void register() {
	Scanner input =new Scanner(System.in);
	System.out.println("저장 아이디 입력");
	saveld=input.next();
	System.out.println("저장 비밀번호 입력");
    savepwd=input.next();
}
public void userChk() {
	Scanner input =new Scanner(System.in);
	String inputld,inputpwd;
	
	System.out.println("아이디 입력");
	inputld =input.next();
	System.out.println("비밀번호 입력");
	inputpwd=input.next();
	if(inputld.equals(getSaveld())&&inputpwd.equals(savepwd)){
		System.out.println("인증통과");
	}  
	else {
		System.out.println("인증 실패");
	}
	
}
public int userChk(String id,String pwd) {
	if (id.equals(getSaveld())&&pwd.equals(savepwd)) {
		return 0;
	}
	else {
		return 1;
	}
}


}
