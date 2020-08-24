package data;

import java.util.ArrayList;

import vo.ReviewVO;
import vo.UserVO;

public class Database {
	
	
private static Database instance;
	
	private Database(){}
	
	public static Database getInstance() {
		if(instance == null){
			instance = new Database();
			
		}
		return instance;

	}
	
	public ArrayList<ReviewVO> tb_review = new ArrayList<>();
	
	{
		ReviewVO review = new ReviewVO();
		review.setReview_number(0);
		review.setReview_grade("¡Ú¡Ú¡Ú¡Ù¡Ù");
		review.setReview_content("Âü Àç¹Õ¾î¿ä");
		tb_review.add(review);
	}
	
	
}
