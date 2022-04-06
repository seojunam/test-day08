package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class EX01 {
	public static void main(String[] args) {
		/*
		 map 
		 -키와 값의 쌍으로 이루어진 데이터의 집합 
		 -순서는 유지되지 않는다
		 -키의 중복은 허용하지 않으며, 값의 중복은 허용
		  */
		HashMap map =new HashMap();
		//LinkedHashMap map =new LinkedHashMap();  순서 유지 해준다
		map.put("선풍기","100만원");
		map.put("에어컨","10만원");
		map.put("자동차","1만원");
		
		System.out.println("선풍기:"+map.get("선풍기")); 
		System.out.println("에어컨:"+map.get("에어컨")); 
		System.out.println("자동차:"+map.get("자동차")); 
		System.out.println("없는값:"+map.get("없는값")); 
	
		System.out.println("결과:"+map.containsKey("자동차")); 
		System.out.println("결과:"+map.containsKey("자전거")); 
		
		Object bool = map.remove("선풍기");
		System.out.println("true 해당작 잘삭제, false 해당 키 없음"+bool);
		
		if(bool==null) {
			System.out.println("삭제 실패");
		}
		else {
			System.out.println("삭제 성공");
		}
		System.out.println("키 목록:"+map.keySet() );// 
		System.out.println("값 목록:"+map.values() );
		
		//Set s =map.keySet();
		//Iterator it =s.iterator();
		Iterator it =map.keySet().iterator();
		
	    while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj+":"+map.get(obj));
		}
	}

}
