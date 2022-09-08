import java.util.*;

public class WordScramble {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);

        while (true){
            System.out.println("Question:"+question);
            System.out.print("Your Answer:");
            String user = sc.nextLine();
            if(user.equals("q"))
                System.exit(0);
            else if(answer.equals(user)){
                System.out.println("You win");
                break;
            }
            else
                System.out.println("Try again");
        }
    }
    public static String getAnswer(String[] strArr) {
        int idx = (int)(Math.random()*strArr.length);
        return strArr[idx];
    }
    public static String getScrambledWord(String str) {
        String nStr = "";
        char [] chArr = str.toCharArray();
        for(int i=0; i<chArr.length; i++){
            int idx = (int)(Math.random()*chArr.length);
            char tmp = chArr[idx];
            chArr[idx] = chArr[i];
            chArr[i] = tmp;
        }
        return new String(chArr);
    }
}
