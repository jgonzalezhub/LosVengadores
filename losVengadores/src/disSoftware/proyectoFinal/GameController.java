package disSoftware.proyectoFinal;
import java.util.Scanner;

public class GameController{
    private DamageCalculator calculator;
    
    public Enemy elegirPersonajelevel1(Integer numerin,World1Factory character) {
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
    
    public Enemy elegirPersonajelevel2(Integer numerin,World2Factory character) {
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
    public void showMenu(Enemy player,Enemy enemy) {
    	System.out.println("Jugador:"+ player.getName());
    	System.out.println("Enemigo:"+ enemy.getName());
    	System.out.println("╔══════════════════════════════╗");
    	System.out.println("║      🦸 AVENGERS MENU 🦸‍♀️     ║");
    	System.out.println("╠══════════════════════════════╣");
    	System.out.println("║ 1️.  Attack ⚔️                ║");
    	System.out.println("║ 2️.  Defend 🛡️                ║");
    	System.out.println("╚══════════════════════════════╝");
    	
    }
    
    public Integer fight(Enemy player,Enemy enemy) {
// esta funcion tambien la puede utilizar los bot solo que habria que poner que si es enemy los valores sean random es decir que elija 1 o 2 aleatoriamente
    	DamageCalculator calculator = DamageCalculator.getInstance();
    	Integer playerAction=0;
    	Scanner scanner = new Scanner(System.in);
    	int damage1=0;
    	int damage2=0;
    	while(player.getHealth() > 0 && enemy.getHealth() > 0) {
    		showMenu(player,enemy);
    		playerAction=scanner.nextInt();
    		switch(playerAction) {
    			case 1:
    				damage1=calculator.calculateDamage(player, enemy);
    				enemy.setHealth(enemy.getHealth()-damage1);
    				System.out.println(player.getName()+ "ataca y genera "+ damage1+ "de danio sobre "+ enemy.getName());
    			break;
    			case 2:
    				damage1=calculator.calculateDamage(enemy,player);
    				if(damage1==0) {
    					System.out.println(player.getName()+" se protege ante el ataque");
    				}else {
    					player.setHealth(enemy.health-damage1);
        				System.out.println(player.getName()+ "ataca y genera "+ damage1+ "de danio sobre "+ enemy.getName());
    				}
    			break;
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
    	Integer numerin = 0;
    	Integer resultadoNivel1;
    	Integer resultadoNivel2;
    	Integer random =(int)(Math.random()*4)+1;
    	Scanner scanner = new Scanner(System.in);
    	World1Factory factory= new World1Factory();
    	Enemy player;
    	Enemy enemy;
    	showCharacters();
    	numerin=scanner.nextInt();
    	player=this.elegirPersonajelevel1(numerin,factory);
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
    	numerin=0;
    	player=null;
    	enemy=null;
    	World2Factory factoryLvl2= new World2Factory();
    	showCharacters();
    	numerin=scanner.nextInt();
    	player=this.elegirPersonajelevel1(numerin,factory);
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
