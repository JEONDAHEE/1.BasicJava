package controller;


import java.util.Scanner;

import data.Session;
import service.IntegerCheck;
import service.Table;
import service.UserService;

public class Controller {

	public static void main(String[] args) {

		start();

	}
	static boolean longin_state = false;
	static Scanner s = new Scanner(System.in);
static void start() {

		


		int menu;
		
		boolean check = false;
		String temp = "";
		do {
			do {
				
				System.out.println("---------------------------------------------------");
				System.out.println("Young���� 202ȣ ��¦���ǿտ� ���Ű� ȯ���մϴ�;D");
				System.out.println("�밴ȯ��! ����ȯ��!");
				System.out.println("---------------------------------------------------");
				System.out.println("1. �п�! ���� �ź���! ������ => 'ȸ������'���ּ���! (ȸ�����Խ� 1000 ���ϸ��� ����)");
				System.out.println("2. �ų���! ��̳���!! => �� ���� �ټ����� '�α���' ");
				System.out.println("0. ������ �����ϰ�(��),,, ���Ǥ�����,,,,");
				System.out.println("---------------------------------------------------");
				System.out.println("�Է����ּ���! > ");
				
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp);
			} while (!check);

			menu = Integer.parseInt(temp);
			
			switch (menu) {
			case 1: // ȸ������
				UserService.join();
				break;
			case 2: // �α���
				UserService.login();                       //�α��� ������
				if (Session.loginUser != null) {           //
					longin_state = true; 
					if(Session.loginUser.isMode()){
						while (longin_state) {
							AdminController.select();
							longin_state = AdminController.login_state;
						}
					}else{
						if(!Table.tableEnter()){
							break;
						}
						while (longin_state) {
							UserController.select();
							longin_state = UserController.login_state;
						}
					}
					
				}
		
				break;
			case 0: // ���α׷�����
				System.out.println("������ �Ͱ��Ͻʼ�!!!");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		} while (menu != 0);

	}
	




}
