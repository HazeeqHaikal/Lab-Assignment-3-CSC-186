import java.util.Scanner;

public class FurnitureApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size;
        System.out.print("Enter the amount of furnitures: ");
        size = scan.nextInt();

        Furniture[] arrFurniture = new Furniture[size];

        scan.nextLine();

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the furniture type: ");
            String furnitureType = scan.nextLine();

            System.out.print("1. Wood\n2. Rattan\n3. Metal\n4. Bamboo\n\nEnter the material: ");
            String material = scan.next();

            switch (material) {
                case "1":
                    material = "Wood";
                    break;
                case "2":
                    material = "Rattan";
                    break;
                case "3":
                    material = "Metal";
                    break;
                case "4":
                    material = "Bamboo";
                    break;
                default:
                    break;
            }

            System.out.print("Enter the price per unit: ");
            double pricePerUnit = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            int quantity = scan.nextInt();

            arrFurniture[i] = new Furniture(furnitureType, material, pricePerUnit, quantity);
            System.out.println();

            scan.nextLine();
        }

        double totalWood = 0.0;
        double totalRattan = 0.0;
        double totalMetal = 0.0;
        double totalBamboo = 0.0;

        double highestPriceOfWoodFurnitures = -9999;

        for (int i = 0; i < 5; i++) {
            if (arrFurniture[i].getMaterial().equals("Wood")) {
                totalWood += arrFurniture[i].calcPriceFurniture();
            } else if (arrFurniture[i].getMaterial().equals("Rattan")) {
                totalRattan += arrFurniture[i].calcPriceFurniture();
            } else if (arrFurniture[i].getMaterial().equals("Metal")) {
                totalMetal += arrFurniture[i].calcPriceFurniture();
            } else if (arrFurniture[i].getMaterial().equals("Bamboo")) {
                totalBamboo += arrFurniture[i].calcPriceFurniture();
            }

            if (arrFurniture[i].calcPriceFurniture() > highestPriceOfWoodFurnitures) {
                highestPriceOfWoodFurnitures = arrFurniture[i].calcPriceFurniture();
            }
            System.out.println(arrFurniture[i].toString());
            // allign the colon too
            System.out.println(String.format("%-25s: RM %.2f", "Total Price", arrFurniture[i].calcPriceFurniture()));
            System.out.println();
        }

        for (int i = 0; i < arrFurniture.length; i++) {
            if (arrFurniture[i].getMaterial().equals("Wood")
                    && arrFurniture[i].calcPriceFurniture() == highestPriceOfWoodFurnitures) {
                System.out.println(arrFurniture[i].toString());
            }
        }

        System.out.println();

        System.out.println("Total Price of Wood Furnitures: RM " + totalWood);
        System.out.println("Total Price of Rattan Furnitures: RM " + totalRattan);
        System.out.println("Total Price of Metal Furnitures: RM " + totalMetal);
        System.out.println("Total Price of Bamboo Furnitures: RM " + totalBamboo);
        System.out.println();
        System.out.println("Highest Price of Wood Furnitures: RM " + highestPriceOfWoodFurnitures);

        scan.close();
    }
}