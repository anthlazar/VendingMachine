package com.techelevator;

import javax.xml.stream.Location;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class VendingMachine {
    private Map<String, Inventory> inventory = new HashMap<String, Inventory>(); // itl suggested that we make the map a final, come back if it breaks code

    //constructor so that when ever we create a new vending machine it will import this file
    public VendingMachine() {


        //pulling the list of the inventory to be read in a loop


        List<Inventory> snacks = new ArrayList<Inventory>();


        /**public String vendingMachineInventory (String, File){
         return inventory.get(inventory); }*/ // we may need this later on a different class


        public static void main(String[] args){


                    //if file doesnt exist






        try (Scanner scan = new Scanner(input)) {
            File input = new File("C:\\Users\\Student\\workspace\\module-1-capstone-team-4\\19_20_Capstone\\capstone\\ExampleFiles\\VendingMachine.txt");

            //read each line of the file
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                // The line from the file is coming in as title,format,inventoryList
                // Because they are comma separated, we can split on the comma to get
                // each individual value
                String[] columns = line.split("\\|");
                // We can save each individual value, doing any conversions as necessary
                String location = columns[0];
                String name = columns[1];
                BigDecimal price = new BigDecimal(columns[2]);
                String type = columns[3];

                Inventory snack = new Inventory(location, name, price, type);
                inventory.put(location, snack);
            }
        } catch (Exception ex) {
            System.out.println("There was an error");
        }
        // method
        //public String getInventory(snacks){
           // return (this.getInventory);



        }
    }

}


/**public String thisMethodReturnsString(Inventory);
    public static void main(String[] args) {
*/
