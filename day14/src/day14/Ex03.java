package day14;

public class Ex03 {
    private static Ex03 ex03;  //밖에 만들면 자동적으로 null값이 들어감
	private Ex03(){	 
		System.out.println("생성자");
	}
	
	public static Ex03 getIntance() {
		if(ex03==null) {
		ex03 =new Ex03();
		}//ex03 null이면 한번만 실행 해라
		return ex03;
	}
	
	
}
