package day11;

public class Test03 {
public int test1() {
	int var=100;
	System.out.println("test:"+var);
	return var;// 반환타입을 바꿔줘야한다 void 에서 int
}
public void test02(int var) {
	System.out.println("test:"+var);
}

public void test3() {
	for(int i=0; i<5; i++) {
		System.out.println("test03:"+i);
		if (i==3)
			return;//break; 리턴은 딱 한번만 가능
	}
	System.out.println("for 다음문장");
}
public int test04() {
	int num =50;
	if(num%3==0) {
		return num;
	}else if (num%2==0) {
		return -1;
	}
	return 0; //모든게 참일수 없기때문에 리턴을 준다
}
}
