package dao;

import java.util.ArrayList;

import vo.MileageVo;
import data.Database;

public class MileageDao {
	private static MileageDao instance;

	private MileageDao() {
		
	}

	public static MileageDao getInstance() {
		if (instance == null) {
			instance = new MileageDao();
		}
		return instance;

	}

	Database database = Database.getInstance();
	
	public void insertMileage(MileageVo mileage) {
		if(!database.tb_Mileage.isEmpty()){
			mileage.setNo(database.tb_Mileage.get(database.tb_Mileage.size()-1).getNo()+1);//�ߺ����� �⺻Ű�� �Է��Ѵ�.
			database.tb_Mileage.add(mileage);
		}else{
			mileage.setNo(0);//�ߺ����� �⺻Ű�� �Է��Ѵ�.
			database.tb_Mileage.add(mileage);
		}		
	}
	public void deleteCategory(MileageVo mileage) {
		database.tb_Mileage.remove(mileage);
	}
	public ArrayList<MileageVo> selectMileageList() {

		return database.tb_Mileage;
	}
	public ArrayList<MileageVo> searchUserMileage(String id){//MileageVo�� ������ ID�� �Ű������� �Է��ϸ� �ش� ������ ID�� ���� MileageVo�� list�� ��ȯ
		ArrayList<MileageVo> list = new ArrayList<>();
		for(int i = 0; i <database.tb_Mileage.size();i++){
			if(database.tb_Mileage.get(i).getId().equals(id)){
				list.add(database.tb_Mileage.get(i)); 
			}
		}
		return list;
	}
	public int searchUserMileageSum(String id){//{//MileageVo�� ������ ID�� �Ű������� �Է��ϸ� �ش� ������ ID�� ���� Mileage�� �հ踦 ��ȯ
		int sum = 0;
		for(int i = 0; i <database.tb_Mileage.size();i++){
			if(database.tb_Mileage.get(i).getId().equals(id)){
				sum+=database.tb_Mileage.get(i).getMiliage(); 
			}
		}
		return sum;
	}
}
