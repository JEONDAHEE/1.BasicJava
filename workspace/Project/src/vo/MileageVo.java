package vo;

import java.util.Date;

public class MileageVo {
	private int no;//pk
	private String id;//�������̵�
	private int miliage;//���ϸ���
	private String  contents;//���� 
	private Date date;//��¥
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMiliage() {
		return miliage;
	}
	public void setMiliage(int miliage) {
		this.miliage = miliage;
	}
	
}
