package day14;

public class MainClass01 {
public static void main(String[] args) {
	Ex01 ex=new Ex01(20,10){
		public void mul() {
			System.out.println(20*10);
		}//내가 원하는 메소드가 실행되지 않으면 main에서 만든다 거이 사용하지는 않는다
	};
	ex.sum(); ex.sub();
	ex.mul(); ex.div();
}
}
