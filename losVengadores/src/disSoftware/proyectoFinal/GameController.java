package disSoftware.proyectoFinal;
import java.util.Scanner;

public class GameController{
    private DamageCalculator calculator;
    
    public Enemy elegirPersonaje(Integer numerin,World1Factory character) {
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
    public void showMenu(World1Factory player,World1Factory enemy) {
    	//System.out.println("Jugador:"+ player.);
    	//System.out.println("Enemigo:"+ enemy.);
    	 System.out.println("╔══════════════════════════════╗");
         System.out.println("║        🦸‍♂️ AVENGERS MENU 🦸‍♀️       ║");
         System.out.println("╠══════════════════════════════╣");
         System.out.println("║ 1️.  Attack ⚔️                      ║");
         System.out.println("║ 2️.  Defend 🛡️                     ║");
         System.out.println("║ 3️.  Exit 👋                        ║");
         System.out.println("╚══════════════════════════════╝");
    	
    }
    
    public void fight(World1Factory player,World1Factory enemy) {
    	Integer playerAction=0;
    	while(player.health <= 0) {
    		showMenu(player,enemy);
    			
    	}
    }
    
    public void play() {
    	// estamos en el primer nivel
    	Integer numerin = 0;
    	Integer random =(int)(Math.random()*4)+1;
    	Scanner scanner = new Scanner(System.in);
    	World1Factory player= new World1Factory();
    	World1Factory enemy= new World1Factory();
    	System.out.println("--------------Avengers----------------\n Elige personaje: \n|1.Capitan America|\n|2. Iron-Man|\n|3.Spider-Man|\n|4. Thor|\n----------------");
    	numerin=scanner.nextInt();
    	this.elegirPersonaje(numerin,player);
    	this.elegirPersonaje(random,enemy);
    	System.out.println("Va a comenzar la pelea");
    	fight(player,enemy);
    	
    	
    }

}
