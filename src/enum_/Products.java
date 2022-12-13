package enum_;

public enum Products {
    SUU_MAY(100),
    BREAD(25),
    TEA(100),
    MILK(80),
    SAUSAGE(160),
    POTATOES(40),

    KETCHUP(75);

    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Products(int price) {
        this.price=price;

    }
}