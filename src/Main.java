import classes.Market;
import classes.Person;
import enum_.Products;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(System.in);
            Person person = new Person("Khafiz", 4000);
            Market market1 = new Market("GLOBUS", 500000);
            Market market2 = new Market("NARODNYI", 200000);
            List<Market> markets = new ArrayList<>(List.of(market1, market2));
            List<Products> products1 = new ArrayList<>(List.of(Products.SUU_MAY, Products.POTATOES, Products.BREAD, Products.SAUSAGE, Products.MILK,Products.KETCHUP, Products.TEA));
            PersonServic personServices = new PersonServic();
            while (true) {
                System.out.println("PRESS 1 BUY A PRODUCT!!!");
                System.out.println("PRESS 2 ALL MY PRODUCTS!!!");
                System.out.println("PRESS 3 ALL PERSON DATA!!!");
                System.out.println("PRESS 4 ADD ALL MARKET!!!");
                System.out.println("PRESS 5 ADD ALL PRODUCTS!!!");
                System.out.println("ПИШИ БОЛЬШИМИ БУКВАМИ!!!");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        String n = scanner.nextLine();
                        System.out.print("MARKET : ");
                        String market22 = scanner.nextLine();

                        while (true) {
                            try {


                                System.out.println("PRESS \"STOP\" STOPING LOOP!!");
                                System.out.print("NAME PRODUCTS : ");
                                String products = scanner.nextLine();
                                if (products.toUpperCase().equals("STOP")) {
                                    personServices.chek(person, markets, market22);
                                    System.out.println();
                                    break;
                                }
                                System.out.println(personServices.crateProducts(person, Products.valueOf(products.toUpperCase()), market22, markets));
                                System.out.println();
                            } catch (IllegalArgumentException e) {
                                System.err.println("No such product!!!");
                                System.out.println("PRESS \"STOP\" STOPING LOOP!!");
                                System.out.print("Name product : ");
                                String products = scanner.nextLine();
                                if (products.toUpperCase().equals("STOP")) {
                                    personServices.chek(person, markets, market22);
                                    System.out.println();
                                    break;
                                }
                                System.out.println(personServices.crateProducts(person, Products.valueOf(products.toUpperCase()), market22, markets));
                                System.out.println();
                            }
                        }
                        break;
                    case 2:
                        System.out.println(personServices.getAllProducts());
                        System.out.println();
                        break;
                    case 3:
                        System.out.println(person.toString());
                        System.out.println();
                        break;
                    case 4:
                        System.out.println(markets);
                        System.out.println();
                        break;
                    case 5:
                        System.out.println(products1);
                        System.out.println();
                        break;
                    default:
                        System.err.println("Error!");
                }

            }

        } catch (IllegalArgumentException e) {
            System.err.println("No such product!!");
        } catch (InputMismatchException e) {
            System.err.println("Write correctly!!!");
        }

    }
}