import java.util.*;
public class Baekjoon10101 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int[] result = new int[3];
        int sum = 0;
        int a = 0, b = 1, c = 2;
        for (int i = 0; i < result.length; i++) {
            result[i] = Sc.nextInt();
            sum += result[i];
        }
        for (int i = 0; i < 1; i++) {
            if (result[i] ==60 && result[i+1] == 60 && result[i+2] == 60)
                System.out.println("Equilateral");
            else if (result[i] + result[i+1] + result[i+2] == 180 && ((result[i] == result[i+1]) || (result[i+1] == result[i+2]) || result[i+2] == result[i]))
                System.out.println("Isosceles");
            else if(result[i] + result[i+1] + result[i+2] == 180 && ((result[i] != result[i+1] && result[i+1] !=result[i+2] &&result[i+2] != result[i] )))
                System.out.println("Scalene");
            else if (result[i] + result[i+1] + result[i+2] != 180) {
                System.out.println("Error");
            }

        }
    }
}