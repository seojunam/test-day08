package day09;

public class EX3 {
	public static void main(String[] args) {
		String str;
		str ="test";
		System.out.println(str);
		
		String str2 =new String();
		str2 = "test2";
		System.out.println(str2);
		
		str2 ="java us Easy. 그리고 programming 할만하다";
		System.out.println("기본:"+str2);
		//str2=str2.toUpperCase();//자기 자신을 완벽히 변신(대문자)
		//System.out.println(str2.toUpperCase()); //일시적으로 변경한다
		System.out.println("확인:"+str2);
		System.out.println(str2.toLowerCase()); //소문자로 변신
		
		
		str ="abcde";
		System.out.println(str.length());//문자5개 있느니까 5라고 표현
		System.out.println(str.charAt(0));//0번째 값은 a
		System.out.println(str.charAt(0)-32);//이스코이프 사용
		System.out.println((char)(str.charAt(0)-32));
		System.out.println(str.charAt(1)=='b');//문자 비교할때'' 표현
		System.out.println(str.charAt(1)=='c');
		
		
	}

}
