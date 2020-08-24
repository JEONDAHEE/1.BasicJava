package service;

import java.util.ArrayList;
import java.util.Scanner;







import vo.CartVo;
import vo.FoodVo;
import dao.CartDao;
import dao.CartegoryDao;
import dao.FoodDao;

public class Menu {
	static Scanner s = new Scanner(System.in);
	public static void deleteMenu(){
		CartegoryDao categoryDao = CartegoryDao.getInstance();
	
		FoodDao foodDao = FoodDao.getInstance();
		
	
		System.out.println("-----------------------------------------------");
		System.out.println("�����Ͻ� �޴��� ī�װ��� �������ּ���.");
		System.out.println("-----------------------------------------------");
		
		ArrayList<Integer> categoryList = categoryDao.searchCategoryInfo();
		String temp = "";
		Boolean check = false;
		do {
			
			for (int i = 0; i < categoryList.size(); i++) {
				System.out.println(i+ 1+ ". "
						+ categoryDao.searchCategoryNoInfo(categoryList.get(i)).getMenu());
			}
			System.out.println("0. ����");
			System.out.println("-----------------------------------------------");
			
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,categoryList.size());
			
		} while (!check);
		
		if (Integer.parseInt(temp)==0){
			return;
		}
		
		int categoryNo = categoryList.get(Integer.parseInt(temp)-1);
		
		ArrayList<Integer>foodList = foodDao.searchFoodInfo(categoryNo);
		
		if(foodList.isEmpty()){
			System.out.println("-----------------------------------------------");
			System.out.println("�ش� ī�װ��� �޴��� �����ϴ�.");
			System.out.println("-----------------------------------------------");
			return;
		}
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("������ �޴��� �������ּ���.");
			for (int i = 0; i < foodList.size(); i++) {
				FoodVo foodvo = foodDao.searchFoodNoInfo(foodList.get(i));
				System.out.println(i + 1 + ". " + foodvo.getName());
			}
			System.out.println("0. ����");
			System.out.println("-----------------------------------------------");
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,foodList.size());
			
		} while (!check);
		
		if (Integer.parseInt(temp)==0){
			return;
		}
		
		int foodNo = foodList.get(Integer.parseInt(temp)-1);
		
		do {
			System.out.println("-----------------------------------------------");

			System.out.println(foodDao.searchFoodNoInfo(foodNo).getName()+"�� �����Ͻðڽ��ϱ�?");
			System.out.println("���� : 1");
			System.out.println("��� : 0");
			System.out.println("-----------------------------------------------");
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 1);
			
		} while (!check);
		
		if(Integer.parseInt(temp)==1){
			foodDao.searchFoodNoInfo(foodNo).setState(false);

		}else{
			System.out.println("�۾��� ����մϴ�.");
			return;
		}
		
	}
	public static void addMenu(){
	
		FoodDao foodDao = FoodDao.getInstance();
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		ArrayList<Integer> categoryList = categoryDao.searchCategoryInfo();
		FoodVo foodvo = new FoodVo();
		Boolean check = false;
		
		System.out.println("-----------------------------------------------");
		System.out.println("�߰� �Ͻ� �޴����� �Է����ּ���.");
		System.out.println("���� �Ͻ÷��� 0�� �Է����ּ���.");
		System.out.println("-----------------------------------------------");
		String temp = s.nextLine().trim();
		
		for(int i = 0; i < foodDao.selectFoodList().size();i++){
			if(foodDao.selectFoodList().get(i).getName().equals(temp)){
				System.out.println("������ ���̽��� �ߺ��� ������ �����մϴ�.\n������ ������ �޴��� �����մϴ�.");
				foodDao.selectFoodList().get(i).setState(true);
				return;
			}
		}
		
		if(temp.equals("0")){
			return;
		}else{
			foodvo.setName(temp);
		}
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("�޴��� ī�װ��� �������ּ���.");
		System.out.println("-----------------------------------------------");
		
		do {
			for (int i = 0; i < categoryList.size(); i++) {

				System.out.println(i+1	
						+ ". "
						+ categoryDao.searchCategoryNoInfo(categoryList.get(i))
								.getMenu());

			}
			System.out.println("0. ����");
			System.out.println("-----------------------------------------------");

			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0,categoryList.size());

		} while (!check);

		
		
		
		if (Integer.parseInt(temp)==0){
			return;
		}
		
		int categoryNo = categoryList.get(Integer.parseInt(temp)-1);
		
		foodvo.setCategory(categoryNo);
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("������ �Է����ּ���.");
			System.out.println("-----------------------------------------------");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);
		} while (!check);
		
		foodvo.setPrice(Integer.parseInt(temp));
		System.out.println(categoryDao.searchCategoryNoInfo(foodvo.getCategory()).getMenu()+"�� "+foodvo.getName()+"�� �޴���"+foodvo.getPrice()+"������ �߰��Ǿ����ϴ�.");
		foodDao.insertFood(foodvo);
		
	}
	public static void selectMenu() {
		FoodDao foodDao = FoodDao.getInstance();	
		CartDao cartDao = CartDao.getInstance();
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		ArrayList<Integer> categoryList = categoryDao.searchCategoryInfo();
		
		String temp = "";
		boolean check = false;
		while(true){
		 do {
			System.out.println("-----------------------------------------------");
			System.out.println(" �ֹ� �Ͻðڽ��ϱ� ??? "); // �ֹ�
			System.out.println(" ���Ͻô� �޴��� ī�װ��� ������ ��ȣ�� �Է� �� �ּ���. ");
			
			for (int i = 0; i < categoryList.size(); i++) {
				int categoryNo  = categoryList.get(i);
				System.out.println(i+ 1+ ". "
						+ categoryDao.searchCategoryNoInfo(categoryNo).getMenu());
			}
			System.out.println("0. �׸� ���");
			System.out.println("-----------------------------------------------");

			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,categoryList.size());
			
		} while (!check);
		 
		if(Integer.parseInt(temp) == 0){
			return;
		}
		
		int categoryNo = categoryList.get(Integer.parseInt(temp) - 1);//ã�� ī�װ��� PK���� No�� �����Ѵ�.
		ArrayList<Integer> foodList = foodDao.searchFoodInfo(categoryNo);//input�� ����Ǿ��ִ� ī�װ���pk���� ���� �ش� ī�װ��� ������ �߰���Ų��.
		
		do {	
			if(foodList.isEmpty()){
				System.out.println("-----------------------------------------------");
				System.out.println("�ش� ī�װ� �޴��� �����ϴ�.");
				System.out.println("�ڷ� ���ư��ϴ�.");
				System.out.println("-----------------------------------------------");
				
			} else{
				System.out.println("-----------------------------------------------");
				System.out.println(categoryDao.searchCategoryNoInfo(categoryNo).getMenu() + "�޴��Դϴ�.");
				System.out.println("���Ͻô� �޴��� ���� ���ּ���");
				
				for(int i = 0 ; i < foodList.size();i++){
					int foodNo = foodList.get(i);
					String name = foodDao.searchFoodNoInfo(foodNo).getName();
					String sub_temp = "";
					
					int condition = 8;
					check = false;
					
					if(name.length() > condition){
						sub_temp = name.substring(0,condition);
						name=name.substring(condition-1,name.length());			
						System.out.print(i+1+". "+sub_temp);
						System.out.println("\t"+foodDao.searchFoodNoInfo(foodNo).getPrice()+"��");
					}else{
						check = true;
						if(name.length()>= 4){
							name=name+"\t";
						}else{
							name=name+"\t\t";
						}
						System.out.print(i+1+". "+name);
						System.out.println(foodDao.searchFoodNoInfo(foodNo).getPrice()+"��");
					}
					if(!check){
						do{
							if(name.length()>condition){
							sub_temp = name.substring(0,condition);
							name=name.substring(condition-1,name.length());	
							System.out.println("       "+sub_temp);
							}else {
								System.out.println("       "+name);
								check = true;
							}
						}while(!check);
					}
				}
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("-----------------------------------------------");

				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp,0,foodList.size());
			}
		} while (!check);
			
		if (!foodList.isEmpty()&&Integer.parseInt(temp)!=0){

				int foodNo = foodList.get(Integer.parseInt(temp) - 1);
				
				do {
					System.out.println("-----------------------------------------------");
					System.out.println(foodDao.searchFoodNoInfo(foodNo).getName() + "�� �����ϼ̽��ϴ�. \n� �ֹ� �Ͻðڽ��ϱ�?");
					System.out.println("�Է� ���� (1 ~ 999)");
					System.out.println("-----------------------------------------------");
					temp = s.nextLine().trim();
					check = IntegerCheck.checkInt(temp,1,999);
				} while (!check);

				int count = Integer.parseInt(temp);

				CartVo cart;

				cart = new CartVo();
				cart.setCount(count);
				cart.setFoodNo(foodNo);
				cartDao.insertCart(cart);
				
			}
		
		}
		
	}
	public static void HomelessMenu() {
		boolean check = false;
		String temp = "";
		FoodDao foodDao = FoodDao.getInstance();

		CartegoryDao categoryDao = CartegoryDao.getInstance();
		do{
		// ī�װ��� ���� ������ pk
		ArrayList<Integer> homelessList = foodDao.searchFoodHomeless();
		if(homelessList.isEmpty()){
			System.out.println("-----------------------------------------------");
			System.out.println("�������� �ʴ� ī�װ��� ����ִ� �޴��� �����ϴ�.");
			System.out.println("-----------------------------------------------");
			return;
		}
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("ī�װ��� ������ ������ �������ּ���.");
			System.out.println("-----------------------------------------------");
			for (int i = 0; i < homelessList.size(); i++) {
				
				int foodNo = homelessList.get(i);
				String name = foodDao.searchFoodNoInfo(foodNo).getName();
				String sub_temp = "";
				
				int condition = 8;
				check = false;
				
				if(name.length() > condition){
					sub_temp = name.substring(0,condition);
					name=name.substring(condition-1,name.length());			
					System.out.print(i+1+". "+sub_temp);
					System.out.println("\t"+foodDao.searchFoodNoInfo(foodNo).getPrice()+"��");
				}else{
					check = true;
					if(name.length()>= 4){
						name=name+"\t";
					}else{
						name=name+"\t\t";
					}
					System.out.print(i+1+". "+name);
					System.out.println(foodDao.searchFoodNoInfo(foodNo).getPrice()+"��");
				}
				if(!check){
					do{
						if(name.length()>condition){
						sub_temp = name.substring(0,condition);
						name=name.substring(condition-1,name.length());	
						System.out.println("       "+sub_temp);
						}else {
							System.out.println("       "+name);
							check = true;
						}
					}while(!check);
				}
				
			
				
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("-----------------------------------------------");
			// ���ο� ������ �־��ִ� �ڵ�
			// true�� ī�װ���

			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0, homelessList.size());

		} while (!check);
		// ������ ��

		if (Integer.parseInt(temp) == 0) {
			return;
		}

		int foodNo = homelessList.get(Integer.parseInt(temp) - 1);

		// �����ϴ� ī�װ��� pk
		ArrayList<Integer> CategoryList = categoryDao.searchCategoryInfo();
		
		

		do {
			System.out.println("-----------------------------------------------");
			System.out.println("������ ������ ������ ī�װ��� �������ּ���.");
			System.out.println("-----------------------------------------------");
			for (int i = 0; i < CategoryList.size(); i++) {
				System.out.print(i + 1 + ". ");
				System.out.println(categoryDao.searchCategoryNoInfo(CategoryList.get(i)).getMenu());

			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("-----------------------------------------------");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0, CategoryList.size());

		} while (!check);

		if (Integer.parseInt(temp) == 0) {
			check = true;
		}else{
		
		int categoryNo = CategoryList.get(Integer.parseInt(temp) - 1);

		foodDao.searchFoodNoInfo(foodNo).setCategory(categoryDao.searchCategoryNoInfo(categoryNo).getNo());
		foodDao.searchFoodNoInfo(foodNo).setState(true);
		System.out.println("-----------------------------------------------------------");
		System.out.print(foodDao.searchFoodNoInfo(foodNo).getName());
		System.out.print("�� ī�װ��� ");
		System.out.print(categoryDao.searchCategoryNoInfo(categoryNo).getMenu());
		System.out.println("�� ����Ǿ����ϴ�.");
		System.out.println("-----------------------------------------------------------");
	}
	}while(check);
	}
	public static void priceModify(){
		
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		
		FoodDao foodDao = FoodDao.getInstance();
		
		Boolean check = false;
		
		
		do{
			ArrayList<Integer> categoryList = categoryDao.searchCategoryInfo();
			
		System.out.println("-----------------------------------------------");
		System.out.println("�����Ͻ� �޴��� ī�װ��� �������ּ���.");
	
		String temp = "";
		
		do {
			for (int i = 0; i < categoryList.size(); i++) {
				System.out.println(i+ 1+ "."
						+ categoryDao.searchCategoryNoInfo(categoryList.get(i)).getMenu());
			}
			System.out.println("0. ���� �޴��� �̵�");

			System.out.println("-----------------------------------------------");
			
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,categoryList.size());
			
		} while (!check);
		
		if(temp.equals("0")){
			return;
		}
		
		
		int categoryNo = categoryList.get(Integer.parseInt(temp)-1);
		
		ArrayList<Integer> foodList = foodDao.searchFoodInfo(categoryNo);
		
		if(foodList.isEmpty()){
			System.out.println("-----------------------------------------------");
			System.out.println("�ش� ī�װ��� �޴��� �����ϴ�.");
			System.out.println("-----------------------------------------------");
			return;
		}
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("������ �޴��� �������ּ���.");
			for (int i = 0; i < foodList.size(); i++) {
				
				
				int foodNo = foodList.get(i);
				String name = foodDao.searchFoodNoInfo(foodNo).getName();
				String sub_temp = "";
				
				int condition = 8;
				check = false;
				
				if(name.length() > condition){
					sub_temp = name.substring(0,condition);
					name=name.substring(condition-1,name.length());			
					System.out.print(i+1+". "+sub_temp);
					System.out.println("\t"+foodDao.searchFoodNoInfo(foodNo).getPrice()+"��");
				}else{
					check = true;
					if(name.length()>= 4){
						name=name+"\t";
					}else{
						name=name+"\t\t";
					}
					System.out.print(i+1+". "+name);
					System.out.println(foodDao.searchFoodNoInfo(foodNo).getPrice()+"��");
				}
				if(!check){
					do{
						if(name.length()>condition){
						sub_temp = name.substring(0,condition);
						name=name.substring(condition-1,name.length());	
						System.out.println("       "+sub_temp);
						}else {
							System.out.println("       "+name);
							check = true;
						}
					}while(!check);
				}
				
				
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("-----------------------------------------------");

			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0, foodList.size());

		} while (!check);
		
		if (Integer.parseInt(temp) == 0) {
			check = true;
		}else{
		
		int foodNo = foodList.get(Integer.parseInt(temp)-1);
		
		
		do {
			System.out.println(foodDao.searchFoodNoInfo(foodNo).getPrice() + "-> ������ ������ �Է����ּ���.");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);
		} while (!check);
		

		foodDao.searchFoodNoInfo(foodNo).setPrice(Integer.parseInt(temp));
	
		System.out.println(categoryDao.searchCategoryNoInfo(categoryNo).getMenu()
				+ "�� " + foodDao.searchFoodNoInfo(foodNo).getName() + "�� �޴��� " 
				+ foodDao.searchFoodNoInfo(foodNo).getPrice() + "������ ����Ǿ����ϴ�.");
		
		return;
		}
		}while(check);
	}
	public static void menuModify() {	
		
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		ArrayList<Integer> categoryList = categoryDao.searchCategoryInfo();
		FoodDao foodDao = FoodDao.getInstance();
		FoodVo foodvo = new FoodVo();
		
	
		String temp = "";
		Boolean check = false;
		do{
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("�����Ͻ� �޴��� ī�װ��� �������ּ���.");
			for (int i = 0; i < categoryList.size(); i++) {
				System.out.println(i + 1+ "."
						+ categoryDao.searchCategoryNoInfo(categoryList.get(i)).getMenu() + "  ");
			}
			System.out.println("0. ���� �޴��� �̵�");
			System.out.println("-----------------------------------------------");
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,categoryList.size());
			
		} while (!check);
		
		if (Integer.parseInt(temp) == 0) {
			return;
		}
		
		int categoryNo = categoryList.get(Integer.parseInt(temp)-1);
		
		ArrayList<Integer> foodList = foodDao.searchFoodInfo(categoryNo);
		
		if(foodList.isEmpty()){
			System.out.println("-----------------------------------------------");
			System.out.println("�ش� ī�װ��� �޴��� �����ϴ�.");
			System.out.println("-----------------------------------------------");
			return;
		}
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("������ �޴��� �������ּ���.");
			for (int i = 0; i < foodList.size(); i++) {
				foodvo = foodDao.searchFoodNoInfo(foodList.get(i));
				System.out.println(i + 1 + ". " + foodvo.getName());
			}
			System.out.println("0. ���� �޴����̵�");
			System.out.println("-----------------------------------------------");
			
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0, foodList.size());

		} while (!check);
		
		if (Integer.parseInt(temp) == 0) {
			check = true;
		}else{
		// ������ �̸��� �� �ڸ�
			
			
	
		int foodNo = foodList.get(Integer.parseInt(temp) - 1);

		
		System.out.println("-----------------------------------------------");
		System.out.println(foodDao.searchFoodNoInfo(foodNo).getName() + "�� ������ �̸��� �Է����ּ���.");
		System.out.println("-----------------------------------------------");
		temp = s.nextLine().trim();
	
		
		System.out.println("-----------------------------------------------");
		System.out.print(categoryDao.searchCategoryNoInfo(categoryNo).getMenu()
				+ "�� " + foodDao.searchFoodNoInfo(foodNo).getName());
		foodDao.searchFoodNoInfo(foodNo).setName(temp);
		System.out.println("�� �޴��� " + foodDao.searchFoodNoInfo(foodNo).getName() + "���� ����Ǿ����ϴ�.");
		System.out.println("-----------------------------------------------");
		
		}
		}while(check);
	}
	public static void menuManagement(){
		
		boolean check = true;
		String temp = "";
		do{
			do {
				System.out.println("----------------------------------------");
				System.out.println("�޴����� �޴��Դϴ�.");
				System.out.println("1. �޴� �߰�");
				System.out.println("2. �޴� ����");
				System.out.println("3. �Ǹ����� �޴� �̸� ����");
				System.out.println("4. �Ǹ����� �޴� ���� ����");
				System.out.println("5. ī�װ��� ���� �޴� ����");
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("----------------------------------------");

				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp,0,5);
				
			} while (!check);
	        int menu = Integer.parseInt(temp);
			
			switch (menu) {
			case 1:
				addMenu();
				break;
			case 2:
				deleteMenu();
				break;
			case 3:
				menuModify();
				break;
			case 4:
				priceModify();
				break;
			case 5 : 
				HomelessMenu();
				break; 
			case 0:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				check = false;	
			}
		}while(check);
		
		
	}
}
 