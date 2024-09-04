import java.util.Scanner;
public class Smallestnumberprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z, smallest;
        System.out.println("enter the first number");
        x = scanner.nextByte();
        System.out.println("enter the second number");
        y = scanner.nextByte();
        System.out.println("enter the third number");
        z = scanner.nextByte();
        smallest = (z < ((x < y) ? x : y)) ? z : ((x < y) ? x : y);
        System.out.println("the smallest number among three numbers is:" + smallest);
    }
}
