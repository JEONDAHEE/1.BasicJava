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
			System.out.println(" �ֹ� �Ͻðڽ��ϱ� ??? "); // �ֹ�
			System.out.println(" ���Ͻô� �޴��� ������ ��ȣ�� �Է� �� �ּ���. ");
			System.out.println(" 1. ����/��   2. ��������  3. ���Ͼ���  4. �ַ�  5. ����   0. �׸� ���");
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
				System.out.println("�׸� ������? ��ٱ��� �����ٰ�");
				cart.printCart();
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		
		}while(input != 0);
	}

}

