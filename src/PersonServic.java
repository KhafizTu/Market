import classes.Market;
import classes.Person;
import enum_.Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonServic {
    List<String> products = new ArrayList<>();
    double chekInt = 0;
    double skidka = 0;

    public String crateProducts(Person person, Products products1, String marketName, List<Market> markets) {
        for (Market market : markets) {
            if (person.getPrice() >= products1.getPrice()) {
                if (marketName.equals("GLOBUS")) {
                    chekInt += products1.getPrice();
                    skidka =  chekInt - 22;
                    market.setPrice(market.getPrice() + skidka);
                    person.setPrice(person.getPrice() - skidka);
                    this.products.add("\n"+products1+" price :"+products1.getPrice()+"\n");
                    person.setProducts(Collections.singletonList("" + this.products + products1.getPrice() + "\n"));
                    return "<< SUCCESSFULLY! >>";
                } else if (marketName.equals("FRUNZE")) {
                    chekInt += products1.getPrice();
                    skidka =  chekInt - 15;
                    market.setPrice(market
                            .getPrice()-skidka);
                    person.setPrice(person.getPrice() - skidka);
                    this.products.add( "\n"+products1+" price :"+products1.getPrice()+"\n");
                    person.setProducts(Collections.singletonList("" + this.products + products1.getPrice() + "\n"));
                    return "<< SUCCESSFULLY! >>";
                } else {
                    return ">>> NET TAKOGO MARKETA!!! <<<";
                }
            }

        }

        return null;


    }  public List<String> getAllProducts () {
        return this.products;
    }
    public void chek(Person person, List<Market> market,String name) {
        for (Market market1 : market) {
            if(market1.getName().equals(name.toUpperCase())) {
                System.out.println("                          ");
                System.out.println("                          ");
                System.out.println("<<<<<<<>> CHECK <<>>>>>>>");
                System.out.println("NAME : " + person.getName());
                System.out.println("MARKET NAME : " + market1.getName());
                System.out.println("YOUR PRODUCT : " + products);
                System.out.println("YOUR SKIDKA CHACK : " + skidka);
                System.out.println("YOUR CHACK : " + chekInt);
                System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~*");
                System.out.println("                           ");
                System.out.println("                           ");
            }
        }
    }

}
