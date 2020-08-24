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
			id = formCheck("¾ÆÀÌµğ(¿µ¹®,¼ıÀÚ 5ÀÚ ÀÌ»ó 20ÀÚÀÌÇÏ ) : ", "[A-Za-z0-9_-]{5,20}");
			user.setId(id);
			userCheck = userDao.selectUser(user);
			if (userCheck != null) {
				System.out
						.println("----------------------------------------------");
				System.out.println("Áßº¹µÈ ¾ÆÀÌµğ°¡ ÀÖ½À´Ï´Ù.");
				System.out
						.println("----------------------------------------------");
			} else {
				System.out
						.println("----------------------------------------------");
				System.out.println("ÇØ´ç ¾ÆÀÌµğ¸¦ »ç¿ëÇÏ½Ç¼ö ÀÖ½À´Ï´Ù.");
				System.out
						.println("----------------------------------------------");
			}
		} while (userCheck != null);

		if (userCheck == null) {
			System.out
					.println("----------------------------------------------");
			String password = formCheck("ºñ¹Ğ¹øÈ£(¿µ¹®5ÀÚÀÌÇÏ, ¼ıÀÚ 20ÀÚÀÌÇÏ Æ÷ÇÔ) : ",
					"[A-Za-z0-9_-]{5,20}");
			System.out
					.println("----------------------------------------------");
			String name = formCheck("ÀÌ¸§ : ", "^[A-Za-z°¡-ÆR]*$");
			System.out
					.println("----------------------------------------------");
			String num = formCheck("ÇÚµåÆù ¹øÈ£('-'Æ÷ÇÔ ÀÔ·Â) : ",
					"^0\\d{1,3}-\\d{3,4}-\\d{4}");
			System.out
					.println("----------------------------------------------");
			String birth = formCheck("»ı³â¿ùÀÏ(6ÀÚ¸®) : ", "[0-9]{6}");

			user.setPassword(password);
			user.setName(name);
			user.setNum(num);
			user.setBirth(birth);
			userDao.insertUser(user);

			MileageVo mileage = new MileageVo();
			mileage.setContents("È¸¿ø°¡ÀÔ");
			mileage.setDate(new Date());
			mileage.setId(id);
			mileage.setMiliage(1000);
			MileageDao mileageDao = MileageDao.getInstance();
			mileageDao.insertMileage(mileage);

			System.out.println("ÇÕ¼®ÇØÁÖ¼Å¼­ °©»çÇÕ´Ï´Ù0.<!");
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
				System.out.println("Çü½Ä¿¡ ¸Â°Ô ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				check = false;
			}

		} while (!check);

		return temp;
	}

	public static void login() {
		// ¾ÆÀÌµğ, ºñ¹Ğ¹øÈ£¸¦ ÀÔ·Â
		UserDao userDao = UserDao.getInstance();

		System.out.println("¾ÆÀÌµğ : ");
		String id = s.nextLine().trim();
		System.out.println("ºñ¹Ğ¹øÈ£ : ");
		String password = s.nextLine().trim();

		UserVo user = new UserVo();
		user.setId(id);
		user.setPassword(password);

		UserVo userCheck = userDao.selectUser(user);

		// ¾øÀ¸¸é ·Î±×ÀÎ ½ÇÆĞ
		if (userCheck == null) {
			System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù! ¹ú½á ÃëÇÏ¼Ì³ª¿ä??¤Ğ¤Ğ");
		} else {
			// ÀÖÀ¸¸é ·Î±×ÀÎ
			System.out.println("¼úÀÜ ÁØºñ ¿Ï·á!!!");
			System.out.println(userCheck.getName() + "Ãë°´ +1~!");
			Session.loginUser = userCheck;
			MileageDao mileageDao = MileageDao.getInstance();
			// Mileage.deleteMilegaeData();// 30ÀÏ Áö³­ ¸¶ÀÏ¸®Áö´Â »èÁ¦µÈ´Ù.
			mileageDao.searchUserMileage(Session.loginUser.getId());
		}
	}

	public static void userManagement() {

		boolean check = true;
		String temp = "";
		do {
			do {
				System.out.println("----------------------------------------");
				System.out.println("À¯Àú°ü¸® ¸Ş´ºÀÔ´Ï´Ù.");
				System.out.println("1. È¸¿ø ¸ñ·Ï Ãâ·Â");
				System.out.println("2. °ü¸®ÀÚ ¹× À¯Àú µî±ŞºÎ¿©");
				System.out.println("3. È¸¿ø »èÁ¦");		
				System.out.println("0. ÀÌÀü ¸Ş´º·Î ÀÌµ¿");
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
			case 2:// µî±Ş°ü¸®
				adminPermission();
				break;
			case 3:
				deleteUser();
				break;
			case 0:
				System.out.println("ÀÌÀü ¸Ş´º·Î µ¹¾Æ°©´Ï´Ù.");
				check = true;
			}
		} while (!check);

	}

	public static void userList() {
		// È¸¿ø ÀüÃ¼ Á¶È¸
		UserDao userDao = UserDao.getInstance();
		ArrayList<UserVo> userArray = userDao.selectUserList();
		// Ãâ·Â
		System.out
				.println("-------------------------------------------------------------------------------");
		System.out.println("¹øÈ£\t¾ÆÀÌµğ\t\t\tÀÌ¸§\tÀüÈ­¹øÈ£\t\t»ı³â¿ùÀÏ");
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
		System.out.println("¹øÈ£\t¾ÆÀÌµğ\t\t\tÀÌ¸§");
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
			System.out.println("0.  Á¾·áÇÏ±â");
			System.out
					.println("---------------------------------------------------");
			System.out.println("»èÁ¦ÇÏ°íÀÚÇÏ´Â È¸¿øÀÇ ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
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
			System.out.println("ID : " + userDao.searchUserNoInfo(pos).getId() + "¸¦ »èÁ¦ÇÏ½Ã°Ú½À´Ï±î?");
			System.out.println("»èÁ¦ : 1");
			System.out.println("Ãë¼Ò : 0");
			System.out.println("-----------------------------------------------");

			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp);

		} while (!check);

		if (Integer.parseInt(temp) == 1) {
			userDao.deleteUser(userDao.searchUserNoInfo(pos));
		} else {
			System.out.println("ÀÛ¾÷À» Ãë¼ÒÇÕ´Ï´Ù.");
			return;
		}
	}

	public static void adminPermission() {
		UserDao userDao = UserDao.getInstance();
		ArrayList<UserVo> notAdminList = userDao.searchNotAdminNoInfo();
		String temp = "";
		boolean check = false;

		if (!Session.loginUser.getId().equals("admin")) {
			System.out.println("ÇØ´ç ¾ÆÀÌµğ´Â Á¢±ÙÇÒ ¼ö ¾ø½À´Ï´Ù.");
		} else {
			do{
			do {
				System.out.println("---------------------------------------");
				System.out.println("µî±ŞÀ» ¹ø°æÇÒ ¾ÆÀÌµğ¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä.");
				System.out.println("---------------------------------------");
				System.out.println("¹øÈ£\t¾ÆÀÌµğ\t\t\tµî±Ş");
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
						System.out.println("°ü¸®ÀÚ");
					} else {
						System.out.println("À¯Àú");
					}
				}
				System.out.println("0. ÀÌÀü ¸Ş´º·Î ÀÌµ¿");
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
				System.out.print(userInfo.getId() + "ÀÇ ÇöÀç µî±ŞÀº ");
				if (userInfo.isMode()) {
					System.out.println("°ü¸®ÀÚ");
				} else {
					System.out.println("À¯Àú");
				}
				System.out.println("ÀÔ´Ï´Ù.");
				System.out.println("º¯°æÇÒ µî±ŞÀ» ¼±ÅÃÇØÁÖ¼¼¿ä.");
				System.out.println("1. À¯Àú");
				System.out.println("2. °ü¸®ÀÚ");
				System.out.println("0. ÀÌÀü ¸Ş´º·Î ÀÌµ¿");
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
					System.out.print(userDao.selectUser(userInfo).getId() + "ÀÇ µî±Ş");
					if (userDao.selectUser(userInfo).isMode()) {
						System.out.println("ÀÌ À¯Àú·Î º¯°æµÇ¾ú½À´Ï´Ù.");
						userDao.selectUser(userInfo).setMode(false);

					} else {
						System.out.println("ÀÇ º¯°æÀ» ½ÇÆĞÇÏ¿´½À´Ï´Ù.");
					}

					System.out.println("-------------------------------------------------");
					break;
				case 2:
					System.out.println("-------------------------------------------------");
					System.out.print(userDao.selectUser(userInfo).getId()+ "ÀÇ µî±Ş");
					if (!userDao.selectUser(userInfo).isMode()) {
						System.out.println("ÀÌ °ü¸®ÀÚ·Î º¯°æµÇ¾ú½À´Ï´Ù.");
						userDao.selectUser(userInfo).setMode(true);
					} else {
						System.out.println("ÀÇ º¯°æÀ» ½ÇÆĞÇÏ¿´½À´Ï´Ù.");
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
