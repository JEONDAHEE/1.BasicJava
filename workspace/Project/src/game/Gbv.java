package game;

import java.util.Date;
import java.util.Scanner;

import vo.MileageVo;
import vo.UserVo;
import dao.MileageDao;

import data.Session;

public class Gbv {
	
private static Gbv instance;
	private Gbv() {
    	
    	
	}

	public static Gbv getInstance() {
		if (instance == null) {
			instance = new Gbv();
		}
		return instance;

	}
	int count = 0;
	int computer = 0;  //���� ���� ���� ��
	int user = 0;      //�Է� ���� ���� ��
	int coin = 0;      //�ݺ� Ƚ��
	int mileage  = 0;   //����
	String comStr=""; //���� ���� �� ��� :��ǻ��
	String userStr="";//���� ���� �� ��� :����
	String comStr1=""; //�� �� �� ��� :��ǻ��
	String userStr1="";//�� �� �� ��� :����
	String comStr2=""; //�� �� �� ���� ���� �� ��� :��ǻ��
	String userStr2="";//�� �� �� ���� ���� �� ��� :����
	Scanner sc = new Scanner(System.in);

  
   public void start(){ //���������� ����
	   Boolean check = false; 
        //���� ����
        System.out.println("===============GAME START================");
        System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
     do{
            //1~3�� ���� ����
             computer =(int)(Math.random()*3)+1;
            //����� �Է°�
             user = sc.nextInt();
            //��ǻ�� ��
            if(computer == 1) {
                comStr="����";
                comStr1="�";               
            }else if(computer == 2) {
                comStr="����";
                comStr1="����";
            }else if(computer == 3) {
                comStr="��";
                comStr1="����";
            }else {
                comStr="�ý��� ����";
            }
            //������ ��
            if(user == 1) {
                userStr="����";
               
            }else if(user == 2) {
                userStr="����";
               
            }else if(user == 3) {
                userStr="��";
                
            }else {
                userStr="�հ��� ����";
            }
            System.out.println("[����] "+userStr+"  =VS= "+comStr+" [��ǻ��]");
            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                	
                	System.out.print("[����...");
                	try {
						Thread.sleep(700);      //������ 0.7��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                	System.out.print("����...");
                	try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                	System.out.println("��..!]");
                	try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                    System.out.println("[�¸�]");     //�̰����� : ���� ����ٿ� (� �) 
                    if(userStr.equals("����")){
                    	userStr1="��";
                    }else if(userStr.equals("����")){
                    	userStr1="��";
                    	
                    }else if(userStr.equals("��")){
                    	userStr1="��";
                    }
                    check= !check;
                    start2();//win
                    
                    
                }else if(computer == user) {
                	System.out.print("[����...");
                	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.print("����...");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.println("��..!]");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                    System.out.println("[���º�]");
                    System.out.println("=========================================");
                    System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
                  
                    
                }else {
                	System.out.print("[����...");
                	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.print("����...");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.println("��..!]");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                	
                    System.out.println("[�й�]");   //������ : ���� ������� (� �) 
                    if(comStr.equals("����")){
                    	comStr1="��";
                    }else if(comStr.equals("����")){
                    	comStr1="��"; 	
                    }else if(comStr.equals("��")){
                    	comStr1="��";
                    }
                    check= !check;
                    start3();//lose
                }
            }   
     }while(!check);
            
     System.out.println("================GAME END=================");
     return;
 
        }
   void start2(){// ����� ��
	   System.out.println("�ڡڡڡڡڡڡڡڡڡڡ�[��]����� START�ڡڡڡڡڡڡڡڡڡڡڡ�");
       System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
      
           //1~3�� ���� ����
            computer =(int)(Math.random()*3)+1;
           //����� �Է°�
            user = sc.nextInt();
           //��ǻ�� ��
           if(computer == 1) {
               comStr="����";
               comStr2="��";
           }else if(computer == 2) {
               comStr="����";
               comStr2="��";
           }else if(computer == 3) {
               comStr="��";
               comStr2="��";
           }else {
               comStr="�ý��� ����";
           }
           //������ ��
           if(user == 1) {
               userStr="����";
               userStr2="��";
           }else if(user == 2) {
               userStr="����";
               userStr2="��";
           }else if(user == 3) {
               userStr="��";
               userStr2="��";
           }else {
               userStr="�հ��� ����";
           }
           System.out.println("[����] "+userStr+"  =VS= "+comStr+" [��ǻ��]");
           if(user >= 1 && user <= 3) {
               if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
            	   
            	   System.out.print("["+userStr1+"��...");
               	try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
               	System.out.print(userStr1+"��...");
               	try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
               	System.out.println(userStr2+"!!!]");
               	try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            	   System.out.println("[�¸�]");
                   System.out.println("[���������� �ٽ�]");
                   if(userStr2.equals("��")){
                   	userStr1="��";
                   }else if(userStr2.equals("��")){
                   	userStr1="��";                   	
                   }else if(userStr2.equals("��")){
                   	userStr1="��";
                   }
                   start2();//win �ѹ���
                   
               }else if(computer == user) {
            	   
            	   System.out.print("["+userStr1+"��...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.print(userStr1+"��...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.println(userStr2+"!!!]");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                   System.out.println("[�¸� ���� ���ϸ���]");
                   start4();//���� ���ϸ���
                   
               }else {
            	   System.out.print("["+userStr1+"��...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.print(userStr1+"��...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.println(userStr2+"!!!]");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                   System.out.println("[�й�]");
                   System.out.println("[���������� �ٽ�]");
                   if(comStr2.equals("��")){
                   	comStr1="��";
                   }else if(comStr2.equals("��")){
                   	comStr1="��"; 	
                   }else if(comStr2.equals("��")){
                   	comStr1="��";
                   }
                   start3();//lose
               }
           }   
           
           

   }
   void start3(){// ����� ��
	   System.out.println("�ڡڡڡڡڡڡڡڡڡڡ�[��]����� START�ڡڡڡڡڡڡڡڡڡڡڡ�");
       System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
       
    	   
       
           //1~3�� ���� ����
            computer =(int)(Math.random()*3)+1;
           //����� �Է°�
            user = sc.nextInt();
           //��ǻ�� ��
           if(computer == 1) {
               comStr="����";
               comStr2="��";
           }else if(computer == 2) {
               comStr="����";
               comStr2="��";
           }else if(computer == 3) {
               comStr="��";
               comStr2="��";
           }else {
               comStr="�ý��� ����";
           }
           //������ ��
           if(user == 1) {
               userStr="����";
               userStr2="��";
           }else if(user == 2) {
               userStr="����";
               userStr2="��";
           }else if(user == 3) {
               userStr="��";
               userStr2="��";
           }else {
               userStr="�հ��� ����";
           }
           System.out.println("[����] "+userStr+"  =VS= "+comStr+" [��ǻ��]");
           if(user >= 1 && user <= 3) {
               if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
            	  
            	   System.out.print("["+comStr1+"��...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.print(comStr1+"��...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.println(comStr2+"!!!]");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
            	   System.out.println("[�¸�]");
                   System.out.println("[���������� �ٽ�]");
                   if(userStr2.equals("��")){
                      	userStr1="��";
                      }else if(userStr2.equals("��")){
                      	userStr1="��";                   	
                      }else if(userStr2.equals("��")){
                      	userStr1="��";
                      }

                   start2();//win �ѹ���
                   
               }else if(computer == user) {
            	   System.out.print("["+comStr1+"��...");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                 	System.out.print(comStr1+"��...");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                 	System.out.println(comStr2+"!!!]");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                   System.out.println("[�й� �⺻ ���ϸ���]");
                   start5();//�й� 1 ���ϸ���
                   
               }else {
            	   System.out.print("["+comStr1+"��...");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                 	System.out.print(comStr1+"��...");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                 	System.out.println(comStr2+"!!!]");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                   System.out.println("[�й�]");
                   System.out.println("[���������� �ٽ�]");
                   if(comStr2.equals("��")){
                      	comStr1="��";
                      }else if(comStr2.equals("��")){
                      	comStr1="��"; 	
                      }else if(comStr2.equals("��")){
                      	comStr1="��";
                      }
                   start3();//lose
               }
           }   
           
           

   }
	   
   void start4(){ //���� ���ϸ��� ���� ����
	
	    MileageDao mileagedao = MileageDao.getInstance();
	    UserVo user = Session.loginUser;
	    String userKey = user.getId();
	    MileageVo mileageInfo = new MileageVo();
		   
		Date date =new Date();
		computer = (int) (Math.random() * 15) + 5;
		mileage += computer;
		mileageInfo.setId(Session.loginUser.getId());
	    mileageInfo.setDate(date);//���� ���� �ð� �Է�
	    mileageInfo.setId(userKey);//���� ���̵�
	    mileageInfo.setMiliage(computer);//ȹ�渶�ϸ���
	    mileageInfo.setContents("����� �¸�");
	    mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ� 
	    	
		System.out.println("ȹ�� ���ϸ��� : "+computer);
		System.out.println("���� ���ϸ��� : " + mileage);
	
   }
   
   void start5(){ //�й� 1���ϸ��� ���� ����
	 
	   MileageDao mileagedao = MileageDao.getInstance();
	   UserVo user = Session.loginUser;
	   String userKey = user.getId();
	   MileageVo mileageInfo = new MileageVo();
	   
	   Date date =new Date();
	   computer=1;
	   mileage +=computer;
		mileageInfo.setId(Session.loginUser.getId());
		mileageInfo.setDate(date);// ���� ���� �ð� �Է�
		mileageInfo.setId(userKey);// ���� ���̵�
		mileageInfo.setMiliage(1);// ȹ�渶�ϸ���
		mileageInfo.setContents("����� �й�");
		mileagedao.insertMileage(mileageInfo); // ���ϸ��� ���� �־��ֱ�
	    	
	   System.out.println("ȹ�� ���ϸ��� : "+computer);
	   System.out.println("���� ���ϸ��� : "+mileage);
	  
   }
 }

