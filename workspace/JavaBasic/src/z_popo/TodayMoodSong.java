package z_popo;


import java.util.Scanner;

public class TodayMoodSong {

	Tms_main tm = new Tms_main();

	Scanner sc = new Scanner(System.in);

	int num2;

	// 1������(�г�)
	void ignore() {
		
		Tms_singer ts = new Tms_singer();
		
		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ��");
		System.out.println("����� ������ ���� Choice �ð�!!");
		System.out.println("--------------------------------------");
		System.out.println(" ������ mood �� '�г�'�� �����Ͻ� ���!");
		System.out.println("������ Artist!");
		System.out.println("1. Crush 2. Zico 3. Dean 4. Penomeco 5. Millic");
		System.out.println("======================================");
		System.out.println("9. ���ܰ�� �̵�");
		System.out.println("--------------------------------------");
		System.out.println("����� ������ ? ->");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 9) {
			System.out.println(tm);
		} else if (num2 == 1) {
			ts.Crush();
		} else if (num2 == 2) {
			ts.Zico();
		} else if (num2 == 3) {
			ts.Dean();
		} else if (num2 == 4) {
			ts.Penomeco();
		} else if (num2 == 5) {
			ts.Millic();
		} 
		
		
	}


	// 2������(��ſ�)
	void happy() {

		Tms_singer ts = new Tms_singer();
		
		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ��");
		System.out.println("����� ������ ���� Choice �ð�!!");
		System.out.println("--------------------------------------");
		System.out.println(" ������ mood �� '��ſ�'�� �����Ͻ� ���!");
		System.out.println("������ Artist!");
		System.out.println("1. Crush 2. Zico 3. Dean 4. Penomeco 5. Millic");
		System.out.println("======================================");
		System.out.println("9. ���ܰ�� �̵�");
		System.out.println("--------------------------------------");
		System.out.println("����� ������ ? ->");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 9) {
			System.out.println(tm);
		} else if (num2 == 1) {
			ts.Crush();
		} else if (num2 == 2) {
			ts.Zico();
		} else if (num2 == 3) {
			ts.Dean();
		} else if (num2 == 4) {
			ts.Penomeco();
		} else if (num2 == 5) {
			ts.Millic();
		} 

	}

	// 3������(�޴�)
	void sweet() {

		Tms_singer ts = new Tms_singer();
		
		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ��");
		System.out.println("����� ������ ���� Choice �ð�!!");
		System.out.println("--------------------------------------");
		System.out.println(" ������ mood �� '�޴�'�� �����Ͻ� ���!");
		System.out.println("������ Artist!");
		System.out.println("1. Crush 2. Zico 3. Dean 4. Penomeco 5. Millic");
		System.out.println("======================================");
		System.out.println("9. ���ܰ�� �̵�");
		System.out.println("--------------------------------------");
		System.out.println("����� ������ ? ->");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 9) {
			System.out.println(tm);
		} else if (num2 == 1) {
			ts.Crush();
		} else if (num2 == 2) {
			ts.Zico();
		} else if (num2 == 3) {
			ts.Dean();
		} else if (num2 == 4) {
			ts.Penomeco();
		} else if (num2 == 5) {
			ts.Millic();
		} 

	}

	// 4������(����)
	void sad() {
		
		Tms_singer ts = new Tms_singer();

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ��");
		System.out.println("����� ������ ���� Choice �ð�!!");
		System.out.println("--------------------------------------");
		System.out.println(" ������ mood �� '���'�� �����Ͻ� ���!");
		System.out.println("������ Artist!");
		System.out.println("1. Crush 2. Zico 3. Dean 4. Penomeco 5. Millic");
		System.out.println("======================================");
		System.out.println("9. ���ܰ�� �̵�");
		System.out.println("--------------------------------------");
		System.out.println("����� ������ ? ->");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 9) {
			System.out.println(tm);
		} else if (num2 == 1) {
			ts.Crush();
		} else if (num2 == 2) {
			ts.Zico();
		} else if (num2 == 3) {
			ts.Dean();
		} else if (num2 == 4) {
			ts.Penomeco();
		} else if (num2 == 5) {
			ts.Millic();
		} 

	}

	// 5������(���)
	void excit() {
		
		Tms_singer ts = new Tms_singer();

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ��");
		System.out.println("����� ������ ���� Choice �ð�!!");
		System.out.println("--------------------------------------");
		System.out.println(" ������ mood �� '���'�� �����Ͻ� ���!");
		System.out.println("������ Artist!");
		System.out.println("1. Crush 2. Zico 3. Dean 4. Penomeco 5. Millic");
		System.out.println("======================================");
		System.out.println("9. ���ܰ�� �̵�");
		System.out.println("--------------------------------------");
		System.out.println("����� ������ ? ->");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 9) {
			System.out.println(tm);
		} else if (num2 == 1) {
			ts.Crush();
		} else if (num2 == 2) {
			ts.Zico();
		} else if (num2 == 3) {
			ts.Dean();
		} else if (num2 == 4) {
			ts.Penomeco();
		} else if (num2 == 5) {
			ts.Millic();
		}
	}
}

	




