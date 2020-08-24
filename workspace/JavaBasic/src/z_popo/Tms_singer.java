package z_popo;

import java.util.Scanner;

public class Tms_singer {
	TodayMoodSong tms = new TodayMoodSong();

	Tms_main tm = new Tms_main();

	Scanner sc = new Scanner(System.in);

	int num3;

	void Crush() {

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ♬");
		System.out.println("당신의 오늘을 위한 Choice 시간!!");
		System.out.println("--------------------------------------");
		System.out.println(" 오늘의 Artist ★Crush★  선택!");
		System.out.println("Hot Track!");
		System.out.println("1. Outside");
		System.out.println("2. Cereal");
		System.out.println("3. SKIP");
		System.out.println("4. Oasis");
		System.out.println("======================================");
		System.out.println("9. 전단계로 이동");
		System.out.println("--------------------------------------");
		num3 = Integer.parseInt(sc.nextLine());

		if (num3 == 9) {
			System.out.println(tm);
		}

	}

	void Zico() {

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ♬");
		System.out.println("당신의 오늘을 위한 Choice 시간!!");
		System.out.println("--------------------------------------");
		System.out.println(" 오늘의 Artist ★Zico★  선택!");
		System.out.println("Hot Track!");
		System.out.println("1. 천둥벌거숭이");
		System.out.println("2. Artist");
		System.out.println("3. 유레카");
		System.out.println("4. Tough Cookie");
		System.out.println("======================================");
		System.out.println("9. 전단계로 이동");
		System.out.println("--------------------------------------");
		num3 = Integer.parseInt(sc.nextLine());

		if (num3 == 9) {
			System.out.println(tm);
		}

	}

	void Dean() {

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ♬");
		System.out.println("당신의 오늘을 위한 Choice 시간!!");
		System.out.println("--------------------------------------");
		System.out.println(" 오늘의 Artist ★Dean★  선택!");
		System.out.println("Hot Track!");
		System.out.println("1. D");
		System.out.println("2. what2do");
		System.out.println("3. 풀어");
		System.out.println("4. I'm Not Sorry");
		System.out.println("======================================");
		System.out.println("9. 전단계로 이동");
		System.out.println("--------------------------------------");
		num3 = Integer.parseInt(sc.nextLine());

		if (num3 == 9) {
			System.out.println(tm);
		}

	}

	void Penomeco() {

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ♬");
		System.out.println("당신의 오늘을 위한 Choice 시간!!");
		System.out.println("--------------------------------------");
		System.out.println(" 오늘의 Artist ★Penomeco★  선택!");
		System.out.println("Hot Track!");
		System.out.println("1. COCO BOTTLE");
		System.out.println("2. L.I.E");
		System.out.println("3. 23");
		System.out.println("4. No.5");
		System.out.println("======================================");
		System.out.println("9. 전단계로 이동");
		System.out.println("--------------------------------------");
		num3 = Integer.parseInt(sc.nextLine());

		if (num3 == 9) {
			System.out.println(tm);
		}

	}

	void Millic() {

		System.out.println("--------------------------------------");
		System.out.println("Music is My Life ~ ♬");
		System.out.println("당신의 오늘을 위한 Choice 시간!!");
		System.out.println("--------------------------------------");
		System.out.println(" 오늘의 Artist ★Millic★  선택!");
		System.out.println("Hot Track!");
		System.out.println("1. IGLOO");
		System.out.println("2. PARADAISE");
		System.out.println("3. YOU");
		System.out.println("4. 보물섬");
		System.out.println("======================================");
		System.out.println("9. 전단계로 이동");
		System.out.println("--------------------------------------");
		num3 = Integer.parseInt(sc.nextLine());

		if (num3 == 9) {
			System.out.println(tm);
		}

	}

	public static void main(String[] args) {

		int num4 = (int)(Math.random() * 4) +1;
			
			System.out.println("--------------------------------------");
			System.out.println("Music is My Life ~ ♬");
			System.out.println("당신의 오늘을 위한 Choice 시간!!");
			System.out.println("--------------------------------------");
			System.out.println(" 당신의 Today's Somg 은???? ");
			System.out.println();
			System.out.println("======================================");
			System.out.println("9. 전단계로 이동");
			System.out.println("--------------------------------------");
			
		
	}

}