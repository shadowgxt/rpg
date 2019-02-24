package rpg;

public enum monster {
	skeletonKnight(50, 5, 6, 10),
	skeletonRanger(25, 8, 3, 10),
	skeletonMage(15, 15, 2, 20),
	zombie(80, 3, 6, 15),
	dryad(100, 7, 7, 20),
	wywern(50, 5, 8, 20),
	dragon(200, 10, 10, 100),
	litch(70, 10, 5, 18),
	rabbit(5, 1, 1, 5);
	
	int monsterHP;
	int monsterATT;
	int monsterDEF;
	double monsterEXP;
	
	private monster(int monsterHP, int monsterATT, int monsterDEF, double monsterEXP){
		this.monsterHP = monsterHP;
		this.monsterATT= monsterATT;
		this.monsterDEF = monsterDEF;
		this.monsterEXP= monsterEXP;
		
	}
	
	

}
