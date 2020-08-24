package i_cillection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		/*
		 put()	: ������ Ű�� ���� ����
		 get()	: ������ Ű�� ���� ��ȯ(������ null)
		 remove() 	: ������ Ű�� ����� ���� ����
		 keySet()	: ����� ��� Ű�� Set���� ��ȯ
		 
		 // �ε����� �����ϴ°� �ƴ϶� Ű�� ����(�ε��� ��ȣ�� ����.) == ������ ���� ���ٴ� ��
		 // ������ ���̽� ���̺� => ArrayList�� hashmap�� ���� ����
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();// �տ� �ִ� �� Ű ,�ڿ� �ִ°� �� (�ΰ��� �����Ѵ�. ���� Ű�� String Ÿ��)
		
		map.put("title", "�����Դϴ�");
		map.put("content", "�����Դϴ�");
		map.put("user", "����");
		map.put("date", "2020-01-13 10:33");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));

		map.put("user", "�̼���"); //user�� ����
		System.out.println(map.get("user"));
		
		map.remove("user"); //���� ������°� �ƴ϶� Ű���� �� �����
		System.out.println(map.get("user"));
	
		//����� ��� Ű�� �޴� �޼ҵ�
		Set<String> keys= map.keySet();
		for(String key : keys){				//(���� for��) ������ ���� �ϳ��� ������ ���ʿ� ����
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("LPROD_ID", "1");
		map1.put("LPROD_GU", "P101");
		map1.put("LPROD_NM", "��ǻ����ǰ");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("LPROD_ID", "2");
		map2.put("LPROD_GU", "P102");
		map2.put("LPROD_NM", "������ǰ");
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("LPROD_ID", "3");
		map3.put("LPROD_GU", "P201");
		map3.put("LPROD_NM", "����ĳ�־�");
		
		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("LPROD_ID", "4");
		map4.put("LPROD_GU", "P202");
		map4.put("LPROD_NM", "����ĳ�־�");
		
		HashMap<String, String> map5 = new HashMap<String, String>();
		map5.put("LPROD_ID", "5");
		map5.put("LPROD_GU", "P302");
		map5.put("LPROD_NM", "������ȭ");
		
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
//		���� ������ ���� �ʴ� ��		
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
