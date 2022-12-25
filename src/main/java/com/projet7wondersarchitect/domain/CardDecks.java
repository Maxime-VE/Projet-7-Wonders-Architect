package com.projet7wondersarchitect.domain;

import java.util.Arrays;
import java.util.List;

public class CardDecks {

	public static class CardTypeQuantity {
		public final int quantity;
		public final CardType cardType;
		public final CardBack cardBack;
		public CardTypeQuantity(int quantity, CardType cardType, CardBack cardBack) {
			this.quantity = quantity;
			this.cardType = cardType;
			this.cardBack = cardBack;
		}
	}
	
	/** Card Types x Quantities for Gizeh Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Gizeh = Arrays.asList(
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, CardBack.Gizeh), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, CardBack.Gizeh), //
			new CardTypeQuantity(1, CardType.CardMaterialBrick, CardBack.Gizeh), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Gizeh), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass, CardBack.Gizeh), //
			new CardTypeQuantity(3, CardType.CardMaterialGold, CardBack.Gizeh), // 2+1
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw, CardBack.Gizeh), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic, CardBack.Gizeh), //
			new CardTypeQuantity(2, CardType.CardScienceArchitect, CardBack.Gizeh), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian, CardBack.Gizeh), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Gizeh), //
			new CardTypeQuantity(0, CardType.CardWar_archer, CardBack.Gizeh), // 0 !
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor, CardBack.Gizeh), //
			new CardTypeQuantity(3, CardType.CardPolitic_cat, CardBack.Gizeh) //
	);

	/** Card Types x Quantities for Rhodes Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Rhodes = Arrays.asList(
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardMaterialGold, CardBack.Rhodes), //
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardScienceMechanic, CardBack.Rhodes), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect, CardBack.Rhodes), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Rhodes), //
			new CardTypeQuantity(1, CardType.CardWar_archer, CardBack.Rhodes), //
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor, CardBack.Rhodes), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat, CardBack.Rhodes) //
	);

	/** Card Types x Quantities for Babylon Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Babylon = Arrays.asList(
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, CardBack.Babylone), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, CardBack.Babylone), //
			new CardTypeQuantity(2-1, CardType.CardMaterialBrick, CardBack.Babylone), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Babylone), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass, CardBack.Babylone), //
			new CardTypeQuantity(2+1, CardType.CardMaterialGold, CardBack.Babylone), // 2+1
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw, CardBack.Babylone), //
			new CardTypeQuantity(2, CardType.CardScienceMechanic, CardBack.Babylone), //
			new CardTypeQuantity(2, CardType.CardScienceArchitect, CardBack.Babylone), //
			// war
			new CardTypeQuantity(1, CardType.CardWar_barbarian, CardBack.Babylone), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Babylone), //
			new CardTypeQuantity(1, CardType.CardWar_archer, CardBack.Babylone), //
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor, CardBack.Babylone), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat, CardBack.Babylone) //
	);
	
	/** Card Types x Quantities for Halicarnasse Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Halicarnasse = Arrays.asList(
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, CardBack.Halicarnasse), //
			new CardTypeQuantity(1, CardType.CardMaterialPaper, CardBack.Halicarnasse), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialBrick, CardBack.Halicarnasse), //
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Halicarnasse), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass, CardBack.Halicarnasse), //
			new CardTypeQuantity(3, CardType.CardMaterialGold, CardBack.Halicarnasse), // 2+1
			// science
			new CardTypeQuantity(2, CardType.CardScienceLaw, CardBack.Halicarnasse), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic, CardBack.Halicarnasse), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect, CardBack.Halicarnasse), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian, CardBack.Halicarnasse), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Halicarnasse), //
			new CardTypeQuantity(1, CardType.CardWar_archer, CardBack.Halicarnasse), //
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor, CardBack.Halicarnasse), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat, CardBack.Halicarnasse) //
	);

	/** Card Types x Quantities for Alexandrie Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Alexandrie = Arrays.asList(
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, CardBack.Alexandrie), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, CardBack.Alexandrie), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick, CardBack.Alexandrie), //
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Alexandrie), //
			new CardTypeQuantity(1, CardType.CardMaterialGlass, CardBack.Alexandrie), // 2-1
			new CardTypeQuantity(4, CardType.CardMaterialGold, CardBack.Alexandrie), // 2+2
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw, CardBack.Alexandrie), //
			new CardTypeQuantity(2, CardType.CardScienceMechanic, CardBack.Alexandrie), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect, CardBack.Alexandrie), //
			// war
			new CardTypeQuantity(1, CardType.CardWar_barbarian, CardBack.Alexandrie), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Alexandrie), //
			new CardTypeQuantity(1, CardType.CardWar_archer, CardBack.Alexandrie), //
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor, CardBack.Alexandrie), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat, CardBack.Alexandrie) //
	);

	/** Card Types x Quantities for Ephese Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Ephese = Arrays.asList(
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass, CardBack.Ephese), //
			new CardTypeQuantity(3, CardType.CardMaterialGold, CardBack.Ephese), // 2+1
			// science
			new CardTypeQuantity(2, CardType.CardScienceLaw, CardBack.Ephese), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardScienceArchitect, CardBack.Ephese), //
			// war
			new CardTypeQuantity(1, CardType.CardWar_barbarian, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Ephese), //
			new CardTypeQuantity(1, CardType.CardWar_archer, CardBack.Ephese), //
			// politics
			new CardTypeQuantity(1, CardType.CardPolitic_emperor, CardBack.Ephese), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat, CardBack.Ephese) //
	);

	/** Card Types x Quantities for Olympie Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Olympie = Arrays.asList(
			// material
			new CardTypeQuantity(1, CardType.CardMaterialWood, CardBack.Olympie), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialPaper, CardBack.Olympie), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick, CardBack.Olympie), //
			new CardTypeQuantity(2, CardType.CardMaterialStone, CardBack.Olympie), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass, CardBack.Olympie), //
			new CardTypeQuantity(3, CardType.CardMaterialGold, CardBack.Olympie), // 2+1
			// science
			new CardTypeQuantity(2, CardType.CardScienceLaw, CardBack.Olympie), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic, CardBack.Olympie), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect, CardBack.Olympie), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian, CardBack.Olympie), //
			new CardTypeQuantity(2, CardType.CardWar_centurion, CardBack.Olympie), //
			new CardTypeQuantity(1, CardType.CardWar_archer, CardBack.Olympie), //
			// politics
			new CardTypeQuantity(1, CardType.CardPolitic_emperor, CardBack.Olympie), //
			new CardTypeQuantity(3, CardType.CardPolitic_cat, CardBack.Olympie) //
	);

	/** Card Types x Quantities for extra Question Deck */ // C'est la pioche centrale
	public static final List<CardTypeQuantity> deckCardQuantities_Extra = Arrays.asList(
			// material
			new CardTypeQuantity(4, CardType.CardMaterialWood, null), //
			new CardTypeQuantity(4, CardType.CardMaterialPaper, null), //
			new CardTypeQuantity(4, CardType.CardMaterialBrick, null), //
			new CardTypeQuantity(4, CardType.CardMaterialStone, null), //
			new CardTypeQuantity(4, CardType.CardMaterialGlass, null), //
			new CardTypeQuantity(6, CardType.CardMaterialGold, null), //
			// science
			new CardTypeQuantity(4, CardType.CardScienceLaw, null), //
			new CardTypeQuantity(4, CardType.CardScienceMechanic, null), //
			new CardTypeQuantity(4, CardType.CardScienceArchitect, null), //
			// war
			new CardTypeQuantity(4, CardType.CardWar_barbarian, null), //
			new CardTypeQuantity(4, CardType.CardWar_centurion, null), //
			new CardTypeQuantity(2, CardType.CardWar_archer, null), //
			// politics
			new CardTypeQuantity(4, CardType.CardPolitic_emperor, null), //
			new CardTypeQuantity(8, CardType.CardPolitic_cat, null) //
	);
}
