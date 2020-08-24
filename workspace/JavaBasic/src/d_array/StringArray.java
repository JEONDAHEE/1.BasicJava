package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		String s = new String("ABCD"); // ������ Ÿ���� �ʱ�ȭ �ϴ� ���
		String str = "ABCD"; // String�� Ư���� �����ϰ� �ʱ�ȭ ����
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		/*
		 <<String�� �ֿ� �޼���>>
		 - equals()	  : ���ڿ��� ������ ������ Ȯ���Ѵ�.
		 - length()	  : ���ڿ��� ���̸� ��ȯ�Ѵ�.
		 - charAt()	  : ���ڿ����� �ش� ��ġ�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		 - substring(): ���ڿ����� �ش� ������ �ִ� ���ڿ��� ��ȯ�Ѵ�.//��ȣ�ȿ� �ε��� ��ȣ �ΰ��� �־ ���
		 - indexOf()  : ���ڿ� ���� Ư�� ���ڿ��� �ε����� ��ȯ�Ѵ�.
		 - replace()  : ���ڿ� ���� Ư�� ���ڿ��� ���ϴ� ���ڿ��� ������ ��ȯ�Ѵ�.
		 */
		
		for(int i = 0; i <str.length(); i++){
			System.out.println(str.charAt(i));
		}
		
		String revStr = ""; // str�� �Ųٷ� ���� ����
		//�ڿ������� �ѱ��ھ� �����ͼ� ���ο� ������ ���Ѵ�.
		//ABCD 
		for(int i = str.length()-1; i >= 0 ;i--){
			revStr += str.charAt(i);
			//revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		
		
		//substring()
		str = "0123456789";
		String sub1 = str.substring(3);// 3�� �ε������� �߶� ��ȯ�Ѵ�.
		System.out.println(sub1);
		String sub2 = str.substring(5,8); // 5�� �ε������� 8���ε��� ������ �߶� ��ȯ�Ѵ�. 5 <= sub2 < 8
		System.out.println(sub2);
		
		//indexOf()
		str = "ġŲ ���� ��â ����";
		int idx = str.indexOf("��â"); // ��â�� ���� �ε����� ��ȯ�Ѵ�.
		System.out.println(idx);
		
		idx = str.indexOf("¥���");
		System.out.println(idx); //�ش�Ǵ� ���ڿ��� ���� ��� -1�� ��ȯ�Ѵ�.
		
		String[] menus = {
				"ġŲ 18000��",
				"���� 9900��",
				"��â 24000��",
				"���� 8000��"
		};
		for(int i = 0; i < menus.length; i++){
			String name = menus[i].substring(0, menus[i].indexOf(" "));
			System.out.println(name);
		}
		
		//���ݸ� �и����� int�� ������ ����ּ���.
		for(int i = 0; i < menus.length; i++){
			int price = Integer.parseInt(menus[i].substring(menus[i].indexOf(" ") + 1, menus[i].indexOf("��")));
			System.out.println(price);
		}
		
		//replace()
		str = "123456789";
		str = str.replace("3", "¦");
		System.out.println(str);
		str = str.replace("6", "¦");
		System.out.println(str);
		str = str.replace("9", "¦");
		System.out.println(str);
		
		String pn = "010-2363-3647";
		//������(-)�� �����ؼ� ��� ���ּ���
		pn = pn.replace("-", "");
		System.out.println(pn);
		
		/*//���ڸ� �Է¹޾� �Է� ���� ���ڿ� 3�ڸ� ���� �޸�(,)�� �ٿ� ������ּ���
		//1234567 -> 1,234,567
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String a = sc.nextLine();
		
		String a1 = ""; 
		
		int count = 0;
		
		for(int i = a.length()-1; i >= 0 ; i--){
			a1 = a.charAt(i) + a1;  
			count++;
			if(count % 3 == 0 && count != a.length()){
				a1 = "," + a1;
			}
		}
		System.out.println(a1);*/
		
		//�ڹ������� �������� [4-9] ���ڸ��� ���� ���ϴ� ��� �ڵ�
		String str1 = "12345";
		int sum = 0; 
		
		for(int i =0; i < str1.length(); i++){
			sum += str1.charAt(i) - '0';
			
		}System.out.println("sum = " + sum);
		
		
		//[4-13] �־��� ���ڿ���  �������� �Ǻ��ϴ� ���α׷�
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i =0; i <value.length(); i++){
			ch = value.charAt(i);
			
			if(!(ch >= '0' && ch <= '9')){
				isNumber = false;
				break;
			}		
		}
		if(isNumber){
			System.out.println(value + "�� �����Դϴ�.");
		}else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
