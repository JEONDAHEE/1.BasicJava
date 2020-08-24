package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.ReviewVO;
import data.Database;

public class UserService {
	
	private static UserService instance;
	
	private UserService(){}
	

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}
			
	//�����ۼ��ϱ�
	public void wright(){
		
		ReviewVO review = new ReviewVO(); //ReviewVO�� ���� review�� �������
				
			Scanner s = new Scanner(System.in);
			
			System.out.println("�ۼ��Ͻ� ��ȭ�� �������ּ���.");
			System.out.println("------------------------------------");
			System.out.println("1.�ܿ�ձ�2\n2.��ġ���ʾ�\n3.��Ÿ����\n4.���۳༮��");
			System.out.println("------------------------------------");

			int movie = Integer.parseInt(s.nextLine());

			if (movie == 1) {
				System.out.println(" ��ȭ���� : �ܿ�ձ� ");
				moviewinter();
			} else if (movie == 2) {
				System.out.println("��ȭ���� :��ġ�� �ʾ�");
				moviewinter();
			} else if (movie == 3) {
				System.out.println("��ȭ���� : ��Ÿ����");
				moviewinter();
			} else if (movie == 4) {
				System.out.println("��ȭ���� : ���۳༮��");
				moviewinter();
			}

	
		}
	
  void moviewinter(){
		ReviewVO review = new ReviewVO(); //ReviewVO�� ���� review�� �������

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �������ּ���.");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. �ڡ١١١�  2. �ڡڡ١١�  3. �ڡڡڡ١�  4. �ڡڡڡڡ�   5.�ڡڡڡڡ� ");
		System.out.println("--------------------------------------------------------------");

		int sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			System.out.println("�ڡ١١١� ");
			review.setReview_grade(sc1);//ReviewVO�� setReview�� ������
			break;
		case 2:
			System.out.println("�ڡڡ١١�");
			review.setReview_grade(sc1);//ReviewVO�� setReview�� ������
			break;
		case 3:
			System.out.println("�ڡڡڡ١�");
			review.setReview_grade(sc1);//ReviewVO�� setReview�� ������
			break;
		case 4:
			System.out.println("�ڡڡڡڡ�");
			review.setReview_grade(sc1);//ReviewVO�� setReview�� ������
			break;
		case 5:
			System.out.println("�ڡڡڡڡ�");
			review.setReview_grade(sc1);//ReviewVO�� setReview�� ������
			break;
		}
		
		Scanner wright = new Scanner(System.in);
			System.out.println("���� ������ �ۼ����ּ���.");
			String userWright = wright.nextLine();
			System.out.println("����:"+userWright);
			review.setReview_content(userWright);
//			review.setReview_date(new date("yyyy-mm-dd"));
		
	}
  
	
	//���亸�� - ��ȭ��ü ���丮��Ʈ �ۼ�
	public void view(){
		
		ArrayList<ReviewVO> userList;
		//���
		System.out.println("------------------------");
		System.out.println("�ۼ���\t��ȭ����\t����\t����\t�ۼ���¥");
		System.out.println("------------------------");
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			ReviewVO user = Database.getInstance().tb_review.get(i);
			System.out.println(i+1+"\t"+user.getReview_content()+"\t"+user.getReview_grade());
		}
		System.out.println("------------------------");
	
		
		
		//���丮��Ʈ�� �������� ���� ����
      
		Scanner choice =  new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("1.���伱��ȭ��  0.�ý������� ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
		System.out.println("���� ���� >>>"+userChoice);
		
	}
	
	//my review
	public void MyReview(){
		
		Scanner choice =  new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("1.������� 2.������� 3.���伱��ȭ��  0.�ý������� ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
		
		switch(userChoice){
		case 1 ://�������
			System.out.println("���䰡 �����Ǿ����ϴ�.");
			break;
		case 2 ://�������
			//����-->�����ۼ� �������� �̵�
			break;
		case 3 ://���伱��ȭ��
			//�����ۼ��ϱ�� �Ѿ��
			break;
		}while(userChoice != 3);

		
	}



	

}
