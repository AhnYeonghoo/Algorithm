import java.util.Scanner;

public class Baekjoon2753 {
    static int solution (int num) {
        int answer ;
        if ((num % 4 == 0&&num % 100 != 0) || (num % 400 == 0)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));





    }
}
