import java.io.*;
import java.util.*;
public class Baekjoon2752 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int result[] = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = Sc.nextInt();
        }
        Arrays.sort(result);
        for (int i = 0; i < 3; i++) {
            System.out.print(result[i] +" ");
        }

    }

}
