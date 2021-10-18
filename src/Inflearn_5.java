import java.util.*;
public class Inflearn_5 {
    static String solution (String str) {
        String answer = "";
        char[] s = str.toCharArray();
            int lt = 0; //문자열의 첫 인덱스
            int rt = str.length() - 1; //문자열의 마지막 인덱스
            while (lt < rt) {
                if (!(Character.isAlphabetic(s[lt])))
                    lt++;
                else if (!(Character.isAlphabetic(s[rt])))
                    rt--;
                else {
                    char temp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = temp;
                    rt--;
                    lt++;
                }
                answer = String.valueOf(s);
            }
        return answer;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.next();
        System.out.println(solution(str));

    }

}
