package day13;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;//

public class Maniclass01 {
public static void main(String[] args) {
	//int 형태와 비슷하다 정수 저장
	long time =System.currentTimeMillis();// 현제의 단위를 초단위로 나타낸다
	System.out.println(time);
	
	SimpleDateFormat simple = new SimpleDateFormat("yyy년 MM월-dd일-hh시 mm분 ss초 이다");
    String s=simple.format(time);
    System.out.println(s);
    
    Date date =new Date();
    System.out.println(date);
    System.out.println(simple.format(date));
    
    for(int i=0; i<5; i++) {
    	
    	System.out.println(i);
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//예외처리, 묶어 줘야한다
		}
    }
    String ss="calc";
    ProcessBuilder pb =new ProcessBuilder(ss);
    try {
		pb.start();
	} catch (IOException e) {
		e.printStackTrace();
	}
    
    
    
    
    }
}
