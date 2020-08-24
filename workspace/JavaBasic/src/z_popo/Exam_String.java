package z_popo;

public class Exam_String {

	public static void main(String[] args) {
/*
		// 1.
		//Stirng(String s)
		//�־��� ���ڿ�(s)�� ���� String�ν��Ͻ��� �����Ѵ�.
		String s = new String("Hello");
		// ��� : s = "Hello"
*/
/*		
		// 2.
		//String(char[] value)
		//�־��� ���ڿ�(value)�� ���� String�ν��Ͻ��� �����Ѵ�.
		char[] c = {'H','e','l','l','o'};
		String s = new String(c);
		// ��� : s = "Hello"
		
*/
/*		
		// 3.
		//String(StringBuffer buf)
		//StringBuffer�� �ν��Ͻ��� ���� �ִ� ���ڿ��� ���� ������ String�ν��Ͻ��� �����Ѵ�.
		StringBuffer sb = new StringBuffer("Hello");
		String s = new String(sb);
		// ��� :  s = "Hello" 

*/
/*		
		// 4.
		//char charAt(int index)
		//������ ��ġ(index)�� �ִ� ���ڸ� �˷��ش�.(index�� 0���� ����)
		String s = "Hello";
		String n = "0123456";
		char c = s.charAt(1);
		char c2 = n.charAt(1);
		// ��� : c = 'e'
		//		c2 = '1'
*/
/*		
		// 5.
		//int compareTo(String str)
		//���ڿ�(str)�� ���� ������ ���Ѵ�. ������, 0�� , ���������������̸� ������, ���ĸ� ����� ��ȯ�Ѵ�.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		// ��� : i = 0
		//		i2 = -1
		//		i3 = 1
		
*/	
/*		
		// 6.
		//String concat(String str)
		//���ڿ�(str)�� �ڿ� �����δ�.
		String s = "Hello";
		String s2 = s.concat(" world");
		// ��� : s2 = "Hello world"
		
*/		
/*		
		// 7.
		//boolean contains(SharSequence s)
		//������ ���ڿ�(s)�� ���ԵǾ����� �˻��Ѵ�.
		String s = "abcdefg";
		boolean b = s.contains("b");
		// ��� : s2 = true
		
*/		
/*		
		// 8.
		//boolean endsWith(String suffix)
		//������ ���ڿ�(suffix)�� �������� �˻��Ѵ�
		String file = "Hello.txt";
		boolean b = file.endsWith("txt");
		// ��� : b = true
*/	
/*		// 9.
		//boolean equals(Object obj)
		//�Ű������� ���� ���ڿ�(obj)�� String�ν��Ͻ��� ���ڿ��� ���Ѵ�. obj�� String�̾ƴϰų� ���ڿ��� �ٸ��� false�� ��ȯ�Ѵ�.
		String s = "Hello";
		boolean b = s.equals("HELLO");
		boolean b2 = s.equals("hello");
		// ��� : b = true
		//	    b2 = false
*/		
/*
		// 10.
		//boolean equalsIgnoreCase(String str)
		//���ڿ��� String�ν��Ͻ��� ���ڿ��� ��ҹ��� ���о��� ���Ѵ�.
		String s = "Hello";
		boolean b = s.equalsIgnoreCase("HELLO");
		boolean b2 = s.equalsIgnoreCase("heLLo");
		// ��� : b = true
		//		b2 = true
*/
/*		
		// 11.
		//int indexOf(int ch)
		//�־��� ����(ch)�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�. �� ã���� -1�� ��ȯ�Ѵ�..(index�� 0���� ����)
		String s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		// ��� : idx1 = 4
		//		idx2 = -1
*/
/*		
		// 12. 
		//int indexOf(int ch, int pos)
		//�־��� ����(ch)�� ���ڿ��� �����ϴ��� ������ ��ġ(pos)���� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�. �� ã���� -1�� ��ȯ�Ѵ�.(index�� 0���� ����)
		String s = "Hello";
		int idx1 = s.indexOf('e', 0);
		int idx2 = s.indexOf('e', 2);
		// ��� : idx1 = 1
		//		idx2 = -1
		
*/
/*		
		// 13.
		//int indexOf(String str)
		//�־��� ���ڿ��� �����ϴ��� Ȯ���Ͽ� �� ��ġ(index)�� �˷��ش�. ������ -1�� ��ȯ�Ѵ�.(index�� 0���� ����)
		String s = "ABCDEFG";
		int idx = s.indexOf("CD");
		// ��� : idx = 2
		
*/	
/*		
		// 14.
		//String intern()
		//���ڿ��� ���Ǯ(constant pool)�� ����Ѵ�. �̹� ���Ǯ�� ���� ������ ���ڿ��� ������� �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�.
		String s = new String("abc");
		String s2 = new String("abc");
		boolean b = (s == s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern() == s2.intern());
		// ��� : b = false
		//		b2 = true
		//		b3 = true
*/
		
		// 15. 
		//int lastIndexOf(int ch)
		//������ ���� �Ǵ� �����ڵ带 ���ڿ��� ������ ���������� ã�Ƽ� ��ġ(index)�� �˷��ش�.�� ã����-1�� ��ȯ�Ѵ�.
	}

}
