package controller;


import java.util.Scanner;

import service.Cart;
import service.IntegerCheck;
import service.Menu;
import service.Mileage;
import service.Notice;
import service.Payment;
import service.RMenuService;
import service.Table;


public class UserController {
	
	
	private static UserController instance;

	private UserController() {
	}

	public static UserController getInstance() {
		if (instance == null) {
			instance = new UserController();
		}
		return instance;

	}
	public static boolean login_state = true;
	
	static Scanner s = new Scanner(System.in);
	public static void select(){//�α��� �� ȭ��
		
		int select ;
		boolean check = false;
		String temp;
		
		do{
			login_state=true;
			System.out.println("---------------------------------------------------");
			System.out.println("Young���� 202ȣ ��¦���ǿտ� ���Ű� ȯ���մϴ�;D");
			System.out.println("�밴ȯ��! ����ȯ��!");
			System.out.println("---------------------------------------------------");
			System.out.println("1. ���Ӽ��� ");
			System.out.println("2. �ֹ��ϱ� ");
			System.out.println("3. ��õ�޴� Ȯ���ϱ� ");
			System.out.println("4. �ֹ����� Ȯ�� /���� �� ����"); 
			System.out.println("5. �������� ");
			System.out.println("6. ���ϸ��� ����"); 
			System.out.println("7. �α׾ƿ�"); 
			System.out.println("---------------------------------------------------");
			System.out.println("�Է����ּ���! > ");
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);
			
		}while(!check);
		
		select= Integer.parseInt(temp);
		
		switch (select) {
		case 1 : //���Ӽ���
			GameController.Game();
			break;
		case 2 : //�ֹ��ϱ�
			Menu.selectMenu();
			break;
		case 3 : //��õ�޴� Ȯ���ϱ�
			RMenuService.userManagement();
			break;
		case 4 : //��ٱ���
			Payment.paymentManagement();
			break;
		case 5 : //�������� ����
			Notice.noticeUser();
			break;
		case 6 : //���ϸ�������
			Mileage.printMileageInfo();
			break;
		
		case 7 : //�α׾ƿ�
			if(Cart.paymentstate()){
				Table.tableOut();
				System.out.println("�α׾ƿ� �Ǽ̽��ϴ�.");
				
				login_state = false;
			}else{
				System.out.println("����ϱ� ���Դϴ�.");
			}
			break; 

		default :
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		
	}
}
