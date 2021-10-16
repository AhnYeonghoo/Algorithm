import java.util.*;

public class Inflearn_3 {
    static String Solution (String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;
        String[] sArr = str.split(" "); //받은 문자열을 split 이용해 스페이스바 단위로 잘라서 문자열 배열에 저장
        for (String s : sArr) { //문자열이지만 배열이기 때문에 향상for문 사용 가능
            int length = s.length();
            if (length > min) {
                min = length;
                answer = s;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Solution(str));
    }
}