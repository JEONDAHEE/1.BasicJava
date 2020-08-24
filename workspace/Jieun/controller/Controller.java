  package controller;

import java.util.Scanner;

import service.UserService;

public class Controller {
	
	public static void main(String[] args) {
		
		new Controller().start();
		
	}
	UserService userService =  UserService.getInstance();

	void start() {
		Scanner s = new Scanner(System.in);
		
		int view;
		
		do{
			System.out.println("-----------------------------");
			System.out.println("1. 리뷰작성하기");
			System.out.println("2. 리뷰보기");
			System.out.println("3. My Review");
			System.out.println("0. 나가기");
			System.out.println("------------------------------");
			System.out.println("선택하실  번호 입력>");
			
			view = Integer.parseInt(s.nextLine());
			
			switch (view){
			case 1: //리뷰작성하기
				userService.wright();
				break;
			case 2: //리뷰보기
				userService.view();
				break;
			case 3 : //my review
				userService.MyReview();
				break;
			case 0 : //나가기
				System.out.println("메인화면으로 돌아갑니다.");
				break;
			}
			
						
		}while (view !=0);
	}
}
