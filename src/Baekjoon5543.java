import java.io.*;
import java.util.*;
import java.lang.*;
public class Baekjoon5543 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sang = sc.nextInt();
        int jung = sc.nextInt();
        int ha = sc.nextInt();
        int col = sc.nextInt();
        int sa = sc.nextInt();
        int result1 = Math.min(sang + col - 50, sang + sa - 50);
        int result2 = Math.min(jung + col - 50, jung + sa - 50);
        int result3 = Math.min(ha + col - 50, ha + sa - 50);
        int result;
        if (result1 < result2 && result1 < result3) result = result1;
        else if (result2 < result1 && result2 < result3) result = result2;
        else result = result3;
        System.out.println(result);

    }
}
