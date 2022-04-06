package test;

import test2.Test01;
import test2.Test02;//나하고 같은 패키지가 아니면 import을 해야한다

//import test02*;해당하는위치에 있는것을 모두 가지고온다


public class Mainclass {
	public static void main(String[] args) {
		Mainclass01 m= new Mainclass01();
		m.test();
		Test01 t=new Test01();
		t.test();
		Test02 t02=new Test02();
		t02.test();
	}

}
