import java.util.*;
public class Baekjoon4504 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        while(true) {
            int arr = Sc.nextInt();
            if(arr == 0) break;
            if (arr % n != 0) {
                System.out.println(arr+" is NOT a multiple of "+ n+".");
            } else {
                System.out.println(arr+" is a multiple of "+n+".");
            }
        }
    }
}
