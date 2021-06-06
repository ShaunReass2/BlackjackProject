package com.skilldistillery.cards.common;

import java.util.Scanner;

public class BlackjackMenus {

	public static void main(String[] args) {

		BlackjackMenus menus = new BlackjackMenus();
		menus.displayWelcomeMenu();

	}

	public void BlackjackMenus() {
		
	}

	public void displayWelcomeMenu() {

		Scanner scanner = new Scanner(System.in);

		boolean runMenu = true;

		while (runMenu) {

			System.out.println("Welcome to SD Royale! Please make a selection from the menu below.");
			System.out.println(" ");
			System.out.println("                  *************************                       ");
			System.out.println("                                                                  ");
			System.out.println("                       PLAYER  OPTIONS                            ");
			System.out.println("                      (choose a number)                           ");
			System.out.println("                                                                  ");
			System.out.println("                  1. Read Blackjack Rules                         ");
			System.out.println("                  2. Play Blackjack                               ");
			System.out.println("                  3. Quit                                         ");
			System.out.println("                                                                  ");
			System.out.println("                  *************************                       ");

			int userMenuChoice = scanner.nextInt();

			switch (userMenuChoice) {

			case 1:
				displayRules();
				break;
			case 2:
				dealFullSuit(); 
				break;
			case 3:
				quitApp();
				break;

			default:
				break;
				System.out.println(
						" That was not a valid selection. Please choose a number between 1 and 3, as listed in the menu.");

			}

		}

	}

	public void displayMenuAfterDeal() {
		
		Scanner scanner = new Scanner(System.in);

		boolean runMenu = true;

		while (runMenu) {

			System.out.println("What would you like to do?");
			System.out.println(" ");
			System.out.println("*************************");
			System.out.println("                         ");
			System.out.println("     PLAYER  OPTIONS     ");
			System.out.println("    (choose a number)    ");
			System.out.println("                         ");
			System.out.println("        1. Hit           ");
			System.out.println("        2. Stay          ");
			System.out.println("                         ");
			System.out.println("*************************");

			int userMenuChoice = scanner.nextInt();

			switch (userMenuChoice) {

			case 1:
				playerHit(); // this needs to be true in the playerHit boolean
				break;
			case 2:
				playerHit(); // this needs to be false in the playerHit boolean
				break;

			default:
				break;
				System.out.println(
						" That was not a valid selection. Please choose either 1 or 2, as listed in the menu.");

			}

		}
		
	}

	public void displayMenuBeforeDeal() {
		
		Scanner scanner = new Scanner(System.in);

		boolean runMenu = true;

		while (runMenu) {

			System.out.println("Would you like to play another hand?");
			System.out.println(" ");
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println("          PLAYER  OPTIONS          ");
			System.out.println("         (choose a number)         ");
			System.out.println("                                   ");
			System.out.println("        1. Play Another Hand       ");
			System.out.println("        2. Quit                    ");
			System.out.println("                                   ");
			System.out.println("***********************************");

			int userMenuChoice = scanner.nextInt();

			switch (userMenuChoice) {

			case 1:
				dealCard(); // confirm this method. this needs to deal a full suit
				break;
			case 2:
				quitApp();
				break;

			default:
				break;
				System.out.println(
						" That was not a valid selection. Please choose either 1 or 2, as listed in the menu.");

			}

		}

	}

	public void displayRules() {

		// provide brief rules for the game

		System.out.println(" ");
	}
	
	public void quitApp() {
		System.out.println("Mothers don't like quitters. But quitting while your'e ahead makes mothers proud. Goodbye!");
		System.exit(0);			
	}

}
