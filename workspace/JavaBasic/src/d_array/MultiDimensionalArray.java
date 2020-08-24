package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 << ������ �迭 >>
		 - �迭 �ȿ� �迭�� ����Ǿ� �ִ� �����̴�.
		*/

		// 2���� �迭
		int[][] number = new int[2][3]; // 2ĭ¥�� �迭�ȿ� �� ĭ���� 3ĭ¥�� �迭�� �����ȴ�.
		int number2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] number3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		//���ȣ�� ��� �ڿ� �־ ��������� Ÿ�Եڿ� ����ϴ°� ����.
		
		int[] a1 = {1,2,3}; // 1����
		int[][] a2 = {{1, 2}, {1, 2, 3}, {4}};// 2����
		int[][][] a3 = {{{5}, {6,7,8} }}; // 3����
		
		// �����迭
		int[][] number4= new int[3][]; 
		number4[0] = new int[3];
		number4[1] = new int[4];
		number4[2] = new int[10]; //���̸� �ٸ��� ���� �� �� �ִ�.
		
//		number[0] = 10; // 1������ ���� ������ �� ����.
		number[0] = new int[5]; //1������ �迭�� ������ �� �ִ�.
		number[0][0] = 10; // 2������ ���� ������ �� �ִ�.
		number[0][1] = 20;
		number[1][0] = 100;
		
		System.out.println(number.length);//1���� �迭�� ���̸� �˷��ش�.
		System.out.println(number[1].length); //2���� �迭�� ����.
		
		for(int i = 0; i < number.length; i++){
			for(int j = 0; j < number[i].length; j++){
				System.out.println(number[i][j]);
				/*
				 {{1, 2}
				 ,{4, 5}
				 ,{7, 8}} // 1�����Ǳ��̴� 3, 2������ ���̴� 2
				 => [3][2]
				 */
			}
		} 
		// 1���� �迭�� ��� ���� ��� �� ��.
		System.out.println(Arrays.toString(number));
		// 2���� �迭�� ��� ���� ��� �� ��.
		for(int i =0; i < number.length; i++){
			System.out.println(Arrays.toString(number[i]));
		} 
	
		//2���� �迭�� ���
		int[][] score= new int[3][5]; //int[�л���][�����]
		int[] sum = new int[score.length]; //����
		double[] avg = new double[score.length]; //���
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random() * 100) + 1; // ������ ���� ���� �߻�
				sum[i] += score[i][j]; // ������ ������ ��.
			}
			System.out.println(Arrays.toString(score[i]));
			avg[i] = (double)sum[i] / score[i].length; //������ ���� ��� 
		}
		System.out.println("5���� ������ ���� : " + Arrays.toString(sum));
		System.out.println("5���� ������ ����� : " + Arrays.toString(avg));
//		System.out.println("���� : " + sum[i] + " ��� : " + avg[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
