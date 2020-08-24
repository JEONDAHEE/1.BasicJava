package data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import vo.CartVo;
import vo.FoodVo;
import vo.MenuCategoryVo;
import vo.MileageVo;
import vo.NoticeVo;
import vo.PaymentVo;
import vo.RecommendedMenuVo;
import vo.TableVo;
import vo.UserVo;

public class Database {
	private static Database instance;

	private Database() {
	}

	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;

	}

	public ArrayList<UserVo> tb_user = new ArrayList<UserVo>();
	public ArrayList<FoodVo> tb_food = new ArrayList<FoodVo>();
	public ArrayList<CartVo> tb_cart = new ArrayList<CartVo>();
	public ArrayList<MenuCategoryVo> tb_cartegory = new ArrayList<MenuCategoryVo>();
	public ArrayList<NoticeVo> tb_notice = new ArrayList<NoticeVo>();
	public ArrayList<PaymentVo> tb_payment = new ArrayList<PaymentVo>();
	public ArrayList<MileageVo> tb_Mileage = new ArrayList<MileageVo>();
	public ArrayList<RecommendedMenuVo> tb_rmenu = new ArrayList<RecommendedMenuVo>();
	public ArrayList<TableVo> tb_table = new ArrayList<TableVo>();
	
	{//��õ�޴� ���̺�
		RecommendedMenuVo rmenu = new RecommendedMenuVo();
		rmenu.setNo(0);
		rmenu.setFoodNo(0);
		rmenu.setContents("��BEST�������� ������ �ְ��� ���� �İ��� ¯¯");
		tb_rmenu.add(rmenu);
		
		rmenu = new RecommendedMenuVo();
		rmenu.setNo(1);
		rmenu.setFoodNo(2);
		rmenu.setContents("��BEST�ڡ�BEST�ڡ�BEST��");
		tb_rmenu.add(rmenu);
	}
	{//���� ���̺� 
		UserVo user = new UserVo();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("������");
		user.setNum("�����\t");
		user.setBirth("�����");
		user.setMode(true);
		tb_user.add(user);
		
		user = new UserVo();
		user.setId("user01");
		user.setPassword("a");
		user.setName("���");
		user.setNum("010-6544-7897");
		user.setBirth("123456");
		tb_user.add(user);
		
		user = new UserVo();
		user.setId("user02");
		user.setPassword("aa");
		user.setName("����");
		user.setNum("010-1234-4567");
		user.setBirth("654321");
		tb_user.add(user);
		
		user = new UserVo();
		user.setId("user03");
		user.setPassword("aaa");
		user.setName("�����");
		user.setNum("010-1234-4567");
		user.setBirth("654321");
		tb_user.add(user);
		
		
		user = new UserVo();
		user.setId("user033214");
		user.setPassword("aaaa");
		user.setName("�����");
		user.setNum("010-1234-4567");
		user.setBirth("654321");
		tb_user.add(user);
		
		
		user = new UserVo();
		user.setId("user020215635244");
		user.setPassword("aaaaa");
		user.setName("���");
		user.setNum("010-0000-0000");
		user.setBirth("000000");
		tb_user.add(user);
		
		user = new UserVo();
		user.setId("user11234567892132");
		user.setPassword("aaaaa");
		user.setName("���");
		user.setNum("010-0000-0000");
		user.setBirth("000000");
		tb_user.add(user);
		
		
	}
	{//��������
		NoticeVo notice = new NoticeVo();
		notice.setContents("�ű� ���Խ� ���ϸ����� 1000�� �����ص帳�ϴ�\n�Ⱓ : 2020/02/01 ~ ");
		notice.setDate(new Date());
		notice.setId("admin");
		notice.setNo(0);
		notice.setSubject("�ڰ������ϡ� �̺�Ʈ~");
		tb_notice.add(notice);
		notice = new NoticeVo();
		notice.setContents("�������ι� ��ο� �޾� ���ڿͷ� ���� ����� �ƴ��ҽ�\n�̷� ������ � ����� �ϸ����� Ȧ �� �̼ŵ�\n"
				+ "������ �� �ߵ� �÷���� �� �� ��� �ϴ϶�\n�� �̶� ���Ͼ� ��� �ʰ� ���� ���� ���� ¥�� �Ͱ����"
				+ "\n������� �ؿ� ���� �ϰ� ���� ���� ���Ѵ� �ϰ��� �ҵ���̴϶�");	
		notice.setDate(new Date());
		notice.setId("admin");
		notice.setNo(1);
		notice.setSubject("�������ι�");
		tb_notice.add(notice);
		
	}
	{//���� ���̺�
		PaymentVo payment =new PaymentVo();
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -15); // ���� ��¥���� 30���� �A��.
		
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(300);
		payment.setNo(0);
		payment.setPaymentNo(100);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -15); // ���� ��¥���� 30���� �A��.
		
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(101);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1);
		cal.add(Calendar.DATE, -15); //2019 1��		
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(102);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 2��
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(103);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 3��
		cal.add(Calendar.MONTH, 1);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(104);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 4��
		cal.add(Calendar.MONTH, 2);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(105);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 5��
		cal.add(Calendar.MONTH, 3);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(106);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 6��
		cal.add(Calendar.MONTH, 4);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(500);
		payment.setNo(0);
		payment.setPaymentNo(107);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 7��
		cal.add(Calendar.MONTH, 5);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(100);
		payment.setNo(0);
		payment.setPaymentNo(108);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 8��
		cal.add(Calendar.MONTH, 6);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(0);
		payment.setNo(0);
		payment.setPaymentNo(109);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 9��
		cal.add(Calendar.MONTH, 7);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(0);
		payment.setNo(0);
		payment.setPaymentNo(110);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1);//2019 10��
		cal.add(Calendar.MONTH, 8);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(300);
		payment.setNo(0);
		payment.setPaymentNo(111);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1);//2019 11��
		cal.add(Calendar.MONTH, 9);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(200);
		payment.setNo(0);
		payment.setPaymentNo(112);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 12��
		cal.add(Calendar.MONTH, 10);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(0);
		payment.setNo(0);
		payment.setPaymentNo(113);
		payment.setRequests("ī�����");
		tb_payment.add(payment);
		
		payment =new PaymentVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -1); //2019 12��
		cal.add(Calendar.MONTH, 11);
		payment.setDate(new Date(cal.getTimeInMillis()));
		payment.setId("a");
		payment.setMilieage(0);
		payment.setNo(0);
		payment.setPaymentNo(114);
		payment.setRequests("���ݰ���");
		tb_payment.add(payment);
	}
	{//īƮ ���̺�
		CartVo cart = new CartVo();
		cart.setCount(4);
		cart.setFoodNo(2);
		cart.setNo(0);
		cart.setPaymentNo(100);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(2);
		cart.setFoodNo(7);
		cart.setNo(1);
		cart.setPaymentNo(100);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(12);
		cart.setNo(2);
		cart.setPaymentNo(100);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(9);
		cart.setNo(3);
		cart.setPaymentNo(101);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(11);
		cart.setNo(4);
		cart.setPaymentNo(101);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(13);
		cart.setNo(5);
		cart.setPaymentNo(101);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(12);
		cart.setNo(6);
		cart.setPaymentNo(102);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(9);
		cart.setNo(7);
		cart.setPaymentNo(102);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(2);
		cart.setFoodNo(4);
		cart.setNo(8);
		cart.setPaymentNo(103);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(10);
		cart.setNo(9);
		cart.setPaymentNo(103);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(6);
		cart.setFoodNo(4);
		cart.setNo(10);
		cart.setPaymentNo(103);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(12);
		cart.setNo(11);
		cart.setPaymentNo(104);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(1);
		cart.setNo(12);
		cart.setPaymentNo(104);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(18);
		cart.setFoodNo(7);
		cart.setNo(13);
		cart.setPaymentNo(104);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(2);
		cart.setFoodNo(2);
		cart.setNo(14);
		cart.setPaymentNo(105);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(40);
		cart.setFoodNo(15);
		cart.setNo(15);
		cart.setPaymentNo(105);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(1);
		cart.setFoodNo(1);
		cart.setNo(16);
		cart.setPaymentNo(106);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(18);
		cart.setFoodNo(6);
		cart.setNo(17);
		cart.setPaymentNo(106);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(28);
		cart.setFoodNo(9);
		cart.setNo(18);
		cart.setPaymentNo(106);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(3);
		cart.setNo(19);
		cart.setPaymentNo(106);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(40);
		cart.setFoodNo(16);
		cart.setNo(20);
		cart.setPaymentNo(107);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(4);
		cart.setFoodNo(5);
		cart.setNo(21);
		cart.setPaymentNo(107);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(11);
		cart.setFoodNo(11);
		cart.setNo(22);
		cart.setPaymentNo(108);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(3);
		cart.setFoodNo(20);
		cart.setNo(23);
		cart.setPaymentNo(108);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(6);
		cart.setFoodNo(15);
		cart.setNo(24);
		cart.setPaymentNo(108);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(12);
		cart.setNo(25);
		cart.setPaymentNo(109);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(17);
		cart.setNo(26);
		cart.setPaymentNo(109);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(18);
		cart.setFoodNo(2);
		cart.setNo(27);
		cart.setPaymentNo(110);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(2);
		cart.setFoodNo(10);
		cart.setNo(28);
		cart.setPaymentNo(110);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(16);
		cart.setFoodNo(16);
		cart.setNo(29);
		cart.setPaymentNo(110);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(6);
		cart.setNo(30);
		cart.setPaymentNo(110);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(3);
		cart.setFoodNo(3);
		cart.setNo(31);
		cart.setPaymentNo(111);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(8);
		cart.setNo(32);
		cart.setPaymentNo(111);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(7);
		cart.setNo(33);
		cart.setPaymentNo(112);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(3);
		cart.setFoodNo(1);
		cart.setNo(34);
		cart.setPaymentNo(112);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(1);
		cart.setNo(35);
		cart.setPaymentNo(113);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(6);
		cart.setFoodNo(8);
		cart.setNo(36);
		cart.setPaymentNo(113);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(18);
		cart.setFoodNo(15);
		cart.setNo(37);
		cart.setPaymentNo(113);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(3);
		cart.setFoodNo(19);
		cart.setNo(38);
		cart.setPaymentNo(113);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(8);
		cart.setFoodNo(20);
		cart.setNo(39);
		cart.setPaymentNo(113);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(4);
		cart.setFoodNo(10);
		cart.setNo(40);
		cart.setPaymentNo(113);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(1);
		cart.setFoodNo(3);
		cart.setNo(41);
		cart.setPaymentNo(114);
		tb_cart.add(cart);	
		
		
		cart = new CartVo();
		cart.setCount(2);
		cart.setFoodNo(7);
		cart.setNo(42);
		cart.setPaymentNo(114);
		tb_cart.add(cart);
		
		cart = new CartVo();
		cart.setCount(5);
		cart.setFoodNo(12);
		cart.setNo(43);
		cart.setPaymentNo(114);
		tb_cart.add(cart);
		
	}
	{//���ϸ������̺�
		MileageVo mileage = new MileageVo();
		mileage.setDate(new Date());
		mileage.setId("a");
		mileage.setMiliage(500);
		mileage.setContents("�������� ��� ���� 0");
		mileage.setNo(0);
		tb_Mileage.add(mileage);
		
		mileage = new MileageVo();
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -29); 
		
		mileage.setDate(new Date(cal.getTimeInMillis()));
		mileage.setId("a");
		mileage.setMiliage(500);
		mileage.setContents("�������� ��� ���� 1");
		mileage.setNo(1);
		tb_Mileage.add(mileage);
		
		
		mileage = new MileageVo();
		cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -30); // ���� ��¥���� 30���� �A��.
		
		mileage.setDate(new Date(cal.getTimeInMillis()));
		mileage.setId("a");
		mileage.setMiliage(1000);
		mileage.setContents("ȸ������");
		mileage.setNo(2);
		tb_Mileage.add(mileage);
		
	
		
	}
	{//ī�װ� ���̺� 
		MenuCategoryVo menu = new MenuCategoryVo();
		menu.setNo(0);
		menu.setMenu("����/��");
		tb_cartegory.add(menu);
		
		menu = new MenuCategoryVo();
		menu.setNo(1);
		menu.setMenu("��������");
		tb_cartegory.add(menu);
		
		menu = new MenuCategoryVo();
		menu.setNo(2);
		menu.setMenu("���Ͼ���");
		tb_cartegory.add(menu);
		
		menu = new MenuCategoryVo();
		menu.setNo(3);
		menu.setMenu("�ַ�");
		tb_cartegory.add(menu);
		
		menu = new MenuCategoryVo();
		menu.setNo(99);
		menu.setMenu("��Ÿ");
		tb_cartegory.add(menu);
		
		menu = new MenuCategoryVo();
		menu.setNo(4);
		menu.setMenu("����");
		tb_cartegory.add(menu);
		
		
	}
	{//���� ���̺�
		FoodVo food = new FoodVo();
		food.setNo(0);
		food.setCategory(0);
		food.setName("��������");
		food.setPrice(8000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(1);
		food.setCategory(0);
		food.setName("�������ֺ����������ֺ����������ֺ����������ֺ���");
		food.setPrice(8000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(2);
		food.setCategory(0);
		food.setName("��������");
		food.setPrice(9000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(3);
		food.setCategory(0);
		food.setName("�ߺ�����");
		food.setPrice(10000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(4);
		food.setCategory(0);
		food.setName("���");
		food.setPrice(5000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(5);
		food.setCategory(1);
		food.setName("����");
		food.setPrice(10000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(6);
		food.setCategory(1);
		food.setName("����");
		food.setPrice(5000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(7);
		food.setCategory(1);
		food.setName("����");
		food.setPrice(5000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(8);
		food.setCategory(1);
		food.setName("��¡��");
		food.setPrice(9000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(9);
		food.setCategory(1);
		food.setName("��븶������");
		food.setPrice(12000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(10);
		food.setCategory(2);
		food.setName("�޷�");
		food.setPrice(8000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(11);
		food.setCategory(2);
		food.setName("Ȳ��");
		food.setPrice(5000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(12);
		food.setCategory(2);
		food.setName("ȭä");
		food.setPrice(12000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(13);
		food.setCategory(2);
		food.setName("��Ұ��Ͼ���");
		food.setPrice(12000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(14);
		food.setCategory(3);
		food.setName("����");
		food.setPrice(4000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(15);
		food.setCategory(3);
		food.setName("����");
		food.setPrice(4000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(16);
		food.setCategory(3);
		food.setName("û��");
		food.setPrice(5000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(17);
		food.setCategory(3);
		food.setName("�ɼ�");
		food.setPrice(6000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(18);
		food.setCategory(4);
		food.setName("�ݶ�");
		food.setPrice(1000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(19);
		food.setCategory(4);
		food.setName("���̴�");
		food.setPrice(1000);
		tb_food.add(food);

		food = new FoodVo();
		food.setNo(20);
		food.setCategory(4);
		food.setName("���ڿ���");
		food.setPrice(2000);
		tb_food.add(food);
	}
	{//���̺� ���̺�
		TableVo table = new TableVo();
		  table.setTablenumber(1);
		  table.setPossiblepeople(4);
		  tb_table.add(table);
		  
		  table = new TableVo();
		  table.setTablenumber(2);
		  table.setPossiblepeople(4);
		  tb_table.add(table);
		  
		  table = new TableVo();
		  table.setTablenumber(3);
		  table.setPossiblepeople(6);
		  
		  tb_table.add(table);
		  table = new TableVo();
		  table.setTablenumber(4);
		  table.setPossiblepeople(2);
		  
		  tb_table.add(table);
		  table = new TableVo();
		  table.setTablenumber(5);
		  table.setPossiblepeople(4);
		  
		  tb_table.add(table);
		  table = new TableVo();
		  table.setTablenumber(6);
		  table.setPossiblepeople(3);
		  
		  tb_table.add(table);
		  table = new TableVo();
		  table.setTablenumber(7);
		  table.setPossiblepeople(2);
		  table.setEnterpeople(2);
		  table.setUserId("aa");
		  tb_table.add(table);
		  
		  table = new TableVo();
		  table.setTablenumber(7);
		  table.setPossiblepeople(7);
		  table.setEnterpeople(2);
		  table.setUserId("aaa");
		  tb_table.add(table);
		  
		  table = new TableVo();
		  table.setTablenumber(9);
		  table.setPossiblepeople(2);
		  table.setEnterpeople(2);
		  table.setUserId("aaaa");
		  tb_table.add(table);
		  
	}
}
