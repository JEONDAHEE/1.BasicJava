package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.CartVo;
import vo.RecommendedMenuVo;
import dao.CartDao;
import dao.CartegoryDao;
import dao.FoodDao;
import dao.RMenuDao;


public class RMenuService {


	// ��������
	static Scanner s = new Scanner(System.in);
	
	public static void userManagement(){
		
		String temp = "";
		boolean check = false;
		do{
		printRMenu();
		System.out.println("----------------------------------------------");
		System.out.println("1. ��õ�޴� �ֹ�");
		System.out.println("0. ����");
		System.out.println("----------------------------------------------");
		
		temp = s.nextLine().trim();
		check = IntegerCheck.checkInt(temp,0,1);
		}while(!check);
		
		int menu = Integer.parseInt(temp);
		
		switch(menu){
		case 1:
			orderRMenu();
			break;
		case 0:
			System.out.println("�޴��� �̵��մϴ�.");
			break;
		}
		
	}
	public static void adminManagement(){
		
		String temp = "";
		boolean check = false;
		do {

			do {
				printRMenu();
				System.out.println("----------------------------------------------");
				System.out.println("1. ��õ�޴� �߰�");
				System.out.println("2. ��õ�޴� ����");
				System.out.println("3. ��õ�޴�  ���� ����");
				System.out.println("0. ����");
				System.out.println("----------------------------------------------");

				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, 3);
			} while (!check);

			int menu = Integer.parseInt(temp);

			switch (menu) {
			case 1:
				insertRMenu();
				break;
			case 2:
				deleteRMenu();
				break;
			case 3:
				contentsModify();
				break;
			case 0:
				System.out.println("�޴��� �̵��մϴ�.");
				check = false;
			}
		}while(check);
		
	}	
	public static void printRMenu(){// �߰��� �޴� ����Ʈ ��ü�� ������
		RMenuDao rmenuDao = RMenuDao.getInstance();
		FoodDao foodDao = FoodDao.getInstance();
		ArrayList<RecommendedMenuVo> rmenuList = rmenuDao.selectRecommendedMenu();
		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t��õ �޴� ���");
		System.out.println("----------------------------------------------");
		for(int i = 0; i<rmenuList.size();i++){
			System.out.print(i+1+". ");
			System.out.println(foodDao.searchFoodNoInfo(rmenuList.get(i).getFoodNo()).getName());
			System.out.println("��õ ���� : "+ rmenuList.get(i).getContents());
			System.out.println("���� : "+ foodDao.searchFoodNoInfo(rmenuList.get(i).getFoodNo()).getPrice()+"��");
		}
		System.out.println("----------------------------------------------");
		
		
	}
	public static void orderRMenu(){//��õ�޴� �ֹ��ϱ�
		
		RMenuDao rmenuDao = RMenuDao.getInstance();
		ArrayList<RecommendedMenuVo> rmenuList = rmenuDao.selectRecommendedMenu();
		CartDao cartDao = CartDao.getInstance();
		String temp = "";
		boolean check = false;
		do{
			printRMenu();
			System.out.println("�ֹ��Ͻ� ��õ�޴��� ��ȣ�� �Է����ּ���.");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,rmenuList.size());
		}while(!check);
		
		int pos = rmenuList.get(Integer.parseInt(temp)-1).getFoodNo();
		CartVo cartVo = new CartVo(); 
		cartVo.setFoodNo(pos);
		do{
			System.out.println("������ �Է����ּ���.");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);
		}while(!check);
		
		cartVo.setCount(Integer.parseInt(temp));
		cartDao.insertCart(cartVo);
	}
	public static void insertRMenu() {
		FoodDao foodDao = FoodDao.getInstance();
		RMenuDao rMenuDao = RMenuDao.getInstance();
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		RecommendedMenuVo rMenuVo = new RecommendedMenuVo();
		ArrayList<Integer> indexSpace = new ArrayList<>();


		Boolean check = false;
		String temp = "";
		do{
		do {
			indexSpace=categoryDao.searchCategoryInfo();

			// ��õ�޴� ī�װ� ���
			System.out.println("=======================================");
			
			for (int i = 0; i < indexSpace.size(); i++) {
				if (categoryDao.searchCategoryNoInfo(indexSpace.get(i)).isState()) {
					System.out.print(i+1+". ");
					System.out.println(categoryDao.searchCategoryNoInfo(indexSpace.get(i)).getMenu() + "\t");
				}
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("=======================================");
			System.out.println("�߰��� ī�װ��޴��� �������ּ���.");
			// ��õ�޴� no �Է�
			
			temp= s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,indexSpace.size()); 
		}while(!check);
		if(Integer.parseInt(temp)==0){
			return;
		}
		
		int categoryKey =indexSpace.get(Integer.parseInt(temp)-1); 

		indexSpace = foodDao.searchFoodInfo(categoryKey);
		
		do{
			System.out.println("=======================================");
			for (int i = 0; i < indexSpace.size(); i++) {

				int foodNo = foodDao.searchFoodNoInfo(indexSpace.get(i)).getNo();
				String name = foodDao.searchFoodNoInfo(foodNo).getName();
				int won = foodDao.searchFoodNoInfo(foodNo).getPrice();
				String sub_temp = "";

				int condition = 8;
				check = false;

				if (name.length() > condition) {
					sub_temp = name.substring(0, condition);
					name = name.substring(condition - 1, name.length());
					System.out.print(i + 1 + ". " + sub_temp);
					System.out.println("\t" + won+"��");
				} else {
					check = true;
					if (name.length() >= 4) {
						name = name + "\t";
					} else {
						name = name + "\t\t";
					}
					System.out.print(i + 1 + ". "+ name);
					System.out.println(won+"��");
				}
				if (!check) {
					do {
						if (name.length() > condition) {
							sub_temp = name.substring(0, condition);
							name = name.substring(condition - 1, name.length());
							System.out.println("       " + sub_temp);
						} else {
							System.out.println("       " + name);
							check = true;
						}
					} while (!check);
				}
			
			
			
			
			
			
			
			
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("=======================================");

			System.out.println("�߰��� ��õ�޴� �������ּ���.");
			temp= s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,indexSpace.size());
		} while (!check);
		if(Integer.parseInt(temp)==0){
			check = true;
		}else{
			int foodKey = indexSpace.get(Integer.parseInt(temp)-1);
			
			
			rMenuVo.setFoodNo(foodKey); // Ǫ�� Ű�� �� �ؼ� ����
			System.out.println("��õ������ �����ּ��� : ");
			rMenuVo.setContents(s.nextLine()); // �޴��߰� �����Է�
			
			
			rMenuDao.insertRMenu(rMenuVo); // ������� �⺻Ű���� �־���
			System.out.println("�߰��� �Ϸ�!");
			return;
		}
		  
		
		}while(check);
		
	}
	public static void deleteRMenu() {
		RMenuDao rMenuDao = RMenuDao.getInstance();
		ArrayList<RecommendedMenuVo> rMenuList = rMenuDao.selectRecommendedMenu();
		Boolean check = false;
		String temp = "";
		do {

			System.out.println("=======================================");
			for (int i = 0; i < rMenuList.size(); i++) {
				System.out.print(i+1+". ");
				System.out.print(rMenuDao.searchRecommendedMenuNo(
						rMenuList.get(i).getFoodNo()).getName()
						+ "\t");
				System.out.println(rMenuList.get(i).getContents());
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("=======================================");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,rMenuList.size());
		} while (!check);
		if(Integer.parseInt(temp)==0){
			return;
		}
		
		int pos = rMenuList.get(Integer.parseInt(temp)-1).getNo();
		rMenuDao.deleteRMenu(rMenuDao.searchRMenuNoInfo(pos));
		System.out.println("-------------------------------------------");
		System.out.println("���������� �����Ͽ����ϴ�.");
		System.out.println("-------------------------------------------");
		
	}
	public static void contentsModify() {
		RMenuDao rMenuDao = RMenuDao.getInstance();
		ArrayList<RecommendedMenuVo> rMenuList = rMenuDao.selectRecommendedMenu();
		Boolean check = false;
		String temp = "";
		do {	
			System.out.println("=======================================");
			System.out.println("������ �����Ͻ� ��õ�޴��� �������ּ���.");
			System.out.println("=======================================");
			for (int i = 0; i < rMenuList.size(); i++) {
				System.out.print(i+1+". ");
				System.out.print(rMenuDao.searchRecommendedMenuNo(
						rMenuList.get(i).getFoodNo()).getName()
						+ "\t");
				System.out.println(rMenuList.get(i).getContents());
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("=======================================");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,rMenuList.size());
		} while (!check);
		if(Integer.parseInt(temp)==0){
			return;
		}
		int pos = rMenuList.get(Integer.parseInt(temp)-1).getNo();
		System.out.println("-------------------------------------------");
		System.out.println("�����Ͻ� ������ �Է����ּ���.");
		System.out.println("-------------------------------------------");
		
		temp = s.nextLine();
		rMenuDao.searchRMenuNoInfo(pos).setContents(temp);
		
		System.out.println("-------------------------------------------");
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("-------------------------------------------");
		

	}
}
