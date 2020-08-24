package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vo.MileageVo;
import vo.PaymentVo;
import dao.CartDao;
import dao.FoodDao;
import dao.MileageDao;
import dao.PaymentDao;
import data.Session;

public class Payment {
	static int sum = 0;//�հ踦 �����ϰ��ִ�  
	static Scanner s = new Scanner(System.in);
	public static void paymentManagement() {
		
		CartDao cartDao = CartDao.getInstance();
		if(cartDao.selectCartList().isEmpty()){
			System.out.println("-----------------------------------");
			System.out.println("�ֹ������� �����ϴ�.");
			System.out.println("-----------------------------------");
			return;
		
		}
			
		
		boolean check = false;
		String temp = "";
		do{
			do {
				sum = Cart.printCart();// �����ؾ��� ������ �����ش�.
				System.out.println("--------------------------------------------");
				System.out.println("�ֹ� ���� ���� �� �߰����� ����");
				System.out.println("1. �ֹ����� ���� �� ���");
				System.out.println("2. �����ϱ�");
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("--------------------------------------------");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, 2);
			} while (!check);
			int menu = Integer.parseInt(temp);
			
			switch(menu){
			case 1 : 
				Cart.orderModify();
				break;
			case 2 : 
				payment();
				check = false;
				break;
			case 0 :
				System.out.println("���� �޴��� ���ư��ϴ�.");
				check = false;
			}
		}while(check);
		
		
	}
	public static ArrayList<Integer> useMileage() {
		ArrayList<Integer> output = new ArrayList<>();
		
		MileageDao mileageDao = MileageDao.getInstance();
		// ���������Ϳ��� ���ϸ����� ��������
		// �Ѱ����ݾ׿��� 10%������ ���ϸ����� ���

		int mileage = mileageDao.searchUserMileageSum(Session.loginUser.getId()); // �α��� �� ������ ������ �ִ� ���ϸ���

		// �α��ε� ������ ������ �ִ� ���ϸ���(mileage)�� �հ�(sum)���� 10%�� ��� �� �� �ְ� ����ž�
		int percent = (int) (sum * 0.1); // percent�� �հ��� 10%
		int mileage_payment = percent - mileage; // ���ϸ��� ��� = �հ��� 10% - ����� ���ϸ���
													// //�̰� ��ü�� ���ϸ����� 10%�� ��� ��
													// �� �ְ� ����� ������

		boolean check = false;
		String temp = "";

		if (mileage_payment > 0) {
			do {
				System.out.println("------------------------------------------------------");
				System.out.println("�� �ݾ��� 10%������ ���ϸ����� ����� �� �ֽ��ϴ�. ���ϸ����� ����Ͻðڽ��ϱ� ?");
				System.out.println("���� ������ ���ϸ��� : " + percent);
				System.out.println("��밡���� ���ϸ��� : " + mileage);
				System.out.println("1. ��.");
				System.out.println("2. �ƴϿ�.");
				System.out.println("------------------------------------------------------");
				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp, 1, 2);
			} while (!check);
			int input = Integer.parseInt(temp);
			switch (input) {
			case 1:
			    do{
			    System.out.println("------------------------------------------------------");
				System.out.println("���ϸ��� �󸶸� ����Ͻðڽ��ϱ�? ");
				System.out.println("------------------------------------------------------");
				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp,1,mileage);
				}while(!check);
				input = Integer.parseInt(temp);
				System.out.println("------------------------------------------------------");
				System.out.println(input+"�� ���ϸ����� ����ϼ̽��ϴ�.");
				System.out.println("------------------------------------------------------");
				output.add(input);
				output.add(sum - input);
				break;
			case 2:
				output.add(0);
				output.add(sum);
				break;
			}
		} else if (mileage_payment < 0) {
			do {
				System.out.println("------------------------------------------------------");
				System.out.println("���ϸ����� ����Ͻðڽ��ϱ� ?");
				System.out.println("���� ������ ���ϸ��� : " + percent);
				System.out.println("��밡���� ���ϸ��� : " + percent);
				System.out.println("1. ��.");
				System.out.println("2. �ƴϿ�.");
				System.out.println("------------------------------------------------------");
				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp, 1, percent);
			} while (!check);
			int input = Integer.parseInt(temp);
			switch (input) {
			case 1:
				do{
				System.out.println("------------------------------------------------------");
				System.out.println("���ϸ��� �󸶸� ����Ͻðڽ��ϱ�? ");
				System.out.println("------------------------------------------------------");
				temp = s.nextLine();
				check = IntegerCheck.checkInt(temp,percent);
				}while(!check);
				input = Integer.parseInt(temp);
				System.out.println("------------------------------------------------------");
				System.out.println(input+"�� ���ϸ����� ����ϼ̽��ϴ�.");
				System.out.println("------------------------------------------------------");
				output.add(input);
				output.add(sum - input);
				break;
			case 2:
				output.add(0);
				output.add(sum);
				break;
			}
		}
		return output;
	}
	public static void payment(){
		PaymentDao paymentDao = PaymentDao.getInstance();
		if(paymentDao.notPaymentList().size()!=0){
		PaymentVo paymentvo = new PaymentVo();
		MileageDao mileageDao = MileageDao.getInstance();
	
		
		int mileage = mileageDao.searchUserMileageSum(Session.loginUser.getId());
		boolean check = false;
		String temp = "";
		
		do {System.out.println("--------------------------------------------");
				System.out.println("�����Ͻ� �ݾ��� " + sum + "�� �Դϴ�.");
				System.out.println("�����Ͻ� ����� �������ּ���.");
				System.out.println("1. ī��");
				System.out.println("2. ����");
				System.out.println("--------------------------------------------");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 1, 2);
				
			} while (!check);

			int input = Integer.parseInt(temp);
			String card = "";

			Pattern p;
			Matcher m;
			
			ArrayList<Integer> mileageOutput = new ArrayList<>();
			switch (input) {
			case 1 : // ī��� �����Ҷ�
				do {
					System.out.println("--------------------------------------------");
					System.out.println("���� ���ϸ�����" + mileage+ "�� �ֽ��ϴ�. ���ϸ����� ����Ͻðڽ��ϱ� ?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�.");
					System.out.println("--------------------------------------------");
					temp = s.nextLine().trim();
					check = IntegerCheck.checkInt(temp, 1, 2);
				} while (!check);

				input = Integer.parseInt(temp);

				switch (input) {
				case 1:
					mileageOutput = useMileage();
					break;
				case 2:
					mileageOutput.add(0);
					mileageOutput.add(sum);
					break;
				}

				do {
					System.out.println("------------------------------------------------------");
					System.out.println("�����Ͻ� �ݾ� : "+ mileageOutput.get(1));
					System.out.println("��) 1234-1234-1234-1341");
					System.out.println("ī���ȣ�� �Է��� �ּ��� ");
					System.out.println("�����ϰ������ 0���� �Է����ּ���");
					System.out.println("------------------------------------------------------");
					card = s.nextLine();
					check = true;
					for (int i = 0; i < card.length(); i++) {
						if (card.charAt(i) < '0' && card.charAt(i) > '9') {
							check = false;
							break;
						}
					}
					if (check && card.length() == 1) {
						if (Integer.parseInt(card) == 0) {
							System.out.println("------------------------------------------------------");
							System.out.println("�޴��� ���ư��ϴ�.");
							System.out.println("------------------------------------------------------");
							return;
						}
					}

					String cardNum = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}";
					p = Pattern.compile(cardNum);
					m = p.matcher(card);
					if (!m.matches()) {
						System.out.println("------------------------------------------------------");
						System.out.println("���İ� �ٸ��ϴ�.");
						System.out.println("------------------------------------------------------");
					}

				} while (!m.matches());

				System.out.println("------------------------------------------------------");
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				System.out.println("------------------------------------------------------");
				if (mileageOutput.get(0) != 0) {
					MileageVo mileageVo = new MileageVo();
					mileageVo.setContents("���ϸ������(����)");
					mileageVo.setDate(new Date());
					mileageVo.setId(Session.loginUser.getId());
					mileageVo.setMiliage(-mileageOutput.get(0));
					mileageDao.insertMileage(mileageVo);
				}
				
				MileageVo mileageVo = new MileageVo();
				mileageVo.setContents("���ϸ��� ����");
				mileageVo.setDate(new Date());
				mileageVo.setId(Session.loginUser.getId());
				mileageVo.setMiliage(mileageOutput.get(1)/100);
				mileageDao.insertMileage(mileageVo);
				
				paymentvo = new PaymentVo();
				paymentvo.setDate(new Date()); // ������ ��¥
				paymentvo.setMilieage(mileageOutput.get(0)); // ���ϸ��� ���������Ϳ���
																// �����ͼ� ó���� �� =>
																// �� �־��ֱ�
				paymentvo.setRequests("ī�����");// ���ݰ������� ī���������
				paymentDao.insertPayment(paymentvo);
				break;

			case 2: // �ݾ�
				do{
					System.out.println("------------------------------------------------------");
					System.out.println("���� ���ϸ�����" + mileage + "�� �ֽ��ϴ�. ���ϸ����� ����Ͻðڽ��ϱ� ?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�.");
					System.out.println("------------------------------------------------------");
					temp = s.nextLine().trim();
					check = IntegerCheck.checkInt(temp,1,2);
				} while (!check);
				
				int menu = Integer.parseInt(temp);
				
				switch (menu) {
				case 1:
					mileageOutput = useMileage();
					break;
				case 2:
					mileageOutput.add(0);
					mileageOutput.add(sum);
					break;
				}
				
				
				do{
					System.out.println("------------------------------------------------------");
					System.out.println("�����Ͻ� �ݾ��� "+ mileageOutput.get(1) +"�� �Դϴ�.");
					System.out.println("���� ���� �Է� �� �ּ���");
					System.out.println("------------------------------------------------------");
					temp = s.nextLine().trim();
					check = IntegerCheck.checkInt(temp);
					
				} while (!check);

				input = Integer.parseInt(temp);

				int change;
				change = input - mileageOutput.get(1);
				if (change > 0) {
					System.out.println("------------------------------------------------------");
					System.out.println(input + "�� ���̽��ϴ�. �Ž������� " + change + "�� �Դϴ�.");
					System.out.println("------------------------------------------------------");
				
				
				}  else if (change <= 0) {
					while (-change > 0) {
						System.out.println("------------------------------------------------------");
						System.out.println("�����Ͻ� ���� ���ڶ��ϴٿ� ~ " + -change+ "�� �߰� ������ ���ּ���");
						System.out.println("------------------------------------------------------");
						input = Integer.parseInt(s.nextLine());
						change = change + input;
					}
							System.out.println("------------------------------------------------------");
							if(change != 0){
								System.out.println("�Ž������� "+(-change)+"�� �Դϴ�.");
							}
							System.out.println("������ �Ϸ� �Ǽ̽��ϴ�.");
							System.out.println("------------------------------------------------------");		
					}
				if(mileageOutput.get(0) != 0){
					mileageVo = new MileageVo();
					mileageVo.setContents("���ϸ������(����)");
					mileageVo.setDate(new Date());
					mileageVo.setId(Session.loginUser.getId());
					mileageVo.setMiliage(-mileageOutput.get(0));
					mileageDao.insertMileage(mileageVo);
				}
				
				mileageVo = new MileageVo();
				mileageVo.setContents("���ϸ��� ����");
				mileageVo.setDate(new Date());
				mileageVo.setId(Session.loginUser.getId());
				mileageVo.setMiliage(mileageOutput.get(1)/100);
				mileageDao.insertMileage(mileageVo);
				
				paymentvo = new PaymentVo();
				paymentvo.setDate(new Date());
				paymentvo.setRequests("���ݰ���");
				paymentDao.insertPayment(paymentvo);
			}
		}else{
			System.out.println("--------------------------------------------");
			System.out.println("�����Ͻ� ������ �����ϴ�.");
			System.out.println("--------------------------------------------");
		}
		
	}
	public static void selectSalesList(){		
		PaymentDao paymentdao = PaymentDao.getInstance();
		ArrayList<PaymentVo> paymentList =  paymentdao.selectPaymentList();
		CartDao cartDao = CartDao.getInstance();

		FoodDao foodDao = FoodDao.getInstance();

		Calendar cal = Calendar.getInstance();
		
		int year = 0;
		int month = 0;
		int day = 0;
		String temp = "";
		
		boolean check=false;
		Date date = null;
		
		do{
			System.out.println("----------------------------------------------");
			temp = UserService.formCheck("��)2020\n�⵵�� �Է����ּ���.","(19|20)\\d{2}");
			if(!temp.equals("")){
				check = true;
			}
		}while(!check);
		year = Integer.parseInt(temp);
		do {
			check = false;
			System.out.println("----------------------------------------------");
			temp = UserService.formCheck("��)08\n���� �Է����ּ���", "(0[1-9]|1[012])");
			
			if (Integer.parseInt(temp) <= 12 && Integer.parseInt(temp) >= 0) {
				check = true;
			} else {
				System.out.println("01~12 ���̷� �Է����ּ���.");
			}
		} while (!check);
		month = Integer.parseInt(temp);
			
			cal.set(year,month-1, 1);
		
			do {
				check = false;
				System.out.println("----------------------------------------------");
				temp = UserService.formCheck("��)12\n���� �Է����ּ���.","(0[1-9]|[12][0-9]|3[01])");
				
				if (Integer.parseInt(temp) <= cal.getActualMaximum(Calendar.DAY_OF_MONTH) && Integer.parseInt(temp) >= 1) {
					check = true;
				}else{
					System.out.println(month+"�� ����  "+Integer.parseInt(temp)+"�� �������� �ʽ��ϴ�.");
					System.out.println("1 ~ "+ cal.getActualMaximum(Calendar.DAY_OF_MONTH)+" ���̷� �Է����ּ���" );
				}			
			} while (!check);
			day = Integer.parseInt(temp);
			
			cal.set(year,month-1, day,00,00,00);
			cal.set(Calendar.MILLISECOND, 0);
			date = cal.getTime();
		
			
		int total = 0;
		int mileageTotal = 0;
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy/MM/dd");
		String paymnet_date = format.format(date);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("������¥ : "+paymnet_date);
		System.out.println("������ȣ\t\t�������\t\t�ݾ�\t\t��븶�ϸ���");
		System.out.println("-------------------------------------------------------------------");
		for(int i = 0 ; i<paymentList.size();i++){
			SimpleDateFormat year_format = new SimpleDateFormat ( "yyyy");
			SimpleDateFormat month_format = new SimpleDateFormat ( "MM");
			SimpleDateFormat day_format = new SimpleDateFormat ( "dd");
			String paymnet_year = year_format.format(paymentList.get(i).getDate());
			String paymnet_month = month_format.format(paymentList.get(i).getDate());
			String paymnet_day = day_format.format(paymentList.get(i).getDate());
			
			temp = paymnet_year+paymnet_month+paymnet_day;
			Date payment_date = null;
			
			try {
				payment_date = new SimpleDateFormat("yyyyMMdd").parse(temp);
			} catch (ParseException e) {
				System.out.println("��¥������ ��ȯ�� �����ϼ̽��ϴ�.");
			}
			
			

			if(payment_date.compareTo(date)==0){
				int sum = 0;
				System.out.print(paymentList.get(i).getPaymentNo()+"\t\t"+paymentList.get(i).getRequests());
				for(int  j = 0 ; j < cartDao.selectPaymentNoCartList(paymentList.get(i).getPaymentNo()).size();j++){
					sum += foodDao.searchFoodNoInfo(cartDao.selectPaymentNoCartList(paymentList.get(i).getPaymentNo()).get(j).getFoodNo()).getPrice()*
							cartDao.selectPaymentNoCartList(paymentList.get(i).getPaymentNo()).get(j).getCount();
				}
				System.out.print("\t\t"+sum);
				System.out.println("\t\t"+paymentList.get(i).getMilieage());
				total+=sum;
				mileageTotal +=paymentList.get(i).getMilieage();
			}
		}
		System.out.println("���� ���ϸ��� : "+mileageTotal + "�� ");
		System.out.println("����� : "+total + "�� ");
		System.out.println("���� ���ϸ����� ������ ����� : "+(total-mileageTotal) + "�� ");
		
	}
	public static void monthSalesList(){		
		PaymentDao paymentdao = PaymentDao.getInstance();
		ArrayList<PaymentVo> paymentList =  paymentdao.selectPaymentList();
		CartDao cartDao = CartDao.getInstance();
		FoodDao foodDao = FoodDao.getInstance();
		Calendar cal = Calendar.getInstance();
		String temp = "";
		boolean check = false;
		
		int max = 12;
		do{
			System.out.println("----------------------------------------------");
			System.out.println("�������� ������� �⵵�� �Է����ּ���.");
			temp = UserService.formCheck("��)2020\n�⵵�� �Է����ּ���.","(19|20)\\d{2}");
			if(!temp.equals("")){
				check = true;
			}
		}while(!check);
		
		int year = Integer.parseInt(temp);

		System.out.println("--------------------------------------------------------------");
		System.out.println("��\t�����\t\t��븶�ϸ���\t��� ���ϸ����� ������ �����");
		System.out.println("--------------------------------------------------------------");
			for(int i = 0 ; i < max ; i++)
			{
				cal.set(year,i,1,00,00,00);
				cal.set(Calendar.MILLISECOND, 0);
				
				int total = 0;
				int mileageTotal = 0;
				for(int j = 0 ; j<paymentList.size();j++){
					SimpleDateFormat year_format = new SimpleDateFormat ( "yyyy");
					SimpleDateFormat month_format = new SimpleDateFormat ( "MM");
					String paymnet_year = year_format.format(paymentList.get(j).getDate());
					String paymnet_month = month_format.format(paymentList.get(j).getDate());
					temp = paymnet_year+paymnet_month;
					Date payment_date = null;
					
					try {
						payment_date = new SimpleDateFormat("yyyyMM").parse(temp);
					} catch (ParseException e) {
						System.out.println("��¥������ ��ȯ�� �����ϼ̽��ϴ�.");
					}
					
					if(payment_date.compareTo(cal.getTime())==0){
						int sum = 0;			
						for(int  k = 0 ; k < cartDao.selectPaymentNoCartList(paymentList.get(j).getPaymentNo()).size();k++){
							int paymentNo = paymentList.get(j).getPaymentNo();
							int foodNo = cartDao.selectPaymentNoCartList(paymentNo).get(k).getFoodNo();
							
							sum += foodDao.searchFoodNoInfo(foodNo).getPrice()*
									cartDao.selectPaymentNoCartList(paymentNo).get(k).getCount();
						}
						total+=sum;
						mileageTotal += paymentList.get(j).getMilieage();
					}
				}
				System.out.println(i+1+"��\t"+total+"��\t\t"+mileageTotal+"��\t\t"+(total-mileageTotal)+"��");
			
			}
	}
	public static void saleListManegement(){
		
		boolean check = false;
		String temp = "";
		do {
			do {
				System.out.println("--------------------------------------------");
				System.out.println("���⳻����� �޴�");
				System.out.println("1. ���� ���⳻�� ���");
				System.out.println("2. ��¥ �Է��Ͽ� ���⳻�� ���");
				System.out.println("3. ������ȣ�� �������� ���� ���");
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("--------------------------------------------");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, 3);
			} while (!check);
			int menu = Integer.parseInt(temp);

			switch (menu) {
			case 1:
				monthSalesList();
				break;
			case 2:
				selectSalesList();
				break;
			case 3:
				searchPaymentNoList();
				break;
			case 0:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				check = false;
			}
		}while(check);
	}
	public static void searchPaymentNoList(){
		CartDao cartDao = CartDao.getInstance();
		PaymentDao paymentDao = PaymentDao.getInstance();
		FoodDao foodDao = FoodDao.getInstance();
		ArrayList<PaymentVo> paymentList = paymentDao.selectPaymentList();
	
		boolean check = true;
		String temp = "";
		int paymentNo = 0;
		
		do {
			do {
				check = true;
				System.out.println("----------------------------------------------");
				System.out.println("\t\t���⳻��");
				System.out.println("----------------------------------------------");
				System.out.println("������ȣ\t�����ݾ�\t�������\t������¥");
				System.out.println("----------------------------------------------");
				for (int i = 0; i < paymentList.size(); i++) {
					SimpleDateFormat format = new SimpleDateFormat ( "yyyy/MM/dd");
					int sum = 0;
					for (int j = 0; j < cartDao.selectPaymentNoCartList(
							paymentList.get(i).getPaymentNo()).size(); j++) {
						sum += foodDao.searchFoodNoInfo(
								cartDao.selectPaymentNoCartList(
										paymentList.get(i).getPaymentNo())
										.get(j).getFoodNo()).getPrice()
								* cartDao
										.selectPaymentNoCartList(
												paymentList.get(i)
														.getPaymentNo()).get(j)
										.getCount();
					}
					String paymnet_date = format.format(paymentList.get(i).getDate());
				
					System.out.println(paymentList.get(i).getPaymentNo() + "\t"
							+ sum + "\t" + paymentList.get(i).getRequests()+"\t"+paymnet_date);
				}
				System.out.println("0 : �����ϱ�");
				System.out.println("----------------------------------------------");
				
				System.out.println("������ȣ�� �Է����ּ���.");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp);
			
			} while (!check);
			
			if(temp.equals("0")){
				return;
			}
			
			paymentNo = Integer.parseInt(temp);
			check = false;
			for (int i = 0; i < paymentDao.selectPaymentList().size(); i++) {
				if (paymentDao.selectPaymentList().get(i).getPaymentNo() == paymentNo) {
					check = true;
					break;
				}
			}
			if(!check){
				System.out.println("---------------------------------------------");
				System.out.println("�ش�Ǵ� ���� ��ȣ�� �����ϴ�.");
				System.out.println("---------------------------------------------");				
			}
		}while(!check);
		
		
		int total = 0;
		
		
		System.out.println("---------------------------------------------");
		System.out.println("������ ������ȣ�� ��������");
		System.out.println("���ĸ�\t\t����\t\t����");
		System.out.println("---------------------------------------------");
		for(int i = 0; i < cartDao.selectPaymentNoCartList(paymentNo).size();i++){
			
			int foodNo = cartDao.selectPaymentNoCartList(paymentNo).get(i).getFoodNo();
			
			String name = foodDao.searchFoodNoInfo(foodNo).getName();
			String sub_temp = "";
			
			int condition = 10;
			check = false;
			
			if(name.length()>condition){
				sub_temp = name.substring(0,condition);
				name=name.substring(condition-1,name.length());			
				System.out.print(sub_temp+"\t"+cartDao.selectPaymentNoCartList(paymentNo).get(i).getCount());
				System.out.println("\t\t"+foodDao.searchFoodNoInfo(foodNo).getPrice()*cartDao.selectPaymentNoCartList(paymentNo).get(i).getCount());
			}else{
				check = true;
				if(name.length()>= 6){
					name=name+"\t";
				}else{
					name=name+"\t\t";
				}
				System.out.print(name+cartDao.selectPaymentNoCartList(paymentNo).get(i).getCount());
				System.out.println("\t\t"+foodDao.searchFoodNoInfo(foodNo).getPrice()*cartDao.selectPaymentNoCartList(paymentNo).get(i).getCount());
			}
			if(!check){
				do{
					if(name.length()>condition){
					sub_temp = name.substring(0,condition);
					name=name.substring(condition-1,name.length());	
					System.out.println(sub_temp);
					}else {
						System.out.println(name);
						check = true;
					}
				}while(!check);
			}
			
			total+=foodDao.searchFoodNoInfo(foodNo).getPrice()*cartDao.selectPaymentNoCartList(paymentNo).get(i).getCount();
		}	
		System.out.println("---------------------------------------------");
		System.out.println("���� ���ϸ��� : "+paymentDao.searchPaymentNoInfo(paymentNo).getMilieage() + "�� ");
		System.out.println("����� : "+total + "�� ");
		System.out.println("���� ���ϸ����� ������ ����� : "+(total-paymentDao.searchPaymentNoInfo(paymentNo).getMilieage()) + "�� ");
		
		
		
		
		
		
	}
}
			

