package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

<<<<<<< HEAD
public class Cash extends VendingMachine{
    private BigDecimal cashReceived;
    private BigDecimal amountDue;
    private BigDecimal change;
    private int numberOfItemsSold;
=======
public class Cash {

    private BigDecimal cashReceived;
    private BigDecimal amountDue;
    private BigDecimal change;
    private BigDecimal userInput;
>>>>>>> 6f36f50856fec7a68602c5242d77304366170c7b


    //if cash received is more than amount due then return change
    //constructor

    public Cash(BigDecimal cashReceive, BigDecimal amountDue, BigDecimal change, int numberOfItemsSold) {
        this.cashReceived = cashReceive;
        this.amountDue = amountDue;
        this.change = change;
        this.numberOfItemsSold = numberOfItemsSold;
    }

    {
    }

    public BigDecimal getCashReceived() {
        return cashReceived;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }


    public int getNumberOfItemsSold() { return numberOfItemsSold;}

    //Method

    public static void cashDispensed() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Insert Cash");
        String userMoney = userInput.nextLine();

    }

    public static void chooseItem() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please select item");
        String userChoice = userInput.nextLine();
<<<<<<< HEAD
        if (userChoice.startsWith("D")) {
            System.out.println("Chew Chew, Yum");
        } else if (userChoice.startsWith("C")) {
            System.out.println("Glug Glug, Yum");
        } else if (userChoice.startsWith("B")) {
            System.out.println("Munch Munch, Yum");
        } else if (userChoice.startsWith("A")) {
            System.out.println("Crunch Crunch, Yum");
        }
=======
>>>>>>> 6f36f50856fec7a68602c5242d77304366170c7b
    }
}
    /**    public static void getChange(){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Your Change is" + change);
            String userChange = userInput.nextLine();
    }  */

<<<<<<< HEAD
   /**  if (cashReceived > amountDue);
     System.out.println("The customer should be given the change as follows:");
     change = cashReceived - amountDue;

=======

    /*
    public double getChange(int cashReceived, double amountDue, double change) {
        change = cashReceived - amountDue;
        change = change * 100;
        return change;
    }
>>>>>>> 6f36f50856fec7a68602c5242d77304366170c7b

    public int calculateDollars(int dollars, double change) {
        double remainder;
        if (change >= 100) {
            dollars = (int) (change / 100);
            remainder = dollars * 100;
            change = change - remainder;
        }
        return dollars;
    }

    public int calculateQuarters(int quarters, double change) {

        double remainder;
        if (change >= 25) {
            quarters = (int) (change / 25);
            remainder = quarters * 25;
            change = change - remainder;
        }
        return quarters;
    }
    public int calculateDimes(int dimes, double change)
    {
        double remainder;
        if (change >= 10)
        {
            dimes = (int) (change / 10);
            remainder = dimes * 10;
            change = change - remainder;

        }
        return dimes;
    }
    public int calculateNickels(int nickels, double change)
    {
        double remainder;
        if (change >= 5)
        {
            nickels = (int) (change / 5);
            remainder = nickels * 5;
            change = change - remainder;

        }
        return nickels;
    }
    public int calculatePennies(int pennies, double change)
    {
        double remainder;
        if (change >= 1)
        {
            pennies = (int) (change);
            remainder = pennies;
            change = change - remainder;

        }
        return pennies;
    }

}

*/

/**
 * if(cashReceived > amountDue);
 * System.out.println("The customer should be given the change as follows:");
 * change =cashReceived -amountDue;
 * <p>
 * else if (cashReceived == amountDue)
 * System.out.println("Thank you for your purchase");
 * <p>
 * else if (cashReceived < amountDue)
 * System.out.println("Please insert more cash");
 * <p>
 * <p>
 * (item purchased > 5)
 * return "Sold out";
 */




