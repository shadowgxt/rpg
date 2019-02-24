package rpg;

public enum rarity {
common('c',0),
uncommon('u',1),
rare('r',2),
special('s',3),
legendary('l',4),
mythical('m',5);
	
	char letterSign;
	int numberSign;
	
	rarity(char letterSign, int numberSign) {
		this.letterSign=letterSign;
		this.numberSign=numberSign;
	}
}
