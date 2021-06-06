package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.BlackjackMenus;
import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackjackApp {

	static BlackjackApp app; 
	
//	 Dealer dealer; 
//	 Player player; 
	
	public static void main(String[] args) {

		app = new BlackjackApp(); 
		app.run(); 
		
		BlackjackMenus blackjackMenu = new BlackjackMenus(); 
	}

	private void run(BlackjackMenus blackjackMenu) {
		
		welcomeMenu(); 
	
	
		
	}
	  
}






