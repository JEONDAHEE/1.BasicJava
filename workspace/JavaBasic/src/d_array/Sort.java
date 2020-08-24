package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		  << 정렬 >> 
		 - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리 바꾸기를 반복 해 앞에서부터
		  작은 수를 채워 나가는 방식 
		  - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리 바꾸기를 반복해
		  뒤에서부터 큰 수를 채워나가는 방싣 
		  - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고
		  중간에 삽입하는 방식
		  
		  <<석차구하기>> 
		  - 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */

		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}

		shuffle(number);
		System.out.println(Arrays.toString(number));
		
//		printRank(number); // 석차구하기
//		selectSort(number); // 선택정렬
//		bubbleSort(number); // 버블정렬
		insertSort(number);// 삽입정렬
		System.out.println(Arrays.toString(number));

	}

	private static void insertSort(int[] number) { // 삽입정렬
		
		int temp = 0; // 기준이 되는 수 -> number[1]
		
		for(int i = 1; i < number.length; i++ ){
			temp = number[i]; // 기준이 되는 수 임시 저장
			int j = 0; // 앞에 있는 수
			for(j = i - 1 /* i앞에 있는 값 */; j >= 0 /* j가 0보다 크거나 같을 때까지 */;  j-- /* 아래로 증가 */){
				if(temp < number[j]){ // 임시 저장 수보다 j값이 크면 
				number[j+1] = number[j]; // 뒤로 하나 밀리고 그게 j가 됨
				}else{
					break;//기준이 되는 수보다 앞에 있는 수가 더 작으면 빠져나간다.
				}
			}
			number[j + 1] = temp; //비어있는칸에 임시저장 공간에 들어있던 수가 들어간다.
		}		
	}//https://dpdpwl.tistory.com/18

	private static void bubblesort(int[] number) { // 버블정렬
		
		int temp = 0;
		
		for(int i = 0; i < number.length - 1; i++){ 
			boolean change = false;
			for(int j = 0; j < number.length - i - 1; j++){
				if(number[j] > number[j + 1]){
					temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
					change = true;
				}
			}
			if(!change){
				break;
			}
		}		
	}

	private static void selectSort(int[] number) { // 선택정렬
		
		int temp = 0;
		
		for(int i = 0; i < number.length - 1; i++ ){
			for(int j = i + 1; j < number.length; j++){
				if(number[i] > number[j]){
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}	
	}

	private static void printRank(int[] number) { // 석차 구하기
		
		int[] rank = new int[number.length];
		
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
			
		for(int i = 0; i < number.length ; i++){
			for(int j = 0; j < number.length ; j++){
				if(number[i] < number[j]){
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));


	}

	private static void shuffle(int[] number) {
		for (int i = 0; i < number.length; i++) {
			int random = (int) (Math.random() * number.length);

			int temp = number[0];
			number[0] = number[random];
			number[random] = temp;
		}
		
	}

}
