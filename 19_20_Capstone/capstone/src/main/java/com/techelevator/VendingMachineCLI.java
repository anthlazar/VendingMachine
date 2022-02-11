package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};

	private static final String PURCHASE_MENU_OPTION1 = "Do Something";
	private static final String PURCHASE_MENU_OPTION2 = "Do Something Else";
	private static final String BACK_TO_MAIN = "Back to main";
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION1, PURCHASE_MENU_OPTION2, BACK_TO_MAIN};

	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				VendingMachine vendingMachineMenu = new VendingMachine();// display vending machine items
				try {
					File file = new File("C:\\Users\\Student\\workspace\\module-1-capstone-team-4\\19_20_Capstone\\capstone\\ExampleFiles\\VendingMachine.txt");

				} catch (FileNotFoundException ex){
					System.out.println("File Not Found");
				}
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				while (true) {
					String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);

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


