public class Cupcake {
    private String name;
    private String code;
    private double pricePerPiece;

    // default constructor
    public Cupcake() {
        this.name = "";
        this.code = "";
        this.pricePerPiece = 0.0;
    }

    // normal constructor
    public Cupcake(String name, String code, double pricePerPiece) {
        this.name = name;
        this.code = code;
        this.pricePerPiece = pricePerPiece;
    }

    // copy constructor
    public Cupcake(Cupcake cupcake) {
        this.name = cupcake.name;
        this.code = cupcake.code;
        this.pricePerPiece = cupcake.pricePerPiece;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPricePerPiece(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCode: " + code + "\nPrice Per Piece: " + pricePerPiece;
    }

    // process
    public double priceInDozen() {
        double discountRate = 0.0;

        char lastCharOfCode = code.charAt(code.length() - 1);
        switch (lastCharOfCode) {
            case '1':
                discountRate = 0.05;
                break;
            case '2':
                discountRate = 0.08;
                break;
            case '3':
                discountRate = 0.10;
                break;
            default:
                discountRate = 0.0;
                break;
        }

        return 12 * pricePerPiece * (1 - discountRate);
    }
}