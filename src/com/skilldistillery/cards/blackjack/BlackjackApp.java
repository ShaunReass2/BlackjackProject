package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackjackApp {

	boolean playerStand = false; 
	Scanner scanner = new Scanner(System.in);

	Dealer dealer;
	Player player;

	public static void main(String[] args) {

		BlackjackApp app = new BlackjackApp();

		app = new BlackjackApp();
		app.run();

	}

	private void run() {

		boolean game = true;
		// welcome menu needs displayed upon program start

		while (game) {

			displayWelcomeMenu();

			int welcomeMenuChoice = scanner.nextInt();
			scanner.nextLine();

			switch (welcomeMenuChoice) {

			case 1:
				displayRules();
				break;
			case 2:
				game = false;
				gameLogic(player, dealer);
				break;
			case 3:
				quitApp();
				break;

			default:
				System.out.println(
						" That was not a valid selection. Please choose a number between 1 and 3, as listed in the menu.");
				break;

			}
		}

	}

	protected void gameLogic(Player player, Dealer dealer) {
		
		dealer = new Dealer();
		player = new Player();
		dealFullSuit(player, dealer);

		boolean game = true;
		
		while (game) {

			showHands(player, dealer); 

			displayMenuAfterDeal();
			
			int menuAfterDealChoice = scanner.nextInt();
			scanner.nextLine();
			
			switch (menuAfterDealChoice) {

			case 1:
				player.addCardToHand(dealer.dealCard(player));
				break;
			case 2:
				System.out.println("The player stands.");
				playerStand = true; 
				playerStand(player, dealer);
				bustLogic(player, dealer);
				checkWinner(player, dealer); 
				break;

			default:
				System.out.println("That was not a valid selection. Please choose either 1 or 2, as listed in the menu.");
				break;
			}
			bustLogic(player, dealer);
		}
	}

	public void playAnotherHandMenu() {

		displayMenuBeforeDeal();

		int menuBeforeDealChoice = scanner.nextInt();
		scanner.nextLine();

		switch (menuBeforeDealChoice) {

		case 1:
			playerStand = false; 
			gameLogic(player, dealer);
			break;
		case 2:
			quitApp();
			break;

		default:
			System.out.println(" That was not a valid selection. Please choose either 1 or 2, as listed in the menu.");
			break;
		}
	}

	protected void displayWelcomeMenu() {

		System.out.println("                                                                  ");
		System.out.println("Welcome to SD Royale! Please make a selection from the menu below.");
		System.out.println(" ");
		System.out.println("                  *******************************                 ");
		System.out.println("                                                                  ");
		System.out.println("                          PLAYER  OPTIONS                         ");
		System.out.println("                         (choose a number)                        ");
		System.out.println("                                                                  ");
		System.out.println("                     1. Read Blackjack Rules                      ");
		System.out.println("                     2. Play Blackjack                            ");
		System.out.println("                     3. Quit                                      ");
		System.out.println("                                                                  ");
		System.out.println("                  *******************************                 ");

	}

	protected void displayMenuAfterDeal() {
		
		System.out.println("                                                                  ");
		System.out.println("                    What would you like to do?                    ");
		System.out.println("                                                                  ");
		System.out.println("                     *************************                    ");
		System.out.println("                                                                  ");
		System.out.println("                         PLAYER  OPTIONS                          ");
		System.out.println("                        (choose a number)                         ");
		System.out.println("                                                                  ");
		System.out.println("                             1. Hit                               ");
		System.out.println("                             2. Stay                              ");
		System.out.println("                                                                  ");
		System.out.println("                     *************************                    ");

	}

	protected void displayMenuBeforeDeal() {
		
		System.out.println("                                                                  ");
		System.out.println("              Would you like to play another hand?                ");
		System.out.println("                                                                  ");
		System.out.println("              ***********************************                 ");
		System.out.println("                                                                  ");
		System.out.println("                        PLAYER  OPTIONS                           ");
		System.out.println("                       (choose a number)                          ");
		System.out.println("                                                                  ");
		System.out.println("                     1. Play Another Hand                         ");
		System.out.println("                     2. Quit                                      ");
		System.out.println("                                                                  ");
		System.out.println("              ***********************************                 ");

	}

	protected void displayRules() {

		// provide brief rules for the game
		// allow player to return to displayWelcomeMenu after reading the rules

	System.out.println("This game of Blackjack will be played between the dealer and one player.  The objective of the game is to obtain the hand value closest to 21, and the");
	System.out.println("person doing so wins.  If a person recieves a hand value of 21 immediately after the deal, that person wins automatically -- this is known as a Blackjack, or ");
	System.out.println("a Natural.  A person cannot exceed a hand value of 21, or they lose -- this is known as a bust. If both dealer and player have a hand value equal to one another, ");
	System.out.println("it is a draw.");
	System.out.println("");
	System.out.println("The first card dealt will be face up (exposing the card value) to the player, and the second card dealt will be to the dealer face down (concealing the card value).");
	System.out.println("The third and fourth cards dealt will be to the player and dealer, respectively, and both cards will be face up. So to recap, at the end of the deal, both player");
	System.out.println("cards will be exposed, and only one of the dealer cards will be exposed.  Only after the player completes their play will the dealer expose both cards.");
	System.out.println("");
	System.out.println("The rules for being dealt an additional card vary between player and dealer.  The player is free to recieve additional cards -- or hit -- as many times as they ");
	System.out.println("choose, despite the value of their hand.  The dealer is REQUIRED to hit if their hand value is 16 or below.  If the dealer's hand value is 17 or above, they CANNOT ");
	System.out.println("hit and must stay -- or stand.");
	System.out.println("");
	System.out.println("All numbered cards are valued at their printed numberic value, regardless of suit.  All face cards are valued at 10, regardless of their suit.  All Aces, regardless");
	System.out.println("of their suit, are valued at 11.");
	System.out.println("");
	System.out.println("Presss RETURN to go back to the main menu.");

		scanner.nextLine();

	}

	protected void dealFullSuit(Player player, Dealer dealer) {

		// deal a card to the player
		player.addCardToHand(dealer.dealCard(player));
		// TODO: need to display the card dealt

		// deal a card to the dealer
		dealer.addCardToHand(dealer.dealCard(dealer));

		// deal a card to the player
		player.addCardToHand(dealer.dealCard(player));

		// deal the last card to the dealer
		dealer.addCardToHand(dealer.dealCard(dealer));
		// TODO: need to display the card dealt
		
		blackjack(player, dealer); 
	}

	protected void bustLogic(Player player, Dealer dealer) {

		if (player.getHand().getValue() > 21) {
			showHands(player, dealer); 
			System.out.println("Player bust. Dealer wins.");
			playAnotherHandMenu();

		} else if (dealer.getHand().getValue() > 21) {
			showHands(player, dealer); 
			System.out.println("Dealer bust. Player wins.");
			playAnotherHandMenu();
		}

	}

	protected void playerStand(Player player, Dealer dealer) {

		while (dealer.getHand().getValue() < 17 && dealer.getHand().getValue() <= player.getHand().getValue()) {
			dealer.addCardToHand(dealer.dealCard(dealer));

		}

	}

	protected void checkWinner(Player player, Dealer dealer) {

		if (player.getHand().getValue() == dealer.getHand().getValue()) {
			showHands(player, dealer); 
			System.out.println("Player and dealer draw.");
			playAnotherHandMenu();

		} else if (player.getHand().getValue() > dealer.getHand().getValue()) {
			showHands(player, dealer); 
			System.out.println("Player wins.");
			playAnotherHandMenu();
			
		} else if (dealer.getHand().getValue() > player.getHand().getValue()) {
			showHands(player, dealer); 
			System.out.println("Dealer wins.");
			playAnotherHandMenu();
		}

	}
	
	protected void blackjack(Player player, Dealer dealer) {
		
		if(dealer.getHand().getValue() == 21 && player.getHand().getValue() == 21) {
			showHands(player, dealer); 
			System.out.println("Dealer and player have Blackjack. It's a draw.");
			playAnotherHandMenu(); 
			
		} else if(dealer.getHand().getValue() == 21) {
			showHands(player, dealer); 
			System.out.println("Dealer Blackjack.");
			playAnotherHandMenu(); 
		
		} else if(player.getHand().getValue() == 21) {
			showHands(player, dealer); 
			System.out.println("Player Blackjack.");
			playAnotherHandMenu(); 
		}
		
	}
	
	protected void showHands(Player player, Dealer dealer) {
		
		if(playerStand == true) {
		System.out.println("Player hand: " + player.getHand());
		System.out.println("Dealer shows: " + dealer.getHand());
	
		} else if(playerStand == false) {
			System.out.println("Player hand: " + player.getHand());
			System.out.println("Dealer shows: " + "(CARD FACED DOWN) " + dealer.getHand().getHand().get(1));
		}
	}

	protected void quitApp() {
		System.out.println("Mothers don't like quitters. But quitting while you're ahead makes mothers proud. Goodbye!");
		scanner.close();
		System.exit(0);

	}

}
