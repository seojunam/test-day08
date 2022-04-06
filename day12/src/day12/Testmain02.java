package day12;



public class Testmain02 {
public static void main(String[] args) {
	
	int k=100,e=90,m=98, s=0;
	int avg;
	System.out.println("국어:"+k);
	
	System.out.println("영어:"+e);
	
	System.out.println("수학:"+m);
	
	 s =k +e+m;

	    System.out.println("합계: " + s);
	    avg= (k+e+m)/3;
	    System.out.print("평균:"+avg);
	test02 ex= new test02();
	ex.setKor(k);
	ex.setEng(e);
	ex.setMath(m);
	

}
}
