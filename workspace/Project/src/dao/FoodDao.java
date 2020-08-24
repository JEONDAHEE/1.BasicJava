package dao;

import java.util.ArrayList;

import vo.FoodVo;
import data.Database;

public class FoodDao {
	private static FoodDao instance;

	private FoodDao() {
		
	}

	public static FoodDao getInstance() {
		if (instance == null) {
			instance = new FoodDao();
		}
		return instance;

	}

	Database database = Database.getInstance();


	
	public void insertFood(FoodVo food) {
		if(!database.tb_food.isEmpty()){
			food.setNo(database.tb_food.get(database.tb_food.size()-1).getNo()+1);//�ߺ����� �⺻Ű�� �Է��Ѵ�.			
		}else{
			food.setNo(0);
		}
		database.tb_food.add(food);
		
	}
	public void deleteFood(FoodVo food) {
		database.tb_food.remove(food);
	}
	public ArrayList<FoodVo> selectFoodList() {

		return database.tb_food;
	}
	
	public FoodVo searchFoodNoInfo(int no) {//int�� no�� ���� �޾� �����ͺ��̽��� ����Ǿ��ִ� pk�� no���� ������ foodvo�� ���� ��ȯ�Ѵ�.
		for(int i = 0;i<database.tb_food.size();i++){
			if(database.tb_food.get(i).getNo()==no){
				return database.tb_food.get(i);
			}
		}
		return null;
	}
	public ArrayList<Integer> searchFoodInfo(int categoryKey) {//���õ� ī�װ��� �ִ� ������ array�� ��Ƽ� ��ȯ
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i = 0 ; i<database.tb_food.size();i++){
			if(database.tb_food.get(i).getCategory() == categoryKey&&database.tb_food.get(i).isState()){
				arrayList.add(database.tb_food.get(i).getNo());
			}
		}
		return arrayList;// Integer�� Arraylist�� ��ȯ�Ѵ�..
	}
	
	public ArrayList<Integer> searchFoodInfo2(int categoryKey) {//���õ� ī�װ��� �ִ� ������ array�� ��Ƽ� ��ȯ
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i = 0 ; i<database.tb_food.size();i++){
			if(database.tb_food.get(i).getCategory() == categoryKey){
				arrayList.add(database.tb_food.get(i).getNo());
			}
		}
		return arrayList;// Integer�� Arraylist�� ��ȯ�Ѵ�..
	}
	
	
	public ArrayList<Integer> searchFoodHomeless() {//���õ� ī�װ��� �ִ� ������ array�� ��Ƽ� ��ȯ
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i = 0 ; i<database.tb_food.size();i++){
			if(!database.tb_food.get(i).isState()){
				arrayList.add(database.tb_food.get(i).getNo());
			}
		}
		return arrayList;// Integer�� Arraylist�� ��ȯ�Ѵ�..
	}
}

