package rpg;

public enum itemType {
	weapon('W',1), 
	armor('A',2);
	
	char letterSign;
	int numberSign;
	
	itemType (char letterSign, int numberSign){
		this.letterSign=letterSign;
		this.numberSign=numberSign;
	}

}
