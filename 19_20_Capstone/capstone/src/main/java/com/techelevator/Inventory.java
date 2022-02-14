package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;

public class Inventory {
    public String type;
    public String name;
    public String location;
    public BigDecimal price;


    public static final String CHIPS = "Chips";
    public static final String CANDY = "Candy";
    public static final String BEVERAGE = "Beverage";
    public static final String GUM = "Gum";
    //public static void add(Map<String, String> inventory) {} come back to this, randomly added by itJ

    //constructor
    public Inventory(String location, String name, BigDecimal price, String type) {

        this.location = location;
        this.price = price;
        this.type = type;
        this.name = name;


        // if (

        //System.out.println("Sold Out");
    }

    //getters
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Inventory getInventory() {
        return getInventory();
    }




}



    // 1 method: transaction ex money - a1 (3.05) =
    // return returnValue;


