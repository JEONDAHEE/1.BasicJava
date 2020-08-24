package d_array;

import java.util.Arrays;

public class Score {

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
		
		
		String[] students =  {"����ö", "����", "������", "���ؿ�", "��ö��", "������", "���Ƹ�", "�ڱ��", "�ڼ���", "������", "������", 
							  "��ȿ��","���ֿ�", "������", "������", "������", "�Ӽ���", "������", "������", "����ȯ", "ȫ����"};
		String[] subjects = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
		double[][] scores = new double[students.length][subjects.length + 3];
		
		//������ �Է��Ѵ�.
		for(int i = 0; i < scores.length; i++){
			scores[i][0] = 1;
			for(int j = 0; j < subjects.length; j++){
				scores[i][j + 1] = (int)(Math.random() * 51) + 50;
			}
		}
		
		//������ ����� ���Ѵ�.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < subjects.length; j++){
				scores[i][scores[i].length - 2] += scores[i][j + 1]; //����
			}
			scores[i][scores[i].length - 1]
					= (int)((double)scores[i][scores[i].length - 2]
							/ subjects.length * 100 + 0.5) / 100.0; //���
		}
		
		//������ ���Ѵ�.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores.length; j++){
				if(scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]){
					scores[i][0]++;
				}
			}
		}
		
		//���������� �����Ѵ�.
		for(int i = 0; i < scores.length - 1; i++){
			for(int j = i + 1; j < scores.length; j++){
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
		//����Ѵ�.
		System.out.print("����\t�̸�");
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t����\t���");
		for(int i = 0; i < scores.length; i++){
			System.out.print((int)scores[i][0] + "\t" + students[i]);
			for(int j = 1; j < scores[i].length; j++){
				if(j == scores[i].length - 1){
					System.out.print("\t" + scores[i][j]);
				}else{
					System.out.print("\t" + (int)scores[i][j]);
				}
			}
			System.out.println();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*int[][] score = new int[21][10];
		int[] sum = new int[score.length];
		double[] av = new double[score.length];
		int[] rank = new int[score.length];
		String[] name = {"����ö", "����", "������", "���ؿ�", "��ö��", "������", "���Ƹ�", "�ڱ��", "�ڼ���", "������", "������", "��ȿ��",
						"���ֿ�", "������", "������", "������", "�Ӽ���", "������", "������", "����ȯ", "ȫ����"};
		
		
		System.out.println("���� \t �̸� \t java \t Oracle  HTML \t CSS \t JQuery JSP \t ���� \t ���");
		//���� ��������, ��, ��� ����
		for(int i = 0; i < score.length; i++){
			score[i][0] = 0;
			for(int j = 2; j < score[i].length-2; j++){
				score[i][j] = (int)(Math.random() * 51) + 50;
				sum[i] += score[i][j];
				score[i][8] = sum[i];
				av[i] += (double)(sum[i] / score.length-2);
				score[i][9] = (int)av[i];
				
			}
		}
		//���� ���ϱ�
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
			
		for(int i = 0; i < score.length ; i++){
			for(int j = 0; j < score.length ; j++){
				if(sum[i] < sum[j]){
					rank[i]++;
				}
			}
			score[i][0] = rank[i];
			}
		
		//���������� �����ϱ�.
		for(int i =0; i<score.length;i++){
			for(int j = i+1; j < score.length; j++ ){
				if(rank[i] > rank[j]){
					double[] temp = score[i];
					score[];
					score[i] = score[j];
					score[j] = temp;
					
					String tempname = name[i];
					name[i] = name[j];
					name[j] = tempname;
				}
			}
		}
		
		

		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		//�̸� �ֱ�
//		for(int i = 0; i < score.length; i++){
//				score[i][1] = name[i];
//		}
//		
 */		