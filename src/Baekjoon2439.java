import java.util.Scanner;

public class Baekjoon2439 {
    /*static int solution (int num) {
        int answer = 0;
       return answer;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.printf(" ");
            }
            for (int d = 1; d <= i; d++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
