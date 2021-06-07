package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	// add a isBust method
	// add a isBlackjack method
	
	// a hand holds cards
	private List<Card> hand = new ArrayList<>();

	// add card to the hand
	public void addCard(Card card) {
		hand.add(card);
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getValue() {
		int value = 0;

		for (Card card : hand) {
			value += card.getValue();
		}

		return value;
	}

	@Override
	public String toString() {
		return hand + " ";
	//	return "Hand [hand=" + hand + "]";
	}
	
//	public void showHand() {
//		for(int i = 0; i < this.hand.size(); i++) {
//			System.out.print(this.getHand().get(i).toString() + " ");
//		}
//	}
	
	public Hand(List<Card> hand) {
		super();
		this.hand = hand;
	}

	public Hand() {
		super();
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
		Hand other = (Hand) obj;
		if (hand == null) {
			if (other.hand != null)
				return false;
		} else if (!hand.equals(other.hand))
			return false;
		return true;
	}

}
