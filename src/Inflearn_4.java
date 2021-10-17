import java.util.Scanner;

public class Inflearn_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        String[] result = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next(); // str[0]str[1]str[2]에 문자열이 저장된 상태
        }
        for (int i = 0; i < num; i++) {
            result[i] = new StringBuffer(str[i]).reverse().toString();
        }
        for (String s : result) {
            System.out.println(s);
        }

    }
}
