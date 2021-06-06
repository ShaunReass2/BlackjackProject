package com.skilldistillery.players;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {

	// Code to determine dealer logic of play - hit or stay
	// with subsequent hits and stays
	// The dealer has a deck of cards
	
	 Dealer dealer; 
	 Player player; 

	private Deck deck = new Deck();

	public Dealer() {
		shuffle();

	}

	public void shuffle() {
		deck.shuffle();

	}
	
	public void dealFullSuit() {
		
		// create a dealer
		// create a player
		 dealer = new Dealer(); 
		 player = new Player(); 
		 
		// deal a card to the player
		dealer.dealCard(player);
		 									        // TODO: need to display the card dealt
		// deal a card to the dealer
		dealer.dealCard(dealer);
										         	// do not display the card dealt
		// deal a card to the player
		dealer.dealCard(player);
										        	// TODO: need to display the card dealt
		// deal the last card to the dealer
		dealer.dealCard(dealer);
											       // TODO: need to display the card dealt
		
		System.out.println("Your hand: " + );      // TODO: need to display the player's hand
		System.out.println("Dealer shows: " + );   // TODO: need to display the dealer's face card
		
	}

	public void dealCard(Player player) {

		// dealer remove a card from the deck
		Card card = deck.getCard();

		// dealer gives that card to the player object
		// pass the card to the player's hand
		player.addCardToHand(card);

	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((deck == null) ? 0 : deck.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dealer other = (Dealer) obj;
		if (deck == null) {
			if (other.deck != null)
				return false;
		} else if (!deck.equals(other.deck))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dealer [deck=" + deck + "]";
	}

}
