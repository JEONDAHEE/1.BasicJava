package z_popo;


import java.util.Scanner;

public class Tms_main {

	public static void main(String[] args) {
		
		
		
		//clss 받아오기
		TodayMoodSong tms = new TodayMoodSong();
		
		//숫자 받아오기
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean keep = true;
		
		//반복
		while (keep) {
			//오늘의 기분 선택
			System.out.println("--------------------------------------");
			System.out.println("Music is My Life ~ ♬");
			System.out.println("당신의 오늘을 위한 Choice 시간!!");
			System.out.println("--------------------------------------");
			System.out.println("당신의 지금 mood는??!");
			System.out.println("");
			System.out.println("1. 분노, 부들부들");
			System.out.println("2. 즐거움, 룰루랄라");
			System.out.println("3. 달달, 하늘을 나는 기분");
			System.out.println("4. 우울, ㄴr는 가r끔 눈물을 흘린ㄷr,,,♪");
			System.out.println("5. 흥분, 흥폭발! 오늘은 흔들어 제껴~~");
			System.out.println("======================================");
			System.out.println("0. 종료");
			System.out.println("--------------------------------------");
			System.out.println("당신의 선택은 ? ->");
			num = Integer.parseInt(sc.nextLine());
			
			if (num == 0) {
				System.out.println("종료.");
			} else if (num == 1) {
				tms.ignore();
				System.out.println("분노");
			} else if (num == 2) {
				tms.happy();
				System.out.println("즐거움");
			} else if (num == 3) {
				tms.sweet();
				System.out.println("달달");
			} else if (num == 4) {
				tms.sad();
				System.out.println("우울");
			} else if (num == 5) {
				tms.excit();
				System.out.println("흥분");
			}

		}

		
	}

}
