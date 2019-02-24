package rpg;

import java.util.Random;

public class fight extends character {
	Random rand = new Random();
	public fight(int difficulty) {
		
		int heroAttack = attack ();
		double m = rand.nextDouble();
		double n = rand.nextInt();
		double g = rand.nextInt();
		
		
	}
	
	public monster createMonster(){
		
	}
	
	public void monster (double monsterHP, double monsterAttack, double monsterDef, int difficulty){
	if (difficulty == 0) double monsterLVL = heroLVL;
		else if (difficulty == 1) double monsterLVL = heroLVL +1;
		else if (difficulty == 2) double monsterLVL = heroLVL +2;
		else if (difficulty == 3) double monsterLVL = heroLVL+4;
		monsterHP = monsterHP * monsterLVL;
		monsterAttack = monsterAttack * monsterLVL;
		monsterDef = monsterDef * monsterLVL;
		
	}
	
	public int attack () {
		int attack = 0;
		if (heroClaass == claass.knight || heroClaass == claass.viking)
			attack = (heroS*2*eWeapon.S);
			else if (heroClaass == claass.mage)
			attack = (heroI*2*eWeapon.I);
			else if (heroClaass == claass.ranger)
			attack = (heroA*2*eWeapon.S);
		return attack;
	}
}
