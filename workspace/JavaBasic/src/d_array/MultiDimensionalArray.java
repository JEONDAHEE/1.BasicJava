package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 << 다차원 배열 >>
		 - 배열 안에 배열이 저장되어 있는 형태이다.
		*/

		// 2차원 배열
		int[][] number = new int[2][3]; // 2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		int number2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] number3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		//대괄호는 어디 뒤에 있어도 상관없으나 타입뒤에 사용하는게 좋다.
		
		int[] a1 = {1,2,3}; // 1차원
		int[][] a2 = {{1, 2}, {1, 2, 3}, {4}};// 2차원
		int[][][] a3 = {{{5}, {6,7,8} }}; // 3차원
		
		// 가변배열
		int[][] number4= new int[3][]; 
		number4[0] = new int[3];
		number4[1] = new int[4];
		number4[2] = new int[10]; //길이를 다르게 지정 할 수 있다.
		
//		number[0] = 10; // 1차원에 값을 저장할 수 없다.
		number[0] = new int[5]; //1차원에 배열을 저장할 수 있다.
		number[0][0] = 10; // 2차원에 값을 저장할 수 있다.
		number[0][1] = 20;
		number[1][0] = 100;
		
		System.out.println(number.length);//1차원 배열의 길이를 알려준다.
		System.out.println(number[1].length); //2차원 배열의 길이.
		
		for(int i = 0; i < number.length; i++){
			for(int j = 0; j < number[i].length; j++){
				System.out.println(number[i][j]);
				/*
				 {{1, 2}
				 ,{4, 5}
				 ,{7, 8}} // 1차원의길이는 3, 2차원의 길이는 2
				 => [3][2]
				 */
			}
		} 
		// 1차원 배열의 모든 값을 출력 할 때.
		System.out.println(Arrays.toString(number));
		// 2차원 배열의 모든 값을 출력 할 때.
		for(int i =0; i < number.length; i++){
			System.out.println(Arrays.toString(number[i]));
		} 
	
		//2차원 배열의 계산
		int[][] score= new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[score.length]; //총점
		double[] avg = new double[score.length]; //평균
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random() * 100) + 1; // 세명의 점수 랜덤 발생
				sum[i] += score[i][j]; // 세명의 점수의 합.
			}
			System.out.println(Arrays.toString(score[i]));
			avg[i] = (double)sum[i] / score[i].length; //세명의 점수 평균 
		}
		System.out.println("5개의 과목의 합은 : " + Arrays.toString(sum));
		System.out.println("5개의 과목의 평균은 : " + Arrays.toString(avg));
//		System.out.println("총점 : " + sum[i] + " 평균 : " + avg[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
