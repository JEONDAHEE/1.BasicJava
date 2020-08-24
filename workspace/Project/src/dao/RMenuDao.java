package dao;

import java.util.ArrayList;

import vo.FoodVo;
import vo.RecommendedMenuVo;
import data.Database;

public class RMenuDao {
   private static RMenuDao instance;

   private RMenuDao() {
   }

   public static RMenuDao getInstance() {
      if (instance == null) {
         instance = new RMenuDao();
      }
      return instance;

   }
   Database database = Database.getInstance();
   FoodDao fooddao = FoodDao.getInstance();
   
   public void insertRMenu(RecommendedMenuVo rmenu) {
		if (!database.tb_rmenu.isEmpty()) {
			rmenu.setNo(database.tb_rmenu.get(database.tb_rmenu.size() - 1)
					.getNo() + 1);// �ߺ����� �⺻Ű�� �Է��Ѵ�.
		} else {
			rmenu.setNo(0);
		}
		database.tb_rmenu.add(rmenu);

	}
   public ArrayList<RecommendedMenuVo> selectRecommendedMenu(){ //��õ�޴� ��̸���Ʈ�� ����
      return database.tb_rmenu;
   }
   public FoodVo searchRecommendedMenuNo(int no){
      for(int i =0; i<database.tb_food.size();i++){  //(��õ�޴��� ����)��õ�޴��� foodvo �� food�� pk�� �� �ؼ� ������ �����ͺ��̽��� �߰�
         if(database.tb_food.get(i).getNo()==no){
            return database.tb_food.get(i);
         }
      }
      return null;
   }
   public void deleteRMenu(RecommendedMenuVo rMenu){ // ��õ�޴��� �ִ� �޴��� Ǫ�� �����ͺ��̽������ؼ� ����
      database.tb_rmenu.remove(rMenu);
   } 
   public RecommendedMenuVo searchRMenuNoInfo(int no){ //int�� �����޾� �����ͺ��̽��� ����� ���� ������ ���
      for(int i =0; i<database.tb_rmenu.size(); i++){  //�ֹ��� ���
         if(database.tb_rmenu.get(i).getNo()==no){
            return database.tb_rmenu.get(i);
         }
      }
      return null;
   } 
}




















