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
	
	public ArrayList<HashMap<String, String>> tb_Bokkeum = new ArrayList<>();//����or�� ���̺�
	public ArrayList<HashMap<String, String>> tb_Maleun = new ArrayList<>();//�������� ���̺�
	public ArrayList<HashMap<String, String>> tb_Fruit = new ArrayList<>();//���Ͼ��� ���̺�
	public ArrayList<HashMap<String, String>> tb_Sul = new ArrayList<>();//�ַ� ���̺�
	public ArrayList<HashMap<String, String>> tb_Drink = new ArrayList<>();//���� ���̺�
	public ArrayList<HashMap<String, String>> tb_Other = new ArrayList<>();//��Ÿ ���̺�
	HashMap<String, String> menu ;
	
	
	{// ����/��
		menu = new HashMap<String, String>();
		menu.put("name", "��������");
		menu.put("price","8000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "�������ֺ���");
		menu.put("price","8000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "��������");
		menu.put("price","9000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "�ߺ�����");
		menu.put("price","10000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "���");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Bokkeum.add(menu);
	}
	
	{// ��������
		menu = new HashMap<String, String>();
		menu.put("name", "����");
		menu.put("price","10000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "����");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "����");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "��¡��");
		menu.put("price","9000");
		menu.put("count","0");
		tb_Maleun.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name", "��븶������(��������)");
		menu.put("price","12000");
		menu.put("count","0");
		tb_Maleun.add(menu);	
	}
		
	{// ���Ͼ���
		menu = new HashMap<String, String>();
		menu.put("name", "�޷�");
		menu.put("price","8000");
		menu.put("count","0");
		tb_Fruit.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name", "Ȳ��");
		menu.put("price","5000");
		menu.put("count","0");
		tb_Fruit.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name", "ȭä");
		menu.put("price","12000");
		menu.put("count","0");
		tb_Fruit.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name", "�����Ͼ���");
		menu.put("price","12000");
		menu.put("count","0");
		tb_Fruit.add(menu);
	}
	
	{//�ַ�
		menu = new HashMap<String, String>();
		menu.put("name","����");
		menu.put("price","4000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name","����");
		menu.put("price","4000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name","û��" );
		menu.put("price","5000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
		menu = new HashMap<String, String>();
		menu.put("name","�ɼ�");
		menu.put("price","6000");
		menu.put("count","0");
		tb_Sul.add(menu);
		
	}
	
	{// ����
		menu = new HashMap<String, String>();
		menu.put("name","�ݶ�");
		menu.put("price","1000");
		menu.put("count","0");
		tb_Drink.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name","���̴�");
		menu.put("price","1000");
		menu.put("count","0");
		tb_Drink.add(menu);
		menu = new HashMap<String, String>();
		menu.put("name","���ڿ���");
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
