import java.util.Scanner;
public class Inflearn_7 {
    static String solution(String str) {
        String s = "YES";
        String temp = new StringBuilder(str).reverse().toString();
        if (!(str.equalsIgnoreCase(temp))) return "NO";
        return s;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.next();
        System.out.println(solution(str));
    }

}
