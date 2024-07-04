import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.strip();
        String[] word = str.split(" ");
        
        if (word[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(word.length); 
        }
        
    }
}
