package data;

import java.util.ArrayList;

import vo.UserVO;

public class Database {
	
	//��� ����ϵ��� ������ ��ü�� ������ ����ؾ� ��. => �̱��� ��������...
	//�̱������� ������ֱ�
	private static Database instance; // �ν��Ͻ���� ���� ����(Ŭ������ ������)
	
	private Database(){}
	
	public static Database getInstance(){// �ν��Ͻ���� �޼��� ����(Ŭ������ ������)
		if(instance == null){
			instance = new Database();
		}
		return instance;
	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<>(); //user���̺�
	
	{ //�Ѹ��� ���� �־���
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("������");
		tb_user.add(user);
	}
	

}
