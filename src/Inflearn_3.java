import java.util.*;

public class Inflearn_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String result = "";
        int min = Integer.MIN_VALUE;
        for(String s : arr) {
            int length = s.length(); // 2 2 4 2 5
            if (length > min) {
                min = length;
                result = s;
            }
        }
        System.out.println(result);
    }
}