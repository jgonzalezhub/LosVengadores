package disSoftware.proyectoFinal;
import java.util.Scanner;

public class GameController{
    private static GameController instance;
    
    private GameController(){
    }

    public static GameController getInstance(){
        if(instance == null){
            instance = new GameController();
        }
        return instance;
    }

    public Integer calculateDamage(Character attacker, Character defender){
    	
    	
        Integer damage;
        damage = attacker.getPower() - defender.getDefense();

        return damage;
    }
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
    
    public void play() {
    	// estamos en el primer nivel
    	Integer numerin = 0;
    	Integer random =0;
    	Scanner scanner = new Scanner(System.in);
    	World1Factory player= new World1Factory();
    	World1Factory enemy= new World1Factory();
    	System.out.println("--------------Avengers----------------\n Elige personaje: \n|1.Capitan America|\n|2. Iron-Man|\n|3.Spider-Man|\n|4. Thor|\n----------------");
    	numerin=scanner.nextInt();
    	this.elegirPersonaje(numerin,player);
    	this.elegirPersonaje(numerin,enemy);
    	while(true) {
    		System.out.println("----------Avengers------------");
    	}
    	
    }

}
