package z_popo;


import java.util.Scanner;

public class Tms_main {

	public static void main(String[] args) {
		
		
		
		//clss �޾ƿ���
		TodayMoodSong tms = new TodayMoodSong();
		
		//���� �޾ƿ���
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean keep = true;
		
		//�ݺ�
		while (keep) {
			//������ ��� ����
			System.out.println("--------------------------------------");
			System.out.println("Music is My Life ~ ��");
			System.out.println("����� ������ ���� Choice �ð�!!");
			System.out.println("--------------------------------------");
			System.out.println("����� ���� mood��??!");
			System.out.println("");
			System.out.println("1. �г�, �ε�ε�");
			System.out.println("2. ��ſ�, ������");
			System.out.println("3. �޴�, �ϴ��� ���� ���");
			System.out.println("4. ���, ��r�� ��r�� ������ �기��r,,,��");
			System.out.println("5. ���, ������! ������ ���� ����~~");
			System.out.println("======================================");
			System.out.println("0. ����");
			System.out.println("--------------------------------------");
			System.out.println("����� ������ ? ->");
			num = Integer.parseInt(sc.nextLine());
			
			if (num == 0) {
				System.out.println("����.");
			} else if (num == 1) {
				tms.ignore();
				System.out.println("�г�");
			} else if (num == 2) {
				tms.happy();
				System.out.println("��ſ�");
			} else if (num == 3) {
				tms.sweet();
				System.out.println("�޴�");
			} else if (num == 4) {
				tms.sad();
				System.out.println("���");
			} else if (num == 5) {
				tms.excit();
				System.out.println("���");
			}

		}

		
	}

}
