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
		System.out.println("볶음/탕 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요.");
		selectMenu(foodDB.tb_Bokkeum);
	}
	
	public void maleun(){
		System.out.println("마른안주 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		selectMenu(foodDB.tb_Maleun);
		}
	
	
	public void fruit(){
		System.out.println("과일 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		selectMenu(foodDB.tb_Fruit);
		}
	
	public void sul(){
		System.out.println("주류 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		selectMenu(foodDB.tb_Sul);
	}
	
	public void drink(){
		System.out.println("음료 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		selectMenu(foodDB.tb_Drink);
	}
	
	void selectMenu(ArrayList<HashMap<String,String>> tb_name ){
		
		
		for(int i = 0;i < tb_name.size();i++){//테이블 메뉴  출력
			System.out.println(i+1+". "+tb_name.get(i).get("name")+" : "+tb_name.get(i).get("price")+"원");
		}
		
		int input  = Integer.parseInt(s.nextLine().trim());
		String temp = "";
		boolean check = true;
		do{
			check = true;
			System.out.println(tb_name.get(input - 1).get("name") + "을 선택하셨습니다. 몇개 주문 하시겠습니까?");
			temp = s.nextLine().trim();
			for(int i = 0; i< temp.length();i++){
				if(temp.charAt(i)<'0'||temp.charAt(i)>'9'){
					check = false;
				}
			}
			if(!check){
				System.out.println("다시 입력 하세요.");
			}
		} while(!check);
		
		///////////////////////////////////////////////////출력부
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
		System.out.println("볶음/탕 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요.");
		System.out.println("1. 제육볶음 : 8000원");
		System.out.println("2. 차돌숙주볶음 : 8000원");
		System.out.println("3. 낙지볶음 : 9000원");
		System.out.println("4. 닭볶음탕 : 10000원");
		System.out.println("5. 어묵탕 : 5000원");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				jeyug jeyug = new jeyug();
				System.out.println("제육볶음을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				jeyug.count = Integer.parseInt(s.nextLine());
				cart.tb_cart.add(jeyug);
				break;
			case 2:
				chadol chadol = new chadol();
				System.out.println("차돌숙주볶음을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				chadol.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(chadol);
				break;
			case 3:
				nagji nagji = new nagji();
				System.out.println("낙지볶음을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				nagji.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(nagji);
				break;
			case 4:
				dalg dalg = new dalg();
				System.out.println("닭볶음탕을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				dalg.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(dalg);
				break;
			case 5:
				eomug eomug = new eomug();
				System.out.println("어묵탕을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				eomug.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(eomug);
				break;
			default :
				System.out.println("다시 입력 하세요.");
		}
		
	}
	
	public void maleun(){
		System.out.println("마른안주 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		System.out.println("1. 먹태 : 10000원");
		System.out.println("2. 땅콩 : 5000원");
		System.out.println("3. 쥐포 : 5000원");
		System.out.println("4. 오징어 : 9000원");
		System.out.println("5. 모듬마른안주(먹태제외) : 12000원");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				muk muk = new muk();
				System.out.println("먹태을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				muk.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(muk);
				break;
			case 2:
				ddang ddang = new ddang();
				System.out.println("땅콩을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				ddang.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(ddang);
				break;
			case 3:
				jwipo jwipo = new jwipo();
				System.out.println("쥐포를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				jwipo.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(jwipo);
				break;
			case 4:
				ojing ojing = new ojing();
				System.out.println("오징어를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				ojing.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(ojing);
				break;
			case 5:
				modeum_ma modeum_ma = new modeum_ma();
				System.out.println("모듬마른안주(먹태제외)를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				modeum_ma.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(modeum_ma);
				break;
			default :
				System.out.println("다시 입력 하세요.");
		}
	}
	
	public void fruit(){
		System.out.println("과일 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		System.out.println("1. 메론 : 8000원");
		System.out.println("2. 황도 : 5000원");
		System.out.println("3. 화채 : 12000원" );
		System.out.println("4. 모듬과일 : 12000원");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				melon melon = new melon();
				System.out.println("메론을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				melon.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(melon);
				break;
			case 2:
				hwangdo hwangdo = new hwangdo();
				System.out.println("황도를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				hwangdo.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(hwangdo);
				break;
			case 3:
				hwachae hwachae = new hwachae();
				System.out.println("화채를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				hwachae.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(hwachae);
				break;
			case 4:
				modeum_fu modeum_fu = new modeum_fu();
				System.out.println("모듬과일안주를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				modeum_fu.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(modeum_fu);
				break;
			default :
				System.out.println("다시 입력 하세요.");
			}
		}
	
	public void sul(){
		System.out.println("주류 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		System.out.println("1. 소주 : 4000원");
		System.out.println("2. 맥주 : 4000원" );
		System.out.println("3. 청하 : 5000원");
		System.out.println("4. 심술 : 6000원");
		
		int input = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				soju soju = new soju();
				System.out.println("소주를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				soju.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(soju);
				break;
			case 2:
				macju macju = new macju();
				System.out.println("맥주를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				macju.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(macju);
				break;
			case 3:
				chungha chungha = new chungha();
				System.out.println("청하를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				chungha.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(chungha);
				break;
			case 4:
				simsul simsul = new simsul();
				System.out.println("심술을 선택하셨습니다. 몇개 주문 하시겠습니까?");
				simsul.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(simsul);
				break;
			default :
				System.out.println("다시 입력 하세요.");
			}
	}
	
	public void drink(){
		System.out.println("음료 메뉴입니다.");
		System.out.println("원하시는 메뉴를 선택 해주세요");
		System.out.println("1. 콜라 : 1000원");
		System.out.println("2. 사이다 : 1000원");
		System.out.println("3. 초코우유 : 2000원");
		
		int input  = Integer.parseInt(s.nextLine());
		
		switch(input){
			case 1:
				coke coke = new coke();
				System.out.println("콜라를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				coke.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(coke);
				break;
			case 2:
				sida sida = new sida();
				System.out.println("사이다를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				sida.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(sida);
				break;
			case 3:
				choco choco = new choco();
				System.out.println("초코우유를 선택하셨습니다. 몇개 주문 하시겠습니까?");
				choco.count=Integer.parseInt(s.nextLine());
				cart.j_m.add(choco);
				break;
			default :
				System.out.println("다시 입력 하세요.");
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
		System.out.println(name + " : " + price + "원");	
	}
}	

// 볶음/탕
	class jeyug extends Menu{
		jeyug(){
			super("제육볶음", 8000);
		}
	}
	class chadol extends Menu{
		chadol(){
			super("차돌숙주볶음", 8000);
		}
	}
	class nagji extends Menu{
		nagji(){
			super("낙지볶음", 9000);
		}
	}
	class dalg extends Menu{
		dalg(){
			super("닭볶음탕", 10000);
		}
	}
	class eomug extends Menu{
		eomug(){
			super("어묵탕", 5000);
		}
	}
// 마른안주
	class muk extends Menu{
		muk(){
			super("먹태", 10000);
		}
	}
	class ddang extends Menu{
		ddang(){
			super("땅콩", 5000);
		}
	}
	class jwipo extends Menu{
		jwipo(){
			super("쥐포", 5000);
		}
	}
	class ojing extends Menu{
		ojing(){
			super("오징어", 9000);
		}
	}
	class modeum_ma extends Menu{
		modeum_ma(){
			super("모듬마른안주(먹태제외)", 12000);
		}
	}
	
// 과일안주
	class melon extends Menu{
		melon(){
			super("메론", 8000);
		}
	}
	class hwangdo extends Menu{
		hwangdo(){
			super("황도", 5000);
		}
	}
	class hwachae extends Menu{
		hwachae(){
			super("화채", 12000);
		}
	}
	class modeum_fu extends Menu{
		modeum_fu(){
			super("모듬과일안주", 12000);
		}
	}
	
// 주류
	class soju extends Menu{
		soju(){
			super("소주", 4000);
		}
	}
	class macju extends Menu{
		macju(){
			super("맥주", 4000);
		}
	}
	class chungha extends Menu{
		chungha(){
			super("청하", 5000);
		}
	}
	class simsul extends Menu{
		simsul(){
			super("심술", 6000);
		}
	}	
	
// 음료	
	class coke extends Menu{
		coke(){
			super("콜라", 1000);
		}
	}
	class sida extends Menu{
		sida(){
			super("사이다", 1000);
		}
	}
	class choco extends Menu{
		choco(){
			super("초코우유", 2000);
		}
	}*/
	
	
	
	
		












