public class Fruit {
    private String name;
    private String type;
    private double weight;
    private double price;

    // default constructor
    public Fruit() {
        this.name = "";
        this.type = "";
        this.weight = 0.0;
        this.price = 0.0;
    }

    // normal constructor
    public Fruit(String name, String type, double weight, double price) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    // copy constructor
    public Fruit(Fruit fruit) {
        this.name = fruit.name;
        this.type = fruit.type;
        this.weight = fruit.weight;
        this.price = fruit.price;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        type = type.substring(0, 1).toUpperCase() + type.substring(1);
        return String.format("%-15s:   %s\n%-15s:   %s\n%-15s:   %.2f KG\n%-15s:   RM %.2f\n%-15s:   RM %.2f", "Name", name,
                "Type", type, "Weight", weight, "Price Per KG", price, "Total Price", calcTotalPrice());
    }

    public boolean isLocal() {
        return type.equals("local");
    }

    public double calcTotalPrice() {
        double totalPrice = weight * price;

        if (isLocal()) {
            totalPrice *= 0.97; // 3% discount
        }
        
        return totalPrice;
    }
}