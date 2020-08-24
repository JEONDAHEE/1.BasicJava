package controller;

import java.util.Scanner;





import service.IntegerCheck;
import game.Gbv;
import game.Minesweeper;
import game.YouCanDo;
import game.sutvivarGame.FIgthClass;

public class GameController {



	private static GameController instance;

	private GameController() {
	}

	public static GameController getInstance() {
		if (instance == null) {
			instance = new GameController();
		}
		return instance;

	}
	static Scanner s = new Scanner(System.in);
	// ���Ӽ���
	public static void Game() {
		
		boolean check = false;
		String tmep = "";
		do{
			
		
		do{
			System.out.println("---------------------------------------------------");
			System.out.println("Young���� 202ȣ ��¦���ǿտ� ���Ű� ȯ���մϴ�;D");
			System.out.println("�밴ȯ��! ����ȯ��!");
			System.out.println("---------------------------------------------------");
			System.out.println("1. �����! ");
			System.out.println("2. ����ã��! ");
			System.out.println("3. ��Ƴ���! ");
			System.out.println("4. Ÿ�ڿ�������! ");
			System.out.println("0. ������ �����ϰ�(��),,, ���Ǥ�����,,,,");
			System.out.println("---------------------------------------------------");
			System.out.println("�Է����ּ���! > ");
			
			tmep = s.nextLine().trim();
			check = IntegerCheck.checkInt(tmep,0,4);
			
		}while(!check);
		
		int menu =Integer.parseInt(tmep);
		
		switch (menu) {
		case 1: // �����
			Gbv g = Gbv.getInstance();
			g.start();
			break;
		case 2: // ����ã��
			Minesweeper mineGame = new Minesweeper(); 
			mineGame.start();
			break;
		case 3: // ��Ƴ���
			FIgthClass fight = FIgthClass.getInstance();
			fight.mainFight();
			break;
		case 4 : // Ÿ�ڿ�������
			YouCanDo youCanDo = YouCanDo.getInstance();
			youCanDo.start1();
			break;
		case 0: // ���α׷�����
			System.out.println("������ �Ͱ��Ͻʼ�!!!");
			check = false;
			break;
		}
		}while(check);

	}

}
