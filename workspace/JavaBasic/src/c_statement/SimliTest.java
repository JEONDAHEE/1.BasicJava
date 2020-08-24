package c_statement;

import java.util.Scanner;

public class SimliTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	      
	      System.out.println("나의 연애 유형은 ?");
	      System.out.println(" 말해 YES or N ! ");
	      System.out.println(" ♥ 테스트를 시작하려면 엔터를 눌러주세요 ♥ ");
	      String start = s.nextLine();
	       System.out.println(start);
	       
	       String b = null;
	       
	       String ta = "A 타입 : 서로에 대한 신뢰감이 깊고, 존중해주는 ♥ 어른 스러운 연애 ♥ 를 하는 타입 !";
	       String tb = "B 타입 : 구속을 하는 것도, 받는 것도 싫은 ♥ 자유로운 연애 ♥ 를 하는 타입 !";
	       String tc = "C 타입 : 이것은 의리인가 사랑인가 ~ ♥ 친구같이 편안한 연애 ♥ 를 하는 타입 !";
	       String td = "D 타입 : 무조건 잘해주고, 무조건 맞춰주는 ♥ 다 퍼주는 연애 ♥ 를 하는 타입 !";
	       
	       System.out.println(" 나는 금사빠다. (금방 사랑에 빠진다) 맞으면 Y, 틀리면 N을 입력 해 주세요.");
	       String a1 = s.nextLine();
	       
	       if(a1.equals("Y")){ //금사빠가 y일 경우
	          b = "연애할 때 끌려다니는 타입이다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	          System.out.println(b);
	          String a1_y = s.nextLine();
	          if(a1_y.equals("Y")){ //끌려다니는 y일 경우
	             b = "감정 표현에 솔직한 편이다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	             System.out.println(b);
	             String a1_y_y = s.nextLine();
	             if(a1_y_y.equals("Y")){//감정표현 y일 경우
	                b = "이성친구는 존재할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_y_y_y = s.nextLine();
	                if(a1_y_y_y.equals("Y")){//이성친구 y일 경우
	                   b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_y_y_y = s.nextLine();
	                   if(a1_y_y_y_y.equals("Y")){//섭섭함 y일 경우
	                      b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_y_y_y_y.equals("N")){//섭섭함 n일 경우
	                      b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }else if(a1_y_y_y.equals("N")){//이성친구 n일 경우
	                   b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                   System.out.println(b);
	                   System.out.println(tb);
	                }
	             }else if(a1_y_y.equals("N")){//감정표현 n일 경우
	                b = "활동적인 데이트가 좋다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_y_y_n_y = s.nextLine();
	                if(a1_y_y_n_y.equals("Y")){//활동적 y일 경우
	                   b = "이성친구는 존재할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_y_n_y_y = s.nextLine();
	                   if(a1_y_y_n_y_y.equals("Y")){//이성친구 y일 경우
	                      b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                      System.out.println(b);
	                      String a1_y_y_n_y_y_y = s.nextLine();
	                      if(a1_y_y_n_y_y_y.equals("Y")){//섭섭함 y일 경우
	                         b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_y_n_y_y_y.equals("N")){//섭섭함 n일 경우
	                         b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_y_y_n_y_y.equals("N")){//이성친구 n일 경우
	                      b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_y_y_n_y.equals("N")){//활동적 n일 경우
	                   b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_y_n_y_n_y = s.nextLine();
	                   if(a1_y_y_n_y_n_y.equals("Y")){//섭섭함 y일 경우
	                      b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_y_y_n_y_n_y.equals("N")){//섭섭함 n일 경우
	                      b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }
	             }
	          }else if(a1_y.equals("N")){//끌려다니는 n일 경우
	             b = "데이트 코스는 미리 짜는게 편하다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	             System.out.println(b);
	             String a1_y_n_y = s.nextLine();
	             if(a1_y_n_y.equals("Y")){//코스 y일 경우
	                b = "활동적인 데이트가 좋다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_y_n_y_y = s.nextLine();
	                if(a1_y_n_y_y.equals("Y")){//활동적 y일 경우
	                   b = "이성친구는 존재 할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_n_y_y_y = s.nextLine();
	                   if(a1_y_n_y_y_y.equals("Y")){//이성친구 y일 경우
	                      b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                      System.out.println(b);
	                      String a1_y_n_y_y_y_y = s.nextLine();
	                      if(a1_y_n_y_y_y_y.equals("Y")){//섭섭함 y일 경우
	                         b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_n_y_y_y_y.equals("N")){//섭섭함 n일 경우
	                         b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_y_n_y_y_y.equals("N")){//이성친구 n일 경우
	                      b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_y_n_y_y.equals("N")){//활동적 n일 경우
	                   b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_n_y_y_n_y = s.nextLine();
	                   if(a1_y_n_y_y_n_y.equals("Y")){//섭섭함 y일 경우
	                      b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_y_n_y_y_n_y.equals("N")){//섭섭함 n일 경우
	                      b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }
	             }else if(a1_y_n_y.equals("N")){//코스 n일 경우
	                b = "감정표현에 솔직한 편이다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_y_n_y_n_y = s.nextLine();
	                if(a1_y_n_y_n_y.equals("Y")){//감정표현 y일 경우
	                   b = "이성친구는 존재 할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_n_y_n_y_y = s.nextLine();
	                   if(a1_y_n_y_n_y_y.equals("Y")){//이성친구 y일 경우
	                      b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                      System.out.println(b);
	                      String a1_y_n_y_n_y_y_y = s.nextLine();
	                      if(a1_y_n_y_n_y_y_y.equals("Y")){//섭섭함 y일 경우
	                         b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_n_y_n_y_y_y.equals("N")){//섭섭함 n일 경우
	                         b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_y_n_y_n_y_y.equals("N")){//이성친구 n일 경우
	                      b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_y_n_y_n_y.equals("N")){//감정표현 n일 경우
	                   b = "활동적인 데이트가 좋다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_y_n_y_n_y_n_y = s.nextLine();
	                   if(a1_y_n_y_n_y_n_y.equals("Y")){//활동적 y일 경우
	                      b = "이성친구는 존재할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                      System.out.println(b);
	                      String a1_y_n_y_n_y_n_y_y = s.nextLine();
	                      if(a1_y_n_y_n_y_n_y_y.equals("Y")){//이성친구 y일 경우
	                         b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                         System.out.println(b);
	                         String a1_y_n_y_n_y_n_y_y_y = s.nextLine();
	                         if(a1_y_n_y_n_y_n_y_y_y.equals("Y")){//섭섭함 y일 경우
	                            b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                            System.out.println(b);
	                            System.out.println(td);
	                         }else if(a1_y_n_y_n_y_n_y_y_y.equals("N")){//섭섭함 n일 경우
	                            b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                            System.out.println(b);
	                            System.out.println(tc);
	                         }
	                      }else if(a1_y_n_y_n_y_n_y_y.equals("N")){//이성친구 n일 경우
	                         b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(tb);
	                      }
	                   }else if(a1_y_n_y_n_y_n_y.equals("N")){//활동적 n일 경우
	                      b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                      System.out.println(b);
	                      String a1_y_n_y_n_y_n_y_n_y = s.nextLine();
	                      if(a1_y_n_y_n_y_n_y_n_y.equals("Y")){//섭섭함 y일 경우
	                         b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_y_n_y_n_y_n_y_n_y.equals("N")){//섭섭함 n일 경우
	                         b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }
	                }
	             }
	          }
	       }else if(a1.equals("N")){//금사빠가 n일경우
	          b = "감정기복이 크지 않다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	          System.out.println(b);
	          String a1_n_y = s.nextLine();
	          if(a1_n_y.equals("Y")){//감정기복 y일 경우
	             b = "연락이 없어도 믿고 기다리는 편이다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	             System.out.println(b);
	             String a1_n_y_y = s.nextLine();
	             if(a1_n_y_y.equals("Y")){//연락 y일 경우
	                b = "당신의 연애 타입은 ♥ A 타입 ♥ 이군요 !";
	               System.out.println(b);
	               System.out.println(ta);
	             }else if(a1_n_y_y.equals("N")){//연락 n일 경우
	                b = "이성친구는 존재할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_n_y_y_n_y = s.nextLine();
	                if(a1_n_y_y_n_y.equals("Y")){//이성친구 y일 경우
	                   b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_n_y_y_n_y_y = s.nextLine();
	                   if(a1_n_y_y_n_y_y.equals("Y")){//섭섭함 y일 경우
	                      b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_n_y_y_n_y_y.equals("N")){//섭섭함 n일 경우
	                      b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }else if(a1_n_y_y_n_y.equals("N")){//이성친구 n일 경우
	                   b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                   System.out.println(b);
	                   System.out.println(tb);
	                }
	             }
	          }else if(a1_n_y.equals("N")){//감정기복 n일 경우
	             b = "감정표현에 솔직한 편이다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	             System.out.println(b);
	             String a1_n_y_n_y = s.nextLine();
	             if(a1_n_y_n_y.equals("Y")){//감정표현 y일 경우
	                b = "이성친구는 존재할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_n_y_n_y_y = s.nextLine();
	                if(a1_n_y_n_y_y.equals("Y")){//이성친구 y일 경우
	                   b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_n_y_n_y_y_y = s.nextLine();
	                   if(a1_n_y_n_y_y_y.equals("Y")){//섭섭함 y일 경우
	                      b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_n_y_n_y_y_y.equals("N")){//섭섭함 n일 경우
	                      b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }else if(a1_n_y_n_y_y.equals("N")){//이성친구 n일 경우
	                   b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                   System.out.println(b);
	                   System.out.println(tb);
	                }
	             }else if(a1_n_y_n_y.equals("N")){//감정표현 n일 경우
	                b = "활동적인 데이트가 좋다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                System.out.println(b);
	                String a1_n_y_n_y_n_y = s.nextLine();
	                if(a1_n_y_n_y_n_y.equals("Y")){//활동적 y일 경우
	                   b = "이성친구는 존재 할 수 없다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_n_y_n_y_n_y_y = s.nextLine();
	                   if(a1_n_y_n_y_n_y_y.equals("Y")){//이성친구 y일 경우
	                      b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                      System.out.println(b);
	                      String a1_n_y_n_y_n_y_y_y = s.nextLine();
	                      if(a1_n_y_n_y_n_y_y_y.equals("Y")){//섭섭함 y일 경우
	                         b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(td);
	                      }else if(a1_n_y_n_y_n_y_y_y.equals("N")){//섭섭함 n일 경우
	                         b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                         System.out.println(b);
	                         System.out.println(tc);
	                      }
	                   }else if(a1_n_y_n_y_n_y_y.equals("N")){//이성친구 n일 경우
	                      b = "당신의 연애 타입은 ♥ B 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tb);
	                   }
	                }else if(a1_n_y_n_y_n_y.equals("N")){//활동적 n일 경우
	                   b = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. 맞으면 Y, 틀리면 N을 입력 해 주세요.";
	                   System.out.println(b);
	                   String a1_n_y_n_y_n_y_n_y = s.nextLine();
	                   if(a1_n_y_n_y_n_y_n_y.equals("Y")){//섭섭함 y일 경우
	                      b = "당신의 연애 타입은 ♥ D 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(td);
	                   }else if(a1_n_y_n_y_n_y_n_y.equals("N")){//섭섭함 n일 경우
	                      b = "당신의 연애 타입은 ♥ C 타입 ♥ 이군요 !";
	                      System.out.println(b);
	                      System.out.println(tc);
	                   }
	                }
	             }
	          }
	       }
		}
	}