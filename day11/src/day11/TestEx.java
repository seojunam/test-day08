package day11;

import java.util.ArrayList;
import java.util.HashSet;

public class TestEx {
public ArrayList ArrayList() {
	ArrayList arr =new ArrayList();
	while(arr.size()<6) {
		int run =(int)(Math.random()*6)+1;
		if(arr.contains(run)==false)arr.add(run);
	}
	return arr;
  

}
	
public HashSet HashSet() {
	HashSet sh=new HashSet();
	while(sh.size()<6) { sh.add((int)(Math.random()*6)+1);
	
		
	}
	return sh;

 }
} 


