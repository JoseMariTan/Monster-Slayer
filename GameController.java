
public class GameController {
	private Game model;
	private GameView view;
	
	public GameController(Game model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setlocMap(int map) {
		model.setMap(map);
	}
	
	public int getlocMap() {
		return model.getMap();
	}

	public void setnewLevel(int nlevel) {
		model.setnLevel(nlevel);
	}
	
	public int getnewLevel() {
		return model.getnLevel();
	}
	
	
	public void setcharClass(int cclass) {
		model.setcClass(cclass);
	}
	public int getcharClass() {
		return model.getcClass();
	}
	
	public void setenemyMon(String enemy) {
		model.setEnemy(enemy);
	}
	
	public String getenemyMon() {
		return model.getEnemy();
	}

	public void setatkStat(int atk) {
		model.setAtk(atk);
	}
	
	public int getatkStat() {
		return model.getAtk();
	}
	
	public void sethealthPoints(int hp) {
		model.setHP(hp);
	}
	
	public int gethealthPoints() {
		return model.getHP();
	}
	
	public void setpotionAmount(int potions) {
		model.setPotion(potions);
	}
	
	public int getpotionAmount() {
		return model.getPotion();
	}
	
	public void setcurrentLevel(int level) {
		model.setLevel(level);
	}
	
	public int getcurrentLevel() {
		return model.getLevel();
	}
	public void updateView() {
		view.printGame(model.getHP(), model.getPotion(), model.getLevel(), model.getAtk(), model.getEnemy(), 
				model.getcClass(), model.getnLevel(), model.getMap());
	}
}
