import java.util.Scanner;

public class CupcakeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of customers: ");
        int sizeOfArray = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        Cupcake[] cupcakes = new Cupcake[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {

            System.out.print("Enter the name of cupcake " + (i + 1) + ": ");
            String name = scanner.next();

            scanner.nextLine();

            System.out.print("Enter the code of cupcake " + (i + 1) + ": ");
            String code = scanner.next();

            System.out.print("Enter the price per piece of cupcake " + (i + 1) + ": ");
            double pricePerPiece = scanner.nextDouble();

            cupcakes[i] = new Cupcake(name, code, pricePerPiece);

            System.out.println();
            scanner.nextLine();

        }

        double totalPriceOfCupcakes = 0.0;
        double netPriceOfCupcakes = 0.0;

        for (int i = 0; i < cupcakes.length; i++) {
            totalPriceOfCupcakes += (12 * cupcakes[i].getPricePerPiece());
            netPriceOfCupcakes = cupcakes[i].priceInDozen();

            System.out.println(cupcakes[i].toString());
            System.out.printf("Net Price of a Dozen Cupcake: RM %,.2f\n", netPriceOfCupcakes);
            System.out.println();
        }

        System.out.printf("Total Price of Dozen Cupcakes for All Type: RM %,.2f\n", totalPriceOfCupcakes);

        scanner.close();
    }
}