package z_popo;

import java.util.Scanner;

/*
 	��ǥ : ���α׷� ����, ���, �޼��� ����, �ÿ�
 	 - ��������������
		1. ����  
		2. ���� 
		3. ��
		��������
		����ڿ� ��ǻ�Ͱ� ������������ �Ѵ�.
		50���� ������ �����Ѵ�.
		����ڴ� �̱�� +5���� �ް� ���� -5���� �޴´�.
		0���� �Ǹ� Ż��.
		100���� �Ǹ� ���ڰ� �ȴ�.
		
		
*/
public class RSP {
	int scissor;
	int rock;
	int paper;
	int score;
	
	RSP(){
		scissor = 1;
		rock = 2;
		paper = 3;
		score =  50;
	}
	
	String gababo(int a){
		if(a == 1){
			return "����";
		}
		else if(a == 2){
			return "����";
		}
		else if(a == 3){
			return "��";
		}else{
			return "�ٺ��� ! ���������� �߿��� ������ ~ ";
		}
	}
	
	void score(){
		score = score;
	}
	
	void scoreUp(){
		score += 5;
	}
	void scoreDown(){
		score -= 5;
	}
	
	
	public static void main(String[] args) {
		
		RSP rsp = new RSP();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" ********** ���� �̰ܺ� ~~! **********");
		System.out.println(" ********** �ΰ� vs ��ǻ��  **********");

		
		System.out.println(" �ȳ�! ���� ���߾� �ʴ� �̸��� ���� ? ");
		String sa = s.nextLine();
		System.out.println(" " + sa + "!! ���� �̸��̾� ~~ ���� ���������� ���� !");	
		System.out.println(" ���� ~~~! �����Ϸ��� ���͸� ������ !");
		String start = s.nextLine();
	    System.out.println(start);
		
		while(true){
				
			System.out.println(" ���� ~ ���� ~ �� ~ !  (���� => 1 , ����  => 2, �� => 3) ");
			
			
			int random =(int)(Math.random() * 3 ) + 1; 

			int input = Integer.parseInt(s.nextLine());

			System.out.println("�� ����  : " + rsp.gababo(random));
			System.out.println("�� " + sa + " : " + rsp.gababo(input));
			
			if(random ==  input ){
				System.out.println("���� �Ф� 0���̾� ~ �ٽ��غ� ~");
				rsp.score();
				System.out.println("����� ���� ���� : " + rsp.score);
			}else if(random == 1 && input == 2){
				System.out.println("���� �̰��? 5�� �ٰ� ~");
				rsp.scoreUp();
				System.out.println("����� ���� ����  : " + rsp.score );
			}else if(random == 1 && input == 3){
				System.out.println("���� ~~~ 5�� �������� ~~~");
				rsp.scoreDown();
				System.out.println("����� ���� ���� : " + rsp.score);
			}
			else if(random == 2 && input == 1){
				System.out.println("���� ~~~ 5�� �������� ~~~");
				rsp.scoreDown();
				System.out.println("����� ���� ���� : " + rsp.score);
			}else if(random == 2 && input == 3){
				System.out.println("���� �̰��? 5�� �ٰ� ~");
				rsp.scoreUp();
				System.out.println("����� ���� ����  : " + rsp.score );
			}
			else if(random == 3 && input == 1){
				System.out.println("���� �̰��? 5�� �ٰ� ~");
				rsp.scoreUp();
				System.out.println("����� ���� ����  : " + rsp.score );
			}else if(random == 3 && input == 2){
				System.out.println("���� ~~~ 5�� �������� ~~~");
				rsp.scoreDown();
				System.out.println("����� ���� ���� : " + rsp.score);
			}System.out.println();
			
			
			if(rsp.score == 0){
				System.out.println("0�� �̳� ~~~~ �ʴ� ��ǻ������ �� �ΰ��̾� ~~~~~~");
				break;
			}
			if(rsp.score == 100){
				System.out.println("100�� !!!!!" + sa + ".. �ϰ� �̰��.. ���ߴ� �ΰ��� ���̰� �� �� �� ");
				break;
			}
		
		}
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
