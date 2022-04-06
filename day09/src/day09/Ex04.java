package day09;

public class Ex04 {
	public static void main(String[] args) {
		String id ="   test   ";
		String idChk="test";
		System.out.println(id);
		System.out.println(idChk);
		System.err.println(id.equals(idChk));
		System.out.println(id.trim());//양쪽에 있는 공백을 삭제 trim
		System.out.println(idChk.equals(id.trim()));
		
		
		//주소(우편번호, 주소, 상세주소)
		String str="002424/서울/구로3";
		String[] s= str.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		
		s[2]="주소 변경";
		str =s[0]+"/"+s[1]+"/"+s[2];
		System.out.println(str);
		String re=str.replace("/",":");
		System.out.println(re);
		
		
	}

}
