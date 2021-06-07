package com.skilldistillery.players;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class Dealer extends Player {

	// Code to determine dealer logic of play - hit or stay
	// with subsequent hits and stays
	// The dealer has a deck of cards
	
	 Dealer dealer; 
	 Player player; 

	private Deck deck = new Deck();
	private Hand hand = new Hand(); 

	public Dealer() {
		shuffle();

	}

	public void shuffle() {
		deck.shuffle();

	}

	public Card dealCard(Player player) {

		// dealer remove a card from the deck
		Card card = deck.removeCard();

		// dealer gives that card to the player object
		// pass the card to the player's hand
		return card; 
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
