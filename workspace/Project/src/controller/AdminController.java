package controller;




import java.util.Scanner;






import service.Category;
import service.IntegerCheck;
import service.Menu;
import service.Notice;
import service.Payment;
import service.RMenuService;
import service.Table;
import service.UserService;
import data.Session;

public class AdminController {

	private static AdminController instance;

	private AdminController() {
	}

	public static AdminController getInstance() {
		if (instance == null) {
			instance = new AdminController();
		}
		return instance;

	}

	
	
    
	public static boolean login_state = true;
	static Scanner s = new Scanner(System.in);
	public static void select() {// �α��� �� ȭ��

	do{
		int select;
		boolean check = false;
		String temp = "";
	
		do {
			System.out.println("---------------------------------------------------");
			System.out.println("������ ������");
			System.out.println("---------------------------------------------------");
			System.out.println("1. ī�װ� ���� ");
			System.out.println("2. �޴� ���� ");
			System.out.println("3. ��õ�޴� ����");
			System.out.println("4. �������� ����");
			System.out.println("5. ���⸮��Ʈ");
			System.out.println("6. ȸ������");
			System.out.println("7. ���̺����");
			System.out.println("0. ����");
			System.out.println("---------------------------------------------------");
			System.out.println("�Է����ּ���! > ");
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);

		} while (!check);

		select = Integer.parseInt(temp);

		switch (select) {
		case 1: // ī�װ�����
			Category.categoryManagement();
			break;
		case 2: // �޴�����
			Menu.menuManagement();
			break;
		case 3: // ��õ�޴� ����
			RMenuService.adminManagement();
			break;
		case 4: // �������װ���
			Notice.NoticeModify();
			break;
		case 5:// ���⸮��Ʈ
			Payment.saleListManegement();
			break;
		case 6:// ��������
			UserService.userManagement();
			break;
		case 7 : // ���̺����
		    Table.tablecotrol();
		    break;
		case 0: // �α׾ƿ�
			Session.loginUser = null;
			login_state = false;
			System.out.println("�α׾ƿ� �Ǽ̽��ϴ�.");
			break;
		default:
			System.out.println("�ش�޴��� �����ϴ�.");
			break;

		}
	}while(login_state);
	}






}
