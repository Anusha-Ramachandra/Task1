import java.util.Scanner;
public class reverseprogram  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int reverse = 0;
        while(number!=0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("the reversed number is:" + reverse);
        scanner.close();
    }
}

