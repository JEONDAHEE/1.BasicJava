package service;

import java.util.ArrayList;
import java.util.Scanner;


import vo.MenuCategoryVo;
import dao.CartegoryDao;
import dao.FoodDao;


public class Category {
	static Scanner s = new Scanner(System.in);
	public static void deleteCategory() {
		
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		
		
		String temp = "";
		Boolean check = false;
		do{
		ArrayList<Integer> categoryList = categoryDao.searchCategoryInfo();
		System.out.println("�����Ͻ� ī�װ��� �������ּ���.");
		do {
			for (int i = 0; i < categoryList.size(); i++) {
				System.out.println(i+ 1+ ". "
						+ categoryDao.searchCategoryNoInfo(categoryList.get(i))
								.getMenu());
			}
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("-----------------------------------------------");

		
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,categoryList.size());
			
		} while (!check);
		
		if (temp.equals("0")){
			return;
		}
		
		int categoryNo = categoryList.get(Integer.parseInt(temp) - 1);
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println(categoryDao.searchCategoryNoInfo(categoryNo).getMenu()
					+ "�� �����Ͻðڽ��ϱ�?");
			System.out.println("���� : 1");
			System.out.println("���� �޴��� �̵� : 0");
			System.out
					.println("-----------------------------------------------");
			check = true;
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp,0,1);
			
		} while (!check);
		
		if (Integer.parseInt(temp) == 1) {
			System.out.println("-------------------------------------------");
			System.out.println("�����Ǿ����ϴ�.");
			categoryDao.searchCategoryNoInfo(categoryNo).setState(false);
			FoodDao foodDao = FoodDao.getInstance();
			
			System.out.println(categoryDao.searchCategoryNoInfo(categoryNo).getMenu()+"�� ���� ������ �޴�");
			System.out.println("-------------------------------------------");
			
			ArrayList<Integer> foodNoList = new ArrayList<Integer>();
			for(int i = 0; i < foodDao.searchFoodInfo(categoryNo).size();i++){
				foodNoList.add(foodDao.searchFoodInfo(categoryNo).get(i));
			}
			for(int i = 0; i < foodNoList.size();i++){
				foodDao.searchFoodNoInfo(foodNoList.get(i)).setState(false);
				System.out.println(foodDao.searchFoodNoInfo(foodNoList.get(i)).getName());
			}
			
			
			
			System.out.println("-------------------------------------------");

		} else {
			check = true;
		}
		}while(check);
	}
	public static void addCategory() {
	
		
		CartegoryDao categoryDao = CartegoryDao.getInstance();
		ArrayList<MenuCategoryVo> categoryList = categoryDao.selectCartegoryList();
		
		boolean check = true;
		String temp = "";
	
		if(categoryList.get(categoryList.size()-1).getNo()+1>99){
			System.out.println("---------------------------------------------");
				System.out.println("���̻� ī�װ��� ������ �� �����ϴ�.");
				System.out.println("������ ī�װ��� �������ּ���.");
				System.out.println("---------------------------------------------");
				return;
			}
		
		MenuCategoryVo categoryVo = new MenuCategoryVo();
		do {
			System.out.println("---------------------------------------------");
			System.out.println("�߰��� ī�װ� ���� �Է����ּ���.");
			System.out.println("���� �Ͻ÷��� 0�� �Է����ּ���.");
			System.out.println("---------------------------------------------");
			temp = s.nextLine().trim();
			
			if(temp.equals("0")){
				return;
			}
			for (int i = 0; i < categoryList.size(); i++) {
				if (temp.equals(categoryList.get(i).getMenu())) {
					FoodDao foodDao = FoodDao.getInstance();
					ArrayList<Integer> foodNoList = foodDao.searchFoodInfo2(categoryList.get(i).getNo());
					categoryList.get(i).setState(true);
					System.out.println("---------------------------------------------");
					System.out.println("���� ī�װ��� �����߽��ϴ�. ");
					System.out.println("�ش� ī�װ��� �ִ� �޴��� �Բ� ���� �Ǿ����ϴ�.");
					System.out.println("---------------------------------------------");
					for(int j = 0; j < foodNoList.size();j++){
						 int foodNo = foodNoList.get(j);
						 foodDao.searchFoodNoInfo(foodNo).setState(true);
						 System.out.println(foodDao.searchFoodNoInfo(foodNo).getName());
					}
					check = false;
					System.out.println("---------------------------------------------");
					return;
				}
			} 
		
		}while (!check);
			
		
		
		categoryVo.setMenu(temp);
		int key = categoryDao.insertCategory(categoryVo);
		
		System.out.println("---------------------------------------------");
		System.out.println(categoryDao.searchCategoryNoInfo(key).getMenu()+"�� �߰��Ǿ����ϴ�.");
		System.out.println("---------------------------------------------");
	
	}
	public static void categoryManagement(){
		
		boolean check = true;
		String temp = "";
		do {

			do {
				System.out.println("----------------------------------------");
				System.out.println("ī�װ����� �޴��Դϴ�.");
				System.out.println("1. ī�װ� �߰�");
				System.out.println("2. ī�װ� ����");
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("----------------------------------------");

				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp, 0, 2);

			} while (!check);

			int menu = Integer.parseInt(temp);
			switch (menu) {
			case 1:
				addCategory();
				break;
			case 2:
				deleteCategory();
				break;
			case 0:
				System.out.println(" ���� �޴��� ���ư��ϴ�.");
				check = false;
			}
		}while(check);
		
	}

}

	