import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        System.out.println("Grocery Product");
        System.out.println("---------------------------");
        System.out.println("Apple Price     ...: 3.67₺");
        System.out.println("Pear Price      ...: 2.14₺");
        System.out.println("Tomato Price    ...: 1.11₺");
        System.out.println("Banana Price    ...: 0.95₺");
        System.out.println("Aubergine Price ...: 5.00₺");
        System.out.println("---------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Apple Kilo       ...:");
        double applePrice = (scanner.nextDouble() * 3.67);

        System.out.print("Please Enter Pear Kilo        ...:");
        double pearPrice = (scanner.nextDouble() * 2.14);

        System.out.print("Please Enter Tomato Kilo      ...:");
        double tomatoPrice = (scanner.nextDouble() * 1.11);

        System.out.print("Please Enter Banana Kilo      ...:");
        double bananaPrice = (scanner.nextDouble() * 0.95);

        System.out.print("Please Enter Aubergine Kilo   ...:");
        double auberginePrice = (scanner.nextDouble() * 5.00);

        double totalAmount = applePrice + pearPrice + tomatoPrice + bananaPrice + auberginePrice;
        System.out.print("Total Amount...:" + totalAmount);

    }
}
