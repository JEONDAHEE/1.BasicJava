package z_popo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Jumoon {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int input;

		do{
			System.out.println("-----------------------------------------------------------");
			System.out.println(" 주문 하시겠습니까 ??? "); // 주문
			System.out.println(" 원하시는 메뉴를 선택해 번호를 입력 해 주세요. ");
			System.out.println(" 1. 볶음/탕   2. 마른안주  3. 과일안주  4. 주류  5. 음료   0. 그만 담기");
			System.out.println("-----------------------------------------------------------");
			
			input = Integer.parseInt(s.nextLine());
			
			Cart cart = Cart.getInstance();
			
			Menu menu = Menu.getInstance();
			
			switch(input){
			case 1: 
				menu.bokkeum();
				break;
			case 2:
				menu.maleun();
				break;
			case 3:
				menu.fruit();
				break;
			case 4:
				menu.sul();
				break;
			case 5:
				menu.drink();
				break;
			case 0:
				System.out.println("그만 담으셔? 장바구니 보여줄게");
				cart.printCart();
				break;
			default :
				System.out.println("다시 입력하세요.");
			}
		
		}while(input != 0);
	}

}

