package com.projet7wondersarchitect.domain;

public class Card {
	public final CardType front;
	public final CardBack back;
	/*pp*/
	public Card(CardType front, CardBack back) {
		this.front = front;
		this.back = back;
	}

	public void displayCard(){
		System.out.println("############\n" +
				"front : " + front +"\n" +
				"back : " + back +"\n ##########");
	}
	
}
