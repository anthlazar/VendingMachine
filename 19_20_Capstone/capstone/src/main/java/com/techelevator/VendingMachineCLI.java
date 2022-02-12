package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};

	private static final String PURCHASE_MENU_OPTION1 = "Insert Money";

	private static final String PURCHASE_MENU_OPTION2 = "Return Money";
	private static final String BACK_TO_MAIN = "Back to main";
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION1, PURCHASE_MENU_OPTION2, BACK_TO_MAIN};

	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		VendingMachine vendingMachine = new VendingMachine();// display vending machine items
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
					 vendingMachine.displayMenu();

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				while (true) {
					String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
					Cash.cashDispensed();
					if (purchaseChoice.equals(PURCHASE_MENU_OPTION1)) {
						//implement option 1
					} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION2)) {
						// implement option 2
					} else if (choice.equals(BACK_TO_MAIN)) {
						//Exit
						break;
					}
				}
			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				break;
			}
		}
	}

			public static void main (String[]args){
				Menu menu = new Menu(System.in, System.out);
				VendingMachineCLI cli = new VendingMachineCLI(menu);
				cli.run();
			}





		}


