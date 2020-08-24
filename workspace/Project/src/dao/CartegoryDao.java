package dao;

import java.util.ArrayList;


import vo.MenuCategoryVo;
import data.Database;

public class CartegoryDao {
	private static CartegoryDao instance;

	private CartegoryDao() {
		
	}

	public static CartegoryDao getInstance() {
		if (instance == null) {
			instance = new CartegoryDao();
		}
		return instance;

	}

	Database database = Database.getInstance();
	
	public int insertCategory(MenuCategoryVo category) {
		if(!database.tb_cartegory.isEmpty()){
			category.setNo(database.tb_cartegory.get(database.tb_cartegory.size()-1).getNo()+1);//�ߺ����� �⺻Ű�� �Է��Ѵ�.
		}else{
			category.setNo(0);
		}
		database.tb_cartegory.add(category);
		
		return category.getNo();
	}
	public void deleteCategory(MenuCategoryVo category) {
		database.tb_cartegory.remove(category);
	}
	public ArrayList<MenuCategoryVo> selectCartegoryList() { //��� cartVo�� �ҷ��´�.
		return database.tb_cartegory;
	}
	
	public MenuCategoryVo searchCategoryNoInfo(int no){//MenuCategoryVo�� �⺻Ű�� �Ű������� �Է��ϸ� �ش� �⺻Ű�� ���� MenuCategoryVo�� ����
		for(int i = 0;i<database.tb_cartegory.size();i++){
			if(database.tb_cartegory.get(i).getNo()==no){
				return database.tb_cartegory.get(i);
			}
		}
		return null;
	}
	public ArrayList<Integer> searchCategoryInfo() {//ī�װ��� �⺻Ű�� list�� ����
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i = 0;i<database.tb_cartegory.size();i++){
			if(database.tb_cartegory.get(i).getNo()!=99&&database.tb_cartegory.get(i).isState()){
				arrayList.add(database.tb_cartegory.get(i).getNo());
			}
		}
		
		for(int i = 0;i<database.tb_cartegory.size();i++){
			if(database.tb_cartegory.get(i).getNo()==99&&database.tb_cartegory.get(i).isState()){
				arrayList.add(database.tb_cartegory.get(i).getNo());
				break;
			}
		}
		
		return arrayList;// Integer�� Arraylist�� ��ȯ�Ѵ�..
	}
}
