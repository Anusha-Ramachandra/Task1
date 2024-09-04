
import java.util.Scanner;
public class printprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int first = scanner.nextByte();
        System.out.println("enter last number");
        int last = scanner.nextByte();
        for (int i=first; i<= last; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}

