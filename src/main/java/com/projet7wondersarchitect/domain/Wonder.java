package com.projet7wondersarchitect.domain;

import java.util.List;

import static com.projet7wondersarchitect.domain.CardDecks.*;

public enum Wonder {

	Alexandrie("Alexandrie", "Alexandrie",
			"Prenez la première carte d'une pioche au choix, n'importe où sur la table, et posez-la devant vous",
			deckCardQuantities_Alexandrie),
	
	Halicarnasse("Halicarnasse", "Halicarnasse",
			"Prenez les 5 premières cartes de la pioche à votre gauche ou à votre droite, choisissez-en 1 et posez-la devant vous" //
			+ "Mélangez-les cartes restantes dans leur pioche",deckCardQuantities_Halicarnasse),
	
	Ephese("Ephese", "Ephèse",
			"Prenez la première carte de la pioche centrale et posez-la devant vous",deckCardQuantities_Ephese),
	
	Olympie("Olympie", "Olympie",
			"Prenez la première carte de la pioche à votre cauche et de celle à votre droite, et posez-les devant vous",
			deckCardQuantities_Olympie),
	
	Babylone("Babylone", "Babylone",
			"Choisissez 1 jeton Progrès parmi les 4 disponibles, et posez-le devant vous",deckCardQuantities_Babylon),
	
	Rhodes("Rhodes", "Rhodes",
			"Ajoutez 1 Bouclier à votre total de Boucliers",deckCardQuantities_Rhodes),
	
	Gizeh("Gizeh", "Gizeh",
			"Cette merveille n'a pas d'effet particulier, mais rapporte plus de points de victoire que les autres Merveilles",
			deckCardQuantities_Gizeh);
	
	// ------------------------------------------------------------------------
	
	public final String displayName;
	
	public final String frenchName;
	
	public final String effectDescription;

	public final List<CardDecks.CardTypeQuantity> cardDeck;
	
	// ------------------------------------------------------------------------
	
	Wonder(String displayName, String frenchName, String effectDescription, List<CardDecks.CardTypeQuantity> cardDeck) {
		this.displayName = displayName;
		this.frenchName = frenchName;
		this.effectDescription = effectDescription;
		this.cardDeck=cardDeck;
	}
}
