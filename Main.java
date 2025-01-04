public class Main {
	public static void main (String[] args) {
		Game model = startUp();
		GameView view = new GameView();
		GameController controller = new GameController(model, view);
		controller.updateView();
	}
	
	private static Game startUp() {
		Game game = new Game();
		Menu start = new Menu();
		start.charSelection();
		start.mapSelection();
		start.enemySelection();
		start.encounterStart();
		start.proceedOrexit();
		return game;
	}
}