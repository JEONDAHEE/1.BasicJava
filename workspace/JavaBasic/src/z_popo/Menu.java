package z_popo;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu { 
	
private static Menu instance; 
	
	private Menu(){}
	
	public static Menu getInstance(){
		if(instance == null){
			instance = new Menu();
		}
		return instance;
	}
	
	Scanner s  = new Scanner(System.in);
	
	Cart cart = Cart.getInstance();
	FoodDatabase foodDB = FoodDatabase.getInstance(); 
	
	public void bokkeum(){
		System.out.println("����/�� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���.");
		selectMenu(foodDB.tb_Bokkeum);
	}
	
	public void maleun(){
		System.out.println("�������� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		selectMenu(foodDB.tb_Maleun);
		}
	
	
	public void fruit(){
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		selectMenu(foodDB.tb_Fruit);
		}
	
	public void sul(){
		System.out.println("�ַ� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		selectMenu(foodDB.tb_Sul);
	}
	
	public void drink(){
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		selectMenu(foodDB.tb_Drink);
	}
	
	void selectMenu(ArrayList<HashMap<String,String>> tb_name ){
		
		
		for(int i = 0;i < tb_name.size();i++){//���̺� �޴�  ���
			System.out.println(i+1+". "+tb_name.get(i).get("name")+" : "+tb_name.get(i).get("price")+"��");
		}
		
		int input  = Integer.parseInt(s.nextLine().trim());
		String temp = "";
		boolean check = true;
		do{
			check = true;
			System.out.println(tb_name.get(input - 1).get("name") + "�� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
			temp = s.nextLine().trim();
			for(int i = 0; i< temp.length();i++){
				if(temp.charAt(i)<'0'||temp.charAt(i)>'9'){
					check = false;
				}
			}
			if(!check){
				System.out.println("�ٽ� �Է� �ϼ���.");
			}
		} while(!check);
		
		///////////////////////////////////////////////////��º�
		int count = Integer.parseInt(temp);

		for (int i = 0; i < cart.tb_cart.size(); i++) {
			if (cart.tb_cart.get(i).get("name").equals(tb_name.get(input - 1).get("name"))) {
				tb_name.get(input - 1).
					put("count",(Integer.parseInt(tb_name.get(input - 1).
							get("count")) + count)+ "");
			} else {
				tb_name.get(input - 1).put("count", count + "");
			}
		}
		cart.tb_cart.add(tb_name.get(input - 1));
		
	}
	

	
}	


	
	
	
	
		



















































/*




public class Menu { 
	
private static Menu instance; 
	
	private Menu(){}
	
	public static Menu getInstance(){
		if(instance == null){
			instance = new Menu();
		}
		return instance;
	}
	
	Scanner s  = new Scanner(System.in);
	
	Cart cart = Cart.getInstance();

	
	public void bokkeum(){
		System.out.println("����/�� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���.");
		System.out.println("1. �������� : 8000��");
		System.out.println("2. �������ֺ��� : 8000��");
		System.out.println("3. �������� : 9000��");
		System.out.println("4. �ߺ����� : 10000��");
		System.out.println("5. ��� : 5000��");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				jeyug jeyug = new jeyug();
				System.out.println("���������� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				jeyug.count = Integer.parseInt(s.nextLine());
				cart.tb_cart.add(jeyug);
				break;
			case 2:
				chadol chadol = new chadol();
				System.out.println("�������ֺ����� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				chadol.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(chadol);
				break;
			case 3:
				nagji nagji = new nagji();
				System.out.println("���������� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				nagji.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(nagji);
				break;
			case 4:
				dalg dalg = new dalg();
				System.out.println("�ߺ������� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				dalg.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(dalg);
				break;
			case 5:
				eomug eomug = new eomug();
				System.out.println("����� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				eomug.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(eomug);
				break;
			default :
				System.out.println("�ٽ� �Է� �ϼ���.");
		}
		
	}
	
	public void maleun(){
		System.out.println("�������� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		System.out.println("1. ���� : 10000��");
		System.out.println("2. ���� : 5000��");
		System.out.println("3. ���� : 5000��");
		System.out.println("4. ��¡�� : 9000��");
		System.out.println("5. ��븶������(��������) : 12000��");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				muk muk = new muk();
				System.out.println("������ �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				muk.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(muk);
				break;
			case 2:
				ddang ddang = new ddang();
				System.out.println("������ �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				ddang.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(ddang);
				break;
			case 3:
				jwipo jwipo = new jwipo();
				System.out.println("������ �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				jwipo.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(jwipo);
				break;
			case 4:
				ojing ojing = new ojing();
				System.out.println("��¡� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				ojing.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(ojing);
				break;
			case 5:
				modeum_ma modeum_ma = new modeum_ma();
				System.out.println("��븶������(��������)�� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				modeum_ma.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(modeum_ma);
				break;
			default :
				System.out.println("�ٽ� �Է� �ϼ���.");
		}
	}
	
	public void fruit(){
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		System.out.println("1. �޷� : 8000��");
		System.out.println("2. Ȳ�� : 5000��");
		System.out.println("3. ȭä : 12000��" );
		System.out.println("4. ������ : 12000��");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				melon melon = new melon();
				System.out.println("�޷��� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				melon.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(melon);
				break;
			case 2:
				hwangdo hwangdo = new hwangdo();
				System.out.println("Ȳ���� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				hwangdo.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(hwangdo);
				break;
			case 3:
				hwachae hwachae = new hwachae();
				System.out.println("ȭä�� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				hwachae.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(hwachae);
				break;
			case 4:
				modeum_fu modeum_fu = new modeum_fu();
				System.out.println("�����Ͼ��ָ� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				modeum_fu.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(modeum_fu);
				break;
			default :
				System.out.println("�ٽ� �Է� �ϼ���.");
			}
		}
	
	public void sul(){
		System.out.println("�ַ� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		System.out.println("1. ���� : 4000��");
		System.out.println("2. ���� : 4000��" );
		System.out.println("3. û�� : 5000��");
		System.out.println("4. �ɼ� : 6000��");
		
		int input = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				soju soju = new soju();
				System.out.println("���ָ� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				soju.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(soju);
				break;
			case 2:
				macju macju = new macju();
				System.out.println("���ָ� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				macju.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(macju);
				break;
			case 3:
				chungha chungha = new chungha();
				System.out.println("û�ϸ� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				chungha.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(chungha);
				break;
			case 4:
				simsul simsul = new simsul();
				System.out.println("�ɼ��� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				simsul.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(simsul);
				break;
			default :
				System.out.println("�ٽ� �Է� �ϼ���.");
			}
	}
	
	public void drink(){
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ���� ���ּ���");
		System.out.println("1. �ݶ� : 1000��");
		System.out.println("2. ���̴� : 1000��");
		System.out.println("3. ���ڿ��� : 2000��");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				coke coke = new coke();
				System.out.println("�ݶ� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				coke.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(coke);
				break;
			case 2:
				sida sida = new sida();
				System.out.println("���̴ٸ� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				sida.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(sida);
				break;
			case 3:
				choco choco = new choco();
				System.out.println("���ڿ����� �����ϼ̽��ϴ�. � �ֹ� �Ͻðڽ��ϱ�?");
				choco.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(choco);
				break;
			default :
				System.out.println("�ٽ� �Է� �ϼ���.");
			}
	}
	
	String name;
	int price;
	int count;
				
	Menu(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){	
		System.out.println(name + " : " + price + "��");	
	}
}	

// ����/��
	class jeyug extends Menu{
		jeyug(){
			super("��������", 8000);
		}
	}
	class chadol extends Menu{
		chadol(){
			super("�������ֺ���", 8000);
		}
	}
	class nagji extends Menu{
		nagji(){
			super("��������", 9000);
		}
	}
	class dalg extends Menu{
		dalg(){
			super("�ߺ�����", 10000);
		}
	}
	class eomug extends Menu{
		eomug(){
			super("���", 5000);
		}
	}
// ��������
	class muk extends Menu{
		muk(){
			super("����", 10000);
		}
	}
	class ddang extends Menu{
		ddang(){
			super("����", 5000);
		}
	}
	class jwipo extends Menu{
		jwipo(){
			super("����", 5000);
		}
	}
	class ojing extends Menu{
		ojing(){
			super("��¡��", 9000);
		}
	}
	class modeum_ma extends Menu{
		modeum_ma(){
			super("��븶������(��������)", 12000);
		}
	}
	
// ���Ͼ���
	class melon extends Menu{
		melon(){
			super("�޷�", 8000);
		}
	}
	class hwangdo extends Menu{
		hwangdo(){
			super("Ȳ��", 5000);
		}
	}
	class hwachae extends Menu{
		hwachae(){
			super("ȭä", 12000);
		}
	}
	class modeum_fu extends Menu{
		modeum_fu(){
			super("�����Ͼ���", 12000);
		}
	}
	
// �ַ�
	class soju extends Menu{
		soju(){
			super("����", 4000);
		}
	}
	class macju extends Menu{
		macju(){
			super("����", 4000);
		}
	}
	class chungha extends Menu{
		chungha(){
			super("û��", 5000);
		}
	}
	class simsul extends Menu{
		simsul(){
			super("�ɼ�", 6000);
		}
	}	
	
// ����	
	class coke extends Menu{
		coke(){
			super("�ݶ�", 1000);
		}
	}
	class sida extends Menu{
		sida(){
			super("���̴�", 1000);
		}
	}
	class choco extends Menu{
		choco(){
			super("���ڿ���", 2000);
		}
	}*/
	
	
	
	
		












