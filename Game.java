import java.util.Random;

public class Game {
	Random rand = new Random();
	
	int maxMonHealth = 75;  // maximum enemy health
	int monDamage = 25; // maximum monster damage
	int hp = 100;
	int atkDmg = 50;
	int potionAmount = 3;
	int potionDropChance = 50; // defeated enemies have 50% chance to drop a potion
	int potionHealAmount = 30;
	int healthPoints;
	
	private int atkStat;
	private int currentLevel;
	private int charClass;
	private int newLevel;
	private int locMap;
	private String enemyMon;
	
	public int getMap() {
		return locMap;
	}
	
	public void setMap(int map) {
		this.locMap = map;
	}
	
	public int getnLevel() {
		return newLevel;
	}
	
	public void setnLevel(int nlevel) {
		this.newLevel = nlevel;
	}
	
	public int getcClass() {
		return charClass;
	}
	
	public void setcClass(int cclass) {
		this.charClass = cclass;
	}
	
	public String getEnemy() {
		return enemyMon;
	}
	
	public void setEnemy(String enemy) {
		this.enemyMon = enemy;
	}
	
	public int getAtk() {
		return atkStat;
	}
	
	public void setAtk(int atk) {
		this.atkStat = atk;
	}
	
	public int getHP() {
		return healthPoints;
	}
	
	public void setHP(int hp) {
		this.healthPoints = hp;
	}
	
	public int getPotion() {
		return potionAmount;
	}
	
	public void setPotion(int potions) {
		this.potionAmount = potions;
	}
	
	public int getLevel() {
		return currentLevel;
	}
	
	public void setLevel(int level) {
		this.currentLevel = level;
	} 

public void potionDrop() {
	System.out.println(" # Remaining HP: " + hp);
	if(rand.nextInt(100) < potionDropChance){
		potionAmount++;
		System.out.println(" # Potion Drop: 1 ");
		System.out.println(" # Potion Inventory: " + potionAmount);				
	}
}
}