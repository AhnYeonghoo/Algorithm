import java.util.Scanner;
import java.util.*;
class Baekjoon2441 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // cococo
}