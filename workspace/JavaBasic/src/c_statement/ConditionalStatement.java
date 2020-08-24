package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 	<<if��>>
		 	- if			 : ���ǽ��� ����� true �̸� ������ ������ �����Ѵ�,.
		 	- else if 	 : �ټ��� ������ �ʿ��� �� if�ڿ� �߰��Ѵ�.
		 	- else		 : ����� true�� ���ǽ��� �ϳ��� ���� ��츦 ���� �߰��Ѵ�.
		 	
		 	
		 */

		int a = 10;
		
		if(a <100){
			System.out.println("���ǽ��� �������� true�̸� ����ȴ�.");
		}
				
		if(a < 10){
			System.out.println("���ǽ��� �������� false�̸� ������� �ʴ´�.");
		}
		
		
		int regNo = 3; //�ֹε�Ϲ�ȣ ù�ڸ�
		String gender = null; //����
		
		if(regNo == 1){
			gender = "����";
		}else if( regNo == 2){ //if�� �ڿ� else if �� ������ �߰� �� �� �ִ�.
			gender = "����";
		}else if( regNo == 3){
			gender = "����";
		}else if(regNo == 4){
			gender = "����";
		}else{ //true�� ���ǽ��� �ϳ���  ���� �� ����ȴ�.
			gender = "Ȯ�κҰ�";
		}
		System.out.println("����� ������  = " + gender + " �Դϴ�.");
		
		// -> ���ǽ� �����ֱ�
		
		if(regNo == 1 || regNo == 3)
			gender = "����";
		else if( regNo == 2 || regNo == 4) //if�� �ڿ� else if �� ������ �߰� �� �� �ִ�.
			gender = "����";
		else //true�� ���ǽ��� �ϳ���  ���� �� ����ȴ�.
			gender = "Ȯ�κҰ�";
			// ���ǽ��� �� ������ ��� {} ���� ����
		System.out.println("����� ������  = " + gender + " �Դϴ�.");
	
		
		int score = 76;
		String grade = null;
		
		if(90 <= score ){
			grade = "A";
		}else if( 80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.println("����� �����  : " + grade +  " �Դϴ�.");
		
		
		score = 73;
		grade = null;
		
		if(90<=score){
			grade = "A";
			if(97 <= score){ //if�� ��ø ��� ����
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if( 80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if( 70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if( 60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else {
			grade = "F";
		}
		
		System.out.println("����� �����  : " + grade +  " �Դϴ�.");
		
		
		/*
		 	<<switch��>>
		 	- ���ǽİ� ��ġ�ϴ� case�� ������ ������ �����Ѵ�.
		 	- ���ǽ��� ����� ������ ���ڿ���(JDK1.7���� ���ڿ� ���) ����Ѵ�. 
		 */
		
		regNo = 2;
		gender = null;
		
		switch(regNo){
			case 1 : case 3 :
				gender = "����";
				break;
			case 2 : case 4 :
				gender = "����";
				break;
			default : //if�� else���� ���� ������ �Ѵ�.
				gender = "Ȯ�κҰ�";
		}
		System.out.println("����� ������ : " + gender + " �Դϴ�.");
		
		
		score = 100;
		grade = null;
		
		switch(score/10){
			case  9 : case 10 :
				grade = "A";
				break;
			case 8 : 
				grade = "B";
				break;
			case 7 : 
				grade = "C";
				break;
			case 6 : 
				grade = "D";
				break;
			default :
				grade = "F";
		}
		
		System.out.println("����� �����  : " + grade +  " �Դϴ�.");
		

		//���ڸ� �Է� �޾� �� ���ڰ� 0���� 0�� �ƴ��� ��� �� �ּ���.
		
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. > ");
		
		int num = Integer.parseInt(s.nextLine());
		String su = null;
		
		if (num == 0){
			su = "0�Դϴ�.";
		}else  {
			su = "0�� �ƴմϴ�.";
		}
		
		System.out.println( "�Է¹��� ����  : " + num + " �� " + su  );*/
		
	/*/*	Scanner s = new Scanner(System.in);
		System.out.println("��ȣ �� �˷��ּ���  > " );
		
		int num = Integer.parseInt(s.nextLine());
		String su = null;
		
		if (num ==64060773){
			su = "�����մϴ�";
		}else  {
			su = "���ٴµ���? ������ ���ž߰ڳ� ; ";
		}
		
		System.out.println(" ��ȣ " + num + " �ֽŰ� " + su  );*/
		
		
		//���ڸ� �Է¹޾� �� ���ڰ� Ȧ������ ¦������ ��� �� �ּ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. > ");
		
		int num1 = Integer.parseInt(sc.nextLine());
		String su1 = null;
		
		if( num1%2 == 0 ){
			su1 = "¦���Դϴ�.";
		}else {
			su1 = "Ȧ���Դϴ�.";
		}
		System.out.println("�Է��� ���� " + num1 + " �� " + su1);
		
		
		
		
	}

}































