package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;
import data.Session;

public class UserService {
	
//싱글톤으로 만들어주기
private static UserService instance; 
	
	private UserService(){}
	
	public static UserService getInstance(){
		if(instance == null){
			instance = new UserService();
		}
		return instance;
	}

	Scanner s = new Scanner(System.in);
	
	private UserDao userDao = UserDao.getInstance();

	//-------------------------------------------------------------------회원가입
	public void join(){
		
		UserVO user = new UserVO();
		
		//사용자 정보 입력
		System.out.println("아이디 : ");
		String id = s.nextLine();
		
		user.setId(id); // 아이디 입력
		//아이디 중복 검사
		UserVO userCheck = userDao.selectUser(user);    //아이디만 입력하고 아이디 중복검사를 하기 위해.
		
		//중복이 아니면 회원가입 진행
		if(userCheck == null){ //입력한 아이디가 없으면 중복이 아니기 때문에
			System.out.println("비밀번호 : ");
			String password = s.nextLine();
			System.out.println("이름 : ");
			String name = s.nextLine();
			
			user.setPassword(password);
			user.setName(name);
			
			userDao.insertUser(user);
			System.out.println("가입해주셔서 감사합니다.");
			
		}else { // 중복이면 아이디 중복이라고 알려준다.
			System.out.println("아이디가 중복입니다.");
		}
	}
	
	//---------------------------------------------------------------------------로그인
	public void login(){
		//아이디, 비밀번호 입력
		System.out.println("아이디 : ");
		String id = s.nextLine();
		System.out.println("비밀번호 : ");
		String password = s.nextLine();
		
		//데이터베이스에 접속해서 일치하는지 확인
		UserVO user = new UserVO();
		user.setId(id);
		user.setPassword(password);
		
		UserVO userCheck = userDao.selectUser(user);
		
		//일치하는 유저가 없으면 로그인 실패
		if(userCheck == null){
			System.out.println("아이디 혹은 비밀번호를 잘못입력하셨습니다.");
		}else{//일치하는 유저가 있으면 로그인 성공
			System.out.println("로그인 성공 !");
			System.out.println(userCheck.getName() + "님 환영합니다 !");
			Session.loginUser = userCheck;
		}
	}
	
	//------------------------------------------------------------------------------회원목록
	public void userList(){
		// 회원 전체 목록 조회
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		//출력
		System.out.println("---------------------------------");
		System.out.println("번호\t아이디\t이름");
		System.out.println("---------------------------------");
		for(int i = 0; i < userList.size();i++){
			UserVO user = userList.get(i);
			System.out.println( (i + 1) + "\t" + user.getId() + "\t" + user.getName());
		}
		System.out.println("---------------------------------");
	}
}
