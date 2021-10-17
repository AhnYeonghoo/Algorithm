import java.util.*;
public class Baekjoon5554 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        int num3 = Sc.nextInt();
        int num4 = Sc.nextInt();
        System.out.println((num1+num2+num3+num4)/60);
        System.out.println((num1+num2+num3+num4)%60);
    }
}