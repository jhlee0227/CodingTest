import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String str = new StringBuilder(s1).reverse().toString();

        if (s1.equals(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}