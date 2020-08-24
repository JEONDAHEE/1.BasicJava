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
	int computer = 0;  //·»´ı °¡À§ ¹ÙÀ§ º¸
	int user = 0;      //ÀÔ·Â °¡À§ ¹ÙÀ§ º¸
	int coin = 0;      //¹İº¹ È½¼ö
	int mileage  = 0;   //Á¡¼ö
	String comStr=""; //°¡À§ ¹ÙÀ§ º¸ Ãâ·Â :ÄÄÇ»ÅÍ
	String userStr="";//°¡À§ ¹ÙÀ§ º¸ Ãâ·Â :À¯Àú
	String comStr1=""; //¹¬ Âî ºü Ãâ·Â :ÄÄÇ»ÅÍ
	String userStr1="";//¹¬ Âî ºü Ãâ·Â :À¯Àú
	String comStr2=""; //¹¬ Âî ºü °¡À§ ¹ÙÀ§ º¸ Ãâ·Â :ÄÄÇ»ÅÍ
	String userStr2="";//¹¬ Âî ºü °¡À§ ¹ÙÀ§ º¸ Ãâ·Â :À¯Àú
	Scanner sc = new Scanner(System.in);

  
   public void start(){ //°¡À§¹ÙÀ§º¸ ½ÃÀÛ
	   Boolean check = false; 
        //°ÔÀÓ ½ÃÀÛ
        System.out.println("===============GAME START================");
        System.out.println("¾î¶²°É ³»½Ã°Ú½À´Ï±î? °¡À§[1] ¹ÙÀ§[2] º¸[3]");
     do{
            //1~3ÀÇ ·£´ı ¼ıÀÚ
             computer =(int)(Math.random()*3)+1;
            //»ç¿ëÀÚ ÀÔ·Â°ª
             user = sc.nextInt();
            //ÄÄÇ»ÅÍ °ª
            if(computer == 1) {
                comStr="°¡À§";
                comStr1="Âî¿¡";               
            }else if(computer == 2) {
                comStr="¹ÙÀ§";
                comStr1="¹¬¿¡";
            }else if(computer == 3) {
                comStr="º¸";
                comStr1="ºü¿¡";
            }else {
                comStr="½Ã½ºÅÛ ¿À·ù";
            }
            //À¯ÀúÀÇ °ª
            if(user == 1) {
                userStr="°¡À§";
               
            }else if(user == 2) {
                userStr="¹ÙÀ§";
               
            }else if(user == 3) {
                userStr="º¸";
                
            }else {
                userStr="¼Õ°¡¶ô ¿À·ù";
            }
            System.out.println("[À¯Àú] "+userStr+"  =VS= "+comStr+" [ÄÄÇ»ÅÍ]");
            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                	
                	System.out.print("[°¡À§...");
                	try {
						Thread.sleep(700);      //µô·¹ÀÌ 0.7ÃÊ
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                	System.out.print("¹ÙÀ§...");
                	try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                	System.out.println("º¸..!]");
                	try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                    System.out.println("[½Â¸®]");     //ÀÌ°åÀ»¶§ : ´ÙÀ½ ¹¬Âî¹Ù¿¡ (Âî¿¡ Âî¿¡) 
                    if(userStr.equals("°¡À§")){
                    	userStr1="Âî";
                    }else if(userStr.equals("¹ÙÀ§")){
                    	userStr1="¹¬";
                    	
                    }else if(userStr.equals("º¸")){
                    	userStr1="ºü";
                    }
                    check= !check;
                    start2();//win
                    
                    
                }else if(computer == user) {
                	System.out.print("[°¡À§...");
                	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.print("¹ÙÀ§...");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.println("º¸..!]");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                    System.out.println("[¹«½ÂºÎ]");
                    System.out.println("=========================================");
                    System.out.println("¾î¶²°É ³»½Ã°Ú½À´Ï±î? °¡À§[1] ¹ÙÀ§[2] º¸[3]");
                  
                    
                }else {
                	System.out.print("[°¡À§...");
                	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.print("¹ÙÀ§...");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                   	System.out.println("º¸..!]");
                   	try {
    					Thread.sleep(700);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
                	
                    System.out.println("[ÆĞ¹è]");   //Á³À»¶§ : ´ÙÀ½ ¹¬Âîºü¿¡ (Âî¿¡ Âî¿¡) 
                    if(comStr.equals("°¡À§")){
                    	comStr1="Âî";
                    }else if(comStr.equals("¹ÙÀ§")){
                    	comStr1="¹¬"; 	
                    }else if(comStr.equals("º¸")){
                    	comStr1="ºü";
                    }
                    check= !check;
                    start3();//lose
                }
            }   
     }while(!check);
            
     System.out.println("================GAME END=================");
     return;
 
        }
   void start2(){// ¹¬Âîºü ½Â
	   System.out.println("¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú[½Â]¹¬Âîºü START¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú");
       System.out.println("¾î¶²°É ³»½Ã°Ú½À´Ï±î? °¡À§[1] ¹ÙÀ§[2] º¸[3]");
      
           //1~3ÀÇ ·£´ı ¼ıÀÚ
            computer =(int)(Math.random()*3)+1;
           //»ç¿ëÀÚ ÀÔ·Â°ª
            user = sc.nextInt();
           //ÄÄÇ»ÅÍ °ª
           if(computer == 1) {
               comStr="°¡À§";
               comStr2="Âî";
           }else if(computer == 2) {
               comStr="¹ÙÀ§";
               comStr2="¹¬";
           }else if(computer == 3) {
               comStr="º¸";
               comStr2="ºü";
           }else {
               comStr="½Ã½ºÅÛ ¿À·ù";
           }
           //À¯ÀúÀÇ °ª
           if(user == 1) {
               userStr="°¡À§";
               userStr2="Âî";
           }else if(user == 2) {
               userStr="¹ÙÀ§";
               userStr2="¹¬";
           }else if(user == 3) {
               userStr="º¸";
               userStr2="ºü";
           }else {
               userStr="¼Õ°¡¶ô ¿À·ù";
           }
           System.out.println("[À¯Àú] "+userStr+"  =VS= "+comStr+" [ÄÄÇ»ÅÍ]");
           if(user >= 1 && user <= 3) {
               if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
            	   
            	   System.out.print("["+userStr1+"¿¡...");
               	try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
               	System.out.print(userStr1+"¿¡...");
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
            	   System.out.println("[½Â¸®]");
                   System.out.println("[°¡À§¹ÙÀ§º¸ ´Ù½Ã]");
                   if(userStr2.equals("Âî")){
                   	userStr1="Âî";
                   }else if(userStr2.equals("¹¬")){
                   	userStr1="¹¬";                   	
                   }else if(userStr2.equals("ºü")){
                   	userStr1="ºü";
                   }
                   start2();//win ÇÑ¹ø´õ
                   
               }else if(computer == user) {
            	   
            	   System.out.print("["+userStr1+"¿¡...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.print(userStr1+"¿¡...");
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
                   System.out.println("[½Â¸® ·£´ı ¸¶ÀÏ¸®Áö]");
                   start4();//·»´ı ¸¶ÀÏ¸®Áö
                   
               }else {
            	   System.out.print("["+userStr1+"¿¡...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.print(userStr1+"¿¡...");
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
                   System.out.println("[ÆĞ¹è]");
                   System.out.println("[°¡À§¹ÙÀ§º¸ ´Ù½Ã]");
                   if(comStr2.equals("Âî")){
                   	comStr1="Âî";
                   }else if(comStr2.equals("¹¬")){
                   	comStr1="¹¬"; 	
                   }else if(comStr2.equals("ºü")){
                   	comStr1="ºü";
                   }
                   start3();//lose
               }
           }   
           
           

   }
   void start3(){// ¹¬Âîºü ÆĞ
	   System.out.println("¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú[ÆĞ]¹¬Âîºü START¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú");
       System.out.println("¾î¶²°É ³»½Ã°Ú½À´Ï±î? °¡À§[1] ¹ÙÀ§[2] º¸[3]");
       
    	   
       
           //1~3ÀÇ ·£´ı ¼ıÀÚ
            computer =(int)(Math.random()*3)+1;
           //»ç¿ëÀÚ ÀÔ·Â°ª
            user = sc.nextInt();
           //ÄÄÇ»ÅÍ °ª
           if(computer == 1) {
               comStr="°¡À§";
               comStr2="Âî";
           }else if(computer == 2) {
               comStr="¹ÙÀ§";
               comStr2="¹¬";
           }else if(computer == 3) {
               comStr="º¸";
               comStr2="ºü";
           }else {
               comStr="½Ã½ºÅÛ ¿À·ù";
           }
           //À¯ÀúÀÇ °ª
           if(user == 1) {
               userStr="°¡À§";
               userStr2="Âî";
           }else if(user == 2) {
               userStr="¹ÙÀ§";
               userStr2="¹¬";
           }else if(user == 3) {
               userStr="º¸";
               userStr2="ºü";
           }else {
               userStr="¼Õ°¡¶ô ¿À·ù";
           }
           System.out.println("[À¯Àú] "+userStr+"  =VS= "+comStr+" [ÄÄÇ»ÅÍ]");
           if(user >= 1 && user <= 3) {
               if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
            	  
            	   System.out.print("["+comStr1+"¿¡...");
                  	try {
   					Thread.sleep(700);
   				} catch (InterruptedException e) {
   					e.printStackTrace();
   				}
                  	System.out.print(comStr1+"¿¡...");
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
            	   System.out.println("[½Â¸®]");
                   System.out.println("[°¡À§¹ÙÀ§º¸ ´Ù½Ã]");
                   if(userStr2.equals("Âî")){
                      	userStr1="Âî";
                      }else if(userStr2.equals("¹¬")){
                      	userStr1="¹¬";                   	
                      }else if(userStr2.equals("ºü")){
                      	userStr1="ºü";
                      }

                   start2();//win ÇÑ¹ø´õ
                   
               }else if(computer == user) {
            	   System.out.print("["+comStr1+"¿¡...");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                 	System.out.print(comStr1+"¿¡...");
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
                   System.out.println("[ÆĞ¹è ±âº» ¸¶ÀÏ¸®Áö]");
                   start5();//ÆĞ¹è 1 ¸¶ÀÏ¸®Áö
                   
               }else {
            	   System.out.print("["+comStr1+"¿¡...");
                 	try {
  					Thread.sleep(700);
  				} catch (InterruptedException e) {
  					e.printStackTrace();
  				}
                 	System.out.print(comStr1+"¿¡...");
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
                   System.out.println("[ÆĞ¹è]");
                   System.out.println("[°¡À§¹ÙÀ§º¸ ´Ù½Ã]");
                   if(comStr2.equals("Âî")){
                      	comStr1="Âî";
                      }else if(comStr2.equals("¹¬")){
                      	comStr1="¹¬"; 	
                      }else if(comStr2.equals("ºü")){
                      	comStr1="ºü";
                      }
                   start3();//lose
               }
           }   
           
           

   }
	   
   void start4(){ //·»´ı ¸¶ÀÏ¸®Áö Àû¸³ Àû¸³
	
	    MileageDao mileagedao = MileageDao.getInstance();
	    UserVo user = Session.loginUser;
	    String userKey = user.getId();
	    MileageVo mileageInfo = new MileageVo();
		   
		Date date =new Date();
		computer = (int) (Math.random() * 15) + 5;
		mileage += computer;
		mileageInfo.setId(Session.loginUser.getId());
	    mileageInfo.setDate(date);//°ÔÀÓ Á¾·á ½Ã°£ ÀÔ·Â
	    mileageInfo.setId(userKey);//À¯Àú ¾ÆÀÌµğ
	    mileageInfo.setMiliage(computer);//È¹µæ¸¶ÀÏ¸®Áö
	    mileageInfo.setContents("¹¬Âîºü ½Â¸®");
	    mileagedao.insertMileage(mileageInfo); // ¸¶ÀÏ¸®Áö Á¤º¸ ³Ö¾îÁÖ±â 
	    	
		System.out.println("È¹µæ ¸¶ÀÏ¸®Áö : "+computer);
		System.out.println("´©Àû ¸¶ÀÏ¸®Áö : " + mileage);
	
   }
   
   void start5(){ //ÆĞ¹è 1¸¶ÀÏ¸®Áö Àû¸³ Àû¸³
	 
	   MileageDao mileagedao = MileageDao.getInstance();
	   UserVo user = Session.loginUser;
	   String userKey = user.getId();
	   MileageVo mileageInfo = new MileageVo();
	   
	   Date date =new Date();
	   computer=1;
	   mileage +=computer;
		mileageInfo.setId(Session.loginUser.getId());
		mileageInfo.setDate(date);// °ÔÀÓ Á¾·á ½Ã°£ ÀÔ·Â
		mileageInfo.setId(userKey);// À¯Àú ¾ÆÀÌµğ
		mileageInfo.setMiliage(1);// È¹µæ¸¶ÀÏ¸®Áö
		mileageInfo.setContents("¹¬Âîºü ÆĞ¹è");
		mileagedao.insertMileage(mileageInfo); // ¸¶ÀÏ¸®Áö Á¤º¸ ³Ö¾îÁÖ±â
	    	
	   System.out.println("È¹µæ ¸¶ÀÏ¸®Áö : "+computer);
	   System.out.println("´©Àû ¸¶ÀÏ¸®Áö : "+mileage);
	  
   }
 }

