package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 << �迭 >>
		 - int[] number = new int[5]; // �⺻������ �ʱ�ȭ �ȴ�.
		 - int[] number = new int[]{10, 20, 30, 40, 50};
		 - int[] number = {10, 20, 30, 40, 50};
		 */
		// ���� Ÿ���� �����͸� ��� ����ϴ� ��
		// �迭�� ������ Ÿ���̴�.
		int[] array; // �迭�� �ּҸ� ������ ������ ���������.
		array = new int[5]; // �迭�� �����ǰ� �� �ּҰ� ����ȴ�.
		//new : ���ο� ������� ���� �� �ּ� ��ȯ
		//int [5] : int�� �����Ҽ� �ִ� 5���� ����
		//�迭�ʱ�ȭ �� �⺻���� ����ȴ�.
		System.out.println(array); //�ּҰ� ����Ǿ� �ִ�.
		System.out.println(array[0]);//�������� �����ϱ� ���ؼ��� index��  ������ ��� �Ѵ�.
		//index���� int�� ��� �� �� �ִ�.(���ͷ�, ����, ���, ���� ��)
		//�迭�� �ִ� ũ��� int��  �ִ밪(�� 20��)�̴�.
		
		String arrayStr = Arrays.toString(array);
		//�迭�� ��� �ε����� ����� ���� ���ڿ��� ��ȯ�Ѵ�
		System.out.println(arrayStr);

		int[] iArray = new int[]{1,2,3};//���� ������ �迭�� ���̰� ��������.
		int[] iArray2 = {1,2,3};//����� �ʱ�ȭ�� ���ÿ� �ؾ� �Ѵ�.
		//int iArray3;
		//iArray3 = {1,2,3};//������ ���� �߻�
		
		array[0] = 10; //�ε����� 0���� �����Ѵ�.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;// ������ �ε����� "�迭�Ǳ��� -1"�̴�.
		
		//������ �����Ҽ� �ִ� ���̰� 10�� �迭�� ���� �� �ʱ�ȭ �ϼ���.
		//1.
		int[] su1 = new int[10]; 
		//2.
		int[] su3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//3.
		int[] su2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		String su1Str = Arrays.toString(su1);
		System.out.println(su1Str);
		
		//��� �ε����� �ִ� ���� �������ּ���.
		su1[0] = 2;
		su1[1] = 3;
		su1[2] = 4;
		su1[3] = 5;
		su1[4] = 6;
		su1[5] = 7;
		su1[6] = 8;
		su1[7] = 9;
		su1[8] = 10;
		su1[9] = 11;
		
		String su1Str2 = Arrays.toString(su1);
		System.out.println(su1Str2);

		//��� �ε����� �ִ� ���� �����ּ���.
		int hap = 0;
		hap += su1[0];
		hap += su1[1];
		hap += su1[2];
		hap += su1[3];
		hap += su1[4];
		hap += su1[5];
		hap += su1[6];
		hap += su1[7];
		hap += su1[8];
		hap += su1[9];
		System.out.println(hap);

		//index�� 1�� �����ϴ� ��Ģ�� �־� for���� �Բ����� ����.
		for(int i =0; i < su1.length; i++){
			System.out.println(su1[i]);
		}
		//�迭�� ���̸� �˰��ִٰ� ���ڸ� ����ϴ°��� �ϵ��ڵ��̶�� �Ѵ�.
		//���̸� �˴��� length�� ����ϴ°��� �� ���� �ڵ��̴�.
		
		for(int i = 0; i < su1.length; i++){
			su1[i] = i + 1; 
		}
		System.out.println(Arrays.toString(su1));
		
		//�迭�� ���ڸ� ��� �հ�� ����� ���غ���.
		int[] num = new int[10];
		
		for(int i =0; i < num.length; i++){
			num[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(num));
		
		hap = 0;//�հ�
		double av = 0;//���
		
		for(int i = 0; i < num.length; i++){
			hap += num[i];
		}
		av = (double)hap / num.length;
		System.out.println("�հ� : " + hap + " / ��� : " + av);
		
		//���� for��
		for(int number : num){ // �迭�� �ִ� ���� ���ʴ�� ������ �ִ´�.
			System.out.println(number);
		}//���� : �ε����� ����Ҽ� ����. �� ���� ���Ѵ�.
		//�迭�� ���� ���� �������� ����Ѵ�.
		
		//�迭�� ����� ���ڵ� �� �ּҰ��� �ִ밪�� ã���ּ���.
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num.length; i++){
			if(max < num[i]){
				max = num[i];
			}else if(min > num[i]){
				min = num[i];
			}
		}
		System.out.println("�ִ밪�� : " + max + " �ּҰ��� : " + min);
		
		
		//������� ����Ǿ� �ִ� ���� ����������  �ϱ�.
		//0�� �ε��� ���� ���� �ε��� ���� ���� ��ȯ�Ѵ�.
		int[] shuffle = new int[30]; //shuffle 30���� �ε���
		for(int i =0; i < shuffle.length; i++){
			shuffle[i] = i + 1; //1 ~ 29��� ���ڰ� ������ �ϱ� ���� +1�� ���ش�. 0���ͱ⶧����
		}
		System.out.println(Arrays.toString(shuffle));//1~29������ ���� ���
		
		int a = 0; // shuffle[0]�ε����� ��� ������ �� ����
		
		for(int i = 0 ; i < shuffle.length; i++){
			int ran = (int)(Math.random() * 30);//ran������ �����ؼ� shuffle�� ���� �����ش�.
			a = shuffle[0];//shuffle[0]�ε����� a�� �����Ų��.
			shuffle[0] = shuffle[ran];//shuffle[0]�ε����� shuffle���� �߻��� ���� ������ �迭(shuffle[ran])�� �־��ش�.
			shuffle[ran] = a;//shuffle���� �߻��� ���� ������ �迭(shuffle[ran]) ��  a. ��,shuffle[0]�ε����� ������°�迭�� �־��ش�.  
		}
		System.out.println(Arrays.toString(shuffle));
			

		// 1 ~ 10 ������ ������ 500�� �����ϰ�, �� ���ڰ� ������ Ƚ���� ������ּ���.
		
		int[] da = new int[500];

		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
		int b5 = 0;
		int b6 = 0;
		int b7 = 0;
		int b8 = 0;
		int b9 = 0;
		int b10 = 0;

		for (int i = 0; i < da.length; i++) {
			da[i] = (int) (Math.random() * 10) + 1;
			if (da[i] == 1) {
				++b1;
			} else if (da[i] == 1) {
				++b1;
			} else if (da[i] == 2) {
				++b2;
			} else if (da[i] == 3) {
				++b3;
			} else if (da[i] == 4) {
				++b4;
			} else if (da[i] == 5) {
				++b5;
			} else if (da[i] == 6) {
				++b6;
			} else if (da[i] == 7) {
				++b7;
			} else if (da[i] == 8) {
				++b8;
			} else if (da[i] == 9) {
				++b9;
			} else if (da[i] == 10) {
				++b10;
			}
		}
		System.out.println("1�� ������ : " + b1);
		System.out.println("2�� ������ : " + b2);
		System.out.println("3�� ������ : " + b3);
		System.out.println("4�� ������ : " + b4);
		System.out.println("5�� ������ : " + b5);
		System.out.println("6�� ������ : " + b6);
		System.out.println("7�� ������ : " + b7);
		System.out.println("8�� ������ : " + b8);
		System.out.println("9�� ������ : " + b9);
		System.out.println("10�� ������ : " + b10);
		
		//--------------------------------------------------------
		
		int[] dh = new int[500];

		for (int i = 0; i < dh.length; i++) {
			dh[i] = (int) (Math.random() * 10) + 1;// 1���� 10�������� ����	
			System.out.print(dh[i] + ", ");
		}

		// �迭�� ����ִ� ���ڵ��� ���� � ����ִ��� ī��Ʈ ����
		int[] counter = new int[10];
		int hy = 0;

		for (int i = 0; i < dh.length; i++) {
			hy = dh[i]-1;
			counter[hy]++; // dh[i] �� ���� counter[i]���� ���� 0~9
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.println((i + 1) + " �� ���� : " + counter[i]);// ī��Ʈ ����� ���� ����
		}	
		
		

		//�������� �ּҰ�, �ִ밪, �ݺ�Ƚ���� �Է¹޾� �� ���ڰ� ������ Ƚ���� ������ּ���.
		Scanner s = new Scanner(System.in);
		
		int min1 = 0;
		int max1 = 0;
		int counter1 = 0;

		System.out.println("�ּҰ��� �Է��� �ּ��� : ");
		min1 = s.nextInt();// int min1 = Integer.parsInt(s.nextLine());
		System.out.println("�ִ밪�� �Է��� �ּ��� : ");
		max1 = s.nextInt();
		System.out.println("�ݺ� Ƚ���� �Է��� �ּ��� : ");
		counter1 = s.nextInt();
		
		/*
		  cou = new int[max1 - min + 1];
		  
		  for(int i =0; i < counter1; i++){
		  		int random = (int)(Math.random() * (max1 - min + 1)) + min1;
		  		cou[random - min1]++;
		  }
		  
		  for(int i = 0; i<cou.length; i++){
		  		sysout(i+1+":"+cou[i]);
		  		}
		 
		 */
		
		
		
		int[] n = new int[counter1];
		//counter1 = new int[max1 - min + 1]
		

		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * max1) + min1;	
			System.out.print(n[i] + ", ");
		}System.out.println();

		int[] c = new int[10];
		int m = 0;

		for (int i = 0; i < n.length; i++) {
			m = n[i]-1;
			c[m]++; 
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println((i + 1) + " �� ���� : " + c[i]);
		}	
		
	}

}























