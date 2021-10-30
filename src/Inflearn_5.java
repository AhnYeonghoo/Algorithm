import java.util.*;
public class Inflearn_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!(Character.isAlphabetic(ch[lt])))
                lt++;
            else if(!(Character.isAlphabetic(ch[rt])))
                rt--;
            else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(ch);
    }
}

