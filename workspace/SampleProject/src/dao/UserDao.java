package dao;

import java.util.ArrayList;

import vo.UserVO;
import data.Database;

public class UserDao {
	
	//싱글톤으로 만들어주기
	private static UserDao instance; 
	
	private UserDao(){} // 다른애들이 얘를 사용 못하게 만들어 놓고 
	
	public static UserDao getInstance(){
		if(instance == null){
			instance = new UserDao();
		}
		return instance;
	}
	
	//데이터베이스를 사용하기 위한 객체 생성
	Database database = Database.getInstance();
	
	public UserVO selectUser(UserVO param){
		UserVO rtnUser = null;
		for(int i = 0; i < database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			
			boolean flag = true;
			
			if(param.getId() != null) // 아이디 중복체크
				if(!param.getId().equals(user.getId())) 
					flag = false;
			
			if(param.getPassword() != null) // 비밀번호 중복체크
				if(!param.getPassword().equals(user.getPassword())) 
					flag = false;
			
			if(param.getName() != null) // 이름중복체크
				if(!param.getName().equals(user.getName())) 
					flag = false;
			
			if(flag){
				rtnUser = user;
				break;
			}
		}
		return rtnUser;
	}

	//회원가입한 유저를 데이터베이스에 추가시킨다.
	public void insertUser(UserVO user) {
		database.tb_user.add(user);
		
	}

	//회원 목록 메서드
	public ArrayList<UserVO> selectUserList() {
		return database.tb_user;
	}

	
}
