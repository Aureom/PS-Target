import java.util.Scanner;

public class Main {

    public static boolean isFibonacci(int n) {
        if (n == 0) {
            return true;
        } else if (n == 1) {
            return true;
        } else if (n == 2) {
            return false;
        } else {
            return isFibonacci(n - 1) && isFibonacci(n - 2);
        }
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (isFibonacci(n)) {
            System.out.println("O número " + n + " é um número fibonacci");
        } else {
            System.out.println("O número " + n + " não é um número fibonacci");
        }

        String s = in.next();
        System.out.println("A string " + s + " de tras para frente é " + reverseString(s));
    }
}