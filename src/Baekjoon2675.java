package Baekjoon;
import java.util.Scanner;

class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int R;
        String S;

        for(int i=0;i<T;i++){
            R = sc.nextInt();
            S = sc.next();
            for(int x=0, cnt=S.length();x<cnt;x++){
                for(int y=0;y<R;y++){
                    System.out.print(S.charAt(x));
                }
            }
            System.out.println();
        }
    }
}