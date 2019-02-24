package rpg;

import java.util.ArrayList;
import java.util.List;

public class character extends main{

	static String heroName;
	static claass heroClaass;
	static int heroHP,heroMP,heroS,heroA,heroI,heroL;
	static double heroEXP=0;
	static double heroLVL=1;
	static item eWeapon;
	static item eArmor;
	static List<item> bag = new ArrayList <item>();
	static int gold;
	
	
	void chooseClaass(){
		int p=1;
		switch (p) {
		case 1: heroClaass=claass.knight;
		setFirstStat();
		giveItem(item.commonSwordShield, item.commonDualSword, item.commonTwoSword, item.commonHeavyArmor);
		equipWeapon();
		equipArmor();
			break;
		case 2: heroClaass=claass.ranger;
		setFirstStat();
		giveItem(item.commonBow, item.commonDagger, item.commonCrossBow, item.commonLightArmor);
		equipWeapon();
		equipArmor();
			break;
		case 3: heroClaass=claass.mage;
		setFirstStat();
		giveItem(item.commonWand, item.commonScepter, item.commonStaff, item.commonRobe);
		equipWeapon();
		equipArmor();
			break;
		case 4:	heroClaass=claass.viking;
		setFirstStat();
		giveItem(item.commonTwoAxe, item.commonDualAxe, item.commonAxeShield, item.commonMidArmor);
		equipWeapon();
		equipArmor();
			break;
		}
	}
	void setFirstStat(){
		heroHP=heroClaass.HP;
		heroMP=heroClaass.MP;
		heroS=heroClaass.S;
		heroA=heroClaass.A;
		heroI=heroClaass.I;
		heroL=heroClaass.L;
	}
	
	void giveItem(item item0, item...items){
		for(int i=0; i<items.length; i++)
			{
		bag.add(items[i]);
		System.out.println("You have received: ");
		item.showFullItemDescription(items[i]);
			}
	}
	
	void equipWeapon(){
		showBag();
		int e=0; // dopisaæ wprowadzanie z klawiatury
		if ((bag.get(e)).itemTypes==itemType.weapon){
		if ((bag.get(e)).itemClaass==heroClaass) {
			bag.add(eWeapon);
			eWeapon = bag.get(e);
			heroHP = heroClaass.HP + bag.get(e).HP + eArmor.HP;
			heroMP = heroClaass.MP + bag.get(e).MP + eArmor.MP;
			heroS = heroClaass.S + bag.get(e).S + eArmor.S;
			heroA = heroClaass.A + bag.get(e).A + eArmor.A;
			heroI = heroClaass.I + bag.get(e).I + eArmor.I;
			heroL = heroClaass.L + bag.get(e).L + eArmor.L;
			bag.remove(e);
		}
		else System.out.println("Wrong class of item, you can equip this weapon");
		}else System.out.println("This is not Weapon!");
		}
	
	void equipArmor(){
		showBag();
		int e=0;//dopisaæ wprowadzanie z klawiatury
		if ((bag.get(e)).itemTypes==itemType.armor){
		if ((bag.get(e)).itemClaass==heroClaass) 
			{
			bag.add(eArmor);
			eArmor = bag.get(e);
			heroHP = heroClaass.HP + bag.get(e).HP + eWeapon.HP;
			heroMP = heroClaass.MP + bag.get(e).MP + eWeapon.MP;
			heroS = heroClaass.S + bag.get(e).S + eWeapon.S;
			heroA = heroClaass.A + bag.get(e).A + eWeapon.A;
			heroI = heroClaass.I + bag.get(e).I + eWeapon.I;
			heroL = heroClaass.L + bag.get(e).L + eWeapon.L;
			bag.remove(e);
			}
		else System.out.println("Wrong class of item, you can equip this armor");
	}else System.out.println("This is not Armor!");
		}
	
	void showBag() {
		for(int i =0;i<bag.size();i++){
			System.out.print(i +" item: ");
			item.showShortItemDescription(bag.get(i));
		}
		//mozliwosc rozwiniecia opisu konkretnego przedmiotu jako showFullItemDescription
			
	}
	
	void sellItem() {
		showBag();
		int r=0;//do wprowadzenia z klawiatury
		bag.remove(r);
	}
	
	public static void showLVL() { 
	System.out.println("Your actually LVL is: " + heroLVL + " and you have " + heroEXP + "/" + (100*(Math.pow((1.2),heroLVL))) + " EXP.");	//mozna sparsowac na int przy wyswietlaniu
	}
	
	
	
}
