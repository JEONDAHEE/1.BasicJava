package game.sutvivarGame;

import java.util.Date;
import java.util.Scanner;

import vo.MileageVo;
import vo.UserVo;
import dao.MileageDao;
import data.Session;

public class FIgthClass {

	private static FIgthClass instance; // instance�� ����

	private FIgthClass() {
	}

	public static FIgthClass getInstance() {
		if (instance == null) {
			instance = new FIgthClass();
		}
		return instance;

	}

	Character2 c2 = Character2.getInstance();
	Scanner s = new Scanner(System.in);
	int stage;
	int turn = 1;
	int point;

	int a_maxhp;
	int a_char;
	int a_health;
	int a_attack;
	int a_point;
	int a_skillpoint;
	int a_mode;
	int a_modeattack;
	boolean a_win;

	int b_maxhp;
	int b_char;
	int b_health;
	int b_attack;
	int b_point;
	int b_skillpoint;
	int b_mode;
	int b_modeattack;
	boolean b_win;

	int user1;
	int user2;

	boolean skillstop = true;

	void aUserpoint() {

		a_point++;

	}

	void attack() {
		if (user1 == 1) {
			a_point--;
			if (user2 == 2) {
				System.out.println("������ ������ ���ҽ��ϴ�");
			} else {
				b_health = b_health - a_attack;
			}
		}
		if (user2 == 1) {
			b_point--;
			if (user1 == 2) {
				System.out.println("������ ������ ���ҽ��ϴ�");
			} else {
				a_health = a_health - b_attack;
			}
		}
	}

	void bUserpoint() {

		b_point++;

	}

	public void mainFight() {
		MileageDao mileageDao = MileageDao.getInstance();
		int sum = mileageDao.searchUserMileageSum(Session.loginUser.getId());
		if(sum<=500){
			System.out.println("������ �����ϱ� ���ؼ��� 500���ϸ��� �̻� �ʿ��մϴ�.");
			return;
		}
		StartClas s = new StartClas();
		   
		   s.Start();
		
		  selectClass s1 = new selectClass();
		   
		   s1.select();

		boolean result = false;

		do {
			turn++;
			// boolean skillstop = true;

			modesetting();
			user_1();
			user_2();// user1 ���� ��
			attack();

			if (user1 == 4)
				a_skillselect();
			if (user1 == 4 && user2 == 4 && a_char == b_char) {

			} else {

				if (user2 == 4)
					b_skillselect();
			}

			view();

			if (a_health <= 0 && b_health <= 0) {
				System.out.println("�����ϴ�.");
			} else if (a_health <= 0) {
				System.out.println("��ǻ���� �¸��Դϴ�.");
				b_win = true;
				result = !result;
			} else if (b_health <= 0) {
				System.out.println(" �¸��ϼ̽��ϴ�!!");
				a_win = true;
				result = !result;
			}

		} while (!result);
		
		if(b_win == true){
			System.out.println("����Ʈ -1000 ����");
			MileageDao mileagedao = MileageDao.getInstance();
			UserVo user = Session.loginUser;
			String userKey = user.getId();
			MileageVo mileageInfo = new MileageVo();

			Date date = new Date();

			mileageInfo.setDate(date);// ���� ���� �ð� �Է�
			mileageInfo.setId(userKey);// ���� ���̵�
			mileageInfo.setMiliage(-200);// ȹ�渶�ϸ���
			mileageInfo.setContents("�������� �¸�");
			mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�
			mileagedao.searchUserMileage(Session.loginUser.getId());// ���ϸ��� ���� �ֽ�ȭ
			
		}
		if(a_win == true && turn < 10){
			System.out.println("����Ʈ 1000 ȹ��!");
			MileageDao mileagedao = MileageDao.getInstance();
			UserVo user = Session.loginUser;
			String userKey = user.getId();
			MileageVo mileageInfo = new MileageVo();

			Date date = new Date();

			mileageInfo.setDate(date);// ���� ���� �ð� �Է�
			mileageInfo.setId(userKey);// ���� ���̵�
			mileageInfo.setMiliage(1000);// ȹ�渶�ϸ���
			mileageInfo.setContents("�������� �¸�");
			mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�
			mileagedao.searchUserMileage(Session.loginUser.getId());// ���ϸ��� ���� �ֽ�ȭ

		}
		if(a_win == true && turn >= 10){
			System.out.println("����Ʈ 500 ȹ��!");
			MileageDao mileagedao = MileageDao.getInstance();
			UserVo user = Session.loginUser;
			String userKey = user.getId();
			MileageVo mileageInfo = new MileageVo();

			Date date = new Date();

			mileageInfo.setDate(date);// ���� ���� �ð� �Է�
			mileageInfo.setId(userKey);// ���� ���̵�
			mileageInfo.setMiliage(500);// ȹ�渶�ϸ���
			mileageInfo.setContents("�������� �¸�");
			mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�
			mileagedao.searchUserMileage(Session.loginUser.getId());// ���ϸ��� ���� �ֽ�ȭ

		}

	} // ��

	void process() {
		if (user2 == 2 || user1 == 2) {

		}

	}

	void view() {

		System.out.println("================================");
		System.out.print("\n���� HP   : ");
		for (int i = 0; i < a_health; i++) {
			System.out.print("��");
		}
		for (int i = 0; i < a_maxhp - a_health; i++) {
			System.out.print("��");
		}
		System.out.print("\n���� MP   :" + a_point);
		System.out.println("\n================================");
		if (a_mode > turn)
			System.out.println("���Ÿ�� : " + (a_mode - turn));
		System.out.print("\n������ HP : ");
		for (int i = 0; i < b_health; i++) {
			System.out.print("��");
		}
		for (int i = 0; i < b_maxhp - b_health; i++) {
			System.out.print("��");
		}
		System.out.print("\n������ MP   :" + b_point);
		if (b_mode > turn)
			System.out.println("\n���Ÿ�� : " + (b_mode - turn));
		System.out.println("\n================================");
	}

	void Char1Skill() {
		System.out.println("��û�� ������ �ذ� ������!");
		System.out.println("���ð�??");
		if (user1 == 4) {
			if (user2 == 2) {
				b_health -= a_attack;
			} else {
				b_health -= a_attack * 2;
			}
		}

		if (user2 == 4) {
			if (user1 == 2) {
				a_health -= b_attack;
			} else {
				a_health -= b_attack * 2;
			}
		}

	}

	void modesetting() {
		if (a_mode == turn) {

			a_attack = a_modeattack;

		}
		if (b_mode == turn) {
			b_attack = b_modeattack;
		}

	}

	void Char2Skill() {
		System.out.println("���� ���� ����");

		if (user1 == 4) {
			a_mode = turn + 2;
			a_modeattack = c2.power;
			a_attack *= 2;
		}

		if (user2 == 4) {
			b_mode = turn + 2;
			b_modeattack = c2.power;
			b_attack *= 2;

		}

	}

	void user_1() {
		skillstop = true;

		while (skillstop == true) {
			
			System.out.println("\n1. �����ϱ�");
			System.out.println("2. ����ϱ�"); //
			System.out.println("3. �������");
			System.out.println("4. ��ų����");
			user1 = s.nextInt();
			switch (user1) {
			case 1:
				if (a_point > 0) {
					// aUserattack(a_attack);
					System.out.println("�׳� �����ϱ�");
					skillstop = false;
				} else {
					System.out.println("���� ����Ʈ�� �����մϴ�!");
				}
				break;

			case 2:

				System.out.println("�׳� ���ƹ�����!");
				skillstop = false;
				break;
			case 3:
				aUserpoint();
				System.out.println("�� ������!");
				skillstop = false;
				break;
			case 4:
				if (a_point >= a_skillpoint) {
					System.out.println("Ư�� �����ϱ�!");
					a_point -= a_skillpoint;
					skillstop = false;
				} else {
					System.out.println("���� ����Ʈ�� �����մϴ�. ����Ʈ�� " + a_skillpoint
							+ " �̻��̾�� �մϴ�.");
					skillstop = true;
				}

			}
		}
	}

	void user_2() {
		skillstop = true;
		while (skillstop == true) {
			
			user2 = (int) (Math.random() * 4) + 1;
			System.out.println("1. �����ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. ��ų����");
			switch (user2) {
			case 1:
				if (b_point > 0) {
					// bUserattack(b_attack);
					System.out.println("�׳� �����ϱ�");
					skillstop = false;
				} else {
					System.out.println("���� ����Ʈ�� �����մϴ�!");
				}
				break;

			case 2:

				System.out.println("�׳� ���ƹ�����!");
				skillstop = false;
				break;
			case 3:
				bUserpoint();
				System.out.println("�� ������!");
				skillstop = false;
				break;
			case 4:
				if (b_point >= b_skillpoint) {
					System.out.println("Ư�� �����ϱ�!");
					b_point -= b_skillpoint;
					skillstop = false;
				} else {
					System.out.println("���� ����Ʈ�� �����մϴ�. ����Ʈ�� " + b_skillpoint
							+ " �̻��̾�� �մϴ�.");
					skillstop = true;
				}

			}
		}

	}

	void a_skillselect() {

		switch (a_char) {
		case 1:
			Char1Skill();

			break;

		case 2:
			Char2Skill();
			break;
		case 3:
			Char3Skill();

			break;
		
		}
	}

	void b_skillselect() {

		switch (b_char) {
		case 1:
			Char1Skill();

			break;

		case 2:
			Char2Skill();
			break;
		case 3:
			Char3Skill();
			break;
		
		}
	}


    void Char3Skill(){
    	System.out.println("ü��ȸ���ϱ�!");
    	
    	if (user1 == 4) {
			a_health += 3;
		}

		if (user2 == 4) {
			b_health += 3;

		}
    }









}
