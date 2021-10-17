import java.util.Scanner;
public class Baekjoon5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            result += num;
        }
        System.out.println(result);

    }
}

