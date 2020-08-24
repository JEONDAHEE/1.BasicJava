package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.ReviewVO;
import data.Database;

public class UserService {
	
	private static UserService instance;
	
	private UserService(){}
	

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}
			
	//리뷰작성하기
	public void wright(){
		
		ReviewVO review = new ReviewVO(); //ReviewVO에 담을 review를 만들어줌
				
			Scanner s = new Scanner(System.in);
			
			System.out.println("작성하실 영화를 선택해주세요.");
			System.out.println("------------------------------------");
			System.out.println("1.겨울왕국2\n2.해치지않아\n3.스타워즈\n4.나쁜녀석들");
			System.out.println("------------------------------------");

			int movie = Integer.parseInt(s.nextLine());

			if (movie == 1) {
				System.out.println(" 영화제목 : 겨울왕국 ");
				moviewinter();
			} else if (movie == 2) {
				System.out.println("영화제목 :해치지 않아");
				moviewinter();
			} else if (movie == 3) {
				System.out.println("영화제목 : 스타워즈");
				moviewinter();
			} else if (movie == 4) {
				System.out.println("영화제목 : 나쁜녀석들");
				moviewinter();
			}

	
		}
	
  void moviewinter(){
		ReviewVO review = new ReviewVO(); //ReviewVO에 담을 review를 만들어줌

		Scanner sc = new Scanner(System.in);

		System.out.println("평점을 선택해주세요.");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. ★☆☆☆☆  2. ★★☆☆☆  3. ★★★☆☆  4. ★★★★☆   5.★★★★★ ");
		System.out.println("--------------------------------------------------------------");

		int sc1 = sc.nextInt();

		switch (sc1) {
		case 1:
			System.out.println("★☆☆☆☆ ");
			review.setReview_grade(sc1);//ReviewVO의 setReview에 담을거
			break;
		case 2:
			System.out.println("★★☆☆☆");
			review.setReview_grade(sc1);//ReviewVO의 setReview에 담을거
			break;
		case 3:
			System.out.println("★★★☆☆");
			review.setReview_grade(sc1);//ReviewVO의 setReview에 담을거
			break;
		case 4:
			System.out.println("★★★★☆");
			review.setReview_grade(sc1);//ReviewVO의 setReview에 담을거
			break;
		case 5:
			System.out.println("★★★★★");
			review.setReview_grade(sc1);//ReviewVO의 setReview에 담을거
			break;
		}
		
		Scanner wright = new Scanner(System.in);
			System.out.println("리뷰 내용을 작성해주세요.");
			String userWright = wright.nextLine();
			System.out.println("내용:"+userWright);
			review.setReview_content(userWright);
//			review.setReview_date(new date("yyyy-mm-dd"));
		
	}
  
	
	//리뷰보기 - 영화전체 리뷰리스트 작성
	public void view(){
		
		ArrayList<ReviewVO> userList;
		//출력
		System.out.println("------------------------");
		System.out.println("작성자\t영화제목\t평점\t내용\t작성날짜");
		System.out.println("------------------------");
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			ReviewVO user = Database.getInstance().tb_review.get(i);
			System.out.println(i+1+"\t"+user.getReview_content()+"\t"+user.getReview_grade());
		}
		System.out.println("------------------------");
	
		
		
		//리뷰리스트가 보여지고 다음 선택
      
		Scanner choice =  new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("1.리뷰선택화면  0.시스템종료 ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
		System.out.println("나의 선택 >>>"+userChoice);
		
	}
	
	//my review
	public void MyReview(){
		
		Scanner choice =  new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("1.리뷰삭제 2.리뷰수정 3.리뷰선택화면  0.시스템종료 ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
		
		switch(userChoice){
		case 1 ://리뷰삭제
			System.out.println("리뷰가 삭제되었습니다.");
			break;
		case 2 ://리뷰수정
			//수정-->리뷰작성 페이지로 이동
			break;
		case 3 ://리뷰선택화면
			//리뷰작성하기로 넘어가기
			break;
		}while(userChoice != 3);

		
	}



	

}
