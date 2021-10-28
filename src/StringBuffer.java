import java.util.ArrayList;
import java.util.Scanner;

public class StringBuffer {
    public Object append;

    public StringBuffer(String abc) {
    }

    static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] c =x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while(lt<rt) { //문자열 끝과 끝 교환
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                rt--;
                lt++;
            }
            String temp = String.valueOf(c);
            answer.add(temp);

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (String x : solution(num, str)) {
            System.out.println(x);
        }
    }
}
