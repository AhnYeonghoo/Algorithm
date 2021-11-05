import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon23246 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int LENGTH = 3;
        int human;
        int[] score = new int[3];
        int multiply;
        int result;
        int[] number = new int[1000];
        int[] dd = new int[100];
        int[] ddplus = new int[100];
        human = sc.nextInt();

        for (int j = 0; j < human; j++) {
            number[j] = sc.nextInt();
            for (int i = 0; i < LENGTH; i++) {
                score[i] = sc.nextInt();
            }
            dd[j] = score[0] * score[1] * score[2];
            ddplus[j] = score[0] + score[1] + score[2];
        }
        //dd[0], dd[1], dd[2], dd[3] //dd[4]...
        for (int i = 0; i < human - 1; i++) {
            for (int j = 0; j < human - 1; j++) {
                if (dd[j] > dd[j + 1]) {
                    int tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                    int tmpdd = dd[j];
                    dd[j] = dd[j + 1];
                    dd[j + 1] = tmpdd;
                    int tmpddplus = ddplus[j];
                    ddplus[j] = ddplus[j + 1];
                    ddplus[j + 1] = tmpddplus;
                }
                else if (dd[j] == dd[j + 1]) {
                    if (ddplus[j] > ddplus[j + 1]) {
                        int tmp = number[j];
                        number[j] = number[j + 1];
                        number[j + 1] = tmp;
                        int tmpdd = dd[j];
                        dd[j] = dd[j + 1];
                        dd[j + 1] = tmpdd;
                        int tmpddplus = ddplus[j];
                        ddplus[j] = ddplus[j + 1];
                        ddplus[j + 1] = tmpddplus;
                    }
                    else if (dd[j] == dd[j + 1] && ddplus[j] == ddplus[j + 1]) {
                        if (number[j] > number[j + 1]) {
                            int tmp = number[j];
                            number[j] = number[j + 1];
                            number[j + 1] = tmp;
                            int tmpdd = dd[j];
                            dd[j] = dd[j + 1];
                            dd[j + 1] = tmpdd;
                            int tmpddplus = ddplus[j];
                            ddplus[j] = ddplus[j + 1];
                            ddplus[j + 1] = tmpddplus;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < LENGTH; i++) {
            System.out.println(number[i]);
        }

    }
}
