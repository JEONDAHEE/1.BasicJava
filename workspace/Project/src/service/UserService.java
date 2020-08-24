package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vo.MileageVo;
import vo.UserVo;
import dao.MileageDao;
import dao.UserDao;
import data.Session;


public class UserService {
	static Scanner s = new Scanner(System.in);

	public static void join() {
		UserDao userDao = UserDao.getInstance();
		UserVo user = new UserVo();

		String id;
		UserVo userCheck;

		do {
			System.out
					.println("----------------------------------------------");
			id = formCheck("���̵�(����,���� 5�� �̻� 20������ ) : ", "[A-Za-z0-9_-]{5,20}");
			user.setId(id);
			userCheck = userDao.selectUser(user);
			if (userCheck != null) {
				System.out
						.println("----------------------------------------------");
				System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
				System.out
						.println("----------------------------------------------");
			} else {
				System.out
						.println("----------------------------------------------");
				System.out.println("�ش� ���̵� ����ϽǼ� �ֽ��ϴ�.");
				System.out
						.println("----------------------------------------------");
			}
		} while (userCheck != null);

		if (userCheck == null) {
			System.out
					.println("----------------------------------------------");
			String password = formCheck("��й�ȣ(����5������, ���� 20������ ����) : ",
					"[A-Za-z0-9_-]{5,20}");
			System.out
					.println("----------------------------------------------");
			String name = formCheck("�̸� : ", "^[A-Za-z��-�R]*$");
			System.out
					.println("----------------------------------------------");
			String num = formCheck("�ڵ��� ��ȣ('-'���� �Է�) : ",
					"^0\\d{1,3}-\\d{3,4}-\\d{4}");
			System.out
					.println("----------------------------------------------");
			String birth = formCheck("�������(6�ڸ�) : ", "[0-9]{6}");

			user.setPassword(password);
			user.setName(name);
			user.setNum(num);
			user.setBirth(birth);
			userDao.insertUser(user);

			MileageVo mileage = new MileageVo();
			mileage.setContents("ȸ������");
			mileage.setDate(new Date());
			mileage.setId(id);
			mileage.setMiliage(1000);
			MileageDao mileageDao = MileageDao.getInstance();
			mileageDao.insertMileage(mileage);

			System.out.println("�ռ����ּż� �����մϴ�0.<!");
		}
	}

	public static String formCheck(String contents, String form) {
		Pattern pattern;
		Matcher matcher;
		boolean check;
		String temp;
		do {

			System.out.println(contents);
			System.out
					.println("----------------------------------------------");
			temp = s.nextLine().trim();

			pattern = Pattern.compile(form);
			matcher = pattern.matcher(temp);

			if (matcher.matches()) {
				check = true;
			} else {
				System.out.println("���Ŀ� �°� �Է����ּ���.");
				check = false;
			}

		} while (!check);

		return temp;
	}

	public static void login() {
		// ���̵�, ��й�ȣ�� �Է�
		UserDao userDao = UserDao.getInstance();

		System.out.println("���̵� : ");
		String id = s.nextLine().trim();
		System.out.println("��й�ȣ : ");
		String password = s.nextLine().trim();

		UserVo user = new UserVo();
		user.setId(id);
		user.setPassword(password);

		UserVo userCheck = userDao.selectUser(user);

		// ������ �α��� ����
		if (userCheck == null) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�! ���� ���ϼ̳���??�Ф�");
		} else {
			// ������ �α���
			System.out.println("���� �غ� �Ϸ�!!!");
			System.out.println(userCheck.getName() + "�밴 +1~!");
			Session.loginUser = userCheck;
			MileageDao mileageDao = MileageDao.getInstance();
			// Mileage.deleteMilegaeData();// 30�� ���� ���ϸ����� �����ȴ�.
			mileageDao.searchUserMileage(Session.loginUser.getId());
		}
	}

	public static void userManagement() {

		boolean check = true;
		String temp = "";
		do {
			do {
				System.out.println("----------------------------------------");
				System.out.println("�������� �޴��Դϴ�.");
				System.out.println("1. ȸ�� ��� ���");
				System.out.println("2. ������ �� ���� ��޺ο�");
				System.out.println("3. ȸ�� ����");		
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("----------------------------------------");

				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp, 0, 3);

			} while (!check);
			check = false;
			int menu = Integer.parseInt(temp);

			switch (menu) {
			case 1:
				userList();
				break;
			case 2:// ��ް���
				adminPermission();
				break;
			case 3:
				deleteUser();
				break;
			case 0:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				check = true;
			}
		} while (!check);

	}

	public static void userList() {
		// ȸ�� ��ü ��ȸ
		UserDao userDao = UserDao.getInstance();
		ArrayList<UserVo> userArray = userDao.selectUserList();
		// ���
		System.out
				.println("-------------------------------------------------------------------------------");
		System.out.println("��ȣ\t���̵�\t\t\t�̸�\t��ȭ��ȣ\t\t�������");
		System.out
				.println("-------------------------------------------------------------------------------");
		for (int i = 0; i < userDao.selectUserList().size(); i++) {

			String id = userArray.get(i).getId();
			
			int count = 3-id.length()/7;
			for(int j = 0 ; j < count ;j++){
				id += "\t";
			}
		
			System.out.println(i + 1 + "\t" + id + userArray.get(i).getName()
					+ "\t" + userArray.get(i).getNum() + "\t"
					+ userArray.get(i).getBirth());

		}
		System.out
				.println("-------------------------------------------------------------------------------");

	}

	public static void deleteUser() {
		UserDao userDao = UserDao.getInstance();
		ArrayList<UserVo> userArray = userDao.selectUserList(false);

		boolean check = true;
		String temp = "";
		System.out.println("---------------------------------------------------");
		System.out.println("��ȣ\t���̵�\t\t\t�̸�");
		System.out.println("---------------------------------------------------");
		do {
			for (int i = 0; i < userArray.size(); i++) {
				String id = userArray.get(i).getId();
				
				int count = 3-id.length()/7;
				for(int j = 0 ; j < count ;j++){
					id += "\t";
				}
				
				
				System.out.println(i + 1 + "\t" + id
						+ userArray.get(i).getName() + "\t");

			}
			System.out.println("0.  �����ϱ�");
			System.out
					.println("---------------------------------------------------");
			System.out.println("�����ϰ����ϴ� ȸ���� ��ȣ�� �Է����ּ���.");
			System.out
					.println("---------------------------------------------------");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0, userArray.size());

		} while (!check);
		if (temp.equals("0")) {
			return;
		}
		String pos = userArray.get(Integer.parseInt(temp) - 1).getId();
		System.out.println(pos);

		do {
			System.out.println("-----------------------------------------------");
			System.out.println("ID : " + userDao.searchUserNoInfo(pos).getId() + "�� �����Ͻðڽ��ϱ�?");
			System.out.println("���� : 1");
			System.out.println("��� : 0");
			System.out.println("-----------------------------------------------");

			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);

		} while (!check);

		if (Integer.parseInt(temp) == 1) {
			userDao.deleteUser(userDao.searchUserNoInfo(pos));
		} else {
			System.out.println("�۾��� ����մϴ�.");
			return;
		}
	}

	public static void adminPermission() {
		UserDao userDao = UserDao.getInstance();
		ArrayList<UserVo> notAdminList = userDao.searchNotAdminNoInfo();
		String temp = "";
		boolean check = false;

		if (!Session.loginUser.getId().equals("admin")) {
			System.out.println("�ش� ���̵�� ������ �� �����ϴ�.");
		} else {
			do{
			do {
				System.out.println("---------------------------------------");
				System.out.println("����� ������ ���̵� �������ּ���.");
				System.out.println("---------------------------------------");
				System.out.println("��ȣ\t���̵�\t\t\t���");
				System.out.println("---------------------------------------");
				for (int i = 0; i < notAdminList.size(); i++) {
					String id = notAdminList.get(i).getId();
					int count = 3-id.length()/7;
					for(int j = 0 ; j < count ;j++){
						id += "\t";
					}
					
					
					
					
				
					

					System.out.print(i + 1 + "\t ");
					System.out.print(id);
					if (notAdminList.get(i).isMode()) {
						System.out.println("������");
					} else {
						System.out.println("����");
					}
				}
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("---------------------------------------");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, notAdminList.size());
			} while (!check);

			if (temp.equals("0")) {
				return;
			}

			UserVo userInfo = notAdminList.get(Integer.parseInt(temp) - 1);

			do {
				System.out.println("-------------------------------------------------");
				System.out.print(userInfo.getId() + "�� ���� ����� ");
				if (userInfo.isMode()) {
					System.out.println("������");
				} else {
					System.out.println("����");
				}
				System.out.println("�Դϴ�.");
				System.out.println("������ ����� �������ּ���.");
				System.out.println("1. ����");
				System.out.println("2. ������");
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("-------------------------------------------------");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, 2);
			} while (!check);

			if (temp.equals("0")) {
				check = true;
			} else {

				int pos = Integer.parseInt(temp);

				switch (pos) {
				case 1:
					System.out.println("-------------------------------------------------");
					userDao.selectUser(userInfo).setMode(true);
					System.out.print(userDao.selectUser(userInfo).getId() + "�� ���");
					if (userDao.selectUser(userInfo).isMode()) {
						System.out.println("�� ������ ����Ǿ����ϴ�.");
						userDao.selectUser(userInfo).setMode(false);

					} else {
						System.out.println("�� ������ �����Ͽ����ϴ�.");
					}

					System.out.println("-------------------------------------------------");
					break;
				case 2:
					System.out.println("-------------------------------------------------");
					System.out.print(userDao.selectUser(userInfo).getId()+ "�� ���");
					if (!userDao.selectUser(userInfo).isMode()) {
						System.out.println("�� �����ڷ� ����Ǿ����ϴ�.");
						userDao.selectUser(userInfo).setMode(true);
					} else {
						System.out.println("�� ������ �����Ͽ����ϴ�.");
					}
					System.out.println("-------------------------------------------------");
					break;

				}
				check = false;
			}

		}while(check);
	}
}
}
