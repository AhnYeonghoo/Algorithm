import java.util.*;
public class Baekjoon5063 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int noAd, goAd, adMoney;
        for (int i = 0; i < n; i++) {
            noAd = Sc.nextInt();
            goAd = Sc.nextInt();
            adMoney = Sc.nextInt();
            if (noAd + adMoney > goAd) {
                System.out.println("do not advertise");
            } else if (goAd >noAd + adMoney) {
                System.out.println("advertise");
            } else {
                System.out.println("does not matter");
            }
        }
    }
}