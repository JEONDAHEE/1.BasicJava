package c_statement;

import java.util.Scanner;

public class SimliTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	      
	      System.out.println("���� ���� ������ ?");
	      System.out.println(" ���� YES or N ! ");
	      System.out.println(" �� �׽�Ʈ�� �����Ϸ��� ���͸� �����ּ��� �� ");
	      String start = s.nextLine();
	       System.out.println(start);
	       
	       String b = null;
	       
	       String ta = "A Ÿ�� : ���ο� ���� �ŷڰ��� ���, �������ִ� �� � ������ ���� �� �� �ϴ� Ÿ�� !";
	       String tb = "B Ÿ�� : ������ �ϴ� �͵�, �޴� �͵� ���� �� �����ο� ���� �� �� �ϴ� Ÿ�� !";
	       String tc = "C Ÿ�� : �̰��� �Ǹ��ΰ� ����ΰ� ~ �� ģ������ ����� ���� �� �� �ϴ� Ÿ�� !";
	       String td = "D Ÿ�� : ������ �����ְ�, ������ �����ִ� �� �� ���ִ� ���� �� �� �ϴ� Ÿ�� !";
	       
	       System.out.println(" ���� �ݻ����. (�ݹ� ����� ������) ������ Y, Ʋ���� N�� �Է� �� �ּ���.");
	       String a1 = s.nextLine();
	       
	       if(a1.equals("Y")){ //�ݻ���� y�� ���
	          b = "������ �� �����ٴϴ� Ÿ���̴�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	          System.out.println(b);
	          String a1_y = s.nextLine();
	          if(a1_y.equals("Y")){ //�����ٴϴ� y�� ���
	             b = "���� ǥ���� ������ ���̴�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	             System.out.println(b);
	             String a1_y_y = s.nextLine();
	             if(a1_y_y.equals("Y")){//����ǥ�� y�� ���
	                b = "�̼�ģ���� ������ �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_y_y_y = s.nextLine();
	                if(a1_y_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                   b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_y_y_y = s.nextLine();
	                   if(a1_y_y_y_y.equals("Y")){//������ y�� ���
	                      b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_y_y_y_y.equals("N")){//������ n�� ���
	                      b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }else if(a1_y_y_y.equals("N")){//�̼�ģ�� n�� ���
	                   b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                   System.out.println(b);
	                   System.out.println(tb);
	                }
	             }else if(a1_y_y.equals("N")){//����ǥ�� n�� ���
	                b = "Ȱ������ ����Ʈ�� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_y_y_n_y = s.nextLine();
	                if(a1_y_y_n_y.equals("Y")){//Ȱ���� y�� ���
	                   b = "�̼�ģ���� ������ �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_y_n_y_y = s.nextLine();
	                   if(a1_y_y_n_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                      b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                      System.out.println(b);
	                      String a1_y_y_n_y_y_y = s.nextLine();
	                      if(a1_y_y_n_y_y_y.equals("Y")){//������ y�� ���
	                         b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_y_n_y_y_y.equals("N")){//������ n�� ���
	                         b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_y_y_n_y_y.equals("N")){//�̼�ģ�� n�� ���
	                      b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_y_y_n_y.equals("N")){//Ȱ���� n�� ���
	                   b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_y_n_y_n_y = s.nextLine();
	                   if(a1_y_y_n_y_n_y.equals("Y")){//������ y�� ���
	                      b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_y_y_n_y_n_y.equals("N")){//������ n�� ���
	                      b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }
	             }
	          }else if(a1_y.equals("N")){//�����ٴϴ� n�� ���
	             b = "����Ʈ �ڽ��� �̸� ¥�°� ���ϴ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	             System.out.println(b);
	             String a1_y_n_y = s.nextLine();
	             if(a1_y_n_y.equals("Y")){//�ڽ� y�� ���
	                b = "Ȱ������ ����Ʈ�� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_y_n_y_y = s.nextLine();
	                if(a1_y_n_y_y.equals("Y")){//Ȱ���� y�� ���
	                   b = "�̼�ģ���� ���� �� �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_n_y_y_y = s.nextLine();
	                   if(a1_y_n_y_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                      b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                      System.out.println(b);
	                      String a1_y_n_y_y_y_y = s.nextLine();
	                      if(a1_y_n_y_y_y_y.equals("Y")){//������ y�� ���
	                         b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_n_y_y_y_y.equals("N")){//������ n�� ���
	                         b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_y_n_y_y_y.equals("N")){//�̼�ģ�� n�� ���
	                      b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_y_n_y_y.equals("N")){//Ȱ���� n�� ���
	                   b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_n_y_y_n_y = s.nextLine();
	                   if(a1_y_n_y_y_n_y.equals("Y")){//������ y�� ���
	                      b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_y_n_y_y_n_y.equals("N")){//������ n�� ���
	                      b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }
	             }else if(a1_y_n_y.equals("N")){//�ڽ� n�� ���
	                b = "����ǥ���� ������ ���̴�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_y_n_y_n_y = s.nextLine();
	                if(a1_y_n_y_n_y.equals("Y")){//����ǥ�� y�� ���
	                   b = "�̼�ģ���� ���� �� �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_n_y_n_y_y = s.nextLine();
	                   if(a1_y_n_y_n_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                      b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                      System.out.println(b);
	                      String a1_y_n_y_n_y_y_y = s.nextLine();
	                      if(a1_y_n_y_n_y_y_y.equals("Y")){//������ y�� ���
	                         b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_n_y_n_y_y_y.equals("N")){//������ n�� ���
	                         b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_y_n_y_n_y_y.equals("N")){//�̼�ģ�� n�� ���
	                      b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_y_n_y_n_y.equals("N")){//����ǥ�� n�� ���
	                   b = "Ȱ������ ����Ʈ�� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_y_n_y_n_y_n_y = s.nextLine();
	                   if(a1_y_n_y_n_y_n_y.equals("Y")){//Ȱ���� y�� ���
	                      b = "�̼�ģ���� ������ �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                      System.out.println(b);
	                      String a1_y_n_y_n_y_n_y_y = s.nextLine();
	                      if(a1_y_n_y_n_y_n_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                         b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                         System.out.println(b);
	                         String a1_y_n_y_n_y_n_y_y_y = s.nextLine();
	                         if(a1_y_n_y_n_y_n_y_y_y.equals("Y")){//������ y�� ���
	                            b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                            System.out.println(b);
	                            System.out.println(td);
	                         }else if(a1_y_n_y_n_y_n_y_y_y.equals("N")){//������ n�� ���
	                            b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                            System.out.println(b);
	                            System.out.println(tc);
	                         }
	                      }else if(a1_y_n_y_n_y_n_y_y.equals("N")){//�̼�ģ�� n�� ���
	                         b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(tb);
	                      }
	                   }else if(a1_y_n_y_n_y_n_y.equals("N")){//Ȱ���� n�� ���
	                      b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                      System.out.println(b);
	                      String a1_y_n_y_n_y_n_y_n_y = s.nextLine();
	                      if(a1_y_n_y_n_y_n_y_n_y.equals("Y")){//������ y�� ���
	                         b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_n_y_n_y_n_y_n_y.equals("N")){//������ n�� ���
	                         b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }
	                }
	             }
	          }
	       }else if(a1.equals("N")){//�ݻ���� n�ϰ��
	          b = "�����⺹�� ũ�� �ʴ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	          System.out.println(b);
	          String a1_n_y = s.nextLine();
	          if(a1_n_y.equals("Y")){//�����⺹ y�� ���
	             b = "������ ��� �ϰ� ��ٸ��� ���̴�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	             System.out.println(b);
	             String a1_n_y_y = s.nextLine();
	             if(a1_n_y_y.equals("Y")){//���� y�� ���
	                b = "����� ���� Ÿ���� �� A Ÿ�� �� �̱��� !";
	               System.out.println(b);
	               System.out.println(ta);
	             }else if(a1_n_y_y.equals("N")){//���� n�� ���
	                b = "�̼�ģ���� ������ �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_n_y_y_n_y = s.nextLine();
	                if(a1_n_y_y_n_y.equals("Y")){//�̼�ģ�� y�� ���
	                   b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_n_y_y_n_y_y = s.nextLine();
	                   if(a1_n_y_y_n_y_y.equals("Y")){//������ y�� ���
	                      b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_n_y_y_n_y_y.equals("N")){//������ n�� ���
	                      b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }else if(a1_n_y_y_n_y.equals("N")){//�̼�ģ�� n�� ���
	                   b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                   System.out.println(b);
	                   System.out.println(tb);
	                }
	             }
	          }else if(a1_n_y.equals("N")){//�����⺹ n�� ���
	             b = "����ǥ���� ������ ���̴�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	             System.out.println(b);
	             String a1_n_y_n_y = s.nextLine();
	             if(a1_n_y_n_y.equals("Y")){//����ǥ�� y�� ���
	                b = "�̼�ģ���� ������ �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_n_y_n_y_y = s.nextLine();
	                if(a1_n_y_n_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                   b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_n_y_n_y_y_y = s.nextLine();
	                   if(a1_n_y_n_y_y_y.equals("Y")){//������ y�� ���
	                      b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_n_y_n_y_y_y.equals("N")){//������ n�� ���
	                      b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }else if(a1_n_y_n_y_y.equals("N")){//�̼�ģ�� n�� ���
	                   b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                   System.out.println(b);
	                   System.out.println(tb);
	                }
	             }else if(a1_n_y_n_y.equals("N")){//����ǥ�� n�� ���
	                b = "Ȱ������ ����Ʈ�� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                System.out.println(b);
	                String a1_n_y_n_y_n_y = s.nextLine();
	                if(a1_n_y_n_y_n_y.equals("Y")){//Ȱ���� y�� ���
	                   b = "�̼�ģ���� ���� �� �� ����. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_n_y_n_y_n_y_y = s.nextLine();
	                   if(a1_n_y_n_y_n_y_y.equals("Y")){//�̼�ģ�� y�� ���
	                      b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                      System.out.println(b);
	                      String a1_n_y_n_y_n_y_y_y = s.nextLine();
	                      if(a1_n_y_n_y_n_y_y_y.equals("Y")){//������ y�� ���
	                         b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_n_y_n_y_n_y_y_y.equals("N")){//������ n�� ���
	                         b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_n_y_n_y_n_y_y.equals("N")){//�̼�ģ�� n�� ���
	                      b = "����� ���� Ÿ���� �� B Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_n_y_n_y_n_y.equals("N")){//Ȱ���� n�� ���
	                   b = "�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�. ������ Y, Ʋ���� N�� �Է� �� �ּ���.";
	                   System.out.println(b);
	                   String a1_n_y_n_y_n_y_n_y = s.nextLine();
	                   if(a1_n_y_n_y_n_y_n_y.equals("Y")){//������ y�� ���
	                      b = "����� ���� Ÿ���� �� D Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_n_y_n_y_n_y_n_y.equals("N")){//������ n�� ���
	                      b = "����� ���� Ÿ���� �� C Ÿ�� �� �̱��� !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }
	             }
	          }
	       }
		}
	}