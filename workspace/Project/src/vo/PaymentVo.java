package vo;

import java.util.Date;

public class PaymentVo {
	//��¥, ���ϸ��� ����, ȸ��  : 
	//���̺� , ���� 
	// ���� : ������ȣ, ȸ��ID, ������, �����ݾ�, ��û����, ���ϸ������� ,���̺��ȣ
	
	
	private int no;//������ȣ (pk)
	private int paymentNo;//������ȣ
	private Date date;//������
	private String id;//ȸ��Id
	private String requests;//��û����
	private int milieage;//���ϸ���
	private int tableNo;//���̺� ��ȣ


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRequests() {
		return requests;
	}
	public void setRequests(String requests) {
		this.requests = requests;
	}
	public int getMilieage() {
		return milieage;
	}
	public void setMilieage(int milieage) {
		this.milieage = milieage;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	
	
}
