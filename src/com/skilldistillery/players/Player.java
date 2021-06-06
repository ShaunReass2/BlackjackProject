package com.skilldistillery.players;

import java.util.Scanner;

import com.skilldistillery.cards.common.BlackjackMenus;
import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class Player {

	BlackjackMenus blackjackMenu = new BlackjackMenus(); 
	
	// Code to allow player choices during play -- hit, stay, and (STRETCH GOAL) split with sub-menu and subsequent hits and stays. 
	// Ever player has a pot. 
	// Every player has a hand
	
	protected Hand hand; 
	
	// Every player determines the value of their hand
	// Every player has the ability to hit or stand. 
	
	public Player () { 
			
	}
	
	// player can add a card to the hand
	public void addCardToHand(Card card) {
		hand.addCard(card); 
		
	}
	
	public boolean playerHit(BlackjackMenus blackjackMenu) {
		
		boolean userMenuChoice; 
		
		if (userMenuChoice == true) {
			dealCard(); 
		
			// need to display the card dealt
			
		} else {
			
			// no card dealt, and the play goes back to the dealer, subject to dealer's code logic
			
		}
		
	
		// booleqn
		// if the player hits = true
		// if the player stays = false
		return false; // this needs to be changed later
	}
	

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hand == null) ? 0 : hand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (hand == null) {
			if (other.hand != null)
				return false;
		} else if (!hand.equals(other.hand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}

	public Player(Hand hand) {
		super();
		this.hand = hand;
	}
	
	
	
}
