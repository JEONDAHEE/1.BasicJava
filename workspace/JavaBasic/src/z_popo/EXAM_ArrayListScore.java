package z_popo;

import java.util.ArrayList;
import java.util.HashMap;

public class EXAM_ArrayListScore {

	public static void main(String[] args) {
		/*
		 �츮�� ����� java, Oracle, HTML, CSS, JQuery, JSP ������ 50~100���� ���� �����ϰ�,
		 ���������� ����, �̸�, ���� ����, ����, ����� ����ϼ���
		 
		 ����		�̸�		java	Oracle	HTML	CSS		JQuery	JSP		����		���
		 1		ȫ�浿	80		90		100		90		70		60		500		80
		 2		ȫ�浿	80		90		100		90		70		60		500		80
		 3		ȫ�浿	80		90		100		90		70		60		500		80
		 4		ȫ�浿	80		90		100		90		70		60		500		80
		 5		ȫ�浿	80		90		100		90		70		60		500		80
		 
		 String[] students =  {"����ö", "����", "������", "���ؿ�", "��ö��", "������", "���Ƹ�", "�ڱ��", "�ڼ���", "������", "������", 
							  "��ȿ��","���ֿ�", "������", "������", "������", "�Ӽ���", "������", "������", "����ȯ", "ȫ����"};
		 */

		//���� �̸� �����
		ArrayList<String> key = new ArrayList<String>();
		key.add("java");
		key.add("Oracle");
		key.add("HTML");
		key.add("CSS");
		key.add("JQuery");
		key.add("JSP");
		
		
		//�̸��迭 �����
		ArrayList<String> name = new ArrayList<String>();
		name.add("����ö");
		name.add("����");
		name.add("������");
		name.add("���ؿ�");
		name.add("��ö��");
		name.add("������");
		name.add("���Ƹ�");
		name.add("�ڱ��");
		name.add("�ڼ���");
		name.add("������");
		name.add("������");
		name.add("��ȿ��");
		name.add("���ֿ�");
		name.add("������");
		name.add("������");
		name.add("������");
		name.add("�Ӽ���");
		name.add("������");
		name.add("������");
		name.add("����ȯ");
		name.add("ȫ����");
		
		//���� ���ϱ�(�̸����� ��)
		ArrayList<ArrayList<Double>> score  = new ArrayList<>();
		
		for(int i = 0; i < name.size(); i++){
			ArrayList<Double> list = new ArrayList<>(); //�� ��
			double sum = 0.0;
			list.add(1.0); // ���� �ֱ�(��)
			for(int j = 0; j < key.size(); j++){ //Ű������ = �������
				list.add((int)(Math.random() * 51) + 50.0);
				sum += list.get(j + 1);  // ����  //sum�� �Ѱ��� ���� ���ϱ� (0��°�� ������ ��� �����ϱ� 1��°����)
			}
			list.add(sum); // ���������� �� index�� ���
			list.add((int)((sum/key.size()) * 10 + 0.5)/10.0);
			score.add(list);
		}
		
		//�������ϱ�
		for(int i = 0; i < score.size(); i++){
			double d = 1;
			for(int j = 0; j < score.size(); j++){
				if(score.get(i).get(score.get(i).size()-2) < score.get(j).get(score.get(i).size()-2)){
					d++;
				}
			}
			score.get(i).set(0,d);
		}
		
		//���� ����
		for(int i = 0; i < score.size() - 1; i++){
			ArrayList<Double> temp = new ArrayList<>(); // �ӽ�����
			for(int j = i + 1; j < score.size(); j++){
				if(score.get(i).get(score.get(i).size()-2) < score.get(j).get(score.get(i).size()-2) ){
					temp = score.get(i); 			// temp�� i�� �ְ�
					score.set(i,score.get(j)); 		// i�ڸ��� j�� �ְ�
					score.set(j,temp); 			// j�ڸ��� temp�� ������ �ڸ��ٲ� �ϼ� !
					
					//�̸�����
					String n = name.get(i);
					name.set(i, name.get(j));
					name.set(j, n);
					
				}
			}
		}
		//����,�̸� ���� ���
		System.out.print("����\t�̸�\t");
		//�����̸� ���
		for(int i = 0; i < key.size(); i++){
			System.out.print(key.get(i) + "\t");
		}
		System.out.println("����" + "\t" + "���"); //����, ��� ���� ���

		//���
		for(int i = 0; i < name.size(); i++){
			System.out.print(score.get(i).get(0) + "\t"); //�̸����
			System.out.print(name.get(i) + "\t");
			for(int j = 1; j < score.get(i).size(); j++ ){
				System.out.print(score.get(i).get(j) + "\t" );
			}
			System.out.println();
		}


	}

}
