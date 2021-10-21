import java.util.*;
public class Inflearn_9 {
    static int solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            //if (Character.isDigit(x)) answer += x;
            if (x >= 48 && x <= 57) // 아스키코드 48~57은 영문자임
                answer = answer * 10 + (x-48);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.next();
        System.out.println(solution(str));
    }
}