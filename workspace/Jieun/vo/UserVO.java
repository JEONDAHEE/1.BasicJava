package vo;

public class UserVO {
	//회원 : 회원 아이디(PK), 비밀번호, 이름(닉네임), 전화번호, 생년월일
	
	private String user_id;
	private String user_pwd;
	private String user_name;
	private String user_phone;
	private String user_reg1;
	
	
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_reg1() {
		return user_reg1;
	}
	public void setUser_reg1(String user_reg1) {
		this.user_reg1 = user_reg1;
	}
	
