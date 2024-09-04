
import java.util.Scanner;
public class positivenegativeprogram
{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        float number = scanner.nextByte();
        if (number >= 0)
        {
            System.out.println("positive number");
        }
        else
        {
            System.out.println("negative number");
        }
        scanner.close();
    }
}

