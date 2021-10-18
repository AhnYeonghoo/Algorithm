import java.util.*;
public class Baekjoon8370 {
    static int solution (int n1, int k1, int n2, int k2) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n1; i++) {
            sum += k1;
        }
        for (int i = 0; i < n2; i++) {
            sum += k2;
        }
        answer = sum;

        return answer;

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();
        int k1 = Sc.nextInt();
        int n2 = Sc.nextInt();
        int k2 = Sc.nextInt();
        System.out.println(solution(n1,k1,n2,k2));



    }
}