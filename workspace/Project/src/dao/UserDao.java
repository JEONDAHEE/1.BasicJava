package dao;

import java.util.ArrayList;

import vo.UserVo;
import data.Database;

public class UserDao {
	private static UserDao instance;

	private UserDao() {
		
	}

	public static UserDao getInstance() {
		if (instance == null) {
			instance = new UserDao();
		}
		return instance;

	}

	Database database = Database.getInstance();

	public UserVo selectUser(UserVo param) {
		
		UserVo rtnUser = null;
		
		for (int i = 0; i < database.tb_user.size(); i++) {
			
			UserVo user = database.tb_user.get(i);
			
			boolean flag = true;
			if (param.getId() != null)
				if (!param.getId().equals(user.getId())) flag = false;
			if (param.getPassword() != null)
				if (!param.getPassword().equals(user.getPassword())) flag = false;
			if (param.getName() != null)
				if (!param.getName().equals(user.getName())) flag = false;
			if (flag) {
				rtnUser = user;
				break;
			}
			
		}

		return rtnUser;
	}
	public void insertUser(UserVo user) {
		database.tb_user.add(user);
	}
	public void deleteUser(UserVo user) {
		database.tb_user.remove(user);
	}
	public ArrayList<UserVo> selectUserList() {

		return database.tb_user;
	}
	public ArrayList<UserVo> selectUserList(boolean state) {
		ArrayList<UserVo> list = new ArrayList<UserVo>();
		
		for(int i = 0; i< database.tb_user.size();i++){
			if(database.tb_user.get(i).isMode()==state){
				list.add(database.tb_user.get(i));
			}
		}
		
		return list;
	}
	
public UserVo searchUserNoInfo(String id) {//int�� no�� ���� �޾� �����ͺ��̽��� ����Ǿ��ִ� pk�� no���� ������ foodvo�� ���� ��ȯ�Ѵ�.
		for(int i = 0;i<database.tb_user.size();i++){
			if(id.equals(database.tb_user.get(i).getId())){
				return database.tb_user.get(i);
			}
		}
		
		return null;
	}
	public ArrayList<UserVo> searchNotAdminNoInfo() {//���̵� admin�� �ƴ�  ��� ȸ������ ��ȯ�Ѵ�.
		ArrayList<UserVo> notAdminList = new ArrayList<UserVo>();
		
		for(int i = 0;i<database.tb_user.size();i++){
			if(!database.tb_user.get(i).getId().equals("admin")){
				notAdminList.add(database.tb_user.get(i));
			}
		}
		return notAdminList;
	}
}
