package vo;

public class MenuCategoryVo {//pk�߰� ����
	
	private int no;//pk
	private String menu;//ī�װ� �̸�
	private boolean state = true;//��� ����
	

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	
}
