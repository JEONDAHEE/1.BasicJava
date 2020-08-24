package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;
import data.Session;

public class UserService {
	
//�̱������� ������ֱ�
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

	//-------------------------------------------------------------------ȸ������
	public void join(){
		
		UserVO user = new UserVO();
		
		//����� ���� �Է�
		System.out.println("���̵� : ");
		String id = s.nextLine();
		
		user.setId(id); // ���̵� �Է�
		//���̵� �ߺ� �˻�
		UserVO userCheck = userDao.selectUser(user);    //���̵� �Է��ϰ� ���̵� �ߺ��˻縦 �ϱ� ����.
		
		//�ߺ��� �ƴϸ� ȸ������ ����
		if(userCheck == null){ //�Է��� ���̵� ������ �ߺ��� �ƴϱ� ������
			System.out.println("��й�ȣ : ");
			String password = s.nextLine();
			System.out.println("�̸� : ");
			String name = s.nextLine();
			
			user.setPassword(password);
			user.setName(name);
			
			userDao.insertUser(user);
			System.out.println("�������ּż� �����մϴ�.");
			
		}else { // �ߺ��̸� ���̵� �ߺ��̶�� �˷��ش�.
			System.out.println("���̵� �ߺ��Դϴ�.");
		}
	}
	
	//---------------------------------------------------------------------------�α���
	public void login(){
		//���̵�, ��й�ȣ �Է�
		System.out.println("���̵� : ");
		String id = s.nextLine();
		System.out.println("��й�ȣ : ");
		String password = s.nextLine();
		
		//�����ͺ��̽��� �����ؼ� ��ġ�ϴ��� Ȯ��
		UserVO user = new UserVO();
		user.setId(id);
		user.setPassword(password);
		
		UserVO userCheck = userDao.selectUser(user);
		
		//��ġ�ϴ� ������ ������ �α��� ����
		if(userCheck == null){
			System.out.println("���̵� Ȥ�� ��й�ȣ�� �߸��Է��ϼ̽��ϴ�.");
		}else{//��ġ�ϴ� ������ ������ �α��� ����
			System.out.println("�α��� ���� !");
			System.out.println(userCheck.getName() + "�� ȯ���մϴ� !");
			Session.loginUser = userCheck;
		}
	}
	
	//------------------------------------------------------------------------------ȸ�����
	public void userList(){
		// ȸ�� ��ü ��� ��ȸ
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		//���
		System.out.println("---------------------------------");
		System.out.println("��ȣ\t���̵�\t�̸�");
		System.out.println("---------------------------------");
		for(int i = 0; i < userList.size();i++){
			UserVO user = userList.get(i);
			System.out.println( (i + 1) + "\t" + user.getId() + "\t" + user.getName());
		}
		System.out.println("---------------------------------");
	}
}
