import java.util.*;
public class Baekjoon11382 {
    static long solution (long n1, long n2, long n3) {
        long answer = 0;
        answer = (long)(n1 + n2 + n3);
        return answer;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        long n1 = Sc.nextLong();
        long n2 = Sc.nextLong();
        long n3 = Sc.nextLong();
        System.out.println(solution(n1,n2,n3));



    }
}