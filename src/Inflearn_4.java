import java.util.Scanner;


public class Inflearn_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        StringBuilder[] result = new StringBuilder[n];
        StringBuilder[] sb = new StringBuilder[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
            sb[i] = new StringBuilder(str[i]);
            result[i] = sb[i].reverse();
            System.out.println(result[i]);
        }



    }
}