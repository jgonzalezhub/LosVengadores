	package disSoftware.proyectoFinal;
import java.util.Scanner;


public class Player extends Character{
    //CONSTRUCTOR
    public Player(String name, 
                 Integer power,
                 Integer health,
                 Integer defense,
                 String specialText,
                 Integer specialNumber){
        super(name, power, health,defense, specialText, specialNumber);
    }
    
    public void performAction(Enemy opponent) {
    	
    	Integer playerAction=0;
    	Scanner scanner = new Scanner(System.in);
    	Integer defense1 = 0;
    	Integer damage2=0;
    	DamageCalculator calculator = DamageCalculator.getInstance();
		playerAction=scanner.nextInt();
      
		         
		if (state != null) {
		    state.handle(this);

		    if (state instanceof ParalyzedState) {
		        return; 
		    }
		}

				switch(playerAction) {
				case 1:
					Action action = new BasicAttack();
					if (this.power == 45) action = new PowerfulAttack(action);
					if (this.power == 30) action = new LightningAttack(action);
					if (this.power == 50) action = new ReflexAttack(action);
					if (this.power == 40 && this.health<=60) action = new WebAttack(action);

	
					System.out.println(name + " usa: " + action.getDescription());
					Integer totalDamage = action.execute(this, opponent);
					opponent.takeDamage(totalDamage);
					System.out.println(opponent.getName() + " recibe " + totalDamage + " de daño. Vida restante: " + opponent.getHealth());
				break;
				case 2:
					defense1 = calculator.calculateDefense(opponent, this);
					if(defense1==0) {
						System.out.println(this.getName()+" se protege ante el ataque.");
					}else {
						defense1 = calculator.calculateDefense(opponent, this);
						this.setHealth(this.health-defense1);
						System.out.println(opponent.getName()+ " ataca y genera "+ opponent.getPower() + " de daño sobre "+ this.getName());
					}
				break;
				
				case 3:
					//System.out.println("\n Stats \nNombre: " + this.name+"\n Power: "+ this.power +"\nHealth: "+ this.health +"\nDefense: "+ this.defense+"\n\n");
					this.showStats();
				break;
				case 4:
					System.out.println("Saliendo......."); // sale del juego 
					System.exit(0);
				break;
				
				default:
					System.out.println("No has hecho nada, el enemigo te ataca");
				break;
				}
			
        
    	
    }
    
    public void showStats() {
    	System.out.println("╔══════════════════════════════╗");
        System.out.println("║          📊 STATS 📊         ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ Nombre  : " + this.name);
        System.out.println("║ Poder   : " + this.power);
        System.out.println("║ Salud   : " + this.health);
        System.out.println("║ Defensa : " + this.defense);
        System.out.println("╚══════════════════════════════╝\n");
    }
    
}
