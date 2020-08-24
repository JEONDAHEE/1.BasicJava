package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 ����ǥ���� : ���ڿ��� ������ �˻��ϴ� ǥ����
		 //ȸ�������Ҷ� �ַ� ���ȴ�.
		 
		 ^		�޹��ڷ� ����
		 $		�չ��ڷ� ����
		 .		������ ����(�ٹٲ� ����)
		 *		�չ��ڰ� 0�� �̻�
		 +		�չ��ڰ� 1�� �̻�
		 ?		�չ��ڰ� ���ų� 1��
		 []		������ �����̳� ����([a-z]:a���� z���� , [^a-z] :a���� z�� �ƴѰ�)
		 {}		�չ����� ���� ({2} : 2��, {2,4} : 2�� �̻� 4�� ����)
		 ()		�׷�ȭ(�Ѱ��� ����ó�� �ν�)
		 |		OR ����
		 \s		����, ��, �ٹٲ�
		 \S		����, ��, �ٹٲ��� �ƴ� ����
		 \w		���ĺ��̳� ����
		 \W		���ĺ��̳� ���ڰ� �ƴ� ����
		 \d		����
		 \D		���ڰ� �ƴ� ����
		 (?i)	�ڹ����� ��ҹ��� ���� ����
		 \		����ǥ���Ŀ��� ���Ǵ� Ư������ ǥ��
		 */

		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+"; +�� �Ѱ� �̻�
//		String regex = "\\w*";//���ĺ��̳����ڰ� 0���̻��ΰ�?
		String regex = ".*";//�ٹٲ��� �ƴ϶�� ��� ���ڰ� ���
		
		
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches());
		
		//���̵�, ��ȭ��ȣ, �̸��� �ּ��� ��ȿ���� �˻��ϴ� ���� ǥ������ ����� �ּ���.
		
		
		
		String id = "hp5192";
		String hp = "010-6406-0773";
		String mail = "hp5192@naver.com";
		
		
		
		String id_regex = "[a-z0-9]{5,20}";
		String hp_regex = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		String mail_regex = "[a-z0-9]{5,20}@[a-z]{1,7}\\.[a-z]{3}";
//		String mail_regex = "[a-z0-9_-]{5,20}@[a-zA-z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		
		Pattern p1 = Pattern.compile(id_regex);
		Matcher m1 = p1.matcher(id);
		System.out.println(m1.matches());
		
		Pattern p2 = Pattern.compile(hp_regex);
		Matcher m2 = p2.matcher(hp);
		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile(mail_regex);
		Matcher m3 = p3.matcher(mail);
		System.out.println(m1.matches());
		
	}

}











