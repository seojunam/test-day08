package Ex02;

import java.util.ArrayList;

public class Mainclass02 {
	public static void main(String[] args) {
		int x=10,y=0, result=0;
		ArrayList arr =new ArrayList();
		try {
			arr.add(111);
			for(int i=0; i<1; i++) {
				System.out.println(arr.get(i));
			}
			
			
			result =x/y;
			System.out.println(result);
		 
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
		
		System.out.println("다음 문장들 실행");
	}
}
