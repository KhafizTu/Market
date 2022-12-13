package classes;

import java.util.ArrayList;
import java.util.List;

public class Market { private String name;
    private double price;

    private List<Products> products = new ArrayList<>();

    public Market(String name, double price) {
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

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\n<<<<<< MARKET >>>>>>>"+
                "\nMARKET NAME : "+name+
                "\nPRICE : "+price+
                "\n*~~~~~~~~~~~~~~~~~~~~~*";
    }
}
