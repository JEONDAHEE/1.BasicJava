
package game;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import vo.MileageVo;
import vo.UserVo;
import dao.MileageDao;

import data.Session;

public class YouCanDo {
	private static YouCanDo instance;
	private YouCanDo() {
    	
    	
	}

	public static YouCanDo getInstance() {
		if (instance == null) {
			instance = new YouCanDo();
		}
		return instance;

	}

	int ranDom1=0;
	int countPoint=0;
	int countM=0;
	int coin=0;
	int check=0;
	int mileage=0;
	int tMileage=0;
	Scanner sc = new Scanner(System.in);
	
	Random oRandom = new Random();

	public void start1(){
		String[] stepOne = {"abc","bdc","cbb","dff","fff"};
		int ranDom1 = oRandom.nextInt(stepOne.length);	    

		System.out.println("======��! �ʵ�! ��Ÿ 200 �Ҽ��־�!!!=======");
		try {
			Thread.sleep(700);      //������ 0.7��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��µ� ��� �Է��Ͻÿ�!!!");
		try {
			Thread.sleep(700);      //������ 0.7��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("3..");
		
		try {
			Thread.sleep(700);      //������ 0.7��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("2..");
		try {
			Thread.sleep(700);      //������ 0.7��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("1..");
		try {
			Thread.sleep(700);      //������ 0.7��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("======GameStrat!!======");
		
	
		
		
		  
		Boolean check = false;	
		do{
			
		System.out.println("Lv.1 ���� : "+stepOne[ranDom1]);
		System.out.println("���� ������ �Է��Ͻÿ�.");
		String answer= sc.nextLine();
		if(answer.equals(stepOne[ranDom1])){
	
			System.out.println("�����Դϴ�!!");
			
			start2();
			check = !check;
		}
		else if(!answer.equals(stepOne[ranDom1])) {
			--countPoint;
			
			System.out.println("Ʋ�Ƚ��ϴ� �Ф�");
		}
		
		}while(!check);
		 
		System.out.println("======������ ���� �Ǿ����ϴ�.======");
		return;
	}
		
		void start2(){
			String[] stepOne = {"Drinking"
							   ,"chicken"
							   ,"Beer"
							   ,"Pizza Hut"
							   ,"hamburger"};
			int ranDom1 = oRandom.nextInt(stepOne.length);
			System.out.println("======��! �ʵ�! ��Ÿ 200 �Ҽ��־�!!!======");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("��µ� ��� �Է��Ͻÿ�!!!");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("3...");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("2,,,");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("1,,,");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("======GameStart!!!======");
			   Boolean check = false; 

			do{
				
				System.out.println("Lv.2 ���� : "+stepOne[ranDom1]);
				System.out.println("���� ������ �Է��Ͻÿ�.");
				String answer= sc.nextLine();
				if(answer.equals(stepOne[ranDom1])){
					
					System.out.println("�����Դϴ�!!");
					start3();
					check = !check;
				}else if(!answer.equals(stepOne[ranDom1])){
					--countPoint;

					System.out.println("Ʋ�Ƚ��ϴ� �Ф�");
				}
				}while(!check);
		}
		
		
		void start3(){
			String[] stepOne = {"I want to eat chicken"
							   ,"I want to exercise"
							   ,"I want to go home"
							   ,"I want to sleep"
							   ,"I want to play a game"};
			int ranDom1 = oRandom.nextInt(stepOne.length);
			System.out.println("======��! �ʵ�! ��Ÿ 200 �Ҽ��־�!!!======");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("��µ� ��� �Է��Ͻÿ�!!!");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("3...");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("2,,,");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("1,,,");
			try {
				Thread.sleep(700);      //������ 0.7��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("======GameStart!!!======");
			   Boolean check = false; 

			do{
				
				System.out.println("Lv.3 ���� : "+stepOne[ranDom1]);
				System.out.println("���� ������ �Է��Ͻÿ�.");
				String answer= sc.nextLine();
				if(answer.equals(stepOne[ranDom1])){
					
					System.out.println("�����Դϴ�!!");
					start4();
					check = !check ;
				}else if(!answer.equals(stepOne[ranDom1])){
					--countPoint;
					System.out.println("Ʋ�Ƚ��ϴ� �Ф�");
				}
				}while(!check);
		}
	


	void start4() {
		
		MileageDao mileagedao = MileageDao.getInstance();
		UserVo user = Session.loginUser;
		String userKey = user.getId();
		MileageVo mileageInfo = new MileageVo();

		Date date = new Date();

		countM = 15;
		mileage = countM + countPoint;
		mileageInfo.setId(Session.loginUser.getId());
		mileageInfo.setDate(date);// ���� ���� �ð� �Է�
		mileageInfo.setId(userKey);// ���� ���̵�
		mileageInfo.setMiliage(mileage);// ȹ�渶�ϸ���
		mileageInfo.setContents("��Ÿ200 �޼�^^");
		mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�

		System.out.println("---------------------------------------");
		System.out.println("ȹ�� ���ϸ��� : " + mileage);
		System.out.println("---------------------------------------");
	}
















}
