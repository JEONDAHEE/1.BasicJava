package vo;

public class ReviewVO {
	//리뷰 : 리뷰번호(PK), 회원아이디(FK), 평점, 리뷰 내용, 날짜, 영화번호(FK)
	
	private int review_number;
	private int review_grade;
	private String review_content;
	private int review_date;
	
	public int getReview_number() {
		return review_number;
	}
	public void setReview_number(int review_number) {
		this.review_number = review_number;
	}
	public int getReview_grade() {
		return review_grade;
	}
	public void setReview_grade(int review_grade) {
		this.review_grade = review_grade;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public int getReview_date() {
		return review_date;
	}
	public void setReview_date(int review_date) {
		this.review_date = review_date;
	}
	
	
	
	
	
}
