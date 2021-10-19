import java.util.Scanner;

public class Baekjoon10039 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int result[] = new int[5];
        for (int i = 0; i < result.length; i++) {
            result[i] = Sc.nextInt();
        }
        int sum = 0;
        for (int s : result) {
            if (s < 40) {
                s = 40;
                sum += s;
            } else {
                sum += s;
            }
        }
        System.out.println(sum / 5);
    }
}