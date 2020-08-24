package z_popo;

import java.util.ArrayList;
import java.util.HashMap;



public class Cart {

	private static Cart instance;

	
	private Cart(){ }
	
	public static Cart getInstance(){ 
		if(instance == null){
			instance = new Cart();
		}
		return instance;
		
	}
	
	public ArrayList<HashMap<String,String>> tb_cart = new ArrayList<>();
	
	public void printCart() {
		
		int sum = 0;  // 총 합계
		
		System.out.println("---------------------------");
		System.out.println("          장바구니                       ");
		System.out.println("---------------------------");
		
		System.out.println("상품명\t수량\t가격");
		
		for(int i = 0;i < tb_cart.size(); i++){
			sum += Integer.parseInt(tb_cart.get(i).get("count")) * Integer.parseInt(tb_cart.get(i).get("won"));
			
			System.out.println(tb_cart.get(i).get("name") + "\t" + tb_cart.get(i).get("count") + "\t" +
					Integer.parseInt(tb_cart.get(i).get("count")) * Integer.parseInt(tb_cart.get(i).get("won")));
			
		}
		System.out.println("---------------------------");
		System.out.println("합계 : " + sum + "원입니다.");
	}

	

}

