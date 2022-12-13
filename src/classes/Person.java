package classes;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double price;
    private List<String> products = new ArrayList<>();

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public Person(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n<<<<<< PERSON >>>>>>"
                +"\nNAME : "+name+
                "\nPRICE : "+price+
                "\nPRODUCTS : "+products+
                "\n*~~~~~~~~~~~~~~~~~~*";

    }
}
