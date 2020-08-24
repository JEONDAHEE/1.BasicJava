package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.NoticeVo;
import dao.NoticeDao;
import data.Session;

public class Notice {
	static Scanner s = new Scanner(System.in);
	public static void notiveUser() {
		NoticeDao noticedao = NoticeDao.getInstance();
		ArrayList<NoticeVo> noticeList =noticedao.selectNoticeList();
		if (noticedao.selectNoticeList().size() == 0) {
			System.out.println("���������� �����ϴ�.");
			return;
			// �ǵ��ư��� ����.
		}
		boolean check = false;
		
		String temp = "";
		do {
			noticeView();
			System.out.println("0. ����");
			System.out.println("-----------------------------------------------");
			System.out.println("�ڼ��� ���� ���������� �������ּ���.");
			temp = s.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 0, noticeList.size());
		}while(!check);
		if(Integer.parseInt(temp)==0){
			return;
		}
		
		int noticeKey = noticeList.get(Integer.parseInt(temp)-1).getNo();
		System.out.println("-----------------------------------------------");	
		System.out.print(noticeList.get(noticeKey).getSubject()+ "\t");
		System.out.println(noticeList.get(noticeKey).getId() + "\t");
		System.out.println("-----------------------------------------------");
		System.out.println(noticeList.get(noticeKey).getContents());
		System.out.println("-----------------------------------------------");
	}
	
	public static void noticeView(){
		NoticeDao noticedao = NoticeDao.getInstance();
		ArrayList<NoticeVo> noticeList =noticedao.selectNoticeList();
		if (noticeList.isEmpty()) {
			System.out.println("���������� �����ϴ�.");
			return;
			// �ǵ��ư��� ����.
		}
	
	

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("\t\t��������");
		System.out.println("����\t\t����\t\t\t�ۼ���\t\t��¥");
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < noticeList.size(); i++) {
			String subject = noticeList.get(i).getSubject();
			int num = 4-subject.length()/6;
			for(int j = 0 ; j < num ; j++){
				subject += "\t";
			}
			
			System.out.print(i+1+"\t");
			System.out.print(subject);
			System.out.print(noticeList.get(i).getId() + "\t    ");
			System.out.println(format1.format(noticeList.get(i).getDate()) + "\t");
		}
		
	    
	}
	public static void noticeUser() {
		NoticeDao noticedao = NoticeDao.getInstance();
		ArrayList<NoticeVo> noticeList =noticedao.selectNoticeList();
		if (noticedao.selectNoticeList().size() == 0) {
			System.out.println("���������� �����ϴ�.");
			return;
			// �ǵ��ư��� ����.
		}
		boolean check = false;
		
		String temp = "";
		
		do {
			do {
				noticeView();
				System.out.println("0\t���� �޴��� �̵�");
				System.out.println("--------------------------------------------------------------");
				System.out.println("�ڼ��� ���� ���������� �������ּ���.");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, noticeList.size());
			} while (!check);
			if (Integer.parseInt(temp) == 0) {
				return;
			}

			int noticeKey = noticeList.get(Integer.parseInt(temp) - 1).getNo();
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.print(noticeList.get(noticeKey).getSubject() + "\t");
			System.out.println("�ۼ��� ID : "+noticeList.get(noticeKey).getId() + "\t");
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println(noticeList.get(noticeKey).getContents());
		

		}while(check);

		
	}
	static void NoticeCreat() {
	

	// ������ �޸� ����� �ְ� ��������� �ϴ� ��

	NoticeDao noticedao = NoticeDao.getInstance();

	NoticeVo notice = new NoticeVo();

	
	String Subject = "";
	String Content = "";
	boolean stop = true;
	do {
		stop = true;
		System.out.println("������ �Է��ϼ���.");
		Subject = s.nextLine().trim();
		
		if (!(Subject.length() <= 15&&Subject.length() >= 2)) {
			System.out.println("2~15���ڷ� ������ �����ּ���.");
			stop = false;
		}
		
	} while (!stop);

	stop = false;
	do {
		System.out.println("������  15�� �̻� �Է��ϼ���.");
		Content = s.nextLine();

		if (Content.length() >= 15) {
			stop = true;
		}
	} while (!stop);

	notice.setDate(new Date());
	notice.setSubject(Subject);
	notice.setContents(Content);
	notice.setId(Session.loginUser.getId());
	noticedao.insertNotice(notice);

}
 	public static void NoticeModify() {
	
	String temp = "";
	boolean check = false;
		do {
			do {		
				noticeView();
				System.out.println("------------------------------------------");
				System.out.println("1. �������� ����");
				System.out.println("2. �������� �߰�");
				System.out.println("3. �������� ����");
				System.out.println("4. �������");
				System.out.println("5. �������");
				System.out.println("0. ���� �޴��� �̵�");
				System.out.println("------------------------------------------");
				temp = s.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 0, 5);

			} while (!check);

			int menu = Integer.parseInt(temp);
			switch (menu) {
			case 1:
				noticeUser();
				break;
			case 2:
				NoticeCreat();
				break;
			case 3:
				Noticedelete(modifyPos());
				break;
			case 4:
				modifySub(modifyPos());
				break;
			case 5:
				modifyCentent(modifyPos());
				break;
			case 0:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				check = false;
			}
		}while(check);
				
	
}
 	static int modifyPos(){
	
	NoticeDao noticeDao = NoticeDao.getInstance();
	ArrayList<Integer> noticList = noticeDao.NoticeList();
	
	String temp = "";
	boolean check = false;
	
	do{
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("�����ϰ� ���� �Խ����� ���ڸ� �Է����ּ���.");
		noticeView();
		System.out.println("0. ����");
		System.out.println("--------------------------------------------------------------------------------------------------");
		temp = s.nextLine().trim();
		check = IntegerCheck.checkInt(temp,0,noticList.size());
	
	}while(!check);

	if(temp.equals("0")){
		return -1;
	}
	
	return noticeDao.NoticeList().get(Integer.parseInt(temp)-1);
}
	static void Noticedelete(int no) {
		if(no == -1){
			return;
		}else {
		
		NoticeDao noticedao = NoticeDao.getInstance();
		for(int i = 0 ; i < noticedao.selectNoticeList().size();i++){
			if(noticedao.selectNoticeList().get(i).getNo()==no){
				System.out.println(i+1+"���� ���������� �����Ͽ����ϴ�.");
			}
		}
		noticedao.deleteNotice(noticedao.searchNoiceNoInfo(no));
	}
	
}
	static void modifySub(int no){
	if(no == -1){
		return;
	} else {
		NoticeDao noticedao = NoticeDao.getInstance();
		boolean check =false;
		int number = 0;
		for(int i = 0 ; i < noticedao.selectNoticeList().size();i++){
			if(noticedao.selectNoticeList().get(i).getNo()==no){
				number=i+1;
				break;
			}
		}
		
		do {
			System.out.println(number+"���� ���������� �����ϼ̽��ϴ�.");
			System.out.println("������ �����Ͻðڽ��ϱ�? Y/N");
			String temp = s.nextLine().trim();
			if (temp.equalsIgnoreCase("Y") || temp.equalsIgnoreCase("y")) {
					do {
						check = true;
						System.out.println("�����ϰ� ���� ������ �Է��ϼ���.");
						temp = s.nextLine();
						if (!(temp.length() <= 15 && temp.length() >= 2)) {
							System.out.println("2~15���ڷ� ������ �����ּ���.");
							check = false;
						}
						
					}while(!check);
				noticedao.searchNoiceNoInfo(no).setSubject(temp);
				
				
			}else if(temp.equalsIgnoreCase("N")|| temp.equalsIgnoreCase("n")){
				System.out.println("�޴��� ���ư��ϴ�.");
				check = true;
				
			}else{
				System.out.println("�߸��� �Է��Դϴ�.");
				check = false;
			}
		}while(!check);
	}
	
 }
	static void modifyCentent(int no) {
		NoticeDao noticedao = NoticeDao.getInstance();
		
		if (no == -1) {
			return;
		}else {
			boolean check = false;
			int number = 0;
			for(int i = 0 ; i < noticedao.selectNoticeList().size();i++){
				if(noticedao.selectNoticeList().get(i).getNo()==no){
					number=i+1;
					break;
				}
			}
			do {
				System.out.println(number + "���� ���������� �����ϼ̽��ϴ�.");
				System.out.println("������ ������ �Ͻðڽ��ϱ�? Y/N");
				String temp = s.nextLine().trim();
				if (temp.equalsIgnoreCase("Y") || temp.equalsIgnoreCase("y")) {
					do{
						check = true;
						System.out.println("�����ϰ� ���� ������ �Է��ϼ���.");
						temp = s.nextLine();
						
						if (!(temp.length() >= 15)) {
							System.out.println("15���� �̻����� ������ �Է����ּ���.");
							check = false;
						}
					}while(!check);

					noticedao.searchNoiceNoInfo(no).setContents(temp);
					
				} else if (temp.equalsIgnoreCase("N")|| temp.equalsIgnoreCase("n")) {
					System.out.println("�޴��� ���ư��ϴ�.");
					check = true;
				} else {
					System.out.println("�߸��� �Է��Դϴ�.");
					check = false;
				}
			} while (!check);

		}
	}
	
}
