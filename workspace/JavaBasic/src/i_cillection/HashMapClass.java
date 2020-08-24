package i_cillection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		/*
		 put()	: 지정된 키와 값을 저장
		 get()	: 지정된 키의 값을 반환(없으면 null)
		 remove() 	: 지정된 키로 저장된 값을 제거
		 keySet()	: 저장된 모든 키를 Set으로 반환
		 
		 // 인덱스로 저장하는게 아니라 키로 저장(인덱스 번호가 없다.) == 순서가 따로 없다는 뜻
		 // 데이터 베이스 테이블 => ArrayList에 hashmap을 담은 형태
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();// 앞에 있는 건 키 ,뒤에 있는건 값 (두개로 저장한다. 보통 키는 String 타입)
		
		map.put("title", "제목입니다");
		map.put("content", "내용입니다");
		map.put("user", "다희");
		map.put("date", "2020-01-13 10:33");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));

		map.put("user", "이순신"); //user값 변경
		System.out.println(map.get("user"));
		
		map.remove("user"); //값만 사라지는게 아니라 키까지 다 사라짐
		System.out.println(map.get("user"));
	
		//저장된 모든 키를 받는 메소드
		Set<String> keys= map.keySet();
		for(String key : keys){				//(향상된 for문) 오른쪽 값을 하나씩 꺼내서 왼쪽에 저장
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("LPROD_ID", "1");
		map1.put("LPROD_GU", "P101");
		map1.put("LPROD_NM", "컴퓨터제품");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("LPROD_ID", "2");
		map2.put("LPROD_GU", "P102");
		map2.put("LPROD_NM", "전자제품");
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("LPROD_ID", "3");
		map3.put("LPROD_GU", "P201");
		map3.put("LPROD_NM", "여성캐주얼");
		
		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("LPROD_ID", "4");
		map4.put("LPROD_GU", "P202");
		map4.put("LPROD_NM", "남성캐주얼");
		
		HashMap<String, String> map5 = new HashMap<String, String>();
		map5.put("LPROD_ID", "5");
		map5.put("LPROD_GU", "P302");
		map5.put("LPROD_NM", "피혁잡화");
		
		ArrayList<HashMap<String,String>> table = new ArrayList<>();
		table.add(map1);
		table.add(map2);
		table.add(map3);
		table.add(map4);
		table.add(map5);
		
		System.out.println("-----------------------------------------");
		for(String key : table.get(0).keySet()){
			System.out.print(key + "\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		for(HashMap <String, String> m : table){
			for(String key : m.keySet()){
				System.out.print(m.get(key) + "\t\t");
			}
			System.out.println();
		}		
//		향상된 포문을 쓰지 않는 법		
//		for(int i = 0; i< table.size(); i++){
//			HashMap<String, String> m = table.get(i);
//			Set<String> keySet = m.keySet();
//			Iterator<String> itr = keySet.iterator();
//			while(itr.hasNext()){
//				String key = itr.next();
//				String value = m.get(key);
//				System.out.println(value + "\t\t");
//			}
//		}
		System.out.println("-----------------------------------------");
		
		
		
		
	}

}
