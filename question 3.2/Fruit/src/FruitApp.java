import java.util.Scanner;

public class FruitApp {
    public static void main(String[] args) {
        Fruit[] fruitList = new Fruit[5];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of fruits: ");
        int numberOfFruits = scan.nextInt();

        System.out.println();

        for (int i = 0; i < numberOfFruits; i++) {
            String type;

            System.out.print("Enter the fruit name: ");
            String name = scan.nextLine();

            System.out.print("1. Imported\n2. Local\nEnter the fruit type (1-2): ");
            int typeBefore = scan.nextInt();

            if (typeBefore == 1) {
                type = "imported";
            } else {
                type = "local";
            }

            System.out.print("Enter the fruit weight (KG): ");
            double weight = scan.nextDouble();

            System.out.print("Enter the fruit price: ");
            double price = scan.nextDouble();

            fruitList[i] = new Fruit(name, type, weight, price);
            System.out.println();

            scan.nextLine();
        }

        String highestPricedLocalFruitName = "";
        double highestPricedLocalFruitPrice = -9999;

        double totalSaleOfImportedFruits = 0.0;

        for(int i = 0; i < fruitList.length; i++) {
            if (fruitList[i].isLocal()) {
                if (fruitList[i].getPrice() > highestPricedLocalFruitPrice) {
                    highestPricedLocalFruitName = fruitList[i].getName();
                    highestPricedLocalFruitPrice = fruitList[i].getPrice();
                }
            } else {
                totalSaleOfImportedFruits += fruitList[i].calcTotalPrice();
            }

            System.out.println(fruitList[i]);
            System.out.println();
        }

        System.out.println("Name of Local Fruit with Highest Price: " + highestPricedLocalFruitName);

        System.out.printf("Total Sale of Imported Fruits: %,.2f\n", totalSaleOfImportedFruits);

        scan.close();
    }
}