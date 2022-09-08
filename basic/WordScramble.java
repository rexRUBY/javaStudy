package javaStudy;

import java.util.*;

class WordScramble {
      public static void main(String[] args) {
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
            String answer;
            String sWord;
            Scanner sc = new Scanner(System.in);
            String usr;
            while(true) {
            	answer = getAnswer(strArr);
            	sWord = getScrambledWord(answer);
            	while(true) {
            		System.out.print("Question: "+sWord+"\nyour answer is?: ");
            		usr = sc.next();
            		if(usr.equals("q"))
            			System.exit(0);
            		else if(usr.equals(answer)) {
            			System.out.println("정답입니다.");
            			break;
            		}
            		else
            			System.out.println(usr+"는 정답이 아닙니다. 다시 시도해 보세요.");
            	}
            }
        }

      public static String getAnswer(String[] strArr) {
            int idx = (int)(Math.random()*strArr.length);
            return strArr[idx];
      }
     
      public static String getScrambledWord(String str) {
            char[] chArr = str.toCharArray();

            for(int i=0;i < str.length();i++) {
                  int idx = (int)(Math.random()*str.length());
                  char tmp = chArr[i];
                  chArr[i] = chArr[idx];
                  chArr[idx] = tmp;
            }
            return new String(chArr);
      }
}

//Question :IWVE
//Your answer is :ievw
//ievw은/는 정답이 아닙니다. 다시 시도해보세요.
//Question :IWVE
//Your answer is :view
//정답입니다.
//
//Question :HOEP
//Your answer is :hope
//정답입니다.
//
//Question :GNCAEH
//Your answer is :change
//정답입니다.
//
//Question :HECNAG
//Your answer is :q
