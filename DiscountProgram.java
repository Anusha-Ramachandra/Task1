import java.util.Scanner;

public class DiscountProgram {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discountRate = 0.0;
        if (purchaseAmount < 500) {
            discountRate = 0.0; // No discount
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discountRate = 0.10; // 10% discount
        } else if (purchaseAmount > 1000) {
            discountRate = 0.20; // 20% discount
        }
        double discountAmount = purchaseAmount * discountRate;
        double finalAmount = purchaseAmount - discountAmount;
        System.out.printf("Purchase amount: %.2f%n", purchaseAmount);
        System.out.printf("Discount applied: %.0f%%%n", discountRate * 100);
        System.out.printf("Final payable amount: %.2f%n", finalAmount);
        scanner.close();
    }
}
