package dao;

import vo.ReviewVO;
import data.Database;

public class UserDao {
	private static UserDao instance;

	private UserDao(){}
	
	public static UserDao getInstance() {
		if(instance == null){
			instance= new UserDao();
			
		}
		return instance;

	}
	
	 Database database = Database.getInstance();
	 
	 
	 
	 public void insertReview(ReviewVO review){
		 database.tb_review.add(review);
	 }
}
