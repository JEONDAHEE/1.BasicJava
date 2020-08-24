package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		  << ���� >> 
		 - �������� : ù��° ���ں��� �� ���� ��� ���ڵ�� ���ؼ� �������� �ڸ� �ٲٱ⸦ �ݺ� �� �տ�������
		  ���� ���� ä�� ������ ��� 
		  - �������� : ù��° ���ں��� �ٷ� �� ���ڿ� ���ؼ� �������� �ڸ� �ٲٱ⸦ �ݺ���
		  �ڿ������� ū ���� ä�������� ��� 
		  - �������� : �ι�° ���ں��� �� ���� ��� ���ڵ�� ���ؼ� ū ������ �ڷ� �а�
		  �߰��� �����ϴ� ���
		  
		  <<�������ϱ�>> 
		  - ��� ������ 1������ �����ؼ� �ٸ� ������� ���� �ڽ��� ������ ������ 1�� ������Ű�� ���
		 */

		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}

		shuffle(number);
		System.out.println(Arrays.toString(number));
		
//		printRank(number); // �������ϱ�
//		selectSort(number); // ��������
//		bubbleSort(number); // ��������
		insertSort(number);// ��������
		System.out.println(Arrays.toString(number));

	}

	private static void insertSort(int[] number) { // ��������
		
		int temp = 0; // ������ �Ǵ� �� -> number[1]
		
		for(int i = 1; i < number.length; i++ ){
			temp = number[i]; // ������ �Ǵ� �� �ӽ� ����
			int j = 0; // �տ� �ִ� ��
			for(j = i - 1 /* i�տ� �ִ� �� */; j >= 0 /* j�� 0���� ũ�ų� ���� ������ */;  j-- /* �Ʒ��� ���� */){
				if(temp < number[j]){ // �ӽ� ���� ������ j���� ũ�� 
				number[j+1] = number[j]; // �ڷ� �ϳ� �и��� �װ� j�� ��
				}else{
					break;//������ �Ǵ� ������ �տ� �ִ� ���� �� ������ ����������.
				}
			}
			number[j + 1] = temp; //����ִ�ĭ�� �ӽ����� ������ ����ִ� ���� ����.
		}		
	}//https://dpdpwl.tistory.com/18

	private static void bubblesort(int[] number) { // ��������
		
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

	private static void selectSort(int[] number) { // ��������
		
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

	private static void printRank(int[] number) { // ���� ���ϱ�
		
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
