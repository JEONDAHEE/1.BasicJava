package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 << 배열 >>
		 - int[] number = new int[5]; // 기본값으로 초기화 된다.
		 - int[] number = new int[]{10, 20, 30, 40, 50};
		 - int[] number = {10, 20, 30, 40, 50};
		 */
		// 같은 타입의 데이터를 묶어서 사용하는 것
		// 배열은 참조형 타입이다.
		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int [5] : int를 저장할수 있는 5개의 공간
		//배열초기화 시 기본값이 저장된다.
		System.out.println(array); //주소가 저장되어 있다.
		System.out.println(array[0]);//실제값에 접근하기 위해서는 index를  지정해 줘야 한다.
		//index에는 int만 사용 할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의  최대값(약 20억)이다.
		
		String arrayStr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다
		System.out.println(arrayStr);

		int[] iArray = new int[]{1,2,3};//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1,2,3};//선언과 초기화를 동시에 해야 한다.
		//int iArray3;
		//iArray3 = {1,2,3};//컴파일 에러 발생
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;// 마지막 인덱스는 "배열의길이 -1"이다.
		
		//정수를 저장할수 있는 길이가 10인 배열을 생성 및 초기화 하세요.
		//1.
		int[] su1 = new int[10]; 
		//2.
		int[] su3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//3.
		int[] su2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		String su1Str = Arrays.toString(su1);
		System.out.println(su1Str);
		
		//모든 인덱스에 있는 값을 변경해주세요.
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

		//모든 인덱스에 있는 값을 더해주세요.
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

		//index는 1씩 증가하는 규칙이 있어 for문과 함께쓰기 좋다.
		for(int i =0; i < su1.length; i++){
			System.out.println(su1[i]);
		}
		//배열의 길이를 알고있다고 숫자를 사용하는것을 하드코딩이라고 한다.
		//길이를 알더라도 length를 사용하는것이 더 좋은 코드이다.
		
		for(int i = 0; i < su1.length; i++){
			su1[i] = i + 1; 
		}
		System.out.println(Arrays.toString(su1));
		
		//배열의 숫자를 담고 합계와 평균을 구해보자.
		int[] num = new int[10];
		
		for(int i =0; i < num.length; i++){
			num[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(num));
		
		hap = 0;//합계
		double av = 0;//평균
		
		for(int i = 0; i < num.length; i++){
			hap += num[i];
		}
		av = (double)hap / num.length;
		System.out.println("합계 : " + hap + " / 평균 : " + av);
		
		//향상된 for문
		for(int number : num){ // 배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}//단점 : 인덱스를 사용할수 없다. 값 변경 못한다.
		//배열의 값을 오직 읽을때만 사용한다.
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num.length; i++){
			if(max < num[i]){
				max = num[i];
			}else if(min > num[i]){
				min = num[i];
			}
		}
		System.out.println("최대값은 : " + max + " 최소값은 : " + min);
		
		
		//순서대로 저장되어 있는 값을 섞여나오게  하기.
		//0번 인덱스 값과 랜덤 인덱스 값을 서로 교환한다.
		int[] shuffle = new int[30]; //shuffle 30개의 인덱스
		for(int i =0; i < shuffle.length; i++){
			shuffle[i] = i + 1; //1 ~ 29라는 숫자가 나오게 하기 위해 +1을 해준다. 0부터기때문에
		}
		System.out.println(Arrays.toString(shuffle));//1~29까지의 숫자 출력
		
		int a = 0; // shuffle[0]인덱스를 잠시 저장할 곳 선언
		
		for(int i = 0 ; i < shuffle.length; i++){
			int ran = (int)(Math.random() * 30);//ran변수를 선언해서 shuffle을 랜덤 돌려준다.
			a = shuffle[0];//shuffle[0]인덱스를 a에 저장시킨다.
			shuffle[0] = shuffle[ran];//shuffle[0]인덱스에 shuffle랜덤 발생한 숫자 번쨰의 배열(shuffle[ran])을 넣어준다.
			shuffle[ran] = a;//shuffle랜덤 발생한 숫자 번쨰의 배열(shuffle[ran]) 은  a. 즉,shuffle[0]인덱스를 랜덤번째배열에 넣어준다.  
		}
		System.out.println(Arrays.toString(shuffle));
			

		// 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
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
		System.out.println("1의 갯수는 : " + b1);
		System.out.println("2의 갯수는 : " + b2);
		System.out.println("3의 갯수는 : " + b3);
		System.out.println("4의 갯수는 : " + b4);
		System.out.println("5의 갯수는 : " + b5);
		System.out.println("6의 갯수는 : " + b6);
		System.out.println("7의 갯수는 : " + b7);
		System.out.println("8의 갯수는 : " + b8);
		System.out.println("9의 갯수는 : " + b9);
		System.out.println("10의 갯수는 : " + b10);
		
		//--------------------------------------------------------
		
		int[] dh = new int[500];

		for (int i = 0; i < dh.length; i++) {
			dh[i] = (int) (Math.random() * 10) + 1;// 1부터 10범위내의 숫자	
			System.out.print(dh[i] + ", ");
		}

		// 배열에 들어있는 숫자들이 각각 몇개 들어있는지 카운트 세기
		int[] counter = new int[10];
		int hy = 0;

		for (int i = 0; i < dh.length; i++) {
			hy = dh[i]-1;
			counter[hy]++; // dh[i] 의 값은 counter[i]값과 동일 0~9
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.println((i + 1) + " 의 갯수 : " + counter[i]);// 카운트 출력을 위한 구문
		}	
		
		

		//위문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		Scanner s = new Scanner(System.in);
		
		int min1 = 0;
		int max1 = 0;
		int counter1 = 0;

		System.out.println("최소값을 입력해 주세요 : ");
		min1 = s.nextInt();// int min1 = Integer.parsInt(s.nextLine());
		System.out.println("최대값을 입력해 주세요 : ");
		max1 = s.nextInt();
		System.out.println("반복 횟수를 입력해 주세요 : ");
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
			System.out.println((i + 1) + " 의 갯수 : " + c[i]);
		}	
		
	}

}























