package z_popo;

import java.util.ArrayList;
import java.util.HashMap;


public class FoodDatabase {
private static FoodDatabase instance;
	
	private FoodDatabase(){ }
	
	public static FoodDatabase getInstance(){ 
		if(instance == null){
			instance = new FoodDatabase();
		}
		return instance;
		
	}
	
	public ArrayList<HashMap<String, String>> tb_Bokkeum = new ArrayList<>();//볶음or탕 테이블
	public ArrayList<HashMap<String, String>> tb_Maleun = new ArrayList<>();//마른안주 테이블
	public ArrayList<HashMap<String, String>> tb_Fruit = new ArrayList<>();//과일안주 테이블
	public ArrayList<HashMap<String, String>> tb_Sul = new ArrayList<>();//주류 테이블
	public ArrayList<HashMap<String, String>> tb_Drink = new ArrayList<>();//음류 테이블
	public ArrayList<HashMap<String, String>> tb_Other = new ArrayList<>();//기타 테이블
	HashMap<String, String> menu ;
	
	
	{// 볶음/탕
		menu = new HashMap<String, String>();
		menu.put("name", "제육볶음");
		menu.put("price","8000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "차돌숙주볶음");
		menu.put("price","8000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "낙지볶음");
		menu.put("price","9000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "닭볶음탕");
		menu.put("price","10000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "어묵탕");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
	}
	
	{// 마른안주
		menu = new HashMap<String, String>();
		menu.put("name", "먹태");
		menu.put("price","10000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "땅콩");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "쥐포");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "오징어");
		menu.put("price","9000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "모듬마른안주(먹태제외)");
		menu.put("price","12000");
		menu.put("count","0");
		tb_Maleun.add(menu);	
	}
		
	{// 과일안주
		menu = new HashMap<String, String>();
		menu.put("name", "메론");
		menu.put("price","8000");
		menu.put("count","0");
		tb_Fruit.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name", "황도");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Fruit.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name", "화채");
		menu.put("price","12000");
		menu.put("count","0");
		tb_Fruit.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name", "모듬과일안주");
		menu.put("price","12000");
		menu.put("count","0");
		tb_Fruit.add(menu);
	}
	
	{//주류
		menu = new HashMap<String, String>();
		menu.put("name","소주");
		menu.put("price","4000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name","맥주");
		menu.put("price","4000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name","청하" );
		menu.put("price","5000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name","심술");
		menu.put("price","6000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
	}
	
	{// 음료
		menu = new HashMap<String, String>();
		menu.put("name","콜라");
		menu.put("price","1000");
		menu.put("count","0");
		tb_Drink.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name","사이다");
		menu.put("price","1000");
		menu.put("count","0");
		tb_Drink.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name","초코우유");
		menu.put("price","2000");
		menu.put("count","0");
		tb_Drink.add(menu);
	}
	
	void addBokkeum(String name,String price){
		menu = new HashMap<String, String>();
		menu.put("name",name);
		menu.put("price",price);
		menu.put("count","0");
		tb_Bokkeum.add(menu);	
	}
	
	void addFruit(String name,String price){
		menu = new HashMap<String, String>();
		menu.put("name",name);
		menu.put("price",price);
		menu.put("count","0");
		tb_Fruit.add(menu);	
	}
	
	void addDrink(String name,String price){
		menu = new HashMap<String, String>();
		menu.put("name",name);
		menu.put("price",price);
		menu.put("count","0");
		tb_Drink.add(menu);	
	}
	
	void addMaleun(String name,String price){
		menu = new HashMap<String, String>();
		menu.put("name",name);
		menu.put("price",price);
		menu.put("count","0");
		tb_Maleun.add(menu);	
	}
	
	void addSul(String name,String price){
		menu = new HashMap<String, String>();
		menu.put("name",name);
		menu.put("price",price);
		menu.put("count","0");
		tb_Sul.add(menu);	
	}
	
	void addOther(String name,String price){
		menu = new HashMap<String, String>();
		menu.put("name",name);
		menu.put("price",price);
		menu.put("count","0");
		tb_Other.add(menu);	
	}
		
}
