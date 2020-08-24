package game;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import service.IntegerCheck;
import vo.MileageVo;
import vo.UserVo;
import dao.MileageDao;
import data.Session;

public class Minesweeper {
	
	
	int mine_Num; // ���� �� 
	int array_Size;// �迭ũ��
	int betting_milieage;//���� ���ϸ���
	int reward_Mileage; //���� ���ϸ���
	
	ArrayList<ArrayList<String>> mine_array = new ArrayList<>();; //������ ����ִ� �迭 
	
	Scanner scan = new Scanner(System.in);
	MileageDao mileageDao = MileageDao.getInstance();
	void play() {//���� ����
		int count = 1;//����Ƚ��
		boolean play = true;//���� �ݺ����� Boolean
		
		do {
			int input = 0; //�Է¹��� ��ġ ��
			boolean check = false;
			String temp = "";
			do {//�迭 ��ġ�� �Է¹޴� �޼���
				
				System.out.println("-----------------------------------------------------");
				System.out.println("<<3X3�Է� ����>>");
				System.out.println("  1  2  3");
				System.out.println("  4  5  6");
				System.out.println("  7  8  9");
				System.out.println("��ġ�� �Է����ּ���. :");
				System.out.println("-----------------------------------------------------");
				
				temp = scan.nextLine().trim();
				check = IntegerCheck.checkInt(temp, 1, (array_Size * array_Size));
				if (check&&!mine_array.get(Integer.parseInt(temp) - 1).get(2).equals("")){
					check = false;
					System.out.println("�ߺ��� �����Դϴ�.");
				}
			} while (!check);//�Է°��� �����̸鼭 ������ ������ ����ȴ�.
			
			input = Integer.parseInt(temp);
			
			if (mine_array.get(input - 1).get(1).equals("boom")) {//�Է��� ���� ��ġ�� ������ ��ġ�� ��� �޼���
				System.out.println("-----------------------------------------------------");
				System.out.println("���ڸ� �P���̽��ϴ�.");
				mine_array.get(input - 1).set(0, "��");
				for (int i = 0; i < array_Size * array_Size; i++) {
					System.out.print(mine_array.get(i).get(0) + "\t");
					if ((i + 1) % array_Size == 0)
						System.out.println();
				}
				loseMileage();
				System.out.println("���� ���� ���ϸ����� " + mileageDao.searchUserMileageSum(Session.loginUser.getId()) + " �Դϴ�.");
				System.out.println("-----------------------------------------------------");
				play = false;
			} else {//�Է��� ���� ��ġ�� ������ ��ġ���ƴѰ�� �޼���
				System.out.println("-----------------------------------------------------");
				System.out.println("���ڰ� �ƴմϴ�.");
				mine_array.get(input - 1).set(2, "cheak");
				mine_array.get(input - 1).set(0, "��");
				for (int i = 0; i < array_Size * array_Size; i++) {
					System.out.print(mine_array.get(i).get(0) + "\t");
					if ((i + 1) % array_Size == 0)
						System.out.println();
				}
				System.out.println("-----------------------------------------------------");
				
				reward(count++);
				
				if(count-1 ==array_Size*array_Size- mine_Num){//���� ��� ���ڸ� ã���� �� �޼���
					play= false;
					System.out.println("-----------------------------------------------------");
					System.out.println("��� ���ڸ� ã���̽��ϴ�.");
					victoryMileage();
					System.out.println("ȹ�渶�ϸ��� : "+reward_Mileage+" �Դϴ�.");
					System.out.println("-----------------------------------------------------");
				}else{//����  ��� ���ڸ� ã�� ������ ��  �޼���
					do {
						System.out.println("-----------------------------------------------------");
						System.out.println("���� ȹ���� ���ϸ��� : " + this.reward_Mileage);
						System.out.println("���  : 1");
						System.out.println("����  : 0");
						System.out.println("-----------------------------------------------------");
						temp = scan.nextLine().trim();
						check =IntegerCheck.checkInt(temp);
					} while (!check);
					
					if(Integer.parseInt(temp) == 1){
						System.out.println("��� �����մϴ�.");
					}else if(Integer.parseInt(temp) ==0){
						play = false;
						System.out.println("-----------------------------------------------------");
						System.out.println("�����մϴ�.");
						System.out.println("ȹ���� ���ϸ����� : " + reward_Mileage
								+ "�Դϴ�.");
						victoryMileage();
						System.out.println("-----------------------------------------------------");
					}
				}
				
			}
		} while (play);
	}
	void createMineArray(){//������ ���ִ� Array�� �����Ѵ�.
		
		for(int i = 0; i < array_Size*array_Size; i++) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("��");
			temp.add("Nomal");
			temp.add("");
			mine_array.add(temp);
		}
		
		Set<Integer> min_Pos = new HashSet<Integer>(); 
		
		while(min_Pos.size()<mine_Num){
			min_Pos.add((int)(Math.random()*array_Size*array_Size));
		}
	
		
		Iterator<Integer> it = min_Pos.iterator();
		
		while(it.hasNext()){
			
			mine_array.get(it.next()).set(1, "boom");
		}
		
		
		for(int i = 0; i < array_Size*array_Size;i++){
			System.out.print(mine_array.get(i));
			if((i+1)%array_Size==0)
				System.out.println();
		}
		
	}
	void input_base(){//���ӽ����� ���� �⺻ �����͸� �����Ѵ�.
		
		String temp ="";
		boolean check = false;
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("5�� �Է½� 5X5�� �簢���� �迭�� �����ȴ�.");
			System.out.println("�Է¹����� 3~6���� �Դϴ�.");
			System.out.println("�迭�� ũ�⸦  �Է����ּ��� : ");
			System.out.println("-----------------------------------------------------");
			
			temp = scan.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 3, 6);
			
		} while (!check);////�Էµ� ���� 3~6������ �����ΰ�� ����
		array_Size = Integer.parseInt(temp);
		 
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("������ ���� ������ 1 ~ "+((array_Size * array_Size) - 1)+" �Դϴ�.");
			System.out.println("������ ������ �Է����ּ���: ");
			System.out.println("-----------------------------------------------------");
			
			 temp = scan.nextLine().trim();
			check = IntegerCheck.checkInt(temp, 1, (array_Size * array_Size) - 1);
			
		} while (!check);//�Էµ� ���� 1 ~ �迭�� ũ��-1�� ������ �����ΰ�� ���� 
		mine_Num = Integer.parseInt(temp);
		
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("���� ���ϸ��� : "+ mileageDao.searchUserMileageSum(Session.loginUser.getId()));
			System.out.println("�ּұݾ��� 100�� �̻��Դϴ�. ");
			System.out.println("����ϰ��� �ϴ� ���ϸ����� �Է����ּ��� : ");
			System.out.println("-----------------------------------------------------");
						
			 temp = scan.nextLine().trim();
			check=IntegerCheck.checkInt(temp, 100, mileageDao.searchUserMileageSum(Session.loginUser.getId()));	
			
		} while (!check);//�Էµ� ���� 100 ~ �ִ� ���ϸ���  ������ �����ΰ�� ���� 
		betting_milieage = Integer.parseInt(temp);
	}
	public void start(){//start ȣ��� ����
		MileageDao mileageDao = MileageDao.getInstance();
		int sum = mileageDao.searchUserMileageSum(Session.loginUser.getId());
		if(sum<=100){
			System.out.println("������ �����ϱ� ���ؼ��� 100���ϸ��� �̻� �ʿ��մϴ�.");
			return;
		}
		input_base();
		createMineArray();
		play();
	}
	void victoryMileage(){
	
		MileageDao mileagedao = MileageDao.getInstance();
		UserVo user = Session.loginUser;
		String userKey = user.getId();
		MileageVo mileageInfo = new MileageVo();

		Date date = new Date();

		mileageInfo.setDate(date);// ���� ���� �ð� �Է�
		mileageInfo.setId(userKey);// ���� ���̵�
		mileageInfo.setMiliage(reward_Mileage);// ȹ�渶�ϸ���
		mileageInfo.setContents("����ã�� �¸�");
		mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�
		mileagedao.searchUserMileage(Session.loginUser.getId());// ���ϸ��� ���� �ֽ�ȭ

	}
	void loseMileage(){
		
		MileageDao mileagedao = MileageDao.getInstance();
		UserVo user = Session.loginUser;
		String userKey = user.getId();
		MileageVo mileageInfo = new MileageVo();

		Date date = new Date();

		mileageInfo.setDate(date);// ���� ���� �ð� �Է�
		mileageInfo.setId(userKey);// ���� ���̵�
		mileageInfo.setMiliage(-betting_milieage);// ȹ�渶�ϸ���
		mileageInfo.setContents("����ã�� �й�");
		mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�
		mileagedao.searchUserMileage(Session.loginUser.getId());// ���ϸ��� ���� �ֽ�ȭ

	}
	void reward(int count){	// ������ ����ϴ� �޼���
		if (array_Size == 3) {
			this.reward_Mileage += (int) (mine_Num * betting_milieage * 0.05 * count);		
		} else if (array_Size == 4) {
			this.reward_Mileage += (int) (mine_Num * betting_milieage * 0.06 * count);
		} else if (array_Size == 5) {
			this.reward_Mileage += (int) (mine_Num * betting_milieage * 0.07 * count);
		} else if (array_Size == 6) {
			this.reward_Mileage += (int) (mine_Num * betting_milieage * 0.08 * count);
		}
		
	}

	
	
	
	
}
