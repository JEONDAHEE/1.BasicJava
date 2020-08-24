package data;

import java.util.ArrayList;

import vo.UserVO;

public class Database {
	
	//어디서 사용하든지 동일한 객체를 가지고 사용해야 함. => 싱글톤 패턴으로...
	//싱글톤으로 만들어주기
	private static Database instance; // 인스턴스라는 변수 생성(클래스명 변수명)
	
	private Database(){}
	
	public static Database getInstance(){// 인스턴스라는 메서드 생성(클래스명 변수명)
		if(instance == null){
			instance = new Database();
		}
		return instance;
	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<>(); //user테이블
	
	{ //한명의 유저 넣어논거
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		tb_user.add(user);
	}
	

}
