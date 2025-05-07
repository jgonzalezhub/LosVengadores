package disSoftware.proyectoFinal;
import java.util.Scanner;

public class GameController{
    private DamageCalculator calculator;
    
    public Player elegirPersonajePlayer(Integer numerin,PlayerFactory character) {
    	switch(numerin) {
		case 1: 
			System.out.println("Has elegido a Capitan America");
			return character.createCaptainAmerica();
		case 2: 
			System.out.println("Has elegido a Iron-Man");
			return character.createIronMan();
			
		case 3: 
			System.out.println("Has elegido a Spider-Man");
			return character.createSpiderMan();
			
		case 4:
			System.out.println("Has elegido a Thor");
			return character.createThor();
		default:
			System.out.println("El personaje que intentas utilizar no esta disponible");
			
    	}
    	return null;
    }
    
    public Enemy elegirPersonajelevel1(Integer numerin,World1Factory character) {
    	switch(numerin) {
		case 1: 
			System.out.println("El enemigo es Capitan America");
			return character.createCaptainAmerica();
		case 2: 
			System.out.println("El enemigo es Iron-Man");
			return character.createIronMan();
			
		case 3: 
			System.out.println("El enemigo es Spider-Man");
			return character.createSpiderMan();
			
		case 4:
			System.out.println("El enemigo es Thor");
			return character.createThor();
		default:
			System.out.println("El personaje que intentas utilizar no esta disponible");
			
    	}
    	return null;
    }
    
    public Enemy elegirPersonajelevel2(Integer numerin,World2Factory character) {
    	switch(numerin) {
		case 1: 
			System.out.println("El enemigo es Capitan America");
			return character.createCaptainAmerica();
		case 2: 
			System.out.println("El enemigo es Iron-Man");
			return character.createIronMan();
			
		case 3: 
			System.out.println("El enemigo es Spider-Man");
			return character.createSpiderMan();
			
		case 4:
			System.out.println("El enemigo es Thor");
			return character.createThor();
		default:
			System.out.println("El personaje que intentas utilizar no esta disponible");
			
    	}
    	return null;
    }
    public void showMenu(Player player,Enemy enemy) {
    	System.out.println("Jugador:"+ player.getName());
    	System.out.println("Enemigo:"+ enemy.getName());
    	System.out.println("╔══════════════════════════════╗");
    	System.out.println("║      🦸 AVENGERS MENU 🦸‍♀️     ║");
    	System.out.println("╠══════════════════════════════╣");
    	System.out.println("║ 1️.  Attack ⚔️                ║");
    	System.out.println("║ 2️.  Defend 🛡️                ║");
    	System.out.println("╚══════════════════════════════╝");
    	
    }
    
    public Integer fight(Player player,Enemy enemy) {
    	Integer playerTurn = 1;
    	while (player.isAlive() && enemy.isAlive()) {
            if (playerTurn == 1) {
            	playerTurn = 2;
            	showMenu(player, enemy);
                player.performAction(enemy);               
            } else {
            	playerTurn = 1;
                enemy.performAction(player);                
            }
            
        }
    	if(player.getHealth() <= 0) {
    		return 0;
    	}
    	return 1;
    }
    
    public void showCharacters() {
    	System.out.println("--------------Avengers----------------\n Elige personaje: \n|1.Capitan America|\n|2. Iron-Man|\n|3.Spider-Man|\n|4. Thor|\n----------------");
    }
    
    public void play() {
    	// estamos en el primer nivel
    	Integer number = 0;
    	Integer resultadoNivel1;
    	Integer resultadoNivel2;
    	Integer random =(int)(Math.random()*4)+1;
    	Scanner scanner = new Scanner(System.in);
    	PlayerFactory playerFactory= new PlayerFactory();
    	World1Factory factory= new World1Factory();
    	Player player;
    	Enemy enemy;
    	showCharacters();
    	number=scanner.nextInt();
    	player=this.elegirPersonajePlayer(number,playerFactory);
    	enemy = this.elegirPersonajelevel1(random,factory);
    	System.out.println("Va a comenzar la pelea");
    	resultadoNivel1=fight(player,enemy);
    	if(resultadoNivel1==0) {
    		System.out.println("DEFEAT");
    		System.exit(0);
    	}
    	System.out.println("VICTORY");
    	
    	// nivel 2
    	System.out.println("viajando al nivel 2");
    	number=0;
    	player=null;
    	enemy=null;
    	World2Factory factoryLvl2= new World2Factory();
    	showCharacters();
    	number=scanner.nextInt();
    	player=this.elegirPersonajePlayer(number,playerFactory);
    	enemy = this.elegirPersonajelevel1(random,factory);
    	System.out.println("Va a comenzar la pelea");
    	resultadoNivel2=fight(player,enemy);
    	
    	if(resultadoNivel2==0) {
    		System.out.println("DEFEAT en level 2");
    		System.exit(0);
    	}
    	System.out.println("WINNER WINNER CHICKEN DINNER");
    }

}