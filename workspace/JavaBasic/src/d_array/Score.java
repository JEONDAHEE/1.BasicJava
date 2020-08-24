package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 우리반 모두의 java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤 생성하고,
		 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력하세요
		 
		 석차		이름		java	Oracle	HTML	CSS		JQuery	JSP		총점		평균
		 1		홍길동	80		90		100		90		70		60		500		80
		 2		홍길동	80		90		100		90		70		60		500		80
		 3		홍길동	80		90		100		90		70		60		500		80
		 4		홍길동	80		90		100		90		70		60		500		80
		 5		홍길동	80		90		100		90		70		60		500		80
		 
		 String[] students =  {"강현철", "김우경", "김종완", "김준우", "김철희", "김태유", "남아름", "박기완", "박선정", "박정민", "박혜진", 
							  "송효진","심주영", "연지은", "이제경", "이혁진", "임수진", "전다희", "정영수", "정주환", "홍종욱"};
		 */
		
		
		String[] students =  {"강현철", "김우경", "김종완", "김준우", "김철희", "김태유", "남아름", "박기완", "박선정", "박정민", "박혜진", 
							  "송효진","심주영", "연지은", "이제경", "이혁진", "임수진", "전다희", "정영수", "정주환", "홍종욱"};
		String[] subjects = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
		double[][] scores = new double[students.length][subjects.length + 3];
		
		//점수를 입력한다.
		for(int i = 0; i < scores.length; i++){
			scores[i][0] = 1;
			for(int j = 0; j < subjects.length; j++){
				scores[i][j + 1] = (int)(Math.random() * 51) + 50;
			}
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < subjects.length; j++){
				scores[i][scores[i].length - 2] += scores[i][j + 1]; //총점
			}
			scores[i][scores[i].length - 1]
					= (int)((double)scores[i][scores[i].length - 2]
							/ subjects.length * 100 + 0.5) / 100.0; //평균
		}
		
		//석차를 구한다.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores.length; j++){
				if(scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]){
					scores[i][0]++;
				}
			}
		}
		
		//석차순으로 정렬한다.
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
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t총점\t평균");
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
		String[] name = {"강현철", "김우경", "김종완", "김준우", "김철희", "김태유", "남아름", "박기완", "박선정", "박정민", "박혜진", "송효진",
						"심주영", "연지은", "이제경", "이혁진", "임수진", "전다희", "정영수", "정주환", "홍종욱"};
		
		
		System.out.println("석차 \t 이름 \t java \t Oracle  HTML \t CSS \t JQuery JSP \t 총점 \t 평균");
		//점수 랜덤생성, 합, 평균 생성
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
		//석차 구하기
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
		
		//석차순으로 정렬하기.
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
		//이름 넣기
//		for(int i = 0; i < score.length; i++){
//				score[i][1] = name[i];
//		}
//		
 */		