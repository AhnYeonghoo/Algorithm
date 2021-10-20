import java.util.*;

public class Inflearn_6 {
    static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);

        }
        return answer;
    }

        public static void main (String[] args){
            Scanner Sc = new Scanner(System.in);
            String string = Sc.next();
            System.out.print(solution(string));
    }
}

