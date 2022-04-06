package day12;

import java.util.Scanner;

public class Testmain01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력");
		name=input.next();
		System.out.println("나이 입력");
		age=input.nextInt();
		
		test01 ex= new test01();
		ex.setName(name);
		
		ex.setAge(age);
		System.out.println(ex.getName());
		
		System.out.println(ex.getAge());
	}
}
