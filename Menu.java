import java.util.Random;
import java.util.Scanner;

public class Menu{
	Scanner sc = new Scanner(System.in); 
	Random rand = new Random();
	Game game = new Game();
	
	int expGrant = 100;
	int totalExp = 0;
	int toNextLevel = 0;
	int baseLevel = 5;
	
	String[] forestMon = {"Elf", "Dark Elf", "Dryad", "Wild Boar", "Ent"};
	String[] mountainMon = {"Troll", "Golem", "Werewolf", "Ogre", "Dragon"};
	String[] riverMon = {"Black Slime", "Venomous Squid", "Bandit", "Medusa Mermaid", "Leviathan"};
			
	public void charSelection() {
		   	System.out.println("\t**MONSTER SLAYER**");
			System.out.println("-------------------------------------");
			System.out.println("Please select a character class:");
			System.out.println("\t[1] Fighter");
			System.out.println("\tAtk: 80 HP: 100");
			System.out.println("\t         />____________\r\n"
					+ "\t[########[]____________>\r\n"
					+ "\t         \\>");
			System.out.println("\t[2] Mage");
			System.out.println("\tAtk: 90 HP: 100");
			
			System.out.println("\t     __/\\__\r\n"
					+ "\t. _  \\\\''//\r\n"
					+ "\t-( )-/_||_\\\r\n"
					+ "\t .'. \\_()_/\r\n"
					+ "\t  |   | . \\\r\n"
					+ "\t  |###| .  \\\r\n"
					+ "\t .'. ,\\_____'.\n");
			System.out.println("\t[3] Tank)");
			System.out.println("\tAtk: 70 HP: 100");
			System.out.println("\t    .--._____,\r\n"
					+ "\t .-='=='==-, \"\r\n"
					+ "\t(O_o_o_o_o_O) ");

			int charClass = sc.nextInt();
			if(charClass == 1) {
				game.setAtk(80);
				game.setcClass(1);
				System.out.println("*Fighter class selected*");
			}	
			else if (charClass == 2) {
				game.setAtk(90);
				game.setcClass(2);
				System.out.println("*Mage class selected*");
			}
			else if (charClass == 3) {
				game.setAtk(70);
				game.setcClass(3);
				System.out.println("*Tank class selected*");
			}
			else {
				System.out.println("Invalid Input!");
				charSelection();
			}
		}
	public void mapSelection() {
		System.out.println("Please select a map:");
		System.out.println("\t[1] Forest of Darkness\n"
				+ "\t       _-_\r\n"
				+ "\t    /~~   ~~\\\r\n"
				+ "\t /~~         ~~\\\r\n"
				+ "\t{               }\r\n"
				+ "\t \\  _-     -_  /\r\n"
				+ "\t   ~  \\\\ //  ~\r\n"
				+ "\t_- -   | | _- _\r\n"
				+ "\t  _ -  | |   -_\r\n"
				+ "\t      // \\\\\n");
		System.out.println("\t[2] Mountain Peak\n\n"
				+ " ---.____    ,/k.\r\n"
				+ "  ___,---'  /  ih,__,-----.___\r\n"
				+ "         ,-' ,  `:7b----.__---`\r\n"
				+ "     _.-/   '  /b.`.4p,\r\n"
				+ "  --\"  ,    ,-' ^6x, `.\"^=._\r\n\n"
				+ "");
		System.out.println("\t[3] River of Death\n\n"
				+ "         |\r\n"
				+ "        \\ _ /\r\n"
				+ "      -= (_) =-\r\n"
				+ "        /   \\         _\\/_\r\n"
				+ "          |           //o\\  _\\/_\r\n"
				+ "   _____ _ __ __ ____ _ | __/o\\\\ _\r\n"
				+ " =-=-_-__=_-= _=_=-=_,-'|\"'\"\"-|-,_\r\n"
				+ "  =- _=-=- -_=-=_,-\"          |\r\n"
				+ "    =- =- -=.--\"\n");
	}
	public void enemySelection(){
		int selectedMap = sc.nextInt();
		switch (selectedMap) {
		case 1:
			game.setMap(1);
			String enemyF = forestMon[rand.nextInt(forestMon.length)];
			game.setEnemy(enemyF);
			System.out.println("\t" + enemyF + " found!\n"
					+ "                __.-/|\r\n"
					+ "               \\`o_O'\r\n"
					+ "                 =( )=  +-----+\r\n"
					+ "                   U|   | heh |\r\n"
					+ "        /\\  /\\  / |   +-----+\r\n"
					+ "     ) /^\\) ^\\/ _)\\     |\r\n"
					+ "      )   /^\\/   _) \\    |\r\n"
					+ "       )   _ /  / _)  \\___|_\r\n"
					+ " /\\  )/\\/ ||  | )_)\\___,|))\r\n"
					+ "<  >      |(,,) )__)    |\r\n"
					+ " ||      /    \\)___)\\\r\n"
					+ " | \\____(      )___) )____\r\n"
					+ "  \\______(_______;;;)__;;;)\n");
			break;
		case 2:
			game.setMap(2);
			String enemyM = mountainMon[rand.nextInt(mountainMon.length)];
			game.setEnemy(enemyM);
			System.out.println("\t" + enemyM + " found!\n"
					+ "        ,     \\    /      ,        \r\n"
					+ "      / \\    )\\__/(     / \\       \r\n"
					+ "     /   \\  (_\\  /_)   /   \\      \r\n"
					+ " ___/_____\\__\\@  @/___/_____\\____ \r\n"
					+ "|             |\\../|               |\r\n"
					+ "|              \\VV/                |\r\n"
					+ "|      Yes, I'm monster. rawr.      |\r\n"
					+ "|___________________________________|\r\n"
					+ " |    /\\ /      \\\\       \\ /\\    | \r\n"
					+ " |  /   V        ))       V   \\  | \r\n"
					+ " |/     `       //        '     \\| \r\n"
					+ " `              V                '\n");
			break;
		case 3:
			game.setMap(3);
			String enemyR = riverMon[rand.nextInt(riverMon.length)];
			game.setEnemy(enemyR);
			System.out.println("\t" + enemyR + " found!\n"
					+ "       ---_ ......._-_--.\r\n"
					+ "      (|\\ /      / /| \\  \\\r\n"
					+ "      /  /     .'  -=-'   `.\r\n"
					+ "     /  /    .'             )\r\n"
					+ "   _/  /   .'        _.)   /\r\n"
					+ "  / o   o        _.-' /  .'\r\n"
					+ "  \\          _.-'    / .'*|\r\n"
					+ "   \\______.-'//    .'.' \\*|\r\n"
					+ "    \\|  \\ | //   .'.' _ |*|\r\n"
					+ "     `   \\|//  .'.'_ _ _|*|\r\n"
					+ "      .  .// .'.' | _ _ \\*|\r\n"
					+ "      \\`-|\\_/ /    \\ _ _ \\*\\\r\n"
					+ "       `/'\\__/      \\ _ _ \\*\\\r\n"
					+ "      /^|            \\ _ _ \\*\r\n"
					+ "     '  `             \\ _ _ \\ \n"
					+ "                       \\_\n");
			break;
		default:
			System.out.println("Invalid Input!");
			mapSelection();
			break;
		}
	}
	
	public void enemySelection2() {
		switch (game.getMap()) {
		case 1:
			game.setMap(1);
			String enemyF = forestMon[rand.nextInt(forestMon.length)];
			game.setEnemy(enemyF);
			System.out.println("\t" + enemyF + " found!\n"
					+ "                __.-/|\r\n"
					+ "               \\`o_O'\r\n"
					+ "                 =( )=  +-----+\r\n"
					+ "                   U|   | heh |\r\n"
					+ "        /\\  /\\  / |   +-----+\r\n"
					+ "     ) /^\\) ^\\/ _)\\     |\r\n"
					+ "      )   /^\\/   _) \\    |\r\n"
					+ "       )   _ /  / _)  \\___|_\r\n"
					+ " /\\  )/\\/ ||  | )_)\\___,|))\r\n"
					+ "<  >      |(,,) )__)    |\r\n"
					+ " ||      /    \\)___)\\\r\n"
					+ " | \\____(      )___) )____\r\n"
					+ "  \\______(_______;;;)__;;;)\n");
			break;
		case 2:
			game.setMap(2);
			String enemyM = mountainMon[rand.nextInt(mountainMon.length)];
			game.setEnemy(enemyM);
			System.out.println("\t" + enemyM + " found!\n"
					+ "        ,     \\    /      ,        \r\n"
					+ "      / \\    )\\__/(     / \\       \r\n"
					+ "     /   \\  (_\\  /_)   /   \\      \r\n"
					+ " ___/_____\\__\\@  @/___/_____\\____ \r\n"
					+ "|             |\\../|               |\r\n"
					+ "|              \\VV/                |\r\n"
					+ "|      Yes, I'm monster. rawr.      |\r\n"
					+ "|___________________________________|\r\n"
					+ " |    /\\ /      \\\\       \\ /\\    | \r\n"
					+ " |  /   V        ))       V   \\  | \r\n"
					+ " |/     `       //        '     \\| \r\n"
					+ " `              V                '\n");
			break;
		case 3:
			game.setMap(3);
			String enemyR = riverMon[rand.nextInt(riverMon.length)];
			game.setEnemy(enemyR);
			System.out.println("\t" + enemyR + " found!\n"
					+ "       ---_ ......._-_--.\r\n"
					+ "      (|\\ /      / /| \\  \\\r\n"
					+ "      /  /     .'  -=-'   `.\r\n"
					+ "     /  /    .'             )\r\n"
					+ "   _/  /   .'        _.)   /\r\n"
					+ "  / o   o        _.-' /  .'\r\n"
					+ "  \\          _.-'    / .'*|\r\n"
					+ "   \\______.-'//    .'.' \\*|\r\n"
					+ "    \\|  \\ | //   .'.' _ |*|\r\n"
					+ "     `   \\|//  .'.'_ _ _|*|\r\n"
					+ "      .  .// .'.' | _ _ \\*|\r\n"
					+ "      \\`-|\\_/ /    \\ _ _ \\*\\\r\n"
					+ "       `/'\\__/      \\ _ _ \\*\\\r\n"
					+ "      /^|            \\ _ _ \\*\r\n"
					+ "     '  `             \\ _ _ \\ \n"
					+ "                       \\_\n");
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
	}
	
	public void encounterStart() {
		int enemyHealth = rand.nextInt(game.maxMonHealth);
		int input;
			do{
				System.out.println("\t" + game.getEnemy() + "'s HP: " + enemyHealth);
				System.out.println("\tYour HP: " + game.hp);
				System.out.println("\n Actions:");
				System.out.println("\t[1] Attack");
				System.out.println("\t[2] Consume health potion");
				System.out.println("\t[3] Run away");
				
				input = sc.nextInt();
					switch (input) {
						case 1:
							if(game.getcClass() == 1) {
								int damageDealt = rand.nextInt(game.getAtk());
								int damageTaken = rand.nextInt(game.monDamage);
								
								enemyHealth -= damageDealt;
								game.hp -= damageTaken;
								
								System.out.println("\t*You striked the " + game.getEnemy() + " for " + damageDealt + " damage!*");
								System.out.println("\t*You received " + damageTaken +" damage in retaliation!*");
							}
							else if(game.getcClass() == 2) {
								int damageDealt = rand.nextInt(game.getAtk());
								int damageTaken = rand.nextInt(game.monDamage);
								
								enemyHealth -= damageDealt;
								game.hp -= damageTaken;
								
								System.out.println("\t*You striked the " + game.getEnemy() + " for " + damageDealt + " damage!*");
								System.out.println("\t*You received " + damageTaken +" damage in retaliation!*");
							}
							else{
								int damageDealt = rand.nextInt(game.getAtk());
								int damageTaken = rand.nextInt(game.monDamage);
								
								enemyHealth -= damageDealt;
								game.hp -= damageTaken;
								
								System.out.println("\t*You striked the " + game.getEnemy() + " for " + damageDealt + " damage!*");
								System.out.println("\t*You received " + damageTaken +" damage in retaliation!*");
							}
							if(game.hp <= 0) {
								userLost();
							}
							if(enemyHealth <= 0) {
								expLevelup();
								game.potionDrop();
							}
							break;		
						case 2:
							if(game.potionAmount > 0) {
								game.hp += game.potionHealAmount;
								game.potionAmount--;
								if(game.hp > 100) {
									game.hp = 100;
								}

								System.out.println("\t*You consumed a health potion*" 
								+ "\n\t> Current HP: " + game.hp
								+ "\n\t> Potions Left: " + game.potionAmount + "\n");
								break;
							}
							else {
								System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!");
								break;
							}
						case 3:
							System.out.println("\t You ran away from the " + game.getEnemy() + "!");
							break;
						default:
							System.out.println("\t Invalid Input!");
							encounterStart();
							break;
						}
			}while (enemyHealth > 0 && input != 3); 
					if(game.hp < 1) {
						System.out.println("You limp out of the dungeon, weak from battle.");
						//break;
					}
	}
	public void expLevelup() {
		int expGain = rand.nextInt(expGrant);
		totalExp += expGain;
		System.out.println("--------------------------------------------------------");
		System.out.println(" # " + game.getEnemy() + " was defeated! \n");
		System.out.println(" # EXP Gain: " + expGain);
		if(totalExp >= 300) {
			game.setLevel(baseLevel++);
			game.setnLevel(game.getLevel() + 1);
			totalExp -= 300;
			toNextLevel = 300 - totalExp;
			System.out.println(" # Level: " + game.getLevel() + " -> " + game.getnLevel() );
			game.setLevel(game.getnLevel());
		}
		else {
			toNextLevel = 300 - totalExp;
		}
		System.out.println(" # EXP to next level: " + toNextLevel + "\n");
	}
	public void proceedOrexit() {
		System.out.println("--------------------------------------------------------");
		System.out.println("What would you like to do now?");
		System.out.println("[1] Continue Fighting");
		System.out.println("[2] Quit");
		
		int input = sc.nextInt();
		if(input == 1) {
			System.out.println("[1] Stay on current map");
			System.out.println("[2] Go to another map");
			int option = sc.nextInt();
			if(option == 1) {
				enemySelection2();
				encounterStart();
				proceedOrexit();
			}
			else if(option == 2) {
				mapSelection();
				enemySelection();
				encounterStart();
				proceedOrexit();
			}
			else {
				System.out.println("Invalid Input!");
			}	
		}
		else if(input == 2) {
			System.out.println("--------------------------------------------------------");
			System.out.println("-                 THANKS FOR PLAYING!                  -" + "\n"
							 + "-                      ___  ___                        -" +"\r\n"   
							 + "-                     /   \\/   \\                       -" +"\r\n" 
							 + "-                     \\        /                       -" +"\r\n" 
							 + "-                      \\      /                        -" +"\r\n" 
							 + "-                       \\    /                         -" +"\r\n"
							 + "-                        \\  /                          -" +"\r\n"
							 + "-                         \\/                           -");
			System.out.println("--------------------------------------------------------");
			System.exit(0);
			
		}
		else {
			System.out.println("Invalid Input!");
			proceedOrexit();
		}
	}
	public void userLost() {
		System.out.println("--------------------------------------------------------");
		System.out.println(" # You are DEAD.\n"
				+ "\r\n"
				+ "           ______\r\n"
				+ "        .-\"      \"-.\r\n"
				+ "       /            \\\r\n"
				+ "      |              |\r\n"
				+ "      |,  .-.  .-.  ,|\r\n"
				+ "      | )(__/  \\__)( |\r\n"
				+ "      |/     /\\     \\|\r\n"
				+ "      (_     ^^     _)\r\n"
				+ "       \\__|IIIIII|__/\r\n"
				+ "        | \\IIIIII/ |\r\n"
				+ "        \\          /\r\n"
				+ "         `--------`\n");
		System.out.println(" # You've been defeated by the " + game.getEnemy());
		System.out.println("--------------------------------------------------------");
		System.out.println("What would you like to do now?");
		System.out.println("[1] Restart");
		System.out.println("[2] Quit");
		int input = sc.nextInt();
		if(input == 1) {
			game.hp = 100;
			charSelection();
			mapSelection();
			enemySelection();
			encounterStart();
			proceedOrexit();
		}
		else if(input == 2) {
			System.out.println("--------------------------------------------------------");
			System.out.println("-                 THANKS FOR PLAYING!                  -" + "\n"
							 + "-                      ___  ___                        -" +"\r\n"   
							 + "-                     /   \\/   \\                       -" +"\r\n" 
							 + "-                     \\        /                       -" +"\r\n" 
							 + "-                      \\      /                        -" +"\r\n" 
							 + "-                       \\    /                         -" +"\r\n"
							 + "-                        \\  /                          -" +"\r\n"
							 + "-                         \\/                           -");
			System.out.println("--------------------------------------------------------");
			System.exit(0);
		}
		else {
			System.out.println("Invalid Input!");
			userLost();
		}
	}
}