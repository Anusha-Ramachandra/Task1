import java.util.Scanner;
public class Patternprin
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the pattern: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number should be greater than 0.");
            scanner.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print((n - j));
                } else {
                    System.out.print((n - i));
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}