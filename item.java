package rpg;

public enum item {
	//knight weapon
commonSwordShield(1, 10, 10,0,0,0,0,5,claass.knight,rarity.common, itemType.weapon),
uncommonSwordShield(5, 10, 10,0,0,0,0,5,claass.knight,rarity.uncommon, itemType.weapon),
rareSwordShield(10, 10, 10,0,0,0,0,5,claass.knight,rarity.rare, itemType.weapon),
specialSwordShield(15, 10, 10,0,0,0,0,5,claass.knight,rarity.special, itemType.weapon),
legendarySwordShield(20, 10, 10,0,0,0,0,5,claass.knight,rarity.legendary, itemType.weapon),
mythicalSwordShield(25, 10, 10,0,0,0,0,5,claass.knight,rarity.mythical, itemType.weapon),
commonDualSword(1, 10, 10,0,0,0,0,5,claass.knight,rarity.common, itemType.weapon),
uncommonDualSword(5, 10, 10,0,0,0,0,5,claass.knight,rarity.uncommon, itemType.weapon),
rareDualSword(10, 10, 10,0,0,0,0,5,claass.knight,rarity.rare, itemType.weapon),
specialDualSword(15, 10, 10,0,0,0,0,5,claass.knight,rarity.special, itemType.weapon),
legendaryDualSword(20, 10, 10,0,0,0,0,5,claass.knight,rarity.legendary, itemType.weapon),
mythicalDualSword(25, 10, 10,0,0,0,0,5,claass.knight,rarity.mythical, itemType.weapon),
commonTwoSword(1, 10, 10,0,0,0,0,5,claass.knight,rarity.common, itemType.weapon),
uncommonTwoSword(5, 10, 10,0,0,0,0,5,claass.knight,rarity.uncommon, itemType.weapon),
rareTwoSword(10, 10, 10,0,0,0,0,5,claass.knight,rarity.rare, itemType.weapon),
specialTwoSword(15, 10, 10,0,0,0,0,5,claass.knight,rarity.special, itemType.weapon),
legendaryTwoSword(20, 10, 10,0,0,0,0,5,claass.knight,rarity.legendary, itemType.weapon),
mythicalTwoSword(25, 10, 10,0,0,0,0,5,claass.knight,rarity.mythical, itemType.weapon),
	//ranger weapon
commonBow(1, 10, 10,0,0,0,0,5,claass.ranger,rarity.common, itemType.weapon),
uncommonBow(5, 10, 10,0,0,0,0,5,claass.ranger,rarity.uncommon, itemType.weapon),
rareBow(10, 10, 10,0,0,0,0,5,claass.ranger,rarity.rare, itemType.weapon),
specialBow(15, 10, 10,0,0,0,0,5,claass.ranger,rarity.special, itemType.weapon),
legendaryBow(20, 10, 10,0,0,0,0,5,claass.ranger,rarity.legendary, itemType.weapon),
mythicalBow(25, 10, 10,0,0,0,0,5,claass.ranger,rarity.mythical, itemType.weapon),
commonDagger(1, 10, 10,0,0,0,0,5,claass.ranger,rarity.common, itemType.weapon),
uncommonDagger(5, 10, 10,0,0,0,0,5,claass.ranger,rarity.uncommon, itemType.weapon),
rareDagger(10, 10, 10,0,0,0,0,5,claass.ranger,rarity.rare, itemType.weapon),
specialDagger(15, 10, 10,0,0,0,0,5,claass.ranger,rarity.special, itemType.weapon),
legendaryDagger(20, 10, 10,0,0,0,0,5,claass.ranger,rarity.legendary, itemType.weapon),
mythicalDagger(25, 10, 10,0,0,0,0,5,claass.ranger,rarity.mythical, itemType.weapon),
commonCrossBow(1, 10, 10,0,0,0,0,5,claass.ranger,rarity.common, itemType.weapon),
uncommonCrossBow(5, 10, 10,0,0,0,0,5,claass.ranger,rarity.uncommon, itemType.weapon),
rareCrossBow(10, 10, 10,0,0,0,0,5,claass.ranger,rarity.rare, itemType.weapon),
specialCrossBow(15, 10, 10,0,0,0,0,5,claass.ranger,rarity.special, itemType.weapon),
legendaryCrossBow(20, 10, 10,0,0,0,0,5,claass.ranger,rarity.legendary, itemType.weapon),
mythicalCrossBow(25, 10, 10,0,0,0,0,5,claass.ranger,rarity.mythical, itemType.weapon),
	//mage weapon
commonWand(1, 10, 10,0,0,0,0,5,claass.mage,rarity.common, itemType.weapon),
uncommonWand(5, 10, 10,0,0,0,0,5,claass.mage,rarity.uncommon, itemType.weapon),
rareWand(10, 10, 10,0,0,0,0,5,claass.mage,rarity.rare, itemType.weapon),
specialWand(15, 10, 10,0,0,0,0,5,claass.mage,rarity.special, itemType.weapon),
legendaryWand(20, 10, 10,0,0,0,0,5,claass.mage,rarity.legendary, itemType.weapon),
mythicalWand(25, 10, 10,0,0,0,0,5,claass.mage,rarity.mythical, itemType.weapon),
commonScepter(1, 10, 10,0,0,0,0,5,claass.mage,rarity.common, itemType.weapon),
uncommonScepter(5, 10, 10,0,0,0,0,5,claass.mage,rarity.uncommon, itemType.weapon),
rareScepter(10, 10, 10,0,0,0,0,5,claass.mage,rarity.rare, itemType.weapon),
specialScepter(15, 10, 10,0,0,0,0,5,claass.mage,rarity.special, itemType.weapon),
legendaryScepter(20, 10, 10,0,0,0,0,5,claass.mage,rarity.legendary, itemType.weapon),
mythicalScepter(25, 10, 10,0,0,0,0,5,claass.mage,rarity.mythical, itemType.weapon),
commonStaff(1, 10, 10,0,0,0,0,5,claass.mage,rarity.common, itemType.weapon),
uncommonStaff(5, 10, 10,0,0,0,0,5,claass.mage,rarity.uncommon, itemType.weapon),
rareStaff(10, 10, 10,0,0,0,0,5,claass.mage,rarity.rare, itemType.weapon),
specialStaff(15, 10, 10,0,0,0,0,5,claass.mage,rarity.special, itemType.weapon),
legendaryStaff(20, 10, 10,0,0,0,0,5,claass.mage,rarity.legendary, itemType.weapon),
mythicalStaff(25, 10, 10,0,0,0,0,5,claass.mage,rarity.mythical, itemType.weapon),
	//viking weapon
commonTwoAxe(1, 10, 10,0,0,0,0,5,claass.viking,rarity.common, itemType.weapon),
uncommonTwoAxe(5, 10, 10,0,0,0,0,5,claass.viking,rarity.uncommon, itemType.weapon),
rareTwoAxe(10, 10, 10,0,0,0,0,5,claass.viking,rarity.rare, itemType.weapon),
specialTwoAxe(15, 10, 10,0,0,0,0,5,claass.viking,rarity.special, itemType.weapon),
legendaryTwoAxe(20, 10, 10,0,0,0,0,5,claass.viking,rarity.legendary, itemType.weapon),
mythicalTwoAxe(25, 10, 10,0,0,0,0,5,claass.viking,rarity.mythical, itemType.weapon),
commonDualAxe(1, 10, 10,0,0,0,0,5,claass.viking,rarity.common, itemType.weapon),
uncommonDualAxe(5, 10, 10,0,0,0,0,5,claass.viking,rarity.uncommon, itemType.weapon),
rareDualAxe(10, 10, 10,0,0,0,0,5,claass.viking,rarity.rare, itemType.weapon),
specialDualAxe(15, 10, 10,0,0,0,0,5,claass.viking,rarity.special, itemType.weapon),
legendaryDualAxe(20, 10, 10,0,0,0,0,5,claass.viking,rarity.legendary, itemType.weapon),
mythicalDualAxe(25, 10, 10,0,0,0,0,5,claass.viking,rarity.mythical, itemType.weapon),
commonAxeShield(1, 10, 10,0,0,0,0,5,claass.viking,rarity.common, itemType.weapon),
uncommonAxeShield(5, 10, 10,0,0,0,0,5,claass.viking,rarity.uncommon, itemType.weapon),
rareAxeShield(10, 10, 10,0,0,0,0,5,claass.viking,rarity.rare, itemType.weapon),
specialAxeShield(15, 10, 10,0,0,0,0,5,claass.viking,rarity.special, itemType.weapon),
legendaryAxeShield(20, 10, 10,0,0,0,0,5,claass.viking,rarity.legendary, itemType.weapon),
mythicalAxeShield(25, 10, 10,0,0,0,0,5,claass.viking,rarity.mythical, itemType.weapon),
	//knight armor
commonHeavyArmor(1, 10, 10,0,0,0,0,10,claass.knight,rarity.common, itemType.armor),
uncommonHeavyArmor(5, 10, 10,0,0,0,0,10,claass.knight,rarity.uncommon, itemType.armor),
rareHeavyArmor(10, 10, 10,0,0,0,0,10,claass.knight,rarity.rare, itemType.armor),
specialHeavyArmor(15, 10, 10,0,0,0,0,10,claass.knight,rarity.special, itemType.armor),
legendaryHeavyArmor(20, 10, 10,0,0,0,0,10,claass.knight,rarity.legendary, itemType.armor),
mythicalHeavyArmor(25, 10, 10,0,0,0,0,10,claass.knight,rarity.mythical, itemType.armor),
	//ranger armor
commonLightArmor(1, 10, 10,0,0,0,0,10,claass.ranger,rarity.common, itemType.armor),
uncommonLightArmor(5, 10, 10,0,0,0,0,10,claass.ranger,rarity.uncommon, itemType.armor),
rareLightArmor(10, 10, 10,0,0,0,0,10,claass.ranger,rarity.rare, itemType.armor),
specialLightArmor(15, 10, 10,0,0,0,0,10,claass.ranger,rarity.special, itemType.armor),
legendaryLightArmor(20, 10, 10,0,0,0,0,10,claass.ranger,rarity.legendary, itemType.armor),
mythicalLightArmor(25, 10, 10,0,0,0,0,10,claass.ranger,rarity.mythical, itemType.armor),
	//mage armor
commonRobe(1, 10, 10,0,0,0,0,10,claass.mage,rarity.common, itemType.armor),
uncommonRobe(5, 10, 10,0,0,0,0,10,claass.mage,rarity.uncommon, itemType.armor),
rareRobe(10, 10, 10,0,0,0,0,10,claass.mage,rarity.rare, itemType.armor),
specialRobe(15, 10, 10,0,0,0,0,10,claass.mage,rarity.special, itemType.armor),
legendaryRobe(20, 10, 10,0,0,0,0,10,claass.mage,rarity.legendary, itemType.armor),
mythicalRobe(25, 10, 10,0,0,0,0,10,claass.mage,rarity.mythical, itemType.armor),
	//viking armor
commonMidArmor(1, 10, 10,0,0,0,0,10,claass.viking,rarity.common, itemType.armor),
uncommonMidArmor(5, 10, 10,0,0,0,0,10,claass.viking,rarity.uncommon, itemType.armor),
rareMidArmor(10, 10, 10,0,0,0,0,10,claass.viking,rarity.rare, itemType.armor),
specialkMidArmor(15, 10, 10,0,0,0,0,10,claass.viking,rarity.special, itemType.armor),
legendaryMidArmor(20, 10, 10,0,0,0,0,10,claass.viking,rarity.legendary, itemType.armor),
mythicalMidArmor(25, 10, 10,0,0,0,0,10,claass.viking,rarity.mythical, itemType.armor);


	itemType itemTypes;
	claass itemClaass;
	int LVL,HP,MP,S,A,I,L,gold;
	rarity raritys;
	
	private item (int LVL,int HP,int MP,int S,int A,int I,int L,int gold,claass itemClaass, rarity raritys, itemType itemTypes) {
		this.itemClaass=itemClaass;
		this.LVL=LVL;
		this.HP=HP;
		this.MP=MP;
		this.S=S;
		this.A=A;
		this.I=I;
		this.L=L;
		this.gold=gold;
		this.itemTypes=itemTypes;
		this.raritys=raritys;
		
	}
	
	public static void showFullItemDescription(item itemName){
		System.out.println(itemName + " posiada nastêpuj¹ce statystyki: ");
		System.out.print("LVL: " + itemName.LVL + "\n");
		if(itemName.HP>0) System.out.print(" HP: " + itemName.HP + " ");
		if(itemName.MP>0) System.out.print(" MP: " + itemName.MP + " ");
		if(itemName.S>0) System.out.print(" S: " + itemName.S + " ");
		if(itemName.A>0) System.out.print(" A: " + itemName.A + " ");
		if(itemName.I>0) System.out.print(" I: " + itemName.I + " ");
		if(itemName.L>0) System.out.print(" L: " + itemName.L + " ");
		System.out.print("\n" + " Sell price: " + itemName.gold + " gold coins\n");
		System.out.print(" Rarity: " + itemName.raritys + "\n");
		System.out.print(" Typ: " + itemName.itemTypes + "\n");
		System.out.print(" Class: " + itemName.itemClaass + "\n");	
	}
	
	public static void showShortItemDescription(item itemName){
		System.out.print(itemName + " w skrocie: ");
		System.out.print("LVL: " + itemName.LVL + "\n");
		System.out.print("\n" + " Sell price: " + itemName.gold + " gold coins");
		System.out.print(" Rarity: " + itemName.raritys);
		System.out.print(" Typ: " + itemName.itemTypes);
		System.out.print(" Class: " + itemName.itemClaass);	
	}
}
