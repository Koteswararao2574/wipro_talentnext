package stringBuffer;
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();
        if (word.substring(0,1).equals("x") && word.substring(n-1,n).equals("x")) {
            System.out.println(word.substring(1, n-1));
        } else if (word.substring(0,1).equals("x")) {
            System.out.println(word.substring(1, n));
        } else if (word.substring(n-1,n).equals("x")) {
            System.out.println(word.substring(0, n-1));
        } else {
            System.out.println(word);
        }
    }
}
