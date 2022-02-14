package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Cash extends VendingMachine{
    private BigDecimal cashReceived;
    private BigDecimal amountDue;
    private BigDecimal change;
    private int numberOfItemsSold;


    //if cash received is more than amount due then return change
    //constructor

    public Cash(BigDecimal cashReceive, BigDecimal amountDue, BigDecimal change, int numberOfItemsSold) {
        this.cashReceived = cashReceive;
        this.amountDue = amountDue;
        this.change = change;
        this.numberOfItemsSold = numberOfItemsSold;
    }

    public BigDecimal getCashReceived() {
        return cashReceived;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public BigDecimal getChange() {
        return change;
    }

    public int getNumberOfItemsSold() { return numberOfItemsSold;}

    //Method

    public static void cashDispensed() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Insert Cash");
        String userMoney =  userInput.nextLine();

    }

    public static void chooseItem(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please select item");
        String userChoice = userInput.nextLine();
        if (userChoice.startsWith("D")) {
            System.out.println("Chew Chew, Yum");
        } else if (userChoice.startsWith("C")) {
            System.out.println("Glug Glug, Yum");
        } else if (userChoice.startsWith("B")) {
            System.out.println("Munch Munch, Yum");
        } else if (userChoice.startsWith("A")) {
            System.out.println("Crunch Crunch, Yum");
        }
    }
}

   /**  if (cashReceived > amountDue);
     System.out.println("The customer should be given the change as follows:");
     change = cashReceived - amountDue;


     else if (cashReceived == amountDue)
     System.out.println("Thank you for your purchase");

     else if (cashReceived < amountDue)
     System.out.println("Please insert more cash");


       (item purchased > 5)
      return "Sold out";

*/




