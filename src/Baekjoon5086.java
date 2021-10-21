import java.util.*;
public class Baekjoon5086 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int first;
        int second;
        while(true) {
            first = Sc.nextInt();
            second = Sc.nextInt();
            if (first==0 && second == 0) break;
            else if (second % first == 0) {
                System.out.println("factor");
            }
            else if(first % second == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }

    }
}