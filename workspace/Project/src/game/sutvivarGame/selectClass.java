package game.sutvivarGame;

import java.util.Scanner;

public class selectClass {

	boolean start = false;
	Scanner c = new Scanner(System.in);
	void select() {
		FIgthClass f = FIgthClass.getInstance();
		Character1 c1 = Character1.getInstance();
		Character2 c2 = Character2.getInstance();
		Character3 c3 = new Character3();

		int choice = 0;
		// ������ ���� �ִ� ����Ʈ�� ��������.
		System.out.println("ĳ���͸� �������ּ���.");
		System.out.println("1.������ (���� : 11)");
		System.out.println("2.���ؿ� (���� : 22)");
		System.out.println("3.�ڱ�� (���� : 33)");

		while (start == false) {

			
			int choose = c.nextInt();
			switch (choose) {
			case 1:
				choice = 1;
				start = true;
				break;
			case 11:
				c1.info();

				break;
			case 2:
				choice = 2;
				start = true;
				break;
			case 22:
				c2.info();
				break;
			case 3:
				choice = 3;
				start = true;
				break;
			case 33:
				c3.info();
				break;
			}
		}

		if (choice == 1) { // ���� a�� ĳ���͸� ����������
			f.a_char = choice;
			f.a_health = c1.health;
			f.a_maxhp = c1.health;
			f.a_attack = c1.power;
			f.a_point = c1.point;
			f.a_skillpoint = c1.skillpoint;

			System.out.println("�������� ���̽��ϴ�!!");
		}
		if (choice == 2) {
			f.a_char = choice;
			f.a_health = c2.health;
			f.a_maxhp = c2.health;
			f.a_attack = c2.power;
			f.a_point = c2.point;
			f.a_skillpoint = c2.skillpoint;

			System.out.println("���ؿ��� ���̽��ϴ�.");
		}
		if (choice == 3) {
			f.a_char = choice;
			f.a_health = c3.health;
			f.a_maxhp = c3.health;
			f.a_attack = c3.power;
			f.a_point = c3.point;
			f.a_skillpoint = c3.skillpoint;

			System.out.println("�ڱ���� ���̽��ϴ�.");
		}

		start = false;

		System.out.println("��ǻ�Ͱ� ĳ���͸� ���� �ֽ��ϴ�.");
		int choice2 = 0;
		while (start == false) {

			int random = (int) (Math.random() * 1) + 1;
			switch (random) {
			case 1:
				choice2 = 1;
				start = true;
				break;
			case 11:
				c1.info();

				break;

			}
		}

		if (choice2 == 1) {
			f.b_char = choice2;
			f.b_health = c1.health;
			f.b_maxhp = c1.health;
			f.b_attack = c1.power;
			f.b_point = c1.point;
			f.b_skillpoint = c1.skillpoint;

			System.out.println("�������� ���̽��ϴ�.");
		}
		if (choice2 == 2) {
			f.b_char = choice2;
			f.b_health = c2.health;
			f.b_maxhp = c2.health;
			f.b_attack = c2.power;
			f.b_point = c2.point;
			f.b_skillpoint = c2.skillpoint;

			System.out.println("���ؿ��� ���̽��ϴ�.");
		}
		if (choice2 == 3) {
			f.b_char = choice;
			f.b_health = c3.health;
			f.b_maxhp = c3.health;
			f.b_attack = c3.power;
			f.b_point = c3.point;
			f.b_skillpoint = c3.skillpoint;

			System.out.println("������ ���̽��ϴ�.");
		}

	}
}
