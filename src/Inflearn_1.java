import java.util.Scanner;

public class Inflearn_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        str = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == Character.toLowerCase(ch)) count++;
        }
        System.out.println(count);
    }
}


