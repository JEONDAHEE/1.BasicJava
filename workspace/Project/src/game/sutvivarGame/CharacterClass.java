package game.sutvivarGame;



abstract class CharacterClass {

}
	
	


class Character1 extends CharacterClass{ // ������ �����Ѵٴ� ���� �����ؼ� Ư������� ���� �� �ڽ��� ü���� �״�ΰ� ������ ���� 2���� ü���� ����

	private static Character1 instance; // instance�� ����

	private Character1() {
	}

	public static Character1 getInstance() {
		if (instance == null) {
			instance = new Character1();
		}
		return instance;

	}

	int health = 9;
	int power = 2;
	int point = 0;
	int skillpoint = 3;
	
	void info() {
		System.out.println("������ fast(24)");
		System.out.print("Health : ");
		for (int i = 0; i < health; i++) {
			System.out.print("�� ");
		}
		System.out.println("("+health+")");
		System.out.print("\nPower : ");
		for (int i = 0; i < power; i++) {
			System.out.print("��");
		}
		System.out.println("\nSkill : ������ ��û�� �ѹ� ");
		
		System.out.print("            ���濡�� �ڽ��� ���ݷ� 2���� �������� ������. ");
		System.out.print("\n            ���� ������ �� �ߴٸ�, �ڽ��� ���ݷ¸�ŭ ���ظ� �ش�. ");
	}
	
}

class Character2 { // 2�� ���� ���ϰ� ����. Ȥ�� �ڽ� ü���� ������ ��ŭ ���� ������ �־��ش�.
	private static Character2 instance; // instance�� ����

	private Character2() {
	}

	public static Character2 getInstance() {
		if (instance == null) {
			instance = new Character2();
		}
		return instance;

	}
	
	int health = 7;
	int power = 2;
	int point = 1;
	int skillpoint = 3;
	
	void info() {
		System.out.println("���ؿ� (26)");
		
		System.out.print("Health : ");
		for (int i = 0; i < health; i++) {
			System.out.print("�� ");
		}
		System.out.println("("+health+")");
		System.out.print("\nPower : ");
		for (int i = 0; i < power; i++) {
			System.out.print("��");
		}
		System.out.print("\nSkill : ���� ���");
		System.out.println("\n         ���� ��忡���� ���� 2��� �����Ѵ�.");
		System.out.println("         ����ϱ� ���� �ʿ��� ����Ʈ�� 3���̴�.");
	}
	

}

class Character3 {
	
	
	int health = 8;
	int power = 5;
	int point = 0;
	int skillpoint = 2;
	
	void info() {
		System.out.println("���� (27)");
		System.out.print("Health : ");
		for (int i = 0; i < health; i++) {
			System.out.print("�� ");
		}
		System.out.println("("+health+")");
		System.out.print("\nPower : ");
		for (int i = 0; i < power; i++) {
			System.out.print("��");
		}
		System.out.print("\nSkill : ȸ���ϱ�");
		System.out.println("\n        �ڽ��� ü���� 3��ŭ ȸ���Ѵ�.");
		System.out.println("         ����ϱ� ���� �ʿ��� ����Ʈ�� 3���̴�.");
	}
	
	
}



