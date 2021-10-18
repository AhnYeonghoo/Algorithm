import java.util.*;
public class Baekjoon6749 {
    static int solution (int n1, int n2) {
        int answer = 0;
        int temp = n2 - n1;
        answer = n2 + temp;
        return answer;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();
        int n2 = Sc.nextInt();
        System.out.println(solution(n1,n2));


    }
}